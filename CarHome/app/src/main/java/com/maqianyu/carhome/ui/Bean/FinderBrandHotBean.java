package com.maqianyu.carhome.ui.Bean;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dllo on 16/9/18.
 */
public class FinderBrandHotBean  {

    /**
     * returncode : 0
     * message :
     * result : {"rowcount":0,"pagecount":10,"pageindex":1,"list":[{"firstletter":"D","id":1,"img":"http://x.autoimg.cn/app/image/brands/1.png","name":"大众","ordercount":795226},{"firstletter":"B","id":14,"img":"http://x.autoimg.cn/app/image/brands/14.png","name":"本田","ordercount":384598},{"firstletter":"F","id":3,"img":"http://x.autoimg.cn/app/image/brands/3.png","name":"丰田","ordercount":273690},{"firstletter":"X","id":12,"img":"http://x.autoimg.cn/app/image/brands/12.png","name":"现代","ordercount":261279},{"firstletter":"J","id":25,"img":"http://x.autoimg.cn/app/image/brands/25.png","name":"吉利汽车","ordercount":232996},{"firstletter":"A","id":33,"img":"http://x.autoimg.cn/app/image/brands/33.png","name":"奥迪","ordercount":209999},{"firstletter":"H","id":181,"img":"http://x.autoimg.cn/app/image/brands/181.png","name":"哈弗","ordercount":209896},{"firstletter":"F","id":8,"img":"http://x.autoimg.cn/app/image/brands/8.png","name":"福特","ordercount":198370},{"firstletter":"R","id":63,"img":"http://x.autoimg.cn/app/image/brands/63.png","name":"日产","ordercount":170849},{"firstletter":"B","id":38,"img":"http://x.autoimg.cn/app/image/brands/38.png?r=38","name":"别克","ordercount":165054}]}
     */

    private int returncode;
    private String message;
    /**
     * rowcount : 0
     * pagecount : 10
     * pageindex : 1
     * list : [{"firstletter":"D","id":1,"img":"http://x.autoimg.cn/app/image/brands/1.png","name":"大众","ordercount":795226},{"firstletter":"B","id":14,"img":"http://x.autoimg.cn/app/image/brands/14.png","name":"本田","ordercount":384598},{"firstletter":"F","id":3,"img":"http://x.autoimg.cn/app/image/brands/3.png","name":"丰田","ordercount":273690},{"firstletter":"X","id":12,"img":"http://x.autoimg.cn/app/image/brands/12.png","name":"现代","ordercount":261279},{"firstletter":"J","id":25,"img":"http://x.autoimg.cn/app/image/brands/25.png","name":"吉利汽车","ordercount":232996},{"firstletter":"A","id":33,"img":"http://x.autoimg.cn/app/image/brands/33.png","name":"奥迪","ordercount":209999},{"firstletter":"H","id":181,"img":"http://x.autoimg.cn/app/image/brands/181.png","name":"哈弗","ordercount":209896},{"firstletter":"F","id":8,"img":"http://x.autoimg.cn/app/image/brands/8.png","name":"福特","ordercount":198370},{"firstletter":"R","id":63,"img":"http://x.autoimg.cn/app/image/brands/63.png","name":"日产","ordercount":170849},{"firstletter":"B","id":38,"img":"http://x.autoimg.cn/app/image/brands/38.png?r=38","name":"别克","ordercount":165054}]
     */

    private ResultBean result;

    public static FinderBrandHotBean objectFromData(String str) {

        return new Gson().fromJson(str, FinderBrandHotBean.class);
    }

    public static FinderBrandHotBean objectFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);

            return new Gson().fromJson(jsonObject.getString(str), FinderBrandHotBean.class);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static List<FinderBrandHotBean> arrayFinderBrandHotBeanFromData(String str) {

        Type listType = new TypeToken<ArrayList<FinderBrandHotBean>>() {
        }.getType();

        return new Gson().fromJson(str, listType);
    }

    public static List<FinderBrandHotBean> arrayFinderBrandHotBeanFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);
            Type listType = new TypeToken<ArrayList<FinderBrandHotBean>>() {
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
        private int rowcount;
        private int pagecount;
        private int pageindex;
        /**
         * firstletter : D
         * id : 1
         * img : http://x.autoimg.cn/app/image/brands/1.png
         * name : 大众
         * ordercount : 795226
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

        public int getRowcount() {
            return rowcount;
        }

        public void setRowcount(int rowcount) {
            this.rowcount = rowcount;
        }

        public int getPagecount() {
            return pagecount;
        }

        public void setPagecount(int pagecount) {
            this.pagecount = pagecount;
        }

        public int getPageindex() {
            return pageindex;
        }

        public void setPageindex(int pageindex) {
            this.pageindex = pageindex;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            private String firstletter;
            private int id;
            private String img;
            private String name;
            private int ordercount;

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

            public String getFirstletter() {
                return firstletter;
            }

            public void setFirstletter(String firstletter) {
                this.firstletter = firstletter;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getImg() {
                return img;
            }

            public void setImg(String img) {
                this.img = img;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getOrdercount() {
                return ordercount;
            }

            public void setOrdercount(int ordercount) {
                this.ordercount = ordercount;
            }
        }
    }
}
