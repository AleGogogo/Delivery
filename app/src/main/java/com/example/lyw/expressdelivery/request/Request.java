package com.example.lyw.expressdelivery.request;


import com.example.lyw.expressdelivery.net.CachePolicy;
import com.example.lyw.expressdelivery.net.HttpMethod;
import com.example.lyw.expressdelivery.net.NameValuesMap;
import com.example.lyw.expressdelivery.net.Response;
import com.example.lyw.expressdelivery.util.HttpHeader;

import java.io.InputStream;


/**
 * Created by LYW on 2017/3/6.
 */

public abstract class Request implements Comparable<Request> {
    private int priorityId;
    private String url;
    private HttpHeader header;
    private Params params;

    private HttpMethod mMethod;
    private requestBody mBody;
    private CachePolicy mCachePolicy;
    private String mTag;


    protected Listener mListener;

    public HttpMethod getmMethod() {
        return mMethod;
    }

    public void setmMethod(HttpMethod mMethod) {
        this.mMethod = mMethod;
    }

    public Params getParams() {
        return params;
    }

    public void setParams(Params params) {
        this.params = params;
    }

    public Request(int priorityId, String url, HttpHeader header, HttpMethod
            mMethod, requestBody mBody, Listener mListener, CachePolicy
                           mCachePolicy, Params params) {
        this.priorityId = priorityId;
        this.url = url;
        this.header = header;
        this.mMethod = mMethod;
        this.mBody = mBody;
        this.mListener = mListener;
        this.mCachePolicy = mCachePolicy;
        this.params = params;

    }

    public String getTag() {
        return mTag;
    }

    public void setTag(String key) {
        this.mTag = key;
    }

    private boolean isCancle = true;
    private boolean isNeedCache = false;


    public void setIdNeedCache(boolean flag) {
        isNeedCache = flag;
    }

    public boolean getIsNeedCache() {
        return isNeedCache;
    }

    public int getPriorityId() {
        return priorityId;
    }

    public void setPriorityId(int priorityId) {
        this.priorityId = priorityId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public HttpHeader getHeader() {
        return header;
    }

    public void setHeader(HttpHeader header) {
        this.header = header;
    }

    public requestBody getmBody() {
        return mBody;
    }

    public void setmBody(requestBody mBody) {
        this.mBody = mBody;
    }

    public void cancleRequest() {
        isCancle = false;
    }

    @Override
    public int compareTo(Request request) {
        return priorityId - request.priorityId;
    }

    public void setListener(Listener listener) {
        mListener = listener;
    }

    public abstract void onParesResponse(InputStream inputStream);

    public interface Listener<T> {
        void onSuccess(T response);

        void onFailed(String str);
    }
}
