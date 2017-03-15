package com.example.lyw.expressdelivery;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.lyw.expressdelivery.fragement.HomeFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

    }

    private void initView() {
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new HomeFragment()).commit();
    }

}
