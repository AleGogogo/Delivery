package com.example.lyw.expressdelivery;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import com.example.lyw.expressdelivery.entity.OrderPage;
import com.example.lyw.expressdelivery.entity.PersonNearly;
import com.example.lyw.expressdelivery.fragement.DeliveryFragment;
import com.example.lyw.expressdelivery.fragement.HomeFragment;
import com.example.lyw.expressdelivery.fragement.SearchFragment;
import com.example.lyw.expressdelivery.net.CachePolicy;
import com.example.lyw.expressdelivery.net.HttpMethod;
import com.example.lyw.expressdelivery.net.RequestManager;
import com.example.lyw.expressdelivery.net.Response;
import com.example.lyw.expressdelivery.request.ObjectRequest;
import com.example.lyw.expressdelivery.request.Params;
import com.example.lyw.expressdelivery.request.Request;
import com.example.lyw.expressdelivery.request.StringRequest;
import com.example.lyw.expressdelivery.request.requestBody;
import com.example.lyw.expressdelivery.util.HttpHeader;
import com.example.lyw.expressdelivery.util.RequestUrl;
import com.google.gson.Gson;

import java.util.List;

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
                mRequestManager.addRequest(initRequest());
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

    private ObjectRequest initRequest() {
        HttpHeader header = new HttpHeader();
        header.setAcceptEncoding(HttpHeader.ACCEPT_ENCODING, "gzip");
        header.setUserAgent(HttpHeader.USER_AGENT, "Dalvik/2.1.0 " +
                "(Linux; U; Android 5.1.1; A0001 Build/LVY48F)");
        header.setContentLength(HttpHeader.CONTENT_LENGTH, "949");
        header.setContentType(HttpHeader.CONTENT_TYPE,
                "application/x-www-form-urlencoded;charset=UTF-8");
        header.setConnection(HttpHeader.CONNECTION, "Keep-Alive");
        requestBody body = new requestBody();
        body.setLatitude("40.047275040481445");
        body.setLongitude("116.32690854887272");
        body.setLtype("mars");
        body.setAppid("com.Kingdee.Express");
        body.setAdcode("110108");
        body.setAddress("北京市海淀区安宁庄东路靠近安宁庄后街13号院(安宁庄东路)");
        body.setMLatitude(40.047275040481445);
        body.setMLongitude(116.32690854887272);
        body.setOs_name("A0001");
        body.setOs_version("android5.1.1");
        body.setNt("wifi");
        body.setTra("f11761ea-3f99-46ca-b959-6334a0a25e7f");
        long t = Long.parseLong("1489224769854");
        body.setVersionCode(436);
//        Log.d(TAG, "initRequest: t is "+ t);
        body.setT(t);
        body.setMType("mars");
        body.setUchannel("null");
        Params params = new Params();
        Gson gson = new Gson();
        String json = gson.toJson(body);
        params.put("method", "courieraround");
        params.put("json", json);
        params.put("hash", "78aca618d7cfdd729ac930e1fb5fbf17");
        params.put("token", "M9MpmsceIrS74Jzk95Cbdvo4p8TM5d_0TgUuIyTdBlw");
        params.put("userid", "11081583");
        ObjectRequest requst = new ObjectRequest(5, OrderPage.class, RequestUrl.REQUEST_ORDER_URL, header,
                HttpMethod.POST, body, new Request.Listener<OrderPage>() {
            @Override
            public void onSuccess(OrderPage response) {

            }

            @Override
            public void onFailed(String str) {

            }
        }, new CachePolicy() {
            @Override
            public boolean isNeedCached() {
                return false;
            }
        }, params);
        requst.setTag("string");
        return requst;
    }
}

