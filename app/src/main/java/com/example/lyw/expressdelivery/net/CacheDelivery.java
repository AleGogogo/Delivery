package com.example.lyw.expressdelivery.net;

import android.util.LruCache;

import com.example.lyw.expressdelivery.request.Request;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by LYW on 2017/3/9.
 */

public class CacheDelivery extends Thread {
    private PriorityBlockingQueue<Request> mCacheQueue;
    private LruCache<String, Response> mLruCache;
    //他不需要去做真正的网络请求，所以这里不需要stack
    //    private Httpstack mHttpstack;
    private ThreadPoolExecutor mExecutor;
    private NetWorkDelivery mNetWorkDelivery;

    //    private boolean isNeedCache;
    public CacheDelivery(ThreadPoolExecutor mExecutor, NetWorkDelivery
            mNetWorkDelivery) {
        mCacheQueue = new PriorityBlockingQueue<>();
        this.mNetWorkDelivery = mNetWorkDelivery;
        this.mExecutor = mExecutor;
        mLruCache = new LruCache<String,
                Response>(30) {

            @Override
            protected int sizeOf(String key, Response value) {
                return super.sizeOf(key, value);
            }
        };
    }

    //这个什么时候用呢？
    public void addToCacheQueque(Request request) {
        mCacheQueue.put(request);
    }

    @Override
    public void run() {
        while (true) {
            try {
                Request request = mCacheQueue.take();
                String key = request.getTag();
                Response response = mLruCache.get(key);
                if (null != response) {
                    //存在缓存数据不用去网络访问
                    //具体response怎么解析
                    request.onParesResponse(null);
                } else {
                    mNetWorkDelivery.addRequest(request);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
