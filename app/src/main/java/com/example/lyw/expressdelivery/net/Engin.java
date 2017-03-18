package com.example.lyw.expressdelivery.net;


import com.example.lyw.expressdelivery.request.Request;

/**
 * Created by LYW on 2017/3/9.
 */

public class Engin implements Httpstack,Runnable {
    private Request mRequest;
    //这里要有一个真正执行网络请求的对象
    private Httpstack mHttpstack;

    public Engin(Request mRequest,Httpstack mHttpstack) {
        this.mRequest = mRequest;
        this.mHttpstack = mHttpstack;
    }


    @Override
    public void run() {
        perFormRequest(mRequest);
    }

    @Override
    public void perFormRequest(Request request) {
         mHttpstack.perFormRequest(request);
    }
}
