package com.maqianyu.carhome.ui.Bean;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;

import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dllo on 16/9/28.
 */
public class FinderInfoBean {

    /**
     * returncode : 0
     * message :
     * result : {"name":"阿斯顿·马丁DB9","logo":"http://car3.autoimg.cn/cardfs/product/g6/M07/E0/74/w_autohomecar__wKgHzVZIVpyAGHyxAAVthSQi_RQ315.jpg","piccount":2130,"clubid":266,"levelname":"跑车","fctprice":"341.80-388.80万","stopsellcarnum":0,"paramlist":[{"name":"级别","value":"跑车"},{"name":"发动机","value":"6.0L"},{"name":"变速箱","value":"手自一体"}],"spectype":[{"name":"在售","value":"0x000c"},{"name":"停售","value":"0x0010"}],"seriesid":266,"enginelist":[{"type":"0x000c","name":"6.0升 自然吸气 517马力","speclist":[{"id":25149,"name":"2015款 6.0L Coupe","price":"341.80万","description":"前置后驱 6挡手自一体","structure":"","paramisshow":"1","state":20,"attention":40,"electriccarname":"","electriccarval":"","minprice":"","canaskprice":1,"specbottomtitle":"询底价","specbottomurl":"","saletype":0,"pricename":"厂商指导价："},{"id":25150,"name":"2015款 6.0L Volante","price":"373.80万","description":"前置后驱 6挡手自一体","structure":"","paramisshow":"1","state":20,"attention":20,"electriccarname":"","electriccarval":"","minprice":"","canaskprice":1,"specbottomtitle":"询底价","specbottomurl":"","saletype":0,"pricename":"厂商指导价："}]},{"type":"0x000c","name":"6.0升 自然吸气 547马力","speclist":[{"id":24530,"name":"2016款 6.0L GT邦德限量版","price":"388.80万","description":"前置后驱 6挡手自一体","structure":"","paramisshow":"1","state":20,"attention":100,"electriccarname":"","electriccarval":"","minprice":"","canaskprice":1,"specbottomtitle":"询底价","specbottomurl":"","saletype":0,"pricename":"厂商指导价："}]}],"koubeiscore":"","bottombtnsubtitle":"经销商为您报价","bottombtntitle":"询底价","type":0,"bottombtnurl":"","dealercount":0,"hascarmall":0,"carmallurl":"","carmalltitle":"","carmalltext":"折","lowprice":"","2sccount":0,"brandid":35,"brandname":"阿斯顿·马丁","koubeicount":7,"newscount":50,"videocount":33,"topiccount":2950,"explaincount":5,"attentionspecid":24530,"manyvictors":{},"canaskprice":1,"shareinfo":{"url":"http://m.autohome.com.cn/266/","title":"阿斯顿·马丁DB9","logo":"http://car3.autoimg.cn/cardfs/product/g6/M07/E0/74/t_autohomecar__wKgHzVZIVpyAGHyxAAVthSQi_RQ315.jpg"},"ownerpricecount":1,"specids":"25149,25150,24530","tabinfos":[{"tabtitle":"配置","tabsubtitle":"3 款车型配置","tabtype":10,"tabicon":""},{"tabtitle":"口碑","tabsubtitle":"7 篇口碑","tabtype":0,"tabicon":""},{"tabtitle":"经销商","tabsubtitle":"0 家经销商","tabtype":1,"tabicon":""},{"tabtitle":"降价","tabsubtitle":"暂无降价","tabtype":2,"tabicon":""},{"tabtitle":"论坛","tabsubtitle":"2950 篇帖子","tabtype":3,"tabicon":""},{"tabtitle":"二手车","tabsubtitle":"0 辆二手车","tabtype":4,"tabicon":""},{"tabtitle":"资讯","tabsubtitle":"50 条资讯","tabtype":5,"tabicon":""},{"tabtitle":"视频","tabsubtitle":"33 个视频","tabtype":6,"tabicon":""},{"tabtitle":"详解","tabsubtitle":"5 个类别详解","tabtype":7,"tabicon":""},{"tabtitle":"车主价格","tabsubtitle":"1 位车主提供","tabtype":8,"tabicon":""},{"tabtitle":"质量评价","tabsubtitle":"暂无 新车 | 暂无 可靠性","tabtype":11,"tabicon":"","taburl":"http://app.k.autohome.com.cn/266/appquality?type=1"}],"teambuyinginfo":{},"levelid":"7","fctpricename":"厂商指导价："}
     */

    private int returncode;
    private String message;
    /**
     * name : 阿斯顿·马丁DB9
     * logo : http://car3.autoimg.cn/cardfs/product/g6/M07/E0/74/w_autohomecar__wKgHzVZIVpyAGHyxAAVthSQi_RQ315.jpg
     * piccount : 2130
     * clubid : 266
     * levelname : 跑车
     * fctprice : 341.80-388.80万
     * stopsellcarnum : 0
     * paramlist : [{"name":"级别","value":"跑车"},{"name":"发动机","value":"6.0L"},{"name":"变速箱","value":"手自一体"}]
     * spectype : [{"name":"在售","value":"0x000c"},{"name":"停售","value":"0x0010"}]
     * seriesid : 266
     * enginelist : [{"type":"0x000c","name":"6.0升 自然吸气 517马力","speclist":[{"id":25149,"name":"2015款 6.0L Coupe","price":"341.80万","description":"前置后驱 6挡手自一体","structure":"","paramisshow":"1","state":20,"attention":40,"electriccarname":"","electriccarval":"","minprice":"","canaskprice":1,"specbottomtitle":"询底价","specbottomurl":"","saletype":0,"pricename":"厂商指导价："},{"id":25150,"name":"2015款 6.0L Volante","price":"373.80万","description":"前置后驱 6挡手自一体","structure":"","paramisshow":"1","state":20,"attention":20,"electriccarname":"","electriccarval":"","minprice":"","canaskprice":1,"specbottomtitle":"询底价","specbottomurl":"","saletype":0,"pricename":"厂商指导价："}]},{"type":"0x000c","name":"6.0升 自然吸气 547马力","speclist":[{"id":24530,"name":"2016款 6.0L GT邦德限量版","price":"388.80万","description":"前置后驱 6挡手自一体","structure":"","paramisshow":"1","state":20,"attention":100,"electriccarname":"","electriccarval":"","minprice":"","canaskprice":1,"specbottomtitle":"询底价","specbottomurl":"","saletype":0,"pricename":"厂商指导价："}]}]
     * koubeiscore :
     * bottombtnsubtitle : 经销商为您报价
     * bottombtntitle : 询底价
     * type : 0
     * bottombtnurl :
     * dealercount : 0
     * hascarmall : 0
     * carmallurl :
     * carmalltitle :
     * carmalltext : 折
     * lowprice :
     * 2sccount : 0
     * brandid : 35
     * brandname : 阿斯顿·马丁
     * koubeicount : 7
     * newscount : 50
     * videocount : 33
     * topiccount : 2950
     * explaincount : 5
     * attentionspecid : 24530
     * manyvictors : {}
     * canaskprice : 1
     * shareinfo : {"url":"http://m.autohome.com.cn/266/","title":"阿斯顿·马丁DB9","logo":"http://car3.autoimg.cn/cardfs/product/g6/M07/E0/74/t_autohomecar__wKgHzVZIVpyAGHyxAAVthSQi_RQ315.jpg"}
     * ownerpricecount : 1
     * specids : 25149,25150,24530
     * tabinfos : [{"tabtitle":"配置","tabsubtitle":"3 款车型配置","tabtype":10,"tabicon":""},{"tabtitle":"口碑","tabsubtitle":"7 篇口碑","tabtype":0,"tabicon":""},{"tabtitle":"经销商","tabsubtitle":"0 家经销商","tabtype":1,"tabicon":""},{"tabtitle":"降价","tabsubtitle":"暂无降价","tabtype":2,"tabicon":""},{"tabtitle":"论坛","tabsubtitle":"2950 篇帖子","tabtype":3,"tabicon":""},{"tabtitle":"二手车","tabsubtitle":"0 辆二手车","tabtype":4,"tabicon":""},{"tabtitle":"资讯","tabsubtitle":"50 条资讯","tabtype":5,"tabicon":""},{"tabtitle":"视频","tabsubtitle":"33 个视频","tabtype":6,"tabicon":""},{"tabtitle":"详解","tabsubtitle":"5 个类别详解","tabtype":7,"tabicon":""},{"tabtitle":"车主价格","tabsubtitle":"1 位车主提供","tabtype":8,"tabicon":""},{"tabtitle":"质量评价","tabsubtitle":"暂无 新车 | 暂无 可靠性","tabtype":11,"tabicon":"","taburl":"http://app.k.autohome.com.cn/266/appquality?type=1"}]
     * teambuyinginfo : {}
     * levelid : 7
     * fctpricename : 厂商指导价：
     */

    private ResultBean result;

    public static FinderInfoBean objectFromData(String str) {

        return new Gson().fromJson(str, FinderInfoBean.class);
    }

    public static FinderInfoBean objectFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);

            return new Gson().fromJson(jsonObject.getString(str), FinderInfoBean.class);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static List<FinderInfoBean> arrayFinderInfoBeanFromData(String str) {

        Type listType = new TypeToken<ArrayList<FinderInfoBean>>() {
        }.getType();

        return new Gson().fromJson(str, listType);
    }

    public static List<FinderInfoBean> arrayFinderInfoBeanFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);
            Type listType = new TypeToken<ArrayList<FinderInfoBean>>() {
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
        private String name;
        private String logo;
        private int piccount;
        private int clubid;
        private String levelname;
        private String fctprice;
        private int stopsellcarnum;
        private int seriesid;
        private String koubeiscore;
        private String bottombtnsubtitle;
        private String bottombtntitle;
        private int type;
        private String bottombtnurl;
        private int dealercount;
        private int hascarmall;
        private String carmallurl;
        private String carmalltitle;
        private String carmalltext;
        private String lowprice;
        @SerializedName("2sccount")
        private int value2sccount;
        private int brandid;
        private String brandname;
        private int koubeicount;
        private int newscount;
        private int videocount;
        private int topiccount;
        private int explaincount;
        private int attentionspecid;
        private ManyvictorsBean manyvictors;
        private int canaskprice;
        /**
         * url : http://m.autohome.com.cn/266/
         * title : 阿斯顿·马丁DB9
         * logo : http://car3.autoimg.cn/cardfs/product/g6/M07/E0/74/t_autohomecar__wKgHzVZIVpyAGHyxAAVthSQi_RQ315.jpg
         */

        private ShareinfoBean shareinfo;
        private int ownerpricecount;
        private String specids;
        private TeambuyinginfoBean teambuyinginfo;
        private String levelid;
        private String fctpricename;
        /**
         * name : 级别
         * value : 跑车
         */

        private List<ParamlistBean> paramlist;
        /**
         * name : 在售
         * value : 0x000c
         */

        private List<SpectypeBean> spectype;
        /**
         * type : 0x000c
         * name : 6.0升 自然吸气 517马力
         * speclist : [{"id":25149,"name":"2015款 6.0L Coupe","price":"341.80万","description":"前置后驱 6挡手自一体","structure":"","paramisshow":"1","state":20,"attention":40,"electriccarname":"","electriccarval":"","minprice":"","canaskprice":1,"specbottomtitle":"询底价","specbottomurl":"","saletype":0,"pricename":"厂商指导价："},{"id":25150,"name":"2015款 6.0L Volante","price":"373.80万","description":"前置后驱 6挡手自一体","structure":"","paramisshow":"1","state":20,"attention":20,"electriccarname":"","electriccarval":"","minprice":"","canaskprice":1,"specbottomtitle":"询底价","specbottomurl":"","saletype":0,"pricename":"厂商指导价："}]
         */

        private List<EnginelistBean> enginelist;
        /**
         * tabtitle : 配置
         * tabsubtitle : 3 款车型配置
         * tabtype : 10
         * tabicon :
         */

        private List<TabinfosBean> tabinfos;

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

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLogo() {
            return logo;
        }

        public void setLogo(String logo) {
            this.logo = logo;
        }

        public int getPiccount() {
            return piccount;
        }

        public void setPiccount(int piccount) {
            this.piccount = piccount;
        }

        public int getClubid() {
            return clubid;
        }

        public void setClubid(int clubid) {
            this.clubid = clubid;
        }

        public String getLevelname() {
            return levelname;
        }

        public void setLevelname(String levelname) {
            this.levelname = levelname;
        }

        public String getFctprice() {
            return fctprice;
        }

        public void setFctprice(String fctprice) {
            this.fctprice = fctprice;
        }

        public int getStopsellcarnum() {
            return stopsellcarnum;
        }

        public void setStopsellcarnum(int stopsellcarnum) {
            this.stopsellcarnum = stopsellcarnum;
        }

        public int getSeriesid() {
            return seriesid;
        }

        public void setSeriesid(int seriesid) {
            this.seriesid = seriesid;
        }

        public String getKoubeiscore() {
            return koubeiscore;
        }

        public void setKoubeiscore(String koubeiscore) {
            this.koubeiscore = koubeiscore;
        }

        public String getBottombtnsubtitle() {
            return bottombtnsubtitle;
        }

        public void setBottombtnsubtitle(String bottombtnsubtitle) {
            this.bottombtnsubtitle = bottombtnsubtitle;
        }

        public String getBottombtntitle() {
            return bottombtntitle;
        }

        public void setBottombtntitle(String bottombtntitle) {
            this.bottombtntitle = bottombtntitle;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public String getBottombtnurl() {
            return bottombtnurl;
        }

        public void setBottombtnurl(String bottombtnurl) {
            this.bottombtnurl = bottombtnurl;
        }

        public int getDealercount() {
            return dealercount;
        }

        public void setDealercount(int dealercount) {
            this.dealercount = dealercount;
        }

        public int getHascarmall() {
            return hascarmall;
        }

        public void setHascarmall(int hascarmall) {
            this.hascarmall = hascarmall;
        }

        public String getCarmallurl() {
            return carmallurl;
        }

        public void setCarmallurl(String carmallurl) {
            this.carmallurl = carmallurl;
        }

        public String getCarmalltitle() {
            return carmalltitle;
        }

        public void setCarmalltitle(String carmalltitle) {
            this.carmalltitle = carmalltitle;
        }

        public String getCarmalltext() {
            return carmalltext;
        }

        public void setCarmalltext(String carmalltext) {
            this.carmalltext = carmalltext;
        }

        public String getLowprice() {
            return lowprice;
        }

        public void setLowprice(String lowprice) {
            this.lowprice = lowprice;
        }

        public int getValue2sccount() {
            return value2sccount;
        }

        public void setValue2sccount(int value2sccount) {
            this.value2sccount = value2sccount;
        }

        public int getBrandid() {
            return brandid;
        }

        public void setBrandid(int brandid) {
            this.brandid = brandid;
        }

        public String getBrandname() {
            return brandname;
        }

        public void setBrandname(String brandname) {
            this.brandname = brandname;
        }

        public int getKoubeicount() {
            return koubeicount;
        }

        public void setKoubeicount(int koubeicount) {
            this.koubeicount = koubeicount;
        }

        public int getNewscount() {
            return newscount;
        }

        public void setNewscount(int newscount) {
            this.newscount = newscount;
        }

        public int getVideocount() {
            return videocount;
        }

        public void setVideocount(int videocount) {
            this.videocount = videocount;
        }

        public int getTopiccount() {
            return topiccount;
        }

        public void setTopiccount(int topiccount) {
            this.topiccount = topiccount;
        }

        public int getExplaincount() {
            return explaincount;
        }

        public void setExplaincount(int explaincount) {
            this.explaincount = explaincount;
        }

        public int getAttentionspecid() {
            return attentionspecid;
        }

        public void setAttentionspecid(int attentionspecid) {
            this.attentionspecid = attentionspecid;
        }

        public ManyvictorsBean getManyvictors() {
            return manyvictors;
        }

        public void setManyvictors(ManyvictorsBean manyvictors) {
            this.manyvictors = manyvictors;
        }

        public int getCanaskprice() {
            return canaskprice;
        }

        public void setCanaskprice(int canaskprice) {
            this.canaskprice = canaskprice;
        }

        public ShareinfoBean getShareinfo() {
            return shareinfo;
        }

        public void setShareinfo(ShareinfoBean shareinfo) {
            this.shareinfo = shareinfo;
        }

        public int getOwnerpricecount() {
            return ownerpricecount;
        }

        public void setOwnerpricecount(int ownerpricecount) {
            this.ownerpricecount = ownerpricecount;
        }

        public String getSpecids() {
            return specids;
        }

        public void setSpecids(String specids) {
            this.specids = specids;
        }

        public TeambuyinginfoBean getTeambuyinginfo() {
            return teambuyinginfo;
        }

        public void setTeambuyinginfo(TeambuyinginfoBean teambuyinginfo) {
            this.teambuyinginfo = teambuyinginfo;
        }

        public String getLevelid() {
            return levelid;
        }

        public void setLevelid(String levelid) {
            this.levelid = levelid;
        }

        public String getFctpricename() {
            return fctpricename;
        }

        public void setFctpricename(String fctpricename) {
            this.fctpricename = fctpricename;
        }

        public List<ParamlistBean> getParamlist() {
            return paramlist;
        }

        public void setParamlist(List<ParamlistBean> paramlist) {
            this.paramlist = paramlist;
        }

        public List<SpectypeBean> getSpectype() {
            return spectype;
        }

        public void setSpectype(List<SpectypeBean> spectype) {
            this.spectype = spectype;
        }

        public List<EnginelistBean> getEnginelist() {
            return enginelist;
        }

        public void setEnginelist(List<EnginelistBean> enginelist) {
            this.enginelist = enginelist;
        }

        public List<TabinfosBean> getTabinfos() {
            return tabinfos;
        }

        public void setTabinfos(List<TabinfosBean> tabinfos) {
            this.tabinfos = tabinfos;
        }

        public static class ManyvictorsBean {
            public static ManyvictorsBean objectFromData(String str) {

                return new Gson().fromJson(str, ManyvictorsBean.class);
            }

            public static ManyvictorsBean objectFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);

                    return new Gson().fromJson(jsonObject.getString(str), ManyvictorsBean.class);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return null;
            }

            public static List<ManyvictorsBean> arrayManyvictorsBeanFromData(String str) {

                Type listType = new TypeToken<ArrayList<ManyvictorsBean>>() {
                }.getType();

                return new Gson().fromJson(str, listType);
            }

            public static List<ManyvictorsBean> arrayManyvictorsBeanFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);
                    Type listType = new TypeToken<ArrayList<ManyvictorsBean>>() {
                    }.getType();

                    return new Gson().fromJson(jsonObject.getString(str), listType);

                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return new ArrayList();


            }
        }

        public static class ShareinfoBean {
            private String url;
            private String title;
            private String logo;

            public static ShareinfoBean objectFromData(String str) {

                return new Gson().fromJson(str, ShareinfoBean.class);
            }

            public static ShareinfoBean objectFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);

                    return new Gson().fromJson(jsonObject.getString(str), ShareinfoBean.class);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return null;
            }

            public static List<ShareinfoBean> arrayShareinfoBeanFromData(String str) {

                Type listType = new TypeToken<ArrayList<ShareinfoBean>>() {
                }.getType();

                return new Gson().fromJson(str, listType);
            }

            public static List<ShareinfoBean> arrayShareinfoBeanFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);
                    Type listType = new TypeToken<ArrayList<ShareinfoBean>>() {
                    }.getType();

                    return new Gson().fromJson(jsonObject.getString(str), listType);

                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return new ArrayList();


            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getLogo() {
                return logo;
            }

            public void setLogo(String logo) {
                this.logo = logo;
            }
        }

        public static class TeambuyinginfoBean {
            public static TeambuyinginfoBean objectFromData(String str) {

                return new Gson().fromJson(str, TeambuyinginfoBean.class);
            }

            public static TeambuyinginfoBean objectFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);

                    return new Gson().fromJson(jsonObject.getString(str), TeambuyinginfoBean.class);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return null;
            }

            public static List<TeambuyinginfoBean> arrayTeambuyinginfoBeanFromData(String str) {

                Type listType = new TypeToken<ArrayList<TeambuyinginfoBean>>() {
                }.getType();

                return new Gson().fromJson(str, listType);
            }

            public static List<TeambuyinginfoBean> arrayTeambuyinginfoBeanFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);
                    Type listType = new TypeToken<ArrayList<TeambuyinginfoBean>>() {
                    }.getType();

                    return new Gson().fromJson(jsonObject.getString(str), listType);

                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return new ArrayList();


            }
        }

        public static class ParamlistBean {
            private String name;
            private String value;

            public static ParamlistBean objectFromData(String str) {

                return new Gson().fromJson(str, ParamlistBean.class);
            }

            public static ParamlistBean objectFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);

                    return new Gson().fromJson(jsonObject.getString(str), ParamlistBean.class);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return null;
            }

            public static List<ParamlistBean> arrayParamlistBeanFromData(String str) {

                Type listType = new TypeToken<ArrayList<ParamlistBean>>() {
                }.getType();

                return new Gson().fromJson(str, listType);
            }

            public static List<ParamlistBean> arrayParamlistBeanFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);
                    Type listType = new TypeToken<ArrayList<ParamlistBean>>() {
                    }.getType();

                    return new Gson().fromJson(jsonObject.getString(str), listType);

                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return new ArrayList();


            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getValue() {
                return value;
            }

            public void setValue(String value) {
                this.value = value;
            }
        }

        public static class SpectypeBean {
            private String name;
            private String value;

            public static SpectypeBean objectFromData(String str) {

                return new Gson().fromJson(str, SpectypeBean.class);
            }

            public static SpectypeBean objectFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);

                    return new Gson().fromJson(jsonObject.getString(str), SpectypeBean.class);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return null;
            }

            public static List<SpectypeBean> arraySpectypeBeanFromData(String str) {

                Type listType = new TypeToken<ArrayList<SpectypeBean>>() {
                }.getType();

                return new Gson().fromJson(str, listType);
            }

            public static List<SpectypeBean> arraySpectypeBeanFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);
                    Type listType = new TypeToken<ArrayList<SpectypeBean>>() {
                    }.getType();

                    return new Gson().fromJson(jsonObject.getString(str), listType);

                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return new ArrayList();


            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getValue() {
                return value;
            }

            public void setValue(String value) {
                this.value = value;
            }
        }

        public static class EnginelistBean {
            private String type;
            private String name;
            /**
             * id : 25149
             * name : 2015款 6.0L Coupe
             * price : 341.80万
             * description : 前置后驱 6挡手自一体
             * structure :
             * paramisshow : 1
             * state : 20
             * attention : 40
             * electriccarname :
             * electriccarval :
             * minprice :
             * canaskprice : 1
             * specbottomtitle : 询底价
             * specbottomurl :
             * saletype : 0
             * pricename : 厂商指导价：
             */

            private List<SpeclistBean> speclist;

            public static EnginelistBean objectFromData(String str) {

                return new Gson().fromJson(str, EnginelistBean.class);
            }

            public static EnginelistBean objectFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);

                    return new Gson().fromJson(jsonObject.getString(str), EnginelistBean.class);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return null;
            }

            public static List<EnginelistBean> arrayEnginelistBeanFromData(String str) {

                Type listType = new TypeToken<ArrayList<EnginelistBean>>() {
                }.getType();

                return new Gson().fromJson(str, listType);
            }

            public static List<EnginelistBean> arrayEnginelistBeanFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);
                    Type listType = new TypeToken<ArrayList<EnginelistBean>>() {
                    }.getType();

                    return new Gson().fromJson(jsonObject.getString(str), listType);

                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return new ArrayList();


            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public List<SpeclistBean> getSpeclist() {
                return speclist;
            }

            public void setSpeclist(List<SpeclistBean> speclist) {
                this.speclist = speclist;
            }

            public static class SpeclistBean {
                private int id;
                private String name;
                private String price;
                private String description;
                private String structure;
                private String paramisshow;
                private int state;
                private int attention;
                private String electriccarname;
                private String electriccarval;
                private String minprice;
                private int canaskprice;
                private String specbottomtitle;
                private String specbottomurl;
                private int saletype;
                private String pricename;

                public static SpeclistBean objectFromData(String str) {

                    return new Gson().fromJson(str, SpeclistBean.class);
                }

                public static SpeclistBean objectFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);

                        return new Gson().fromJson(jsonObject.getString(str), SpeclistBean.class);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return null;
                }

                public static List<SpeclistBean> arraySpeclistBeanFromData(String str) {

                    Type listType = new TypeToken<ArrayList<SpeclistBean>>() {
                    }.getType();

                    return new Gson().fromJson(str, listType);
                }

                public static List<SpeclistBean> arraySpeclistBeanFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);
                        Type listType = new TypeToken<ArrayList<SpeclistBean>>() {
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

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getPrice() {
                    return price;
                }

                public void setPrice(String price) {
                    this.price = price;
                }

                public String getDescription() {
                    return description;
                }

                public void setDescription(String description) {
                    this.description = description;
                }

                public String getStructure() {
                    return structure;
                }

                public void setStructure(String structure) {
                    this.structure = structure;
                }

                public String getParamisshow() {
                    return paramisshow;
                }

                public void setParamisshow(String paramisshow) {
                    this.paramisshow = paramisshow;
                }

                public int getState() {
                    return state;
                }

                public void setState(int state) {
                    this.state = state;
                }

                public int getAttention() {
                    return attention;
                }

                public void setAttention(int attention) {
                    this.attention = attention;
                }

                public String getElectriccarname() {
                    return electriccarname;
                }

                public void setElectriccarname(String electriccarname) {
                    this.electriccarname = electriccarname;
                }

                public String getElectriccarval() {
                    return electriccarval;
                }

                public void setElectriccarval(String electriccarval) {
                    this.electriccarval = electriccarval;
                }

                public String getMinprice() {
                    return minprice;
                }

                public void setMinprice(String minprice) {
                    this.minprice = minprice;
                }

                public int getCanaskprice() {
                    return canaskprice;
                }

                public void setCanaskprice(int canaskprice) {
                    this.canaskprice = canaskprice;
                }

                public String getSpecbottomtitle() {
                    return specbottomtitle;
                }

                public void setSpecbottomtitle(String specbottomtitle) {
                    this.specbottomtitle = specbottomtitle;
                }

                public String getSpecbottomurl() {
                    return specbottomurl;
                }

                public void setSpecbottomurl(String specbottomurl) {
                    this.specbottomurl = specbottomurl;
                }

                public int getSaletype() {
                    return saletype;
                }

                public void setSaletype(int saletype) {
                    this.saletype = saletype;
                }

                public String getPricename() {
                    return pricename;
                }

                public void setPricename(String pricename) {
                    this.pricename = pricename;
                }
            }
        }

        public static class TabinfosBean {
            private String tabtitle;
            private String tabsubtitle;
            private int tabtype;
            private String tabicon;

            public static TabinfosBean objectFromData(String str) {

                return new Gson().fromJson(str, TabinfosBean.class);
            }

            public static TabinfosBean objectFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);

                    return new Gson().fromJson(jsonObject.getString(str), TabinfosBean.class);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return null;
            }

            public static List<TabinfosBean> arrayTabinfosBeanFromData(String str) {

                Type listType = new TypeToken<ArrayList<TabinfosBean>>() {
                }.getType();

                return new Gson().fromJson(str, listType);
            }

            public static List<TabinfosBean> arrayTabinfosBeanFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);
                    Type listType = new TypeToken<ArrayList<TabinfosBean>>() {
                    }.getType();

                    return new Gson().fromJson(jsonObject.getString(str), listType);

                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return new ArrayList();


            }

            public String getTabtitle() {
                return tabtitle;
            }

            public void setTabtitle(String tabtitle) {
                this.tabtitle = tabtitle;
            }

            public String getTabsubtitle() {
                return tabsubtitle;
            }

            public void setTabsubtitle(String tabsubtitle) {
                this.tabsubtitle = tabsubtitle;
            }

            public int getTabtype() {
                return tabtype;
            }

            public void setTabtype(int tabtype) {
                this.tabtype = tabtype;
            }

            public String getTabicon() {
                return tabicon;
            }

            public void setTabicon(String tabicon) {
                this.tabicon = tabicon;
            }
        }
    }
}
