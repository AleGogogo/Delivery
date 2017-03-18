package com.example.lyw.expressdelivery.fragement;

import android.os.Bundle;
import android.provider.DocumentsContract;
import android.support.annotation.Nullable;
import android.support.v7.widget.ListPopupWindow;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.lyw.expressdelivery.R;
import com.example.lyw.expressdelivery.adapter.DeliveryAdapter;

/**
 * Created by LYW on 2017/3/16.
 */

public class DeliveryFragment extends BasicFragment{
    private ListView mListview;

    @Override
    public int getResourceId() {
        return R.layout.fragment_dlivery;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         Rootview =  super.onCreateView(inflater, container, savedInstanceState);
          mListview = (ListView) Rootview.findViewById(R.id.id_fujin_listview);
        //  mListview.setAdapter(new DeliveryAdapter());
        return Rootview;
    }
}
