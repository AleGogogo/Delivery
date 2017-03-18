package com.example.lyw.expressdelivery;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

import com.example.lyw.expressdelivery.fragement.BasicFragment;
import com.example.lyw.expressdelivery.fragement.DeliveryFragment;
import com.example.lyw.expressdelivery.fragement.HomeFragment;
import com.example.lyw.expressdelivery.fragement.SearchFragment;
import com.example.lyw.expressdelivery.net.CachePolicy;
import com.example.lyw.expressdelivery.net.HttpMethod;
import com.example.lyw.expressdelivery.net.NameValuesMap;
import com.example.lyw.expressdelivery.net.RequestManager;
import com.example.lyw.expressdelivery.net.Response;
import com.example.lyw.expressdelivery.request.Params;
import com.example.lyw.expressdelivery.request.Request;
import com.example.lyw.expressdelivery.request.StringRequst;
import com.example.lyw.expressdelivery.request.requestBody;
import com.example.lyw.expressdelivery.util.HttpHeader;
import com.example.lyw.expressdelivery.util.RequestUrl;
import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {
    private ImageButton mHomeButton;
    private ImageButton mSearchButton;
    private ImageButton mDeliveryButton;
    private FragmentManager mFragmentManager;
    private RequestManager mRequestManager;
    private Request.Listener mListener;
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRequestManager = RequestManager.getInstance();
        initView();
        initListener();
    }

    private void initListener() {

        mSearchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mHomeButton.setImageResource(R.drawable.tab_home_normal);
                mDeliveryButton.setImageResource(R.drawable
                        .tab_delivery_normal);
                mSearchButton.setImageResource(R.drawable.tab_search_pressed);
                replaceFragment(new SearchFragment());
            }
        });
        mDeliveryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mHomeButton.setImageResource(R.drawable.tab_home_normal);
                mSearchButton.setImageResource(R.drawable.tab_search_normall);
                mDeliveryButton.setImageResource(R.drawable
                        .tab_delivery_pressed);
                replaceFragment(new DeliveryFragment());
                final StringRequst requst = initRequest();
                mRequestManager.addRequest(requst, new Request.Listener() {
                    @Override
                    public void onSuccess(Response response) {

                    }

                    @Override
                    public void onFailed(String str) {
                        Log.d(TAG, "onFailed: "+str);
                    }
                });
        }
    });
    }

    private void initView() {
        mHomeButton = (ImageButton) findViewById(R.id.id_bottom_home_imgbut);
        mSearchButton = (ImageButton) findViewById(R.id.id_bottom_search_img);
        mDeliveryButton = (ImageButton) findViewById(R.id
                .id_bottom_delivery_img);
        mHomeButton.setImageResource(R.drawable.tab_home_pressed);
        mFragmentManager = getSupportFragmentManager();
        replaceFragment(new HomeFragment());
    }

    private void replaceFragment(Fragment fragment) {
        mFragmentManager.beginTransaction().replace(R.id
                .fragment_container, fragment).commit();
    }
    private StringRequst initRequest(){
        HttpHeader header = new HttpHeader();
        header.setAcceptEncoding(HttpHeader.ACCEPT_ENCODING, "gzip");
        header.setUserAgent(HttpHeader.USER_AGENT, "Dalvik/2.1.0 " +
                "(Linux; U; Android 5.1.1; A0001 Build/LVY48F)");
        header.setContentLength(HttpHeader.CONTENT_LENGTH, "870");
        header.setContentType(HttpHeader.CONTENT_TYPE,
                "application/x-www-form-urlencoded;charset=UTF-8");
        header.setConnection(HttpHeader.CONNECTION, "Keep-Alive");
        requestBody body =new requestBody();
        body.setLatitude("39.961866963074606");
        body.setLongitude("116.35616120383973");
        body.setLtype("mars");
        body.setAppid("com.Kingdee.Express");
        body.setAdcode("110108");
        body.setAddress("北京市海淀区西土城路辅路靠近北京邮电大学电子工程学院");
        body.setMLatitude(39.961866963074606);
        body.setMLongitude(116.35616120383973);
        body.setOs_name("A0001");
        body.setOs_version("android5.1.1");
        body.setNt("wifi");
        body.setTra("f11761ea-3f99-46ca-b959-6334a0a25e7f");
//        long t = Long.getLong("1489224769854");
//        Log.d(TAG, "initRequest: t is "+ t);
//        body.setT(t);
        body.setMType("mars");
        body.setUchannel("null");
        Params params = new Params();
        Gson gson = new Gson();
        String json = gson.toJson(body);
        params.set("mathod","courieraround");
        params.set("json",json);
        params.set("hash","7f58bc797f122e6d9a608134b477c300");
        params.set("token",null);
        params.set("userid","0");
        StringRequst requst = new StringRequst(5, RequestUrl.REQUEST_URL, header,
                HttpMethod.POST, body, mListener, new CachePolicy() {
            @Override
            public boolean isNeedCached() {
                return false;
            }
        },params);
        requst.setTag("string");
        return requst;
    }
    }

