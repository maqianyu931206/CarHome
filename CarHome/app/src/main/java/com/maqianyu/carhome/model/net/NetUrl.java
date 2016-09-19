package com.maqianyu.carhome.model.net;

import java.security.PublicKey;

/**
 * Created by dllo on 16/9/14.
 */
public class NetUrl {
    /**
     * 推荐界面
     */
    public static final String ARTICLE_NEW = "http://app.api.autohome.com.cn/autov4.2.5/news/newslist-a2-pm1-v4.2.5-c0-nt0-p1-s30-l0.html";// 最新
    public static final String ARTICLE_UNIHUB = "http://223.99.255.20/news.app.autohome.com.cn/news_v6.1.0/newspf/NPNewsList.ashx?a=2&pm=2&v=6.2.1&au=&type=3&lastid=&lastuid=0&size=30";// 优创+
    public static final String ARTICLE_LETTER = "http://app.api.autohome.com.cn/autov5.0.0/news/fastnewslist-pm2-b0-l0-s20-lastid0.json";// 快报
    public static final String ARTICLE_MEDIA = "http://app.api.autohome.com.cn/autov5.0.0/news/videolist-pm2-vt0-s20-lastid0.json";// 视频
    public static final String ARTICLE_NEWS = "http://app.api.autohome.com.cn/autov5.0.0/news/newslist-pm1-c0-nt1-p1-s30-l0.json";//新闻
    public static final String ARTICLE_USECAR = "http://app.api.autohome.com.cn/autov5.0.0/news/newslist-pm2-c0-nt82-p1-s20-l0.json";// 用车
    public static final String ARTICLE_EVALUATION = "http://app.api.autohome.com.cn/autov4.8.8/news/newslist-pm1-c0-nt3-p1-s30-l0.json";//评测
    public static final String ARTICLE_SHOPPING = "http://app.api.autohome.com.cn/autov4.8.8/news/newslist-pm1-c0-nt60-p1-s30-l0.json";//导购
    public static final String ARTICLE_QUOTATION = "http://app.api.autohome.com.cn/autov4.8.8/news/newslist-pm1-c110100-nt2-p1-s30-l0.json";//行情
    public static final String ARTICLE_TECHNOLOGY = "http://app.api.autohome.com.cn/autov4.8.8/news/newslist-pm1-c0-nt102-p1-s30-l0.json";//技术
    public static final String ARTICLE_CULTURE = "http://app.api.autohome.com.cn/autov4.8.8/news/newslist-pm1-c0-nt97-p1-s30-l0.json";// 文化
    public static final String ARTICLE_CONVERSION = "http://app.api.autohome.com.cn/autov4.8.8/news/newslist-pm1-c0-nt107-p1-s30-l0.json";// 改装
    public static final String ARTICLE_TRAVELNOTES = "http://app.api.autohome.com.cn/autov4.8.8/news/newslist-pm1-c0-nt100-p1-s30-l0.json";//游记
    public static final String ARTICLE_ORIGINAL_VIDEO = "http://app.api.autohome.com.cn/autov4.8.8/news/videolist-pm1-vt8-s30-lastid0.json";//原创视频
    public static final String ARTICLE_LOBBYIST = "http://http://app.api.autohome.com.cn/autov4.8.8/news/shuokelist-pm1-s30-lastid0.json";// 说客

    /**
     * 快报界面拼接网址,详情页
     */
    public static final String ARTICLE_LETTER_INFO_START = "http://cont.app.autohome.com.cn/autov5.0.0/content/News/fastnewscontent-n";
    public static final String ARTICLE_LETTER_INFO_END = "-lastid0-o1.json";
    /**
     * 找车界面
     */
    public static final String FINDER_BRAND = "http://223.99.255.20/cars.app.autohome.com.cn/dealer_v5.7.0/dealer/hotbrands-pm2.json";//品牌-热门品牌
    public static final String FINDER_BRAND_START = "http://app.api.autohome.com.cn/autov5.0.0/cars/seriesprice-pm1-b";
    public static final String FINDER_BRAND_END = "-t1.json";
    public static final String FINDER_BRAND_START_SHOW = "http://app.api.autohome.com.cn/autov5.0.0/cars/seriesprice-pm2-b";
    public static final String FINDER_BRAND_END_SHOW = "-t2.json";
    /**
     * 轮播图 优创界面
     */
    public static final String ARTICLE_LUNBO_1 = "http://qn.www2.autoimg.cn/youchuang/g8/M0D/44/75/autohomecar__wKgHz1fZIqiAQKAsAAMxrclobMY403.jpg?imageView2/0/w/640/h/320";
    public static final String ARTICLE_LUNBO_2 = "http://qn.www2.autoimg.cn/youchuang/g13/M0C/3B/0A/autohomecar__wKgH1FfXyueASiOZAASoinkhSa4822.jpg?imageView2/0/w/640/h/320";
    public static final String ARTICLE_LUNBO_3 = "http://qn.www2.autoimg.cn/youchuang/g21/M10/1B/F5/autohomecar__wKgFWlfX0AmASOw1AANh5VnEFhY842.jpg?imageView2/0/w/640/h/320";
    public static final String ARTICLE_LUNBO_4 = "http://qn.www2.autoimg.cn/youchuang/g4/M14/3A/03/autohomecar__wKgHy1fXzIOAVtHhAAUG0jwiv3Y728.jpg?imageView2/0/w/640/h/320";
    public static final String ARTICLE_LUNBO_5 = "http://qn.www2.autoimg.cn/youchuang/g16/M0C/3A/43/autohomecar__wKjBx1fXZlWAcRVBAAM3ZDk_5WA521.jpg?imageView2/0/w/640/h/320";
    /**
     * 轮播图 最新界面
     */
    public static final String ARTICLE_LUNBO_NEW_1 = "http://www3.autoimg.cn/newsdfs/g20/M06/1F/51/640x320_0_autohomecar__wKgFVFfYR0KAS-uvAAlxbD8uByM162.jpg";
    public static final String ARTICLE_LUNBO_NEW_2 = "http://www3.autoimg.cn/newsdfs/g18/M0A/3B/1E/640x320_0_autohomecar__wKgH2VfX5hCATTIGAAVltb82JZk408.jpg";
    public static final String ARTICLE_LUNBO_NEW_3 = "http://www3.autoimg.cn/newsdfs/g9/M0B/34/B6/640x320_0_autohomecar__wKjBzlfXwWOAbrB0AAYoBgRgIZY910.jpg";
    public static final String ARTICLE_LUNBO_NEW_4 = "http://www3.autoimg.cn/newsdfs/g9/M0B/34/B6/640x320_0_autohomecar__wKjBzlfXwWOAbrB0AAYoBgRgIZY910.jpg";
    public static final String ARTICLE_LUNBO_NEW_5 = "http://www2.autoimg.cn/newsdfs/g8/M01/32/C6/640x320_0_autohomecar__wKjBz1fWyZyAMuDzAAI6vdT028E429.jpg";
    public static final String ARTICLE_LUNBO_NEW_6 = "http://www3.autoimg.cn/newsdfs/g15/M01/3A/21/640x320_0_autohomecar__wKjByFfWdmyAKIFZAAe7nV4xEYM091.jpg";
    /**
     * 论坛页面
     */
    public static final String FORUM_ALESESE = "http://app.api.autohome.com.cn/autov5.0.0/club/jingxuantopic-pm2-c0-p1-s20.json";
    public static final String FORUM_FORUM = "http://club.app.autohome.com.cn/club_v6.1.0/club/shotfoumlist-pm1-p1-s50.json";
    /**
     * 论坛页面精选推荐的点击事件
     */
    public static final String FORUM_ANSLESE_0 = "http://app.api.autohome.com.cn/autov4.8.8/club/jingxuantopic-pm1-c0-p1-s30.json";//全部
    public static final String FORUM_ANSLESE_1 = "http://app.api.autohome.com.cn/autov4.8.8/club/jingxuantopic-pm1-c104-p1-s30.json";// 媳妇当车模
    public static final String FORUM_ANSLESE_2 = "http://app.api.autohome.com.cn/autov4.8.8/club/jingxuantopic-pm1-c110-p1-s30.json";//美人计
    public static final String FORUM_ANSLESE_3 = "http://app.api.autohome.com.cn/autov4.8.8/club/jingxuantopic-pm1-c172-p1-s30.json";// 论坛名人堂
    public static final String FORUM_ANSLESE_4 = "http://app.api.autohome.com.cn/autov4.8.8/club/jingxuantopic-pm1-c230-p1-s30.json";// 论坛讲师
    public static final String FORUM_ANSLESE_5 = "http://app.api.autohome.com.cn/autov4.8.8/club/jingxuantopic-pm1-c233-p1-s30.json";//汽车之家十年
    public static final String FORUM_ANSLESE_6 = "http://app.api.autohome.com.cn/autov4.8.8/club/jingxuantopic-pm1-c121-p1-s30.json";//精挑细选
    public static final String FORUM_ANSLESE_7 = "http://app.api.autohome.com.cn/autov4.8.8/club/jingxuantopic-pm1-c106-p1-s30.json";//现身说法
    public static final String FORUM_ANSLESE_8 = "http://app.api.autohome.com.cn/autov4.8.8/club/jingxuantopic-pm1-c118-p1-s30.json";//高端阵地
    public static final String FORUM_ANSLESE_9 = "http://app.api.autohome.com.cn/autov4.8.8/club/jingxuantopic-pm1-c210-p1-s30.json";//电动车
    public static final String FORUM_ANSLESE_10 = "http://app.api.autohome.com.cn/autov4.8.8/club/jingxuantopic-pm1-c199-p1-s30.json";// 汇买车
    public static final String FORUM_ANSLESE_11 = "http://app.api.autohome.com.cn/autov4.8.8/club/jingxuantopic-pm1-c198-p1-s30.json";//行车点评
    public static final String FORUM_ANSLESE_12 = "http://app.api.autohome.com.cn/autov4.8.8/club/jingxuantopic-pm1-c168-p1-s30.json";//超级试驾员
    public static final String FORUM_ANSLESE_13 = "http://app.api.autohome.com.cn/autov4.8.8/club/jingxuantopic-pm1-c113-p1-s30.json";//海外购车
    public static final String FORUM_ANSLESE_14 = "http://app.api.autohome.com.cn/autov4.8.8/club/jingxuantopic-pm1-c109-p1-s30.json";//经典老车
    public static final String FORUM_ANSLESE_15 = "http://app.api.autohome.com.cn/autov4.8.8/club/jingxuantopic-pm1-c191-p1-s30.json";//妹子选车
    public static final String FORUM_ANSLESE_16 = "http://app.api.autohome.com.cn/autov4.8.8/club/jingxuantopic-pm1-c196-p1-s30.json";//优惠购车
    public static final String FORUM_ANSLESE_17 = "http://app.api.autohome.com.cn/autov4.8.8/club/jingxuantopic-pm1-c107-p1-s30.json";//原创大片
    public static final String FORUM_ANSLESE_18 = "http://app.api.autohome.com.cn/autov4.8.8/club/jingxuantopic-pm1-c105-p1-s30.json";//顶配风采
    public static final String FORUM_ANSLESE_19 = "http://app.api.autohome.com.cn/autov4.8.8/club/jingxuantopic-pm1-c122-p1-s30.json";//改装有理
    public static final String FORUM_ANSLESE_20 = "http://app.api.autohome.com.cn/autov4.8.8/club/jingxuantopic-pm1-c194-p1-s30.json";//养车有道
    public static final String FORUM_ANSLESE_21 = "http://app.api.autohome.com.cn/autov4.8.8/club/jingxuantopic-pm1-c119-p1-s30.json";//首发阵营
    public static final String FORUM_ANSLESE_22 = "http://app.api.autohome.com.cn/autov4.8.8/club/jingxuantopic-pm1-c112-p1-s30.json";//新车直播
    public static final String FORUM_ANSLESE_23 = "http://app.api.autohome.com.cn/autov4.8.8/club/jingxuantopic-pm1-c120-p1-s30.json";//历史选题
    public static final String FORUM_ANSLESE_24 = "http://app.api.autohome.com.cn/autov4.8.8/club/jingxuantopic-pm1-c184-p1-s30.json";//摩友天地
    public static final String FORUM_ANSLESE_25 = "http://app.api.autohome.com.cn/autov4.8.8/club/jingxuantopic-pm1-c108-p1-s30.json";//蜜月之旅
    public static final String FORUM_ANSLESE_26 = "http://app.api.autohome.com.cn/autov4.8.8/club/jingxuantopic-pm1-c124-p1-s30.json";//甜蜜婚礼
    public static final String FORUM_ANSLESE_27 = "http://app.api.autohome.com.cn/autov4.8.8/club/jingxuantopic-pm1-c123-p1-s30.json";//摄影课堂
    public static final String FORUM_ANSLESE_28 = "http://app.api.autohome.com.cn/autov4.8.8/club/jingxuantopic-pm1-c185-p1-s30.json";//车友聚会
    public static final String FORUM_ANSLESE_29 = "http://app.api.autohome.com.cn/autov4.8.8/club/jingxuantopic-pm1-c186-p1-s30.json";//单车部落
    public static final String FORUM_ANSLESE_30 = "http://app.api.autohome.com.cn/autov4.8.8/club/jingxuantopic-pm1-c214-p1-s30.json";//杂谈俱乐部
    public static final String FORUM_ANSLESE_31 = "http://app.api.autohome.com.cn/autov4.8.8/club/jingxuantopic-pm1-c218-p1-s30.json";//华北游记
    public static final String FORUM_ANSLESE_32 = "http://app.api.autohome.com.cn/autov4.8.8/club/jingxuantopic-pm1-c223-p1-s30.json";//西南游记
    public static final String FORUM_ANSLESE_33 = "http://app.api.autohome.com.cn/autov4.8.8/club/jingxuantopic-pm1-c221-p1-s30.json";//东北游记
    public static final String FORUM_ANSLESE_34 = "http://app.api.autohome.com.cn/autov4.8.8/club/jingxuantopic-pm1-c222-p1-s30.json";//西北游记
    public static final String FORUM_ANSLESE_35 = "http://app.api.autohome.com.cn/autov4.8.8/club/jingxuantopic-pm1-c220-p1-s30.json";//华中游记
    public static final String FORUM_ANSLESE_36 = "http://app.api.autohome.com.cn/autov4.8.8/club/jingxuantopic-pm1-c224-p1-s30.json";//华南游记
    public static final String FORUM_ANSLESE_37 = "http://app.api.autohome.com.cn/autov4.8.8/club/jingxuantopic-pm1-c219-p1-s30.json";//华东游记
    public static final String FORUM_ANSLESE_38 = "http://app.api.autohome.com.cn/autov4.8.8/club/jingxuantopic-pm1-c225-p1-s30.json";//港澳台游记
    public static final String FORUM_ANSLESE_39 = "http://app.api.autohome.com.cn/autov4.8.8/club/jingxuantopic-pm1-c226-p1-s30.json";//海外游记
    public static final String FORUM_ANSLESE_40 = "http://app.api.autohome.com.cn/autov4.8.8/club/jingxuantopic-pm1-c212-p1-s30.json";//沧海遗珠

    /**
     * 发现页,轮播图
     */

    public static final String SALE_LUNBO_1 = "http://app2.autoimg.cn/appdfs/g22/M11/2C/2A/autohomecar__wKjBwVfeJsaAbXOFAAJ6WLXTx94392.jpg";
    public static final String SALE_LUNBO_2 = "http://app2.autoimg.cn/appdfs/g20/M15/2B/EA/autohomecar__wKjBw1feXkaAfH82AAH_jeiKPEU422.jpg";
    public static final String SALE_LUNBO_3 = "http://app2.autoimg.cn/appdfs/g10/M0F/4A/26/autohomecar__wKgH0VfeadSAeX9NAAKRGlfYsiQ489.jpg";
    public static final String SALE_LUNBO_4 = "http://app2.autoimg.cn/appdfs/g6/M0E/48/CE/autohomecar__wKgHzVfeQbOAeCjDAAGUKq5A1lA366.jpg";
    public static final String SALE_LUNBO_5 = "http://app2.autoimg.cn/appdfs/g13/M05/40/B4/autohomecar__wKgH1FfZDPmAE7W0AAKp8IloxLE758.jpg";
    /**
     * 发现页-导航-recyclerView
     */
    public static  final  String SALE_DISCOVER = "http://223.99.255.20/mobilenc.app.autohome.com.cn/discover_v5.8.0/mobile/functionlist-a2-pm2-v5.8.5-pid210000-cid210200.json";
    public static  final  String SALE_DISCOVER_LIKE = "http://223.99.255.20/mobilenc.app.autohome.com.cn/discover_v5.8.0/mall/intelligentrecommend.ashx?a=2&pm=2&v=5.8.5&uid=0&deviceid=99000628573771&g" +
            "ps=38.889659,121.551063&cityid=210200&pid=210000&pageindex=1&pagesize=20&hid";
}
