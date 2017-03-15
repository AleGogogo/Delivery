package com.example.lyw.expressdelivery.fragement;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by LYW on 2017/3/15.
 */

public abstract class BasicFragment extends Fragment {
    public String mTitle;
    public static final String BUNDLE_TITLE = "mtitle";
    public abstract int getResourceId();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup
            container, @Nullable Bundle savedInstanceState) {
           View view =inflater.inflate(getResourceId(),container,false);
          Bundle bundle = getArguments();
         if (bundle != null){
            mTitle = bundle.getString(BUNDLE_TITLE);
         }
        TextView textView = new TextView(getActivity());
        textView.setText(mTitle);
        textView.setGravity(Gravity.CENTER);
        return view;
    }
    public static Fragment getInstance(String title){

        Bundle bundle = new Bundle();
        bundle.putString(BUNDLE_TITLE,title);
        Fragment basicFragment = new Fragment();
        basicFragment.setArguments(bundle);
        return basicFragment;
    }
}
