package com.example.lyw.expressdelivery.request;



import com.example.lyw.expressdelivery.net.CachePolicy;
import com.example.lyw.expressdelivery.net.Response;
import com.example.lyw.expressdelivery.util.HttpHeader;

import java.io.InputStream;
import java.util.HashMap;

/**
 * Created by LYW on 2017/3/6.
 */

public abstract class Request implements Comparable<Request>{
      private int priorityId;
      private String url;
      private HttpHeader header;
      private HashMap<String,String> requestBody;
      private Listener mListener;
      private CachePolicy mCachePolicy;
      private String mTag;



    public String getTag() {
        return mTag;
    }

    public void setTag(String key) {
        this.mTag = key;
    }

    private boolean isCancle = true;
      private boolean isNeedCache = false;

    public Request(HttpHeader header, int priorityId, String
            url, HashMap<String, String> requestBody, CachePolicy cachePolicy) {
        this.header = header;
        this.priorityId = priorityId;
        this.url = url;
        this.requestBody = requestBody;
        mCachePolicy = cachePolicy;
    }

    public void setIdNeedCache(boolean flag){
           isNeedCache = flag;
    }
    public boolean getIsNeedCache(){
        return  isNeedCache;
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

    public HashMap<String, String> getRequestBody() {
        return requestBody;
    }

    public void setRequestBody(HashMap<String, String> requestBody) {
        this.requestBody = requestBody;
    }

    public void cancleRequest(){
        isCancle = false;
    }

    @Override
    public int compareTo(Request request) {
        return priorityId - request.priorityId;
    }

    public void setListener(Listener listener){
           mListener = listener;
    }
    public void parseResponse(InputStream is){
           Response response = onParesResponse(is);
          if (null != response){
                 mListener.onSuccess(response);
          }else {
              mListener.onFailed("失败");
          }
    }
    public abstract Response onParesResponse(InputStream inputStream);

    public interface Listener{
        void onSuccess(Response response);
        void onFailed(String str);
    }
}
