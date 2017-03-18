package com.example.lyw.expressdelivery.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.lyw.expressdelivery.R;
import com.example.lyw.expressdelivery.entity.Person_Nearly;
import com.example.lyw.expressdelivery.entity.TypeTwoHolder;

import java.util.List;

/**
 * Created by LYW on 2017/3/16.
 */

public class DeliveryAdapter extends BaseAdapter {

    private LayoutInflater mInflater;
    private List<Person_Nearly> mPepoles;
    private Context mContext;

    public DeliveryAdapter(List<Person_Nearly> mPepoles, Context mContext) {
        this.mPepoles = mPepoles;
        this.mContext = mContext;
        mInflater = LayoutInflater.from(mContext);

    }

    @Override
    public int getCount() {
        return mPepoles.size();
    }

    @Override
    public Object getItem(int i) {
        return mPepoles.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        TypeTwoHolder holder = null;
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.item_fujinren_layout,
                    viewGroup, false);

        }
        holder = new TypeTwoHolder(convertView,mPepoles.get(position));
        return convertView;
    }
}




