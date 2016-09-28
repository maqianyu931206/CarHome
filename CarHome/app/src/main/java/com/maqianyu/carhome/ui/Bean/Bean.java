package com.maqianyu.carhome.ui.Bean;

import java.util.List;

/**
 * Created by dllo on 16/9/28.
 */
public class Bean {

    /**
     * isloadmore : true
     * rowcount : 76083
     * pagecount : 2455
     * pageindex : 0
     * list : [{"id":90993,"title":"史上最可爱宝马 1955年宝马Isetta介绍","type":"花边","time":"2016-09-28","indexdetail":"视频展示了台湾汽车节目对1955年宝马Isetta这辆经典车型的介绍。","smallimg":"http://www2.autoimg.cn/newsdfs/g5/M05/5D/BB/120x90_0_autohomecar__wKgH21frOB6AL3OaAAHq9mJQEuM139.jpg","replycount":0,"playcount":375,"nickname":"艾琦","videoaddress":"http://v.youku.com/player/getM3U8/vid//type/mp4/v.m3u8","shareaddress":"http://v.autohome.com.cn/v_4_90993.html","updatetime":"20160928112530","lastid":"201609281125302016092813103390993"}]
     */

    public ResultBean result;
    /**
     * result : {"isloadmore":true,"rowcount":76083,"pagecount":2455,"pageindex":0,"list":[{"id":90993,"title":"史上最可爱宝马 1955年宝马Isetta介绍","type":"花边","time":"2016-09-28","indexdetail":"视频展示了台湾汽车节目对1955年宝马Isetta这辆经典车型的介绍。","smallimg":"http://www2.autoimg.cn/newsdfs/g5/M05/5D/BB/120x90_0_autohomecar__wKgH21frOB6AL3OaAAHq9mJQEuM139.jpg","replycount":0,"playcount":375,"nickname":"艾琦","videoaddress":"http://v.youku.com/player/getM3U8/vid//type/mp4/v.m3u8","shareaddress":"http://v.autohome.com.cn/v_4_90993.html","updatetime":"20160928112530","lastid":"201609281125302016092813103390993"}]}
     * returncode : 0
     * message :
     */

    public int returncode;
    public String message;

    public static class ResultBean {
        public boolean isloadmore;
        public int rowcount;
        public int pagecount;
        public int pageindex;
        /**
         * id : 90993
         * title : 史上最可爱宝马 1955年宝马Isetta介绍
         * type : 花边
         * time : 2016-09-28
         * indexdetail : 视频展示了台湾汽车节目对1955年宝马Isetta这辆经典车型的介绍。
         * smallimg : http://www2.autoimg.cn/newsdfs/g5/M05/5D/BB/120x90_0_autohomecar__wKgH21frOB6AL3OaAAHq9mJQEuM139.jpg
         * replycount : 0
         * playcount : 375
         * nickname : 艾琦
         * videoaddress : http://v.youku.com/player/getM3U8/vid//type/mp4/v.m3u8
         * shareaddress : http://v.autohome.com.cn/v_4_90993.html
         * updatetime : 20160928112530
         * lastid : 201609281125302016092813103390993
         */

        public List<ListBean> list;

        public static class ListBean {
            public int id;
            public String title;
            public String type;
            public String time;
            public String indexdetail;
            public String smallimg;
            public int replycount;
            public int playcount;
            public String nickname;
            public String videoaddress;
            public String shareaddress;
            public String updatetime;
            public String lastid;
        }
    }
}
