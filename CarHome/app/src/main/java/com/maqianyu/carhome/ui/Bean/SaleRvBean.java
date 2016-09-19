package com.maqianyu.carhome.ui.Bean;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dllo on 16/9/19.
 */
public class SaleRvBean {


    /**
     * returncode : 0
     * message : ok
     * result : {"functionlist":[{"id":13,"title":"汽车音频","iconurl":"http://x.autoimg.cn/app/image/banner/201512151831420159212.jpg","url":"","pvname":"电台来源-发现","pvkey":"v470_radio_radio_playFrom","type":2},{"id":14,"title":"活动/团购","iconurl":"http://x.autoimg.cn/app/image/banner/201512151831199052195.jpg","url":"","pvname":"降价-活动","pvkey":"v400_sale","type":2},{"id":6,"title":"车型对比","iconurl":"http://x.autoimg.cn/app/image/banner/201512151832212550562.jpg","url":"","pvname":"个人中心-车型对比","pvkey":"v400_userCenter","type":2},{"id":8,"title":"违章查询","iconurl":"http://x.autoimg.cn/app/image/banner/201512151832451378652.jpg","url":"http://wz.m.autohome.com.cn/?from=AutohomeApp&pvareaid=103171","pvname":"个人中心-违章查询","pvkey":"v400_userCenter","type":2},{"id":32,"title":"车友圈","iconurl":"http://app2.autoimg.cn/appdfs/g20/M13/FE/26/autohomecar__wKjBw1bx5T6ALBNaAAASTordXA8443.png","url":"http://friends.autohome.com.cn/index.html?v=20160325#pvareaid=2022104","pvname":"1","pvkey":"1","type":2},{"id":16,"title":"爱车估值","iconurl":"http://x.autoimg.cn/app/image/banner/201512151833054238527.jpg","url":"http://m.che168.com/pinggu/?buymark=oaha10027&sellmark=oaha10026&appversionbuy=2.08V&appversionsell=2.04V&hideheadfoot=1&hidead=1&pvareaid=101375","pvname":"发现-爱车估值","pvkey":"v470_discovery","type":2},{"id":7,"title":"购车计算","iconurl":"http://x.autoimg.cn/app/image/banner/201512151834138242781.jpg","url":"","pvname":"购车计算器来源-个人中心","pvkey":"v405_calculator_source","type":2},{"id":12,"title":"电动车之家","iconurl":"http://x.autoimg.cn/app/image/banner/201512151834333439510.jpg","url":"http://diandong.m.autohome.com.cn/#pvareaid=103843","pvname":"个人中心-电动车之家","pvkey":"v400_userCenter","type":2}],"businesslist":[{"id":1,"title":"车商城","iconurl":"http://app2.autoimg.cn/appdfs/g15/M00/65/FD/autohomecar__wKgH5Vch0vaAGdruAACw0ovsFis853.jpg","url":"http://m.mall.autohome.com.cn/#pvareaid=103544","pvname":"发现-车商城5.2","pvkey":"v470_discovery","type":2},{"id":2,"title":"分期购车","iconurl":"http://app2.autoimg.cn/appdfs/g23/M12/27/8F/autohomecar__wKjBwFb881GAbtRNAACvScRYTus125.jpg","url":"http://m.mall.autohome.com.cn/finance/list/3-0-0-0-0-0-0-0-0-1.html?isapp=1#pvareaid=106577","pvname":"发现-分期购车5.2","pvkey":"v470_discovery","type":2},{"id":23,"title":"二手车之家","iconurl":"http://app2.autoimg.cn/appdfs/g9/M02/53/0A/autohomecar__wKgH0FcM1gWAbeUUAAC4L5GkJkg359.jpg","url":"http://m.che168.com/beijing/list/?sourcename=main&pvareaid=101964","pvname":"","pvkey":"","type":2},{"id":4,"title":"养车特惠","iconurl":"http://app2.autoimg.cn/appdfs/g14/M04/45/1A/autohomecar__wKgH5Fb85D-AWLrEAACzS3eVCv8399.jpg","url":"http://yc.m.autohome.com.cn/index.do?&pvareaid=2008199&PreciseAD=autohome_app_faxian","pvname":"发现-养车特惠5.2","pvkey":"v470_discovery","type":2},{"id":3,"title":"汽车保险","iconurl":"http://app2.autoimg.cn/appdfs/g21/M02/49/A4/autohomecar__wKjBwlchz7aAEo2dAAC444dskz0500.jpg","url":"http://comm.app.autohome.com.cn/aspx/thirdlogin.aspx?keytype=2&islogin=-1&callbackurl=http%3A%2F%2Fbaoxian.autohome.com.cn%2Fmanage%2FappIndex","pvname":"发现-汽车保险5.2","pvkey":"v470_discovery","type":2},{"id":24,"title":"加油充值","iconurl":"http://app2.autoimg.cn/appdfs/g9/M0D/7A/DB/autohomecar__wKgH31cxSdCAStM2AAC3ANU4YaU896.jpg","url":"http://m.wz.qichecdn.com/JiaYou/oilv1.aspx?platformid=gsucTDsWOxw","pvname":"","pvkey":"","type":2}],"imageads":{"moreactivitysurl":"http://mobilenc.app.autohome.com.cn/discover_v5.8.0/mobile/activitylist.aspx?a=2&pm=2&v=5.8.5","imageadsinfo":[{"id":9028,"url":"http://inout.tuhu.cn/Click.aspx?c_id=1680&kw=k2%E7%94%A8%E7%9A%84%E6%98%AF%E4%BB%80%E4%B9%88%E8%BD%AE%E8%83%8E","imgurl":"http://app2.autoimg.cn/appdfs/g18/M06/4D/75/autohomecar__wKgH6FffWCOAAvqLAADQGFxHAkE392.jpg","type":2,"urlscheme":""},{"id":8759,"url":"http://java.jia.autohome.com.cn/mappweb/special/ganen#pvareaid=2088109","imgurl":"http://app2.autoimg.cn/appdfs/g9/M00/1B/0C/autohomecar__wKjBzlfFQYWAPtpPAADeS_9WqIg700.jpg","type":2,"urlscheme":""},{"id":8397,"url":"http://m.j.autohome.com.cn/pinpai/page?pvareaid=2020159","imgurl":"http://app2.autoimg.cn/appdfs/g11/M0F/21/5F/autohomecar__wKgH4VfFQZ-AT_CqAADZYlybGB4026.jpg","type":2,"urlscheme":""}]}}
     */

    private int returncode;
    private String message;
    /**
     * functionlist : [{"id":13,"title":"汽车音频","iconurl":"http://x.autoimg.cn/app/image/banner/201512151831420159212.jpg","url":"","pvname":"电台来源-发现","pvkey":"v470_radio_radio_playFrom","type":2},{"id":14,"title":"活动/团购","iconurl":"http://x.autoimg.cn/app/image/banner/201512151831199052195.jpg","url":"","pvname":"降价-活动","pvkey":"v400_sale","type":2},{"id":6,"title":"车型对比","iconurl":"http://x.autoimg.cn/app/image/banner/201512151832212550562.jpg","url":"","pvname":"个人中心-车型对比","pvkey":"v400_userCenter","type":2},{"id":8,"title":"违章查询","iconurl":"http://x.autoimg.cn/app/image/banner/201512151832451378652.jpg","url":"http://wz.m.autohome.com.cn/?from=AutohomeApp&pvareaid=103171","pvname":"个人中心-违章查询","pvkey":"v400_userCenter","type":2},{"id":32,"title":"车友圈","iconurl":"http://app2.autoimg.cn/appdfs/g20/M13/FE/26/autohomecar__wKjBw1bx5T6ALBNaAAASTordXA8443.png","url":"http://friends.autohome.com.cn/index.html?v=20160325#pvareaid=2022104","pvname":"1","pvkey":"1","type":2},{"id":16,"title":"爱车估值","iconurl":"http://x.autoimg.cn/app/image/banner/201512151833054238527.jpg","url":"http://m.che168.com/pinggu/?buymark=oaha10027&sellmark=oaha10026&appversionbuy=2.08V&appversionsell=2.04V&hideheadfoot=1&hidead=1&pvareaid=101375","pvname":"发现-爱车估值","pvkey":"v470_discovery","type":2},{"id":7,"title":"购车计算","iconurl":"http://x.autoimg.cn/app/image/banner/201512151834138242781.jpg","url":"","pvname":"购车计算器来源-个人中心","pvkey":"v405_calculator_source","type":2},{"id":12,"title":"电动车之家","iconurl":"http://x.autoimg.cn/app/image/banner/201512151834333439510.jpg","url":"http://diandong.m.autohome.com.cn/#pvareaid=103843","pvname":"个人中心-电动车之家","pvkey":"v400_userCenter","type":2}]
     * businesslist : [{"id":1,"title":"车商城","iconurl":"http://app2.autoimg.cn/appdfs/g15/M00/65/FD/autohomecar__wKgH5Vch0vaAGdruAACw0ovsFis853.jpg","url":"http://m.mall.autohome.com.cn/#pvareaid=103544","pvname":"发现-车商城5.2","pvkey":"v470_discovery","type":2},{"id":2,"title":"分期购车","iconurl":"http://app2.autoimg.cn/appdfs/g23/M12/27/8F/autohomecar__wKjBwFb881GAbtRNAACvScRYTus125.jpg","url":"http://m.mall.autohome.com.cn/finance/list/3-0-0-0-0-0-0-0-0-1.html?isapp=1#pvareaid=106577","pvname":"发现-分期购车5.2","pvkey":"v470_discovery","type":2},{"id":23,"title":"二手车之家","iconurl":"http://app2.autoimg.cn/appdfs/g9/M02/53/0A/autohomecar__wKgH0FcM1gWAbeUUAAC4L5GkJkg359.jpg","url":"http://m.che168.com/beijing/list/?sourcename=main&pvareaid=101964","pvname":"","pvkey":"","type":2},{"id":4,"title":"养车特惠","iconurl":"http://app2.autoimg.cn/appdfs/g14/M04/45/1A/autohomecar__wKgH5Fb85D-AWLrEAACzS3eVCv8399.jpg","url":"http://yc.m.autohome.com.cn/index.do?&pvareaid=2008199&PreciseAD=autohome_app_faxian","pvname":"发现-养车特惠5.2","pvkey":"v470_discovery","type":2},{"id":3,"title":"汽车保险","iconurl":"http://app2.autoimg.cn/appdfs/g21/M02/49/A4/autohomecar__wKjBwlchz7aAEo2dAAC444dskz0500.jpg","url":"http://comm.app.autohome.com.cn/aspx/thirdlogin.aspx?keytype=2&islogin=-1&callbackurl=http%3A%2F%2Fbaoxian.autohome.com.cn%2Fmanage%2FappIndex","pvname":"发现-汽车保险5.2","pvkey":"v470_discovery","type":2},{"id":24,"title":"加油充值","iconurl":"http://app2.autoimg.cn/appdfs/g9/M0D/7A/DB/autohomecar__wKgH31cxSdCAStM2AAC3ANU4YaU896.jpg","url":"http://m.wz.qichecdn.com/JiaYou/oilv1.aspx?platformid=gsucTDsWOxw","pvname":"","pvkey":"","type":2}]
     * imageads : {"moreactivitysurl":"http://mobilenc.app.autohome.com.cn/discover_v5.8.0/mobile/activitylist.aspx?a=2&pm=2&v=5.8.5","imageadsinfo":[{"id":9028,"url":"http://inout.tuhu.cn/Click.aspx?c_id=1680&kw=k2%E7%94%A8%E7%9A%84%E6%98%AF%E4%BB%80%E4%B9%88%E8%BD%AE%E8%83%8E","imgurl":"http://app2.autoimg.cn/appdfs/g18/M06/4D/75/autohomecar__wKgH6FffWCOAAvqLAADQGFxHAkE392.jpg","type":2,"urlscheme":""},{"id":8759,"url":"http://java.jia.autohome.com.cn/mappweb/special/ganen#pvareaid=2088109","imgurl":"http://app2.autoimg.cn/appdfs/g9/M00/1B/0C/autohomecar__wKjBzlfFQYWAPtpPAADeS_9WqIg700.jpg","type":2,"urlscheme":""},{"id":8397,"url":"http://m.j.autohome.com.cn/pinpai/page?pvareaid=2020159","imgurl":"http://app2.autoimg.cn/appdfs/g11/M0F/21/5F/autohomecar__wKgH4VfFQZ-AT_CqAADZYlybGB4026.jpg","type":2,"urlscheme":""}]}
     */

    private ResultBean result;

    public static SaleRvBean objectFromData(String str) {

        return new Gson().fromJson(str, SaleRvBean.class);
    }

    public static SaleRvBean objectFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);

            return new Gson().fromJson(jsonObject.getString(str), SaleRvBean.class);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static List<SaleRvBean> arraySaleRvBeanFromData(String str) {

        Type listType = new TypeToken<ArrayList<SaleRvBean>>() {
        }.getType();

        return new Gson().fromJson(str, listType);
    }

    public static List<SaleRvBean> arraySaleRvBeanFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);
            Type listType = new TypeToken<ArrayList<SaleRvBean>>() {
            }.getType();

            return new Gson().fromJson(jsonObject.getString(str), listType);

        } catch (JSONException e) {
            e.printStackTrace();
        }

        return new ArrayList();


    }

    public int getReturncode() {
        return returncode;
    }

    public void setReturncode(int returncode) {
        this.returncode = returncode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * moreactivitysurl : http://mobilenc.app.autohome.com.cn/discover_v5.8.0/mobile/activitylist.aspx?a=2&pm=2&v=5.8.5
         * imageadsinfo : [{"id":9028,"url":"http://inout.tuhu.cn/Click.aspx?c_id=1680&kw=k2%E7%94%A8%E7%9A%84%E6%98%AF%E4%BB%80%E4%B9%88%E8%BD%AE%E8%83%8E","imgurl":"http://app2.autoimg.cn/appdfs/g18/M06/4D/75/autohomecar__wKgH6FffWCOAAvqLAADQGFxHAkE392.jpg","type":2,"urlscheme":""},{"id":8759,"url":"http://java.jia.autohome.com.cn/mappweb/special/ganen#pvareaid=2088109","imgurl":"http://app2.autoimg.cn/appdfs/g9/M00/1B/0C/autohomecar__wKjBzlfFQYWAPtpPAADeS_9WqIg700.jpg","type":2,"urlscheme":""},{"id":8397,"url":"http://m.j.autohome.com.cn/pinpai/page?pvareaid=2020159","imgurl":"http://app2.autoimg.cn/appdfs/g11/M0F/21/5F/autohomecar__wKgH4VfFQZ-AT_CqAADZYlybGB4026.jpg","type":2,"urlscheme":""}]
         */

        private ImageadsBean imageads;
        /**
         * id : 13
         * title : 汽车音频
         * iconurl : http://x.autoimg.cn/app/image/banner/201512151831420159212.jpg
         * url :
         * pvname : 电台来源-发现
         * pvkey : v470_radio_radio_playFrom
         * type : 2
         */

        private List<FunctionlistBean> functionlist;
        /**
         * id : 1
         * title : 车商城
         * iconurl : http://app2.autoimg.cn/appdfs/g15/M00/65/FD/autohomecar__wKgH5Vch0vaAGdruAACw0ovsFis853.jpg
         * url : http://m.mall.autohome.com.cn/#pvareaid=103544
         * pvname : 发现-车商城5.2
         * pvkey : v470_discovery
         * type : 2
         */

        private List<BusinesslistBean> businesslist;

        public static ResultBean objectFromData(String str) {

            return new Gson().fromJson(str, ResultBean.class);
        }

        public static ResultBean objectFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);

                return new Gson().fromJson(jsonObject.getString(str), ResultBean.class);
            } catch (JSONException e) {
                e.printStackTrace();
            }

            return null;
        }

        public static List<ResultBean> arrayResultBeanFromData(String str) {

            Type listType = new TypeToken<ArrayList<ResultBean>>() {
            }.getType();

            return new Gson().fromJson(str, listType);
        }

        public static List<ResultBean> arrayResultBeanFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);
                Type listType = new TypeToken<ArrayList<ResultBean>>() {
                }.getType();

                return new Gson().fromJson(jsonObject.getString(str), listType);

            } catch (JSONException e) {
                e.printStackTrace();
            }

            return new ArrayList();


        }

        public ImageadsBean getImageads() {
            return imageads;
        }

        public void setImageads(ImageadsBean imageads) {
            this.imageads = imageads;
        }

        public List<FunctionlistBean> getFunctionlist() {
            return functionlist;
        }

        public void setFunctionlist(List<FunctionlistBean> functionlist) {
            this.functionlist = functionlist;
        }

        public List<BusinesslistBean> getBusinesslist() {
            return businesslist;
        }

        public void setBusinesslist(List<BusinesslistBean> businesslist) {
            this.businesslist = businesslist;
        }

        public static class ImageadsBean {
            private String moreactivitysurl;
            /**
             * id : 9028
             * url : http://inout.tuhu.cn/Click.aspx?c_id=1680&kw=k2%E7%94%A8%E7%9A%84%E6%98%AF%E4%BB%80%E4%B9%88%E8%BD%AE%E8%83%8E
             * imgurl : http://app2.autoimg.cn/appdfs/g18/M06/4D/75/autohomecar__wKgH6FffWCOAAvqLAADQGFxHAkE392.jpg
             * type : 2
             * urlscheme :
             */

            private List<ImageadsinfoBean> imageadsinfo;

            public static ImageadsBean objectFromData(String str) {

                return new Gson().fromJson(str, ImageadsBean.class);
            }

            public static ImageadsBean objectFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);

                    return new Gson().fromJson(jsonObject.getString(str), ImageadsBean.class);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return null;
            }

            public static List<ImageadsBean> arrayImageadsBeanFromData(String str) {

                Type listType = new TypeToken<ArrayList<ImageadsBean>>() {
                }.getType();

                return new Gson().fromJson(str, listType);
            }

            public static List<ImageadsBean> arrayImageadsBeanFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);
                    Type listType = new TypeToken<ArrayList<ImageadsBean>>() {
                    }.getType();

                    return new Gson().fromJson(jsonObject.getString(str), listType);

                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return new ArrayList();


            }

            public String getMoreactivitysurl() {
                return moreactivitysurl;
            }

            public void setMoreactivitysurl(String moreactivitysurl) {
                this.moreactivitysurl = moreactivitysurl;
            }

            public List<ImageadsinfoBean> getImageadsinfo() {
                return imageadsinfo;
            }

            public void setImageadsinfo(List<ImageadsinfoBean> imageadsinfo) {
                this.imageadsinfo = imageadsinfo;
            }

            public static class ImageadsinfoBean {
                private int id;
                private String url;
                private String imgurl;
                private int type;
                private String urlscheme;

                public static ImageadsinfoBean objectFromData(String str) {

                    return new Gson().fromJson(str, ImageadsinfoBean.class);
                }

                public static ImageadsinfoBean objectFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);

                        return new Gson().fromJson(jsonObject.getString(str), ImageadsinfoBean.class);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return null;
                }

                public static List<ImageadsinfoBean> arrayImageadsinfoBeanFromData(String str) {

                    Type listType = new TypeToken<ArrayList<ImageadsinfoBean>>() {
                    }.getType();

                    return new Gson().fromJson(str, listType);
                }

                public static List<ImageadsinfoBean> arrayImageadsinfoBeanFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);
                        Type listType = new TypeToken<ArrayList<ImageadsinfoBean>>() {
                        }.getType();

                        return new Gson().fromJson(jsonObject.getString(str), listType);

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return new ArrayList();


                }

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getImgurl() {
                    return imgurl;
                }

                public void setImgurl(String imgurl) {
                    this.imgurl = imgurl;
                }

                public int getType() {
                    return type;
                }

                public void setType(int type) {
                    this.type = type;
                }

                public String getUrlscheme() {
                    return urlscheme;
                }

                public void setUrlscheme(String urlscheme) {
                    this.urlscheme = urlscheme;
                }
            }
        }

        public static class FunctionlistBean {
            private int id;
            private String title;
            private String iconurl;
            private String url;
            private String pvname;
            private String pvkey;
            private int type;

            public static FunctionlistBean objectFromData(String str) {

                return new Gson().fromJson(str, FunctionlistBean.class);
            }

            public static FunctionlistBean objectFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);

                    return new Gson().fromJson(jsonObject.getString(str), FunctionlistBean.class);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return null;
            }

            public static List<FunctionlistBean> arrayFunctionlistBeanFromData(String str) {

                Type listType = new TypeToken<ArrayList<FunctionlistBean>>() {
                }.getType();

                return new Gson().fromJson(str, listType);
            }

            public static List<FunctionlistBean> arrayFunctionlistBeanFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);
                    Type listType = new TypeToken<ArrayList<FunctionlistBean>>() {
                    }.getType();

                    return new Gson().fromJson(jsonObject.getString(str), listType);

                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return new ArrayList();


            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getIconurl() {
                return iconurl;
            }

            public void setIconurl(String iconurl) {
                this.iconurl = iconurl;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getPvname() {
                return pvname;
            }

            public void setPvname(String pvname) {
                this.pvname = pvname;
            }

            public String getPvkey() {
                return pvkey;
            }

            public void setPvkey(String pvkey) {
                this.pvkey = pvkey;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }
        }

        public static class BusinesslistBean {
            private int id;
            private String title;
            private String iconurl;
            private String url;
            private String pvname;
            private String pvkey;
            private int type;

            public static BusinesslistBean objectFromData(String str) {

                return new Gson().fromJson(str, BusinesslistBean.class);
            }

            public static BusinesslistBean objectFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);

                    return new Gson().fromJson(jsonObject.getString(str), BusinesslistBean.class);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return null;
            }

            public static List<BusinesslistBean> arrayBusinesslistBeanFromData(String str) {

                Type listType = new TypeToken<ArrayList<BusinesslistBean>>() {
                }.getType();

                return new Gson().fromJson(str, listType);
            }

            public static List<BusinesslistBean> arrayBusinesslistBeanFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);
                    Type listType = new TypeToken<ArrayList<BusinesslistBean>>() {
                    }.getType();

                    return new Gson().fromJson(jsonObject.getString(str), listType);

                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return new ArrayList();


            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getIconurl() {
                return iconurl;
            }

            public void setIconurl(String iconurl) {
                this.iconurl = iconurl;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getPvname() {
                return pvname;
            }

            public void setPvname(String pvname) {
                this.pvname = pvname;
            }

            public String getPvkey() {
                return pvkey;
            }

            public void setPvkey(String pvkey) {
                this.pvkey = pvkey;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }
        }
    }
}
