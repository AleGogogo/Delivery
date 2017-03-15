package com.example.lyw.expressdelivery.fragement;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lyw.expressdelivery.R;
import com.example.lyw.expressdelivery.view.ViewpagerIndicator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by LYW on 2017/3/15.
 */

public class HomeFragment extends Fragment {
    private ViewPager mViewPage;
    private List<Fragment> mFragmentcontainer = new ArrayList<>();
    private List<String> mTitles = Arrays.asList("全部","未签收","已签收","回收站");
    private ViewpagerIndicator mIndicator;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup
            container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home_fragment_layout,
                container, false);
        initView(view);
        return view;
    }

    private void initView(View view) {
        mViewPage = (ViewPager) view.findViewById(R.id.id_viewpager);
        mIndicator = (ViewpagerIndicator) view.findViewById(R.id
                .id_viewpagerindicator);
        mFragmentcontainer.add(new MainFragment());
        mFragmentcontainer.add(new NotsignedFragment());
        mFragmentcontainer.add(new SignedFragement());
        mFragmentcontainer.add(new GCFragement());
        mIndicator.setTabItemTitles(mTitles);
        mViewPage.setAdapter(new FragmentPagerAdapter(getFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return mFragmentcontainer.get(position);
            }

            @Override
            public int getCount() {
                return mFragmentcontainer.size();
            }
        });

    }
}
