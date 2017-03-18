package com.example.lyw.expressdelivery.entity;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by LYW on 2017/3/16.
 */

public abstract class TypeHolder extends RecyclerView.ViewHolder{
    public int type;

    public TypeHolder(View itemView) {
        super(itemView);
    }
    public abstract void bindHolder(Object model);
}
