package com.example.lyw.expressdelivery.fragement;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.lyw.expressdelivery.R;

/**
 * Created by LYW on 2017/3/13.
 */

public class MainFragment extends BasicFragment {


    private static final String TAG = "MainFragment";
    @Override
    public int getResourceId() {
        Log.d(TAG, "getResourceId: ");
        return R.layout.tab1;
    }
}
