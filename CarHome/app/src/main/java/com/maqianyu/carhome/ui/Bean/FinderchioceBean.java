package com.maqianyu.carhome.ui.Bean;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dllo on 16/9/20.
 */
public class FinderchioceBean {


    /**
     * returncode : 0
     * message :
     * result : {"pageindex":1,"totalseriescount":1035,"totalpagecount":52,"series":[{"seriesname":"荣威RX5","thumburl":"http://car2.m.autoimg.cn/cardfs/product/g15/M0C/A2/82/242x182_0_q30_autohomecar__wKgH5VdeXUWAAMVuAAT-oS2RPms384.jpg","pricerange":"9.98-18.68万","seriesid":4080,"cornericon":"1"},{"seriesname":"博越","thumburl":"http://car3.m.autoimg.cn/cardfs/product/g18/M14/50/ED/242x182_0_q30_autohomecar__wKgH2VcK_T-ALdMbAAebOIcc4mA331.jpg","pricerange":"9.88-15.78万","seriesid":3788,"cornericon":"2"},{"seriesname":"宝马3系","thumburl":"http://car2.m.autoimg.cn/cardfs/product/g19/M04/2E/58/242x182_0_q30_autohomecar__wKjBxFffsQWAc53sAAaUrPh-Ako480.jpg","pricerange":"28.3-59.88万","seriesid":66,"cornericon":"3"},{"seriesname":"汉兰达","thumburl":"http://car0.m.autoimg.cn/car/carnews/2015/4/8/242x182_0_q30_201504080900488944149112.jpg","pricerange":"23.98-42.28万","seriesid":771,"cornericon":""},{"seriesname":"奥迪A4L","thumburl":"http://car2.m.autoimg.cn/cardfs/product/g7/M02/0F/AD/242x182_0_q30_autohomecar__wKgH3Ve8Jq-AOoA8AAl9nhGECuU568.jpg","pricerange":"28.99-41.28万","seriesid":692,"cornericon":""},{"seriesname":"帝豪GS","thumburl":"http://car2.m.autoimg.cn/cardfs/product/g9/M0B/8D/21/242x182_0_q30_autohomecar__wKgH31dEJlGAL7xzAAh0OtUu4Hc548.jpg","pricerange":"7.78-10.88万","seriesid":3465,"cornericon":""},{"seriesname":"福克斯","thumburl":"http://car3.m.autoimg.cn/cardfs/product/g20/M02/DE/15/242x182_0_q30_autohomecar__wKgFVFexrDWAB4moAAbl5VIoz-o270.jpg","pricerange":"9.98-16.58万","seriesid":364,"cornericon":""},{"seriesname":"思域","thumburl":"http://car2.m.autoimg.cn/cardfs/product/g6/M0F/70/4B/242x182_0_q30_autohomecar__wKgH3FcpyCaAbOnhAAcqpKPkrf4198.jpg","pricerange":"12.99-16.99万","seriesid":135,"cornericon":""},{"seriesname":"奔驰E级","thumburl":"http://car2.m.autoimg.cn/cardfs/product/g6/M10/ED/D9/242x182_0_q30_autohomecar__wKjB0VekUEqAQqiWAAhLxUArrVE427.jpg","pricerange":"39.8-79.8万","seriesid":197,"cornericon":""},{"seriesname":"博瑞","thumburl":"http://car0.m.autoimg.cn/car/carnews/2015/4/15/242x182_0_q30_201504152238111845132112.jpg","pricerange":"11.98-22.98万","seriesid":3589,"cornericon":""},{"seriesname":"雅阁","thumburl":"http://car3.m.autoimg.cn/cardfs/product/g19/M05/E4/3C/242x182_0_q30_autohomecar__wKgFU1bqcdSAcCPiAAmrfezSiWI456.jpg","pricerange":"16.98-23.78万","seriesid":78,"cornericon":""},{"seriesname":"长安CS75","thumburl":"http://car3.m.autoimg.cn/cardfs/product/g22/M01/BF/7E/242x182_0_q30_autohomecar__wKjBwVbf8t6Ab5SaAAZpyQcmTzQ371.jpg","pricerange":"9.28-15.88万","seriesid":3204,"cornericon":""},{"seriesname":"迈腾","thumburl":"http://car2.m.autoimg.cn/cardfs/product/g18/M09/EF/86/242x182_0_q30_autohomecar__wKgH2VemCWKAUbuBAAgh_dP5XIo352.jpg","pricerange":"18.99-31.69万","seriesid":496,"cornericon":""},{"seriesname":"远景SUV","thumburl":"http://car3.m.autoimg.cn/cardfs/product/g23/M15/9B/4F/242x182_0_q30_autohomecar__wKjBwFd0ybWAbtxMAAmVBij4ea8223.jpg","pricerange":"7.49-10.19万","seriesid":4133,"cornericon":""},{"seriesname":"长安CX70","thumburl":"http://car2.m.autoimg.cn/cardfs/product/g21/M10/32/A2/242x182_0_q30_autohomecar__wKgFWlcKgcCARiKwAAiC00vcgQk795.jpg","pricerange":"6.89-8.49万","seriesid":3893,"cornericon":""},{"seriesname":"哈弗H6","thumburl":"http://car3.m.autoimg.cn/cardfs/product/g19/M12/E4/4E/242x182_0_q30_autohomecar__wKgFWFbqb2aAb8VYAAWs5fhl12Q288.jpg","pricerange":"8.88-16.28万","seriesid":2123,"cornericon":""},{"seriesname":"奔腾X80","thumburl":"http://car2.m.autoimg.cn/cardfs/product/g18/M06/A2/A0/242x182_0_q30_autohomecar__wKgH2VYXpYKACG-xAAcyXxWgnh8832.jpg","pricerange":"11.98-18.18万","seriesid":3000,"cornericon":""},{"seriesname":"速腾","thumburl":"http://car0.m.autoimg.cn/car/carnews/2015/2/24/242x182_0_q30_20150224213405865443511.jpg","pricerange":"13.18-21.88万","seriesid":442,"cornericon":""},{"seriesname":"马自达CX-4","thumburl":"http://car2.m.autoimg.cn/cardfs/product/g16/M15/5F/9D/242x182_0_q30_autohomecar__wKgH11cZkpaAO3HjAAserV7cTJM706.jpg","pricerange":"14.08-21.58万","seriesid":3968,"cornericon":""},{"seriesname":"全新奔腾B50","thumburl":"http://car3.m.autoimg.cn/cardfs/product/g9/M11/B2/B4/242x182_0_q30_autohomecar__wKgH31dpQjSAE7g5AAi9nT-AJZE390.jpg","pricerange":"8.18-12.28万","seriesid":632,"cornericon":""}]}
     */

    private int returncode;
    private String message;
    /**
     * pageindex : 1
     * totalseriescount : 1035
     * totalpagecount : 52
     * series : [{"seriesname":"荣威RX5","thumburl":"http://car2.m.autoimg.cn/cardfs/product/g15/M0C/A2/82/242x182_0_q30_autohomecar__wKgH5VdeXUWAAMVuAAT-oS2RPms384.jpg","pricerange":"9.98-18.68万","seriesid":4080,"cornericon":"1"},{"seriesname":"博越","thumburl":"http://car3.m.autoimg.cn/cardfs/product/g18/M14/50/ED/242x182_0_q30_autohomecar__wKgH2VcK_T-ALdMbAAebOIcc4mA331.jpg","pricerange":"9.88-15.78万","seriesid":3788,"cornericon":"2"},{"seriesname":"宝马3系","thumburl":"http://car2.m.autoimg.cn/cardfs/product/g19/M04/2E/58/242x182_0_q30_autohomecar__wKjBxFffsQWAc53sAAaUrPh-Ako480.jpg","pricerange":"28.3-59.88万","seriesid":66,"cornericon":"3"},{"seriesname":"汉兰达","thumburl":"http://car0.m.autoimg.cn/car/carnews/2015/4/8/242x182_0_q30_201504080900488944149112.jpg","pricerange":"23.98-42.28万","seriesid":771,"cornericon":""},{"seriesname":"奥迪A4L","thumburl":"http://car2.m.autoimg.cn/cardfs/product/g7/M02/0F/AD/242x182_0_q30_autohomecar__wKgH3Ve8Jq-AOoA8AAl9nhGECuU568.jpg","pricerange":"28.99-41.28万","seriesid":692,"cornericon":""},{"seriesname":"帝豪GS","thumburl":"http://car2.m.autoimg.cn/cardfs/product/g9/M0B/8D/21/242x182_0_q30_autohomecar__wKgH31dEJlGAL7xzAAh0OtUu4Hc548.jpg","pricerange":"7.78-10.88万","seriesid":3465,"cornericon":""},{"seriesname":"福克斯","thumburl":"http://car3.m.autoimg.cn/cardfs/product/g20/M02/DE/15/242x182_0_q30_autohomecar__wKgFVFexrDWAB4moAAbl5VIoz-o270.jpg","pricerange":"9.98-16.58万","seriesid":364,"cornericon":""},{"seriesname":"思域","thumburl":"http://car2.m.autoimg.cn/cardfs/product/g6/M0F/70/4B/242x182_0_q30_autohomecar__wKgH3FcpyCaAbOnhAAcqpKPkrf4198.jpg","pricerange":"12.99-16.99万","seriesid":135,"cornericon":""},{"seriesname":"奔驰E级","thumburl":"http://car2.m.autoimg.cn/cardfs/product/g6/M10/ED/D9/242x182_0_q30_autohomecar__wKjB0VekUEqAQqiWAAhLxUArrVE427.jpg","pricerange":"39.8-79.8万","seriesid":197,"cornericon":""},{"seriesname":"博瑞","thumburl":"http://car0.m.autoimg.cn/car/carnews/2015/4/15/242x182_0_q30_201504152238111845132112.jpg","pricerange":"11.98-22.98万","seriesid":3589,"cornericon":""},{"seriesname":"雅阁","thumburl":"http://car3.m.autoimg.cn/cardfs/product/g19/M05/E4/3C/242x182_0_q30_autohomecar__wKgFU1bqcdSAcCPiAAmrfezSiWI456.jpg","pricerange":"16.98-23.78万","seriesid":78,"cornericon":""},{"seriesname":"长安CS75","thumburl":"http://car3.m.autoimg.cn/cardfs/product/g22/M01/BF/7E/242x182_0_q30_autohomecar__wKjBwVbf8t6Ab5SaAAZpyQcmTzQ371.jpg","pricerange":"9.28-15.88万","seriesid":3204,"cornericon":""},{"seriesname":"迈腾","thumburl":"http://car2.m.autoimg.cn/cardfs/product/g18/M09/EF/86/242x182_0_q30_autohomecar__wKgH2VemCWKAUbuBAAgh_dP5XIo352.jpg","pricerange":"18.99-31.69万","seriesid":496,"cornericon":""},{"seriesname":"远景SUV","thumburl":"http://car3.m.autoimg.cn/cardfs/product/g23/M15/9B/4F/242x182_0_q30_autohomecar__wKjBwFd0ybWAbtxMAAmVBij4ea8223.jpg","pricerange":"7.49-10.19万","seriesid":4133,"cornericon":""},{"seriesname":"长安CX70","thumburl":"http://car2.m.autoimg.cn/cardfs/product/g21/M10/32/A2/242x182_0_q30_autohomecar__wKgFWlcKgcCARiKwAAiC00vcgQk795.jpg","pricerange":"6.89-8.49万","seriesid":3893,"cornericon":""},{"seriesname":"哈弗H6","thumburl":"http://car3.m.autoimg.cn/cardfs/product/g19/M12/E4/4E/242x182_0_q30_autohomecar__wKgFWFbqb2aAb8VYAAWs5fhl12Q288.jpg","pricerange":"8.88-16.28万","seriesid":2123,"cornericon":""},{"seriesname":"奔腾X80","thumburl":"http://car2.m.autoimg.cn/cardfs/product/g18/M06/A2/A0/242x182_0_q30_autohomecar__wKgH2VYXpYKACG-xAAcyXxWgnh8832.jpg","pricerange":"11.98-18.18万","seriesid":3000,"cornericon":""},{"seriesname":"速腾","thumburl":"http://car0.m.autoimg.cn/car/carnews/2015/2/24/242x182_0_q30_20150224213405865443511.jpg","pricerange":"13.18-21.88万","seriesid":442,"cornericon":""},{"seriesname":"马自达CX-4","thumburl":"http://car2.m.autoimg.cn/cardfs/product/g16/M15/5F/9D/242x182_0_q30_autohomecar__wKgH11cZkpaAO3HjAAserV7cTJM706.jpg","pricerange":"14.08-21.58万","seriesid":3968,"cornericon":""},{"seriesname":"全新奔腾B50","thumburl":"http://car3.m.autoimg.cn/cardfs/product/g9/M11/B2/B4/242x182_0_q30_autohomecar__wKgH31dpQjSAE7g5AAi9nT-AJZE390.jpg","pricerange":"8.18-12.28万","seriesid":632,"cornericon":""}]
     */

    private ResultBean result;

    public static FinderchioceBean objectFromData(String str) {

        return new Gson().fromJson(str, FinderchioceBean.class);
    }

    public static FinderchioceBean objectFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);

            return new Gson().fromJson(jsonObject.getString(str), FinderchioceBean.class);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static List<FinderchioceBean> arrayFinderchioceBeanFromData(String str) {

        Type listType = new TypeToken<ArrayList<FinderchioceBean>>() {
        }.getType();

        return new Gson().fromJson(str, listType);
    }

    public static List<FinderchioceBean> arrayFinderchioceBeanFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);
            Type listType = new TypeToken<ArrayList<FinderchioceBean>>() {
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
        private int pageindex;
        private int totalseriescount;
        private int totalpagecount;
        /**
         * seriesname : 荣威RX5
         * thumburl : http://car2.m.autoimg.cn/cardfs/product/g15/M0C/A2/82/242x182_0_q30_autohomecar__wKgH5VdeXUWAAMVuAAT-oS2RPms384.jpg
         * pricerange : 9.98-18.68万
         * seriesid : 4080
         * cornericon : 1
         */

        private List<SeriesBean> series;

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

        public int getPageindex() {
            return pageindex;
        }

        public void setPageindex(int pageindex) {
            this.pageindex = pageindex;
        }

        public int getTotalseriescount() {
            return totalseriescount;
        }

        public void setTotalseriescount(int totalseriescount) {
            this.totalseriescount = totalseriescount;
        }

        public int getTotalpagecount() {
            return totalpagecount;
        }

        public void setTotalpagecount(int totalpagecount) {
            this.totalpagecount = totalpagecount;
        }

        public List<SeriesBean> getSeries() {
            return series;
        }

        public void setSeries(List<SeriesBean> series) {
            this.series = series;
        }

        public static class SeriesBean {
            private String seriesname;
            private String thumburl;
            private String pricerange;
            private int seriesid;
            private String cornericon;

            public static SeriesBean objectFromData(String str) {

                return new Gson().fromJson(str, SeriesBean.class);
            }

            public static SeriesBean objectFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);

                    return new Gson().fromJson(jsonObject.getString(str), SeriesBean.class);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return null;
            }

            public static List<SeriesBean> arraySeriesBeanFromData(String str) {

                Type listType = new TypeToken<ArrayList<SeriesBean>>() {
                }.getType();

                return new Gson().fromJson(str, listType);
            }

            public static List<SeriesBean> arraySeriesBeanFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);
                    Type listType = new TypeToken<ArrayList<SeriesBean>>() {
                    }.getType();

                    return new Gson().fromJson(jsonObject.getString(str), listType);

                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return new ArrayList();


            }

            public String getSeriesname() {
                return seriesname;
            }

            public void setSeriesname(String seriesname) {
                this.seriesname = seriesname;
            }

            public String getThumburl() {
                return thumburl;
            }

            public void setThumburl(String thumburl) {
                this.thumburl = thumburl;
            }

            public String getPricerange() {
                return pricerange;
            }

            public void setPricerange(String pricerange) {
                this.pricerange = pricerange;
            }

            public int getSeriesid() {
                return seriesid;
            }

            public void setSeriesid(int seriesid) {
                this.seriesid = seriesid;
            }

            public String getCornericon() {
                return cornericon;
            }

            public void setCornericon(String cornericon) {
                this.cornericon = cornericon;
            }
        }
    }
}
