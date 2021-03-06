package com.example.lyw.expressdelivery.request;


import android.util.Log;

import com.example.lyw.expressdelivery.net.CachePolicy;
import com.example.lyw.expressdelivery.net.HttpMethod;
import com.example.lyw.expressdelivery.net.NameValuesMap;
import com.example.lyw.expressdelivery.net.Response;
import com.example.lyw.expressdelivery.util.HttpHeader;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * Created by LYW on 2017/3/17.
 */

public class StringRequest extends Request {

    private static final String TAG = "StringRequest";

    public StringRequest(int priorityId, String url, HttpHeader header,
                         HttpMethod mMethod, requestBody mBody, Listener
                                 mListener, CachePolicy mCachePolicy,
                         Params params) {
        super(priorityId, url, header, mMethod, mBody, mListener, mCachePolicy, params);
    }

    @Override
    public void onParesResponse(InputStream inputStream) {

        InputStreamReader isr = new InputStreamReader(inputStream);
        BufferedReader br = new BufferedReader(isr);
        StringBuilder sb = new StringBuilder();
        String str;
        try {
            while ((str = br.readLine()) != null) {
                sb.append(str);
            }
            Response<String> stringResponse = new Response<>();
            stringResponse.setData(sb.toString());
            if (null != mListener) mListener.onSuccess(stringResponse);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (isr != null) {
                    isr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        Log.d(TAG, "数据返回来拉！！！" + sb.toString());
    }

}

