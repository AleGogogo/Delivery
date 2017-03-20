package com.example.lyw.expressdelivery.request;

import android.util.Log;

import com.example.lyw.expressdelivery.net.CachePolicy;
import com.example.lyw.expressdelivery.net.HttpMethod;
import com.example.lyw.expressdelivery.net.Response;
import com.example.lyw.expressdelivery.util.HttpHeader;
import com.google.gson.Gson;

import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by bluerain on 17-3-19.
 */

public class ObjectRequest extends Request {
    protected Class mClassType;


    public ObjectRequest(int priorityId, Class classType, String url, HttpHeader header, HttpMethod mMethod, requestBody mBody, Listener mListener, CachePolicy mCachePolicy, Params params) {
        super(priorityId, url, header, mMethod, mBody, mListener, mCachePolicy, params);
        mClassType = classType;


    }


    @Override
    public void onParesResponse(InputStream inputStream) {
        if (null != inputStream) {
            Gson gson = new Gson();
            Object result = gson.fromJson(new InputStreamReader(inputStream), mClassType);
            if (null != mListener) mListener.onSuccess(result);
        }
    }

}
