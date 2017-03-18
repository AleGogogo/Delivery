package com.example.lyw.expressdelivery.entity;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.lyw.expressdelivery.R;

/**
 * Created by LYW on 2017/3/16.
 */

public class TypeOneHolder extends TypeHolder{

    public int type = 1;
    private TextView mFromInfo;
    private TextView mToInfo;
    private ImageButton mArrow;
    private ImageButton mClear;

    public TypeOneHolder(View itemView) {
        super(itemView);
        mFromInfo = (TextView) itemView.findViewById(R.id.id_local_from_text);
        mToInfo = (TextView) itemView.findViewById(R.id.id_local_to_text);
        mArrow = (ImageButton) itemView.findViewById(R.id.id_imgbutton_arrow);
        mClear = (ImageButton) itemView.findViewById(R.id.id_delete_buttom);
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }





    @Override
    public void bindHolder(Object model) {
        LocalInfo info = (LocalInfo)model;
        mToInfo.setText(info.getToInfo());
        mFromInfo.setText(info.getFromInfo());
    }
}
