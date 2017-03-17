package com.example.lyw.expressdelivery.net;

import com.example.lyw.networkstructs.entity.Request;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by LYW on 2017/3/9.
 */
//为啥要thread?
public class NetWorkDelivery extends Thread{
    private PriorityBlockingQueue<Request> mNetworkQueue;
    private Httpstack mStack;
    //为什么这里要有一个线程池? 哦哦 这里的线程池是传进来的
    private ThreadPoolExecutor mExecutor;

    public NetWorkDelivery( Httpstack mStack, ThreadPoolExecutor mExecutor) {

        this.mNetworkQueue = new PriorityBlockingQueue<>() ;
        this.mStack = mStack ;
        this.mExecutor = mExecutor ;

    }

    @Override
    public void run() {
        while (true) {
            try {
                Request request = mNetworkQueue.take();
                mExecutor.execute(new com.example.lyw.networkstructs.net.Engin(request, mStack));

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public BlockingQueue getmNetworkQueue() {
        return mNetworkQueue;
    }

    public void addRequest(Request request) {
        mNetworkQueue.put(request);
    }
}
