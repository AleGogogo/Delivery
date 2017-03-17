package com.example.lyw.expressdelivery.net;

import android.util.Log;

import com.example.lyw.networkstructs.entity.Request;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

/**
 * Created by LYW on 2017/3/9.
 */

public class HttpConnectionStack implements Httpstack {

    @Override
    public void perFormRequest(Request mRequest) {
        InputStream is = null;
        HttpURLConnection con = null;
        try {
            URL url = new URL(mRequest.getUrl());
            con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setReadTimeout(2000);
            con.setConnectTimeout(2000);
            if (con.getResponseCode() == 200) {
                is = con.getInputStream();
                mRequest.parseResponse(is);
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

