package com.example.lyw.expressdelivery.net;

import android.text.Html;
import android.text.TextUtils;
import android.util.Log;


import com.example.lyw.expressdelivery.request.Params;
import com.example.lyw.expressdelivery.request.Request;
import com.example.lyw.expressdelivery.util.HttpHeader;
import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLEncoder;

/**
 * Created by LYW on 2017/3/9.
 */

public class HttpConnectionStack implements Httpstack {
    private static final String TAG = "HttpConnectionStack";
    @Override
    public void perFormRequest(Request mRequest) {
        Log.d(TAG, "perFormRequest: 执行了么？");
        InputStream is = null;
        HttpURLConnection con = null;
        OutputStream os = null;
        try {
            URL url = new URL(mRequest.getUrl());
            con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod(mRequest.getmMethod()+"");
            con.setDoOutput(true);
            // Read from the connection. Default is true.
            con.setDoInput(true);
            con.setReadTimeout(5000);
            con.setConnectTimeout(2000);

            // 默认是 GET方式
            HttpHeader header = mRequest.getHeader();
            for (String key:
                 header.keySet()) {
                con.setRequestProperty(key,header.get(key));
            }
            Log.d(TAG, "perFormRequest: --------");
            con.connect();
            os = con.getOutputStream();
            PrintStream ps = new PrintStream(os);
            Params params = mRequest.getParams();
            StringBuilder sb = new StringBuilder();
            int index = 0;
            for (String key: params.keySet()) {
                String s = params.get(key);
                if (TextUtils.equals("json",key)) s = URLEncoder.encode(s);
                sb.append(key + "=" + s).append(index++ < params.size()-1 ? "&" :"");
            }
            sb.append("&");
            Log.d(TAG, "perFormRequest: sb is"+sb.toString());
            ps.print(sb.toString());
            ps.flush();
            ps.close();
            try {
                con.getResponseCode();
            } catch (IOException e) {
                e.printStackTrace();
                int responsecode = con.getResponseCode();
                Log.d(TAG, "perFormRequest: 成功执行了么？"+responsecode);

            }
            if (con.getResponseCode() == 200) {
                is = con.getInputStream();
                mRequest.onParesResponse(is);

            } else {
                Log.d("TAG", "数据回应不成功");
            }
        } catch (ProtocolException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }

