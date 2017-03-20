package com.example.lyw.expressdelivery.entity;

import java.util.List;

/**
 * Created by bluerain on 17-3-19.
 */

public class OrderPage {

    /**
     * status : 200
     * message : 成功
     * coList : [{"guid":"C3E02D400D98C229AF557B53D114E991","courierName":"陈平","courierTel":"1863****783","companyCode":"yuantong","companyName":"圆通速递","workArea":"上林溪南区...","logo":"https://cdn.kuaidi100.com/images/all/144/yuantong.png","login":true,"areaTime":0,"price":0,"avgTime":0,"url":"","defaultWorkTime":"","benefitInfo":"","doorService":""},{"guid":"097BA14F8DEC9F2C585362503D91C1E5","courierName":"卜令展","courierTel":"1851****936","companyCode":"debangwuliu","companyName":"德邦快递","workArea":"安宁庄北里8号...","logo":"https://cdn.kuaidi100.com/images/all/144/debangwuliu.png","login":true,"areaTime":0,"price":0,"avgTime":0,"url":"","defaultWorkTime":"","benefitInfo":"","doorService":""},{"guid":"75FA70678BEF6476A07367CA6627ED56","courierName":"张亿","courierTel":"1770****825","companyCode":"tiantian","companyName":"天天快递","workArea":"上林溪...","logo":"https://ptest.kuaidi100.com/mobile/mobileapi.do?method=download&id=avatar_c531099.jpg&t=1469776325364","login":true,"areaTime":0,"price":0,"avgTime":0,"url":"","defaultWorkTime":"","benefitInfo":"","doorService":""},{"guid":"BC32330C294F3D56CAD8E7DAD527A0BA","courierName":"祖金水","courierTel":"1355****591","companyCode":"tiantian","companyName":"天天快递","workArea":"光华创业园7号楼...","logo":"https://cdn.kuaidi100.com/images/all/144/tiantian.png","login":false,"areaTime":0,"price":0,"avgTime":0,"url":"","defaultWorkTime":"","benefitInfo":"","doorService":""},{"guid":"2FF3FA3463F2DDC41ADA8D8CD3D40AF6","courierName":"徐普乐","courierTel":"1891****031","companyCode":"zhongtong","companyName":"中通快递","workArea":"上林溪...","logo":"https://cdn.kuaidi100.com/images/all/144/zhongtong.png","login":false,"areaTime":0,"price":0,"avgTime":0,"url":"","defaultWorkTime":"","benefitInfo":"","doorService":""},{"guid":"C26EEC2C26BBCBB99781D291AA15745D","courierName":"孙浩","courierTel":"1851****371","companyCode":"ems","companyName":"EMS","workArea":"上林溪...","logo":"https://cdn.kuaidi100.com/images/all/144/ems.png","login":false,"areaTime":0,"price":0,"avgTime":0,"url":"","defaultWorkTime":"","benefitInfo":"","doorService":""},{"guid":"E2FF1BE8E4A736A8DCB425AE58520868","courierName":"李小刚","courierTel":"1891****319","companyCode":"huitongkuaidi","companyName":"百世汇通","workArea":"上林溪...","logo":"https://cdn.kuaidi100.com/images/all/144/huitongkuaidi.png","login":false,"areaTime":0,"price":0,"avgTime":0,"url":"","defaultWorkTime":"","benefitInfo":"","doorService":""},{"guid":"0BA6DFC6171E5905454C937744D3CD2F","courierName":"师晓刚","courierTel":"1800****893","companyCode":"zhaijisong","companyName":"宅急送","workArea":"水利一处宿舍...","logo":"https://cdn.kuaidi100.com/images/all/144/zhaijisong.png","login":false,"areaTime":0,"price":0,"avgTime":0,"url":"","defaultWorkTime":"","benefitInfo":"","doorService":""},{"guid":"1337A59C96C48EFA498768FCB487B7E4","courierName":"杜龙","courierTel":"1305****575","companyCode":"zhongtong","companyName":"中通快递","workArea":"上林溪南区...","logo":"https://cdn.kuaidi100.com/images/all/144/zhongtong.png","login":true,"areaTime":0,"price":0,"avgTime":0,"url":"","defaultWorkTime":"","benefitInfo":"","doorService":""},{"guid":"494595247B33B00AE5EF373EDBF676F0","courierName":"常志明","courierTel":"1851****430","companyCode":"tiantian","companyName":"天天快递","workArea":"KINGHORSE商务办公中心...","logo":"https://cdn.kuaidi100.com/images/all/144/tiantian.png","login":true,"areaTime":0,"price":0,"avgTime":0,"url":"","defaultWorkTime":"","benefitInfo":"","doorService":""},{"guid":"4E70A5DE38FEA44A6EB31EC09B95C55C","courierName":"刘勇","courierTel":"1336****757","companyCode":"zhongtong","companyName":"中通快递","workArea":"上林溪...","logo":"https://cdn.kuaidi100.com/images/all/144/zhongtong.png","login":true,"areaTime":0,"price":0,"avgTime":0,"url":"","defaultWorkTime":"","benefitInfo":"","doorService":""},{"guid":"82E18C6AC9286388501C0BBAF60097F2","courierName":"王红日","courierTel":"1337****331","companyCode":"zhongtong","companyName":"中通快递","workArea":"安宁庄东路6号院...","logo":"https://cdn.kuaidi100.com/images/all/144/zhongtong.png","login":false,"areaTime":0,"price":0,"avgTime":0,"url":"","defaultWorkTime":"","benefitInfo":"","doorService":""},{"guid":"699618DB8E755ADC772452C02F08544B","courierName":"张建波","courierTel":"1330****753","companyCode":"yunda","companyName":"韵达快运","workArea":"上林溪...","logo":"https://cdn.kuaidi100.com/images/all/144/yunda.png","login":false,"areaTime":0,"price":0,"avgTime":0,"url":"","defaultWorkTime":"","benefitInfo":"","doorService":""},{"guid":"DA541CC3A3DBD57C23EDAB339F8BF690","courierName":"边晓军","courierTel":"1891****189","companyCode":"yunda","companyName":"韵达快运","workArea":"安宁庄东路6号院...","logo":"https://cdn.kuaidi100.com/images/all/144/yunda.png","login":true,"areaTime":0,"price":0,"avgTime":0,"url":"","defaultWorkTime":"","benefitInfo":"","doorService":""}]
     * landMark : {"name":"上林溪南区","xzqNumber":"110808","xzqName":"海淀区","isAlias":0,"landMarkId":406418,"marsLng":116.333466,"marsLat":40.053372,"gpsLng":116.326892,"gpsLat":40.047648,"corename":"上林溪南区","distance":3.73937059109063E-4,"guid":"7036755DB30E180E62A0C8AC87C5C77B","city":"北京市"}
     * targetxzq : null
     */

    private int status;
    private String message;
    private LandMarkBean landMark;
    private Object targetxzq;
    private List<CoListBean> coList;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LandMarkBean getLandMark() {
        return landMark;
    }

    public void setLandMark(LandMarkBean landMark) {
        this.landMark = landMark;
    }

    public Object getTargetxzq() {
        return targetxzq;
    }

    public void setTargetxzq(Object targetxzq) {
        this.targetxzq = targetxzq;
    }

    public List<CoListBean> getCoList() {
        return coList;
    }

    public void setCoList(List<CoListBean> coList) {
        this.coList = coList;
    }

    public static class LandMarkBean {
        /**
         * name : 上林溪南区
         * xzqNumber : 110808
         * xzqName : 海淀区
         * isAlias : 0
         * landMarkId : 406418
         * marsLng : 116.333466
         * marsLat : 40.053372
         * gpsLng : 116.326892
         * gpsLat : 40.047648
         * corename : 上林溪南区
         * distance : 3.73937059109063E-4
         * guid : 7036755DB30E180E62A0C8AC87C5C77B
         * city : 北京市
         */

        private String name;
        private String xzqNumber;
        private String xzqName;
        private int isAlias;
        private int landMarkId;
        private double marsLng;
        private double marsLat;
        private double gpsLng;
        private double gpsLat;
        private String corename;
        private double distance;
        private String guid;
        private String city;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getXzqNumber() {
            return xzqNumber;
        }

        public void setXzqNumber(String xzqNumber) {
            this.xzqNumber = xzqNumber;
        }

        public String getXzqName() {
            return xzqName;
        }

        public void setXzqName(String xzqName) {
            this.xzqName = xzqName;
        }

        public int getIsAlias() {
            return isAlias;
        }

        public void setIsAlias(int isAlias) {
            this.isAlias = isAlias;
        }

        public int getLandMarkId() {
            return landMarkId;
        }

        public void setLandMarkId(int landMarkId) {
            this.landMarkId = landMarkId;
        }

        public double getMarsLng() {
            return marsLng;
        }

        public void setMarsLng(double marsLng) {
            this.marsLng = marsLng;
        }

        public double getMarsLat() {
            return marsLat;
        }

        public void setMarsLat(double marsLat) {
            this.marsLat = marsLat;
        }

        public double getGpsLng() {
            return gpsLng;
        }

        public void setGpsLng(double gpsLng) {
            this.gpsLng = gpsLng;
        }

        public double getGpsLat() {
            return gpsLat;
        }

        public void setGpsLat(double gpsLat) {
            this.gpsLat = gpsLat;
        }

        public String getCorename() {
            return corename;
        }

        public void setCorename(String corename) {
            this.corename = corename;
        }

        public double getDistance() {
            return distance;
        }

        public void setDistance(double distance) {
            this.distance = distance;
        }

        public String getGuid() {
            return guid;
        }

        public void setGuid(String guid) {
            this.guid = guid;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }
    }

    public static class CoListBean {
        /**
         * guid : C3E02D400D98C229AF557B53D114E991
         * courierName : 陈平
         * courierTel : 1863****783
         * companyCode : yuantong
         * companyName : 圆通速递
         * workArea : 上林溪南区...
         * logo : https://cdn.kuaidi100.com/images/all/144/yuantong.png
         * login : true
         * areaTime : 0
         * price : 0
         * avgTime : 0
         * url :
         * defaultWorkTime :
         * benefitInfo :
         * doorService :
         */

        private String guid;
        private String courierName;
        private String courierTel;
        private String companyCode;
        private String companyName;
        private String workArea;
        private String logo;
        private boolean login;
        private int areaTime;
        private int price;
        private int avgTime;
        private String url;
        private String defaultWorkTime;
        private String benefitInfo;
        private String doorService;

        public String getGuid() {
            return guid;
        }

        public void setGuid(String guid) {
            this.guid = guid;
        }

        public String getCourierName() {
            return courierName;
        }

        public void setCourierName(String courierName) {
            this.courierName = courierName;
        }

        public String getCourierTel() {
            return courierTel;
        }

        public void setCourierTel(String courierTel) {
            this.courierTel = courierTel;
        }

        public String getCompanyCode() {
            return companyCode;
        }

        public void setCompanyCode(String companyCode) {
            this.companyCode = companyCode;
        }

        public String getCompanyName() {
            return companyName;
        }

        public void setCompanyName(String companyName) {
            this.companyName = companyName;
        }

        public String getWorkArea() {
            return workArea;
        }

        public void setWorkArea(String workArea) {
            this.workArea = workArea;
        }

        public String getLogo() {
            return logo;
        }

        public void setLogo(String logo) {
            this.logo = logo;
        }

        public boolean isLogin() {
            return login;
        }

        public void setLogin(boolean login) {
            this.login = login;
        }

        public int getAreaTime() {
            return areaTime;
        }

        public void setAreaTime(int areaTime) {
            this.areaTime = areaTime;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public int getAvgTime() {
            return avgTime;
        }

        public void setAvgTime(int avgTime) {
            this.avgTime = avgTime;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getDefaultWorkTime() {
            return defaultWorkTime;
        }

        public void setDefaultWorkTime(String defaultWorkTime) {
            this.defaultWorkTime = defaultWorkTime;
        }

        public String getBenefitInfo() {
            return benefitInfo;
        }

        public void setBenefitInfo(String benefitInfo) {
            this.benefitInfo = benefitInfo;
        }

        public String getDoorService() {
            return doorService;
        }

        public void setDoorService(String doorService) {
            this.doorService = doorService;
        }
    }
}
