package com.example.lyw.expressdelivery;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerTabStrip;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.lyw.expressdelivery.fragement.GCFragement;
import com.example.lyw.expressdelivery.fragement.MainFragment;
import com.example.lyw.expressdelivery.view.ViewpagerIndicator;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Toolbar mToolbar;
    private List<Fragment> mFragmentList;
    private ViewpagerIndicator mIndicator;
    private ViewPager mViewPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

    }

    private void initView() {
        mToolbar = (Toolbar) findViewById(R.id.id_toolbar);
        setSupportActionBar(mToolbar);
        mIndicator = (ViewpagerIndicator) findViewById(R.id
                .id_viewpagerindicator);
        mViewPage = (ViewPager) findViewById(R.id.id_viewpager);


    }

}
