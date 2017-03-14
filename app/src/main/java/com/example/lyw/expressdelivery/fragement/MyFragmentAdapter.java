package com.example.lyw.expressdelivery.fragement;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by LYW on 2017/3/13.
 */

public class MyFragmentAdapter extends FragmentPagerAdapter {

    private List<Fragment> mFragmentList;

    private List<String> mTitles;

    public MyFragmentAdapter(FragmentManager fm, List<Fragment> fragmentList,
                             List<String> mTitles) {
        super(fm);
        this.mFragmentList = fragmentList;
        this.mTitles = mTitles;
    }

    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTitles.get(position);
    }
}
