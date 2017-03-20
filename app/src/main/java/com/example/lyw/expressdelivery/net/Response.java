package com.example.lyw.expressdelivery.net;

/**
 * Created by LYW on 2017/3/6.
 */

public class Response<ResponseType> {
    protected ResponseType data;

    public ResponseType getData() {
        return data;
    }

    public void setData(ResponseType data) {
        this.data = data;
    }
}
