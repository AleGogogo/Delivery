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
    public abstract int getResourceId();
    public View Rootview;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup
            container, @Nullable Bundle savedInstanceState) {
            Rootview =inflater.inflate(getResourceId(),container,false);
        return Rootview;
    }

}
