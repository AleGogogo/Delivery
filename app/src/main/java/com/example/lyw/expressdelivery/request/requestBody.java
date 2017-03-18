package com.example.lyw.expressdelivery.request;

/**
 * Created by LYW on 2017/3/17.
 */

public class requestBody {
    /**
     * latitude : 39.961866963074606
     * longitude : 116.35616120383973
     * ltype : mars
     * appid : com.Kingdee.Express
     * versionCode : 436
     * os_version : android5.1.1
     * os_name : A0001
     * t : 1489224769854
     * tra : f11761ea-3f99-46ca-b959-6334a0a25e7f
     * uchannel : null
     * nt : wifi
     * mType : mars
     * mLatitude : 39.961866963074606
     * mLongitude : 116.35616120383973
     * adcode : 110108
     * address : 北京市海淀区西土城路辅路靠近北京邮电大学电子工程学院
     */

    private String latitude;
    private String longitude;
    private String ltype;
    private String appid;
    private int versionCode;
    private String os_version;
    private String os_name;
    private long  t;
    private String tra;
    private String uchannel;
    private String nt;
    private String mType;
    private double mLatitude;
    private double mLongitude;
    private String adcode;
    private String address;

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLtype() {
        return ltype;
    }

    public void setLtype(String ltype) {
        this.ltype = ltype;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public int getVersionCode() {
        return versionCode;
    }

    public void setVersionCode(int versionCode) {
        this.versionCode = versionCode;
    }

    public String getOs_version() {
        return os_version;
    }

    public void setOs_version(String os_version) {
        this.os_version = os_version;
    }

    public String getOs_name() {
        return os_name;
    }

    public void setOs_name(String os_name) {
        this.os_name = os_name;
    }

    public long getT() {
        return t;
    }

    public void setT(long t) {
        this.t = t;
    }

    public String getTra() {
        return tra;
    }

    public void setTra(String tra) {
        this.tra = tra;
    }

    public String getUchannel() {
        return uchannel;
    }

    public void setUchannel(String uchannel) {
        this.uchannel = uchannel;
    }

    public String getNt() {
        return nt;
    }

    public void setNt(String nt) {
        this.nt = nt;
    }

    public String getMType() {
        return mType;
    }

    public void setMType(String mType) {
        this.mType = mType;
    }

    public double getMLatitude() {
        return mLatitude;
    }

    public void setMLatitude(double mLatitude) {
        this.mLatitude = mLatitude;
    }

    public double getMLongitude() {
        return mLongitude;
    }

    public void setMLongitude(double mLongitude) {
        this.mLongitude = mLongitude;
    }

    public String getAdcode() {
        return adcode;
    }

    public void setAdcode(String adcode) {
        this.adcode = adcode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    /**
     * {"latitude":"39.961866963074606","longitude":"116.35616120383973",
     * "ltype":"mars","appid":"com.Kingdee.Express","versionCode":436,
     * "os_version":"android5.1.1","os_name":"A0001","t":1489224769854,
     * "tra":"f11761ea-3f99-46ca-b959-6334a0a25e7f","uchannel":"null",
     * "nt":"wifi","mType":"mars","mLatitude":39.961866963074606,
     * "mLongitude":116.35616120383973,"adcode":,
     * "address":}
     */
}
