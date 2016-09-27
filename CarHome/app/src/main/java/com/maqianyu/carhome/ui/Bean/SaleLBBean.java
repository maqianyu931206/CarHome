package com.maqianyu.carhome.ui.Bean;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dllo on 16/9/27.
 */
public class SaleLBBean {


    /**
     * returncode : 0
     * message :
     * result : {"list":[{"id":9482,"title":"926","shorttitle":"口碑","url":"http://k.m.autohome.com.cn/topic/2016/09#pvareaid=2014143","imgurl":"http://app2.autoimg.cn/appdfs/g18/M02/58/1A/autohomecar__wKjBxVfofBOAUkAZAAJfm6IUeRI021.jpg","urlscheme":"","type":2,"appicon":"","siteindex":0},{"id":9484,"title":"9月27-28日","shorttitle":"金融车险","url":"http://u.pingan.com/upingan/insure/bdwx/bdwx.html?area=EC03-AUTOHOME-ZT&mediasource=EC03-AUTOHOME-ZT","imgurl":"http://app2.autoimg.cn/appdfs/g21/M14/34/C2/autohomecar__wKgFWlfk_z2Ae4JtAAEoYhNZKVA773.jpg","urlscheme":"","type":2,"appicon":"","siteindex":0},{"id":9509,"title":"9月27日分期推广","shorttitle":"上汽","url":"http://hd.j.autohome.com.cn/loan/loan/sqty#pvareaid=106574","imgurl":"http://app2.autoimg.cn/appdfs/g15/M07/5A/72/autohomecar__wKjByFfpDQaAbCnFAAE1-jCWOAg113.jpg","urlscheme":"","type":2,"appicon":"","siteindex":0},{"id":9496,"title":"9.26","shorttitle":"双11","url":"http://m.1111.autohome.com.cn/#pvareaid=104735","imgurl":"http://app2.autoimg.cn/appdfs/g19/M08/3A/12/autohomecar__wKgFWFfo7JuAIaxmAAKxYKKttR8489.jpg","urlscheme":"","type":2,"appicon":"","siteindex":0},{"id":9497,"title":"0927","shorttitle":"秋游季专题","url":"http://m.mall.autohome.com.cn/topic/2016/9/921/#pvareaid=104735","imgurl":"http://app2.autoimg.cn/appdfs/g5/M09/58/87/autohomecar__wKjB0lfo7yWABp2GAAG4O89fQA0226.jpg","urlscheme":"","type":2,"appicon":"","siteindex":0}]}
     */

    private int returncode;
    private String message;
    private ResultBean result;

    public static SaleLBBean objectFromData(String str) {

        return new Gson().fromJson(str, SaleLBBean.class);
    }

    public static SaleLBBean objectFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);

            return new Gson().fromJson(jsonObject.getString(str), SaleLBBean.class);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static List<SaleLBBean> arraySaleLBBeanFromData(String str) {

        Type listType = new TypeToken<ArrayList<SaleLBBean>>() {
        }.getType();

        return new Gson().fromJson(str, listType);
    }

    public static List<SaleLBBean> arraySaleLBBeanFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);
            Type listType = new TypeToken<ArrayList<SaleLBBean>>() {
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
         * id : 9482
         * title : 926
         * shorttitle : 口碑
         * url : http://k.m.autohome.com.cn/topic/2016/09#pvareaid=2014143
         * imgurl : http://app2.autoimg.cn/appdfs/g18/M02/58/1A/autohomecar__wKjBxVfofBOAUkAZAAJfm6IUeRI021.jpg
         * urlscheme :
         * type : 2
         * appicon :
         * siteindex : 0
         */

        private List<ListBean> list;

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

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            private int id;
            private String title;
            private String shorttitle;
            private String url;
            private String imgurl;
            private String urlscheme;
            private int type;
            private String appicon;
            private int siteindex;

            public static ListBean objectFromData(String str) {

                return new Gson().fromJson(str, ListBean.class);
            }

            public static ListBean objectFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);

                    return new Gson().fromJson(jsonObject.getString(str), ListBean.class);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return null;
            }

            public static List<ListBean> arrayListBeanFromData(String str) {

                Type listType = new TypeToken<ArrayList<ListBean>>() {
                }.getType();

                return new Gson().fromJson(str, listType);
            }

            public static List<ListBean> arrayListBeanFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);
                    Type listType = new TypeToken<ArrayList<ListBean>>() {
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

            public String getShorttitle() {
                return shorttitle;
            }

            public void setShorttitle(String shorttitle) {
                this.shorttitle = shorttitle;
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

            public String getUrlscheme() {
                return urlscheme;
            }

            public void setUrlscheme(String urlscheme) {
                this.urlscheme = urlscheme;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public String getAppicon() {
                return appicon;
            }

            public void setAppicon(String appicon) {
                this.appicon = appicon;
            }

            public int getSiteindex() {
                return siteindex;
            }

            public void setSiteindex(int siteindex) {
                this.siteindex = siteindex;
            }
        }
    }
}
