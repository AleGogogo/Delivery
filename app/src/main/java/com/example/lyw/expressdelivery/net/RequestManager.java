package com.example.lyw.expressdelivery.net;


import com.example.lyw.expressdelivery.request.Request;

import java.util.concurrent.Executors;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by LYW on 2017/3/6.
 */

public class RequestManager {
    private static PriorityBlockingQueue<Request> mRequstQueue;
    private static final int DEAFAULT_NUM = 5;
    private static int threadNum;
    private static ThreadPoolExecutor mThreadPol;
    private NetWorkDelivery mNetWorkDelivery;
    private CacheDelivery mCacheDelivery;

    private Httpstack mHttpStack;
    private static RequestManager INSTACE = null;

    //这里怎么可以随意选择访问网络用的工具呢？（connection?okhttp?）
    private RequestManager() {
        mRequstQueue = new PriorityBlockingQueue<>();
        mHttpStack = new HttpConnectionStack();
        mThreadPol = (ThreadPoolExecutor) Executors.newFixedThreadPool
                (DEAFAULT_NUM);
        mNetWorkDelivery = new NetWorkDelivery(mHttpStack, mThreadPol);
        mCacheDelivery = new CacheDelivery(mThreadPol, mNetWorkDelivery);
        mNetWorkDelivery.start();
        mCacheDelivery.start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Request request = mRequstQueue.take();
                        if (!request.getIsNeedCache())
                            mCacheDelivery.addToCacheQueque(request);
                        else {
                            mNetWorkDelivery.addRequest(request);
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

    }

    public synchronized static RequestManager getInstance() {
        if (null == INSTACE) {
            INSTACE = new RequestManager();
        }
        return INSTACE;
    }

    public static void addRequest(Request request, Request.Listener listener) {
        if (null != request) {
            request.setListener(listener);
            mRequstQueue.put(request);
        }
    }

    public static void setThreadPolNum(int num) {
        threadNum = num;
        mThreadPol.setCorePoolSize(threadNum);
    }

    public static void cancleRequest(Request request) {
        if (mRequstQueue.contains(request)) {
            request.cancleRequest();
        }
    }
}
