package com.example.lyw.expressdelivery.entity;

import android.view.View;
import android.widget.TextView;

import com.example.lyw.expressdelivery.R;

/**
 * Created by LYW on 2017/3/16.
 */

public class TypeTwoHolder extends TypeHolder{

    private int type = 2;
    private int logoIcon;
    private TextView mName;
    private TextView mCompany;
    private TextView mLocalInfo;
    private TextView mTime;
    private PersonNearly mPerson;

    public TypeTwoHolder(View itemView,PersonNearly mPerson) {
        super(itemView);
        mName = (TextView)itemView.findViewById(R.id.id_name_text);
        mCompany = (TextView)itemView.findViewById(R.id.fujinren_company);
        mLocalInfo = (TextView)itemView.findViewById(R.id.id_fujinrenxiangqing);
        mTime = (TextView)itemView.findViewById(R.id.id_kuaidishijian);
        this.mPerson = mPerson ;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getLogoIcon() {
        return logoIcon;
    }

    public void setLogoIcon(int logoIcon) {
        this.logoIcon = logoIcon;
    }


    @Override
    public void bindHolder(Object o) {
        if (o instanceof PersonNearly)
            mPerson = (PersonNearly) o;
        mName.setText(mPerson.getCourierName());
        mCompany.setText(mPerson.getCompanyName());
        mLocalInfo.setText(mPerson.getWorkArea());
        mTime.setText(mPerson.getAreaTime());
    }
}
