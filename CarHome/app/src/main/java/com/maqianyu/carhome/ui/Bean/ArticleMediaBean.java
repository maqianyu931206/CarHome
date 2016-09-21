package com.maqianyu.carhome.ui.Bean;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dllo on 16/9/14.
 */
public class ArticleMediaBean {


    /**
     * isloadmore : true
     * rowcount : 75529
     * pagecount : 2437
     * pageindex : 0
     * list : [{"id":90192,"title":"《传承.呼啸》--斯巴鲁拉力车队纪录片","type":"花边","time":"2016-09-20","indexdetail":"《传承.呼啸》--斯巴鲁拉力车队纪录片","smallimg":"http://www2.autoimg.cn/newsdfs/g17/M02/4B/1C/120x90_0_autohomecar__wKgH51fgwKSAdKz7AAG_ESeZpVo459.jpg","replycount":7,"playcount":4515,"nickname":"张超620","videoaddress":"http://v.youku.com/player/getM3U8/vid//type/mp4/v.m3u8","shareaddress":"http://v.autohome.com.cn/v_4_90192.html","updatetime":"20160920125248","lastid":"201609201252482016092017062390192"},{"id":90096,"title":"2016年性能车闪电圈速实录 讴歌NSX","type":"花边","time":"2016-09-20","indexdetail":"视频中带来的是2016年性能车闪电圈速实录之讴歌NSX。","smallimg":"http://www2.autoimg.cn/newsdfs/g10/M0C/4D/2F/120x90_0_autohomecar__wKjBzVffeWCAPw6DAAEp-zfyudw151.jpg","replycount":61,"playcount":8304,"nickname":"郭泽松","videoaddress":"http://v.youku.com/player/getM3U8/vid//type/mp4/v.m3u8","shareaddress":"http://v.autohome.com.cn/v_4_90096.html","updatetime":"20160919133643","lastid":"201609200037352016092017062390096"},{"id":90148,"title":"看着肉就疼！停车指挥员遭轿车来回碾压","type":"花边","time":"2016-09-20","indexdetail":"视频中战斗民族司机充分展现了鲁莽的一面，这位指挥员遭到了碾压！","smallimg":"http://www2.autoimg.cn/newsdfs/g21/M04/2E/30/120x90_0_autohomecar__wKjBwlfgls6AFzEVAAGIehaNGy0301.jpg","replycount":144,"playcount":93101,"nickname":"郭泽松","videoaddress":"http://v.youku.com/player/getM3U8/vid//type/mp4/v.m3u8","shareaddress":"http://v.autohome.com.cn/v_4_90148.html","updatetime":"20160920095424","lastid":"201609200954242016092017012390148"},{"id":90151,"title":"加速比拼！911 Turbo S vs Huracan","type":"花边","time":"2016-09-20","indexdetail":"视频中展示了一场直线大战！911 Turbo S vs Huracan 610-4。","smallimg":"http://www2.autoimg.cn/newsdfs/g11/M06/4E/E3/120x90_0_autohomecar__wKgH4Vfgl3eAHqaeAADnpb-mXQw761.jpg","replycount":226,"playcount":46358,"nickname":"郭泽松","videoaddress":"http://v.youku.com/player/getM3U8/vid//type/mp4/v.m3u8","shareaddress":"http://v.autohome.com.cn/v_4_90151.html","updatetime":"20160920095713","lastid":"201609200957142016092017012390151"},{"id":90159,"title":"剑指RS 6 新款梅赛德斯-AMG E 43旅行版","type":"花边","time":"2016-09-20","indexdetail":"视频展示了新款梅赛德斯-AMG E 43旅行版。","smallimg":"http://www3.autoimg.cn/newsdfs/g23/M06/30/0F/120x90_0_autohomecar__wKjBwFfgmZyAai5sAAEzZWo4-k8196.jpg","replycount":249,"playcount":46957,"nickname":"艾琦","videoaddress":"http://v.youku.com/player/getM3U8/vid//type/mp4/v.m3u8","shareaddress":"http://v.autohome.com.cn/v_4_90159.html","updatetime":"20160920100625","lastid":"201609201006262016092017012290159"},{"id":90169,"title":"阿拉伯老司机 街头实拍高难度两轮驾驶","type":"花边","time":"2016-09-20","indexdetail":"视频展示了阿拉伯街头实拍的高难度两轮驾驶。","smallimg":"http://www3.autoimg.cn/newsdfs/g5/M10/4E/01/120x90_0_autohomecar__wKjB0lfgnuiAEQbDAADYaD81FvM653.jpg","replycount":122,"playcount":39558,"nickname":"艾琦","videoaddress":"http://v.youku.com/player/getM3U8/vid//type/mp4/v.m3u8","shareaddress":"http://v.autohome.com.cn/v_4_90169.html","updatetime":"20160920102859","lastid":"201609201028592016092017012290169"},{"id":90164,"title":"肚子里还能装车！实拍超豪华大型房车","type":"花边","time":"2016-09-20","indexdetail":"视频详细展示了一辆超豪华的大型房车，惊人的是它的\u201c肚子\u201d里竟然能装下一辆敞篷跑车！","smallimg":"http://www3.autoimg.cn/newsdfs/g10/M07/4F/9B/120x90_0_autohomecar__wKgH4FfgmxaAZivhAAGhZHnNy3I314.jpg","replycount":25,"playcount":33324,"nickname":"艾琦","videoaddress":"http://v.youku.com/player/getM3U8/vid//type/mp4/v.m3u8","shareaddress":"http://v.autohome.com.cn/v_4_90164.html","updatetime":"20160920170120","lastid":"201609201701192016092017012290164"},{"id":90147,"title":"太没素质了 实拍轿车撞车后肇事逃逸","type":"花边","time":"2016-09-20","indexdetail":"视频中展示了轿车撞车后肇事逃逸的画面。","smallimg":"http://www3.autoimg.cn/newsdfs/g4/M00/4E/C6/120x90_0_autohomecar__wKjB01fglgOAUShCAAECW0q1ppM229.jpg","replycount":251,"playcount":49628,"nickname":"郭泽松","videoaddress":"http://v.youku.com/player/getM3U8/vid//type/mp4/v.m3u8","shareaddress":"http://v.autohome.com.cn/v_4_90147.html","updatetime":"20160920095100","lastid":"201609200951012016092017012290147"},{"id":90097,"title":"2016年性能车闪电圈速 奥迪R8 V10 plus","type":"花边","time":"2016-09-20","indexdetail":"视频中带来的是2016年性能车闪电圈速 奥迪R8 V10 plus。","smallimg":"http://www3.autoimg.cn/newsdfs/g9/M02/51/A2/120x90_0_autohomecar__wKgH31ffee2ANyadAAGCeyPrQQc833.jpg","replycount":27,"playcount":4744,"nickname":"郭泽松","videoaddress":"http://v.youku.com/player/getM3U8/vid//type/mp4/v.m3u8","shareaddress":"http://v.autohome.com.cn/v_4_90097.html","updatetime":"20160919133855","lastid":"201609200039312016092017012290097"},{"id":90149,"title":"这才是天籁之音 S 500 L内聆听柏林之声","type":"花边","time":"2016-09-20","indexdetail":"视频作者在奔驰S 500 L内记录了柏林之声的播放效果，音色太出众了。","smallimg":"http://www3.autoimg.cn/newsdfs/g6/M10/4D/E6/120x90_0_autohomecar__wKjB0VfgluaAQgbBAAFHZgW8m_8265.jpg","replycount":30,"playcount":35603,"nickname":"崔海","videoaddress":"http://v.youku.com/player/getM3U8/vid//type/mp4/v.m3u8","shareaddress":"http://v.autohome.com.cn/v_4_90149.html","updatetime":"20160920095448","lastid":"201609200954492016092017012290149"},{"id":90158,"title":"内饰更加高级 2017款阿特兹内饰展示","type":"花边","time":"2016-09-20","indexdetail":"视频展示了2017款马自达阿特兹的内饰，新款车型内饰整体风格摆脱了之前的老气，年轻时尚了不少。","smallimg":"http://www3.autoimg.cn/newsdfs/g5/M0A/4E/00/120x90_0_autohomecar__wKgHzFfhAWyAHOlJAADw9g7Z6LI213.jpg","replycount":36,"playcount":17337,"nickname":"艾琦","videoaddress":"http://v.youku.com/player/getM3U8/vid//type/mp4/v.m3u8","shareaddress":"http://v.autohome.com.cn/v_4_90158.html","updatetime":"20160920172919","lastid":"201609201729172016092017012290158"},{"id":90188,"title":"摔得太惨了 狭窄街道两辆摩托迎面相撞","type":"花边","time":"2016-09-20","indexdetail":"视频实录了狭窄街道上两辆摩托迎面相撞的惨烈一幕。","smallimg":"http://www3.autoimg.cn/newsdfs/g22/M02/2E/73/120x90_0_autohomecar__wKgFVlfgqm-AMTLLAAF1tOIWHuE166.jpg","replycount":328,"playcount":76608,"nickname":"艾琦","videoaddress":"http://v.youku.com/player/getM3U8/vid//type/mp4/v.m3u8","shareaddress":"http://v.autohome.com.cn/v_4_90188.html","updatetime":"20160920111809","lastid":"201609201118102016092017012290188"},{"id":90168,"title":"4.08秒就破百 2017款奥迪S6详细展示","type":"花边","time":"2016-09-20","indexdetail":"视频详细展示了2017款奥迪S6，百公里加速时间和颇为吵闹的声浪。","smallimg":"http://www2.autoimg.cn/newsdfs/g5/M05/50/52/120x90_0_autohomecar__wKgH21fgntuAR204AAF5oHHZ5ys874.jpg","replycount":8,"playcount":5541,"nickname":"艾琦","videoaddress":"http://v.youku.com/player/getM3U8/vid//type/mp4/v.m3u8","shareaddress":"http://v.autohome.com.cn/v_4_90168.html","updatetime":"20160920102844","lastid":"201609201028452016092017012290168"},{"id":90199,"title":"逼格都很高 台媒总结性能车的开门方式","type":"花边","time":"2016-09-20","indexdetail":"视频展示了台湾汽车深节目中畅聊多辆性能车的开门方式。","smallimg":"http://www2.autoimg.cn/newsdfs/g17/M06/48/2E/120x90_0_autohomecar__wKgH2Ffg1IWAIlG5AAGeIqxPnFo876.jpg","replycount":8,"playcount":7179,"nickname":"陆维","videoaddress":"http://v.youku.com/player/getM3U8/vid//type/mp4/v.m3u8","shareaddress":"http://v.autohome.com.cn/v_4_90199.html","updatetime":"20160920141838","lastid":"201609201418372016092017012290199"},{"id":90139,"title":"痛并快乐着 试驾KTM X-BOW GT预告片","type":"试车","time":"2016-09-19","indexdetail":"在X-bow身上我们发现很多专为赛车比赛而设计的元素，比如此车从后方看成八字形的后轮\u2014\u2014这种程度的外倾角设置，一般只出现在赛车上，目的是为了提升过弯时的稳定性。","smallimg":"http://www3.autoimg.cn/newsdfs/g15/M00/4D/76/120x90_0_autohomecar__wKgH1lff7gSAOqd8AAE3iydl5fI300.jpg","replycount":10,"playcount":10655,"nickname":"刘甜甜","videoaddress":"http://v.youku.com/player/getM3U8/vid//type/mp4/v.m3u8","shareaddress":"http://v.autohome.com.cn/v_2_90139.html","updatetime":"20160920165631","lastid":"201609192355502016092017012290139"},{"id":90145,"title":"这些跑车很稀有 综艺节目介绍古董车","type":"花边","time":"2016-09-20","indexdetail":"台湾的综艺节目中介绍了兰博基尼Miura、捷豹E-type等古董车。","smallimg":"http://www3.autoimg.cn/newsdfs/g6/M00/4D/E3/120x90_0_autohomecar__wKjB0VfglWeAWwkLAAF1QK50E3U210.jpg","replycount":2,"playcount":1179,"nickname":"崔海","videoaddress":"http://v.youku.com/player/getM3U8/vid//type/mp4/v.m3u8","shareaddress":"http://v.autohome.com.cn/v_4_90145.html","updatetime":"20160920094826","lastid":"201609200948272016092013023490145"},{"id":90157,"title":"凶狠的獠牙！TOPCAR改装AMG GLE 63","type":"花边","time":"2016-09-20","indexdetail":"视频展示了TOPCAR改装的奔驰AMG GLE 63 coupe，凶狠的獠牙遍布全身。","smallimg":"http://www2.autoimg.cn/newsdfs/g7/M0A/4C/81/120x90_0_autohomecar__wKgHzlfgmG-ATW3iAAFP4po97gU571.jpg","replycount":2,"playcount":2630,"nickname":"崔海","videoaddress":"http://v.youku.com/player/getM3U8/vid//type/mp4/v.m3u8","shareaddress":"http://v.autohome.com.cn/v_4_90157.html","updatetime":"20160920100121","lastid":"201609201001222016092013023490157"},{"id":90160,"title":"极为少见 白色法拉利288 GTO上板车","type":"花边","time":"2016-09-20","indexdetail":"视频展示了一辆白色法拉利288 GTO开上板车的过程。","smallimg":"http://www3.autoimg.cn/newsdfs/g4/M0F/4B/DD/120x90_0_autohomecar__wKgHy1fgmaeAAad6AAEk-aHwCzQ219.jpg","replycount":1,"playcount":2181,"nickname":"艾琦","videoaddress":"http://v.youku.com/player/getM3U8/vid//type/mp4/v.m3u8","shareaddress":"http://v.autohome.com.cn/v_4_90160.html","updatetime":"20160920100633","lastid":"201609201006332016092013023490160"},{"id":90179,"title":"躲过一劫 摄像车后方两车严重追尾事故","type":"花边","time":"2016-09-20","indexdetail":"视频实录了摄像车后方两车发生严重追尾事故。","smallimg":"http://www2.autoimg.cn/newsdfs/g6/M06/4B/B1/120x90_0_autohomecar__wKgHzVfgpvuAUo6CAADjtQP97ss110.jpg","replycount":10,"playcount":5032,"nickname":"艾琦","videoaddress":"http://v.youku.com/player/getM3U8/vid//type/mp4/v.m3u8","shareaddress":"http://v.autohome.com.cn/v_4_90179.html","updatetime":"20160920110324","lastid":"201609201103252016092013023490179"},{"id":90171,"title":"加速大对比 RC F vs AMG C 63 Coupe","type":"花边","time":"2016-09-20","indexdetail":"视频中带来的是RC F vs AMG C 63 Coupe加速大对比。","smallimg":"http://www2.autoimg.cn/newsdfs/g9/M09/53/1A/120x90_0_autohomecar__wKgH31fgoLaAQuLYAAFQmjBMNME106.jpg","replycount":129,"playcount":32967,"nickname":"郭泽松","videoaddress":"http://v.youku.com/player/getM3U8/vid//type/mp4/v.m3u8","shareaddress":"http://v.autohome.com.cn/v_4_90171.html","updatetime":"20160920103641","lastid":"201609201036412016092013023490171"},{"id":90152,"title":"摇身一变 看3008达喀尔拉力赛车宣传片","type":"广告","time":"2016-09-20","indexdetail":"视频是标致3008达喀尔拉力赛车的宣传片，挺有创意的。","smallimg":"http://www3.autoimg.cn/newsdfs/g14/M07/4E/F6/120x90_0_autohomecar__wKgH5Ffgl8uASfVGAADOOkgmw1E669.jpg","replycount":1,"playcount":1691,"nickname":"崔海","videoaddress":"http://v.youku.com/player/getM3U8/vid//type/mp4/v.m3u8","shareaddress":"http://v.autohome.com.cn/v_3_90152.html","updatetime":"20160920095837","lastid":"201609200958382016092013023490152"},{"id":90170,"title":"9秒绝杀 爆改科尔维特C7直线战强敌","type":"花边","time":"2016-09-20","indexdetail":"视频展示了一辆爆改的科尔维特C7直线战强敌的镜头合集。","smallimg":"http://www3.autoimg.cn/newsdfs/g8/M06/52/3A/120x90_0_autohomecar__wKgH3lfgn5WAHDl2AAFLNMcMeio000.jpg","replycount":2,"playcount":1742,"nickname":"艾琦","videoaddress":"http://v.youku.com/player/getM3U8/vid//type/mp4/v.m3u8","shareaddress":"http://v.autohome.com.cn/v_4_90170.html","updatetime":"20160920103150","lastid":"201609201031512016092013023490170"},{"id":90155,"title":"震耳欲聋 改装超跑全油门加速声浪合集","type":"花边","time":"2016-09-20","indexdetail":"视频中带来的是超跑全油门加速声浪合集，绝对听觉盛宴！","smallimg":"http://www3.autoimg.cn/newsdfs/g20/M0B/2D/F3/120x90_0_autohomecar__wKgFVFfgowqAA4eUAAEcAFFPW34305.jpg","replycount":74,"playcount":42415,"nickname":"郭泽松","videoaddress":"http://v.youku.com/player/getM3U8/vid//type/mp4/v.m3u8","shareaddress":"http://v.autohome.com.cn/v_4_90155.html","updatetime":"20160920104635","lastid":"201609201046352016092013023490155"},{"id":90177,"title":"MT驾驶者之车评选Shelby GT350R跑圈速","type":"花边","time":"2016-09-20","indexdetail":"MT驾驶者之车评选Shelby GT350R跑圈速。","smallimg":"http://www2.autoimg.cn/newsdfs/g22/M06/2E/64/120x90_0_autohomecar__wKgFVlfgo6KAG3UiAADoKy-7bNU675.jpg","replycount":22,"playcount":5349,"nickname":"郭泽松","videoaddress":"http://v.youku.com/player/getM3U8/vid//type/mp4/v.m3u8","shareaddress":"http://v.autohome.com.cn/v_4_90177.html","updatetime":"20160920104908","lastid":"201609201049092016092013023490177"},{"id":90189,"title":"盲区看不见 实拍SUV强行并线发生剐蹭","type":"花边","time":"2016-09-20","indexdetail":"视频实拍了SUV强行并线发生剐蹭的一幕。","smallimg":"http://www2.autoimg.cn/newsdfs/g16/M15/4F/7D/120x90_0_autohomecar__wKgH5lfgqr-AeY-iAAFW88Qq9bo110.jpg","replycount":144,"playcount":47252,"nickname":"艾琦","videoaddress":"http://v.youku.com/player/getM3U8/vid//type/mp4/v.m3u8","shareaddress":"http://v.autohome.com.cn/v_4_90189.html","updatetime":"20160920111928","lastid":"201609201119292016092013023490189"},{"id":90178,"title":"MT驾驶者之车评选 迈凯伦570S圈速实录","type":"花边","time":"2016-09-20","indexdetail":"MT驾驶者之车评选 迈凯伦570S拉古娜塞卡圈速实录。","smallimg":"http://www3.autoimg.cn/newsdfs/g23/M06/30/27/120x90_0_autohomecar__wKjBwFfgpBeAJSL1AADyZh3igN4408.jpg","replycount":11,"playcount":4457,"nickname":"郭泽松","videoaddress":"http://v.youku.com/player/getM3U8/vid//type/mp4/v.m3u8","shareaddress":"http://v.autohome.com.cn/v_4_90178.html","updatetime":"20160920130741","lastid":"201609201307412016092013023490178"},{"id":90175,"title":"MT驾驶者之车评选 宝马M4 GTS圈速实录","type":"花边","time":"2016-09-20","indexdetail":"MT驾驶者之车评选 M4 GTS圈速实录，赛道为马自达拉古娜塞卡。","smallimg":"http://www3.autoimg.cn/newsdfs/g20/M06/2E/C1/120x90_0_autohomecar__wKjBw1fgovmAbz78AAE5ZFP3Qhk363.jpg","replycount":17,"playcount":3034,"nickname":"郭泽松","videoaddress":"http://v.youku.com/player/getM3U8/vid//type/mp4/v.m3u8","shareaddress":"http://v.autohome.com.cn/v_4_90175.html","updatetime":"20160920131132","lastid":"201609201311322016092013023490175"},{"id":90172,"title":"老车也酷炫！车友展示老款高尔夫GTI","type":"花边","time":"2016-09-20","indexdetail":"视频中车友带你展示一下聚会上的老款高尔夫GTI。","smallimg":"http://www3.autoimg.cn/newsdfs/g20/M05/2E/BE/120x90_0_autohomecar__wKjBw1fgoWmAWWLpAAF_e-LbttI734.jpg","replycount":1,"playcount":2203,"nickname":"郭泽松","videoaddress":"http://v.youku.com/player/getM3U8/vid//type/mp4/v.m3u8","shareaddress":"http://v.autohome.com.cn/v_4_90172.html","updatetime":"20160920103939","lastid":"201609201039392016092013023490172"},{"id":90173,"title":"行车记录趣 台媒试驾2016款捷豹F-PACE","type":"花边","time":"2016-09-20","indexdetail":"视频中台湾媒体试驾2016款捷豹F-PACE。","smallimg":"http://www2.autoimg.cn/newsdfs/g13/M0A/4F/37/120x90_0_autohomecar__wKjBylfgoeaAU2BBAADyQmxlV64118.jpg","replycount":1,"playcount":2431,"nickname":"郭泽松","videoaddress":"http://v.youku.com/player/getM3U8/vid//type/mp4/v.m3u8","shareaddress":"http://v.autohome.com.cn/v_4_90173.html","updatetime":"20160920104144","lastid":"201609201041452016092013023490173"},{"id":90144,"title":"这下被撞惨了！小轿车鬼探头拦腰被撞","type":"花边","time":"2016-09-20","indexdetail":"视频中展示了小轿车鬼探头拦腰被撞的画面。","smallimg":"http://www3.autoimg.cn/newsdfs/g5/M15/4D/3A/120x90_0_autohomecar__wKgHzFfglFOACyyQAAFEYVVMsyY752.jpg","replycount":11,"playcount":8283,"nickname":"郭泽松","videoaddress":"http://v.youku.com/player/getM3U8/vid//type/mp4/v.m3u8","shareaddress":"http://v.autohome.com.cn/v_4_90144.html","updatetime":"20160920094348","lastid":"201609200943492016092013023490144"}]
     */

    private ResultBean result;
    /**
     * result : {"isloadmore":true,"rowcount":75529,"pagecount":2437,"pageindex":0,"list":[{"id":90192,"title":"《传承.呼啸》--斯巴鲁拉力车队纪录片","type":"花边","time":"2016-09-20","indexdetail":"《传承.呼啸》--斯巴鲁拉力车队纪录片","smallimg":"http://www2.autoimg.cn/newsdfs/g17/M02/4B/1C/120x90_0_autohomecar__wKgH51fgwKSAdKz7AAG_ESeZpVo459.jpg","replycount":7,"playcount":4515,"nickname":"张超620","videoaddress":"http://v.youku.com/player/getM3U8/vid//type/mp4/v.m3u8","shareaddress":"http://v.autohome.com.cn/v_4_90192.html","updatetime":"20160920125248","lastid":"201609201252482016092017062390192"},{"id":90096,"title":"2016年性能车闪电圈速实录 讴歌NSX","type":"花边","time":"2016-09-20","indexdetail":"视频中带来的是2016年性能车闪电圈速实录之讴歌NSX。","smallimg":"http://www2.autoimg.cn/newsdfs/g10/M0C/4D/2F/120x90_0_autohomecar__wKjBzVffeWCAPw6DAAEp-zfyudw151.jpg","replycount":61,"playcount":8304,"nickname":"郭泽松","videoaddress":"http://v.youku.com/player/getM3U8/vid//type/mp4/v.m3u8","shareaddress":"http://v.autohome.com.cn/v_4_90096.html","updatetime":"20160919133643","lastid":"201609200037352016092017062390096"},{"id":90148,"title":"看着肉就疼！停车指挥员遭轿车来回碾压","type":"花边","time":"2016-09-20","indexdetail":"视频中战斗民族司机充分展现了鲁莽的一面，这位指挥员遭到了碾压！","smallimg":"http://www2.autoimg.cn/newsdfs/g21/M04/2E/30/120x90_0_autohomecar__wKjBwlfgls6AFzEVAAGIehaNGy0301.jpg","replycount":144,"playcount":93101,"nickname":"郭泽松","videoaddress":"http://v.youku.com/player/getM3U8/vid//type/mp4/v.m3u8","shareaddress":"http://v.autohome.com.cn/v_4_90148.html","updatetime":"20160920095424","lastid":"201609200954242016092017012390148"},{"id":90151,"title":"加速比拼！911 Turbo S vs Huracan","type":"花边","time":"2016-09-20","indexdetail":"视频中展示了一场直线大战！911 Turbo S vs Huracan 610-4。","smallimg":"http://www2.autoimg.cn/newsdfs/g11/M06/4E/E3/120x90_0_autohomecar__wKgH4Vfgl3eAHqaeAADnpb-mXQw761.jpg","replycount":226,"playcount":46358,"nickname":"郭泽松","videoaddress":"http://v.youku.com/player/getM3U8/vid//type/mp4/v.m3u8","shareaddress":"http://v.autohome.com.cn/v_4_90151.html","updatetime":"20160920095713","lastid":"201609200957142016092017012390151"},{"id":90159,"title":"剑指RS 6 新款梅赛德斯-AMG E 43旅行版","type":"花边","time":"2016-09-20","indexdetail":"视频展示了新款梅赛德斯-AMG E 43旅行版。","smallimg":"http://www3.autoimg.cn/newsdfs/g23/M06/30/0F/120x90_0_autohomecar__wKjBwFfgmZyAai5sAAEzZWo4-k8196.jpg","replycount":249,"playcount":46957,"nickname":"艾琦","videoaddress":"http://v.youku.com/player/getM3U8/vid//type/mp4/v.m3u8","shareaddress":"http://v.autohome.com.cn/v_4_90159.html","updatetime":"20160920100625","lastid":"201609201006262016092017012290159"},{"id":90169,"title":"阿拉伯老司机 街头实拍高难度两轮驾驶","type":"花边","time":"2016-09-20","indexdetail":"视频展示了阿拉伯街头实拍的高难度两轮驾驶。","smallimg":"http://www3.autoimg.cn/newsdfs/g5/M10/4E/01/120x90_0_autohomecar__wKjB0lfgnuiAEQbDAADYaD81FvM653.jpg","replycount":122,"playcount":39558,"nickname":"艾琦","videoaddress":"http://v.youku.com/player/getM3U8/vid//type/mp4/v.m3u8","shareaddress":"http://v.autohome.com.cn/v_4_90169.html","updatetime":"20160920102859","lastid":"201609201028592016092017012290169"},{"id":90164,"title":"肚子里还能装车！实拍超豪华大型房车","type":"花边","time":"2016-09-20","indexdetail":"视频详细展示了一辆超豪华的大型房车，惊人的是它的\u201c肚子\u201d里竟然能装下一辆敞篷跑车！","smallimg":"http://www3.autoimg.cn/newsdfs/g10/M07/4F/9B/120x90_0_autohomecar__wKgH4FfgmxaAZivhAAGhZHnNy3I314.jpg","replycount":25,"playcount":33324,"nickname":"艾琦","videoaddress":"http://v.youku.com/player/getM3U8/vid//type/mp4/v.m3u8","shareaddress":"http://v.autohome.com.cn/v_4_90164.html","updatetime":"20160920170120","lastid":"201609201701192016092017012290164"},{"id":90147,"title":"太没素质了 实拍轿车撞车后肇事逃逸","type":"花边","time":"2016-09-20","indexdetail":"视频中展示了轿车撞车后肇事逃逸的画面。","smallimg":"http://www3.autoimg.cn/newsdfs/g4/M00/4E/C6/120x90_0_autohomecar__wKjB01fglgOAUShCAAECW0q1ppM229.jpg","replycount":251,"playcount":49628,"nickname":"郭泽松","videoaddress":"http://v.youku.com/player/getM3U8/vid//type/mp4/v.m3u8","shareaddress":"http://v.autohome.com.cn/v_4_90147.html","updatetime":"20160920095100","lastid":"201609200951012016092017012290147"},{"id":90097,"title":"2016年性能车闪电圈速 奥迪R8 V10 plus","type":"花边","time":"2016-09-20","indexdetail":"视频中带来的是2016年性能车闪电圈速 奥迪R8 V10 plus。","smallimg":"http://www3.autoimg.cn/newsdfs/g9/M02/51/A2/120x90_0_autohomecar__wKgH31ffee2ANyadAAGCeyPrQQc833.jpg","replycount":27,"playcount":4744,"nickname":"郭泽松","videoaddress":"http://v.youku.com/player/getM3U8/vid//type/mp4/v.m3u8","shareaddress":"http://v.autohome.com.cn/v_4_90097.html","updatetime":"20160919133855","lastid":"201609200039312016092017012290097"},{"id":90149,"title":"这才是天籁之音 S 500 L内聆听柏林之声","type":"花边","time":"2016-09-20","indexdetail":"视频作者在奔驰S 500 L内记录了柏林之声的播放效果，音色太出众了。","smallimg":"http://www3.autoimg.cn/newsdfs/g6/M10/4D/E6/120x90_0_autohomecar__wKjB0VfgluaAQgbBAAFHZgW8m_8265.jpg","replycount":30,"playcount":35603,"nickname":"崔海","videoaddress":"http://v.youku.com/player/getM3U8/vid//type/mp4/v.m3u8","shareaddress":"http://v.autohome.com.cn/v_4_90149.html","updatetime":"20160920095448","lastid":"201609200954492016092017012290149"},{"id":90158,"title":"内饰更加高级 2017款阿特兹内饰展示","type":"花边","time":"2016-09-20","indexdetail":"视频展示了2017款马自达阿特兹的内饰，新款车型内饰整体风格摆脱了之前的老气，年轻时尚了不少。","smallimg":"http://www3.autoimg.cn/newsdfs/g5/M0A/4E/00/120x90_0_autohomecar__wKgHzFfhAWyAHOlJAADw9g7Z6LI213.jpg","replycount":36,"playcount":17337,"nickname":"艾琦","videoaddress":"http://v.youku.com/player/getM3U8/vid//type/mp4/v.m3u8","shareaddress":"http://v.autohome.com.cn/v_4_90158.html","updatetime":"20160920172919","lastid":"201609201729172016092017012290158"},{"id":90188,"title":"摔得太惨了 狭窄街道两辆摩托迎面相撞","type":"花边","time":"2016-09-20","indexdetail":"视频实录了狭窄街道上两辆摩托迎面相撞的惨烈一幕。","smallimg":"http://www3.autoimg.cn/newsdfs/g22/M02/2E/73/120x90_0_autohomecar__wKgFVlfgqm-AMTLLAAF1tOIWHuE166.jpg","replycount":328,"playcount":76608,"nickname":"艾琦","videoaddress":"http://v.youku.com/player/getM3U8/vid//type/mp4/v.m3u8","shareaddress":"http://v.autohome.com.cn/v_4_90188.html","updatetime":"20160920111809","lastid":"201609201118102016092017012290188"},{"id":90168,"title":"4.08秒就破百 2017款奥迪S6详细展示","type":"花边","time":"2016-09-20","indexdetail":"视频详细展示了2017款奥迪S6，百公里加速时间和颇为吵闹的声浪。","smallimg":"http://www2.autoimg.cn/newsdfs/g5/M05/50/52/120x90_0_autohomecar__wKgH21fgntuAR204AAF5oHHZ5ys874.jpg","replycount":8,"playcount":5541,"nickname":"艾琦","videoaddress":"http://v.youku.com/player/getM3U8/vid//type/mp4/v.m3u8","shareaddress":"http://v.autohome.com.cn/v_4_90168.html","updatetime":"20160920102844","lastid":"201609201028452016092017012290168"},{"id":90199,"title":"逼格都很高 台媒总结性能车的开门方式","type":"花边","time":"2016-09-20","indexdetail":"视频展示了台湾汽车深节目中畅聊多辆性能车的开门方式。","smallimg":"http://www2.autoimg.cn/newsdfs/g17/M06/48/2E/120x90_0_autohomecar__wKgH2Ffg1IWAIlG5AAGeIqxPnFo876.jpg","replycount":8,"playcount":7179,"nickname":"陆维","videoaddress":"http://v.youku.com/player/getM3U8/vid//type/mp4/v.m3u8","shareaddress":"http://v.autohome.com.cn/v_4_90199.html","updatetime":"20160920141838","lastid":"201609201418372016092017012290199"},{"id":90139,"title":"痛并快乐着 试驾KTM X-BOW GT预告片","type":"试车","time":"2016-09-19","indexdetail":"在X-bow身上我们发现很多专为赛车比赛而设计的元素，比如此车从后方看成八字形的后轮\u2014\u2014这种程度的外倾角设置，一般只出现在赛车上，目的是为了提升过弯时的稳定性。","smallimg":"http://www3.autoimg.cn/newsdfs/g15/M00/4D/76/120x90_0_autohomecar__wKgH1lff7gSAOqd8AAE3iydl5fI300.jpg","replycount":10,"playcount":10655,"nickname":"刘甜甜","videoaddress":"http://v.youku.com/player/getM3U8/vid//type/mp4/v.m3u8","shareaddress":"http://v.autohome.com.cn/v_2_90139.html","updatetime":"20160920165631","lastid":"201609192355502016092017012290139"},{"id":90145,"title":"这些跑车很稀有 综艺节目介绍古董车","type":"花边","time":"2016-09-20","indexdetail":"台湾的综艺节目中介绍了兰博基尼Miura、捷豹E-type等古董车。","smallimg":"http://www3.autoimg.cn/newsdfs/g6/M00/4D/E3/120x90_0_autohomecar__wKjB0VfglWeAWwkLAAF1QK50E3U210.jpg","replycount":2,"playcount":1179,"nickname":"崔海","videoaddress":"http://v.youku.com/player/getM3U8/vid//type/mp4/v.m3u8","shareaddress":"http://v.autohome.com.cn/v_4_90145.html","updatetime":"20160920094826","lastid":"201609200948272016092013023490145"},{"id":90157,"title":"凶狠的獠牙！TOPCAR改装AMG GLE 63","type":"花边","time":"2016-09-20","indexdetail":"视频展示了TOPCAR改装的奔驰AMG GLE 63 coupe，凶狠的獠牙遍布全身。","smallimg":"http://www2.autoimg.cn/newsdfs/g7/M0A/4C/81/120x90_0_autohomecar__wKgHzlfgmG-ATW3iAAFP4po97gU571.jpg","replycount":2,"playcount":2630,"nickname":"崔海","videoaddress":"http://v.youku.com/player/getM3U8/vid//type/mp4/v.m3u8","shareaddress":"http://v.autohome.com.cn/v_4_90157.html","updatetime":"20160920100121","lastid":"201609201001222016092013023490157"},{"id":90160,"title":"极为少见 白色法拉利288 GTO上板车","type":"花边","time":"2016-09-20","indexdetail":"视频展示了一辆白色法拉利288 GTO开上板车的过程。","smallimg":"http://www3.autoimg.cn/newsdfs/g4/M0F/4B/DD/120x90_0_autohomecar__wKgHy1fgmaeAAad6AAEk-aHwCzQ219.jpg","replycount":1,"playcount":2181,"nickname":"艾琦","videoaddress":"http://v.youku.com/player/getM3U8/vid//type/mp4/v.m3u8","shareaddress":"http://v.autohome.com.cn/v_4_90160.html","updatetime":"20160920100633","lastid":"201609201006332016092013023490160"},{"id":90179,"title":"躲过一劫 摄像车后方两车严重追尾事故","type":"花边","time":"2016-09-20","indexdetail":"视频实录了摄像车后方两车发生严重追尾事故。","smallimg":"http://www2.autoimg.cn/newsdfs/g6/M06/4B/B1/120x90_0_autohomecar__wKgHzVfgpvuAUo6CAADjtQP97ss110.jpg","replycount":10,"playcount":5032,"nickname":"艾琦","videoaddress":"http://v.youku.com/player/getM3U8/vid//type/mp4/v.m3u8","shareaddress":"http://v.autohome.com.cn/v_4_90179.html","updatetime":"20160920110324","lastid":"201609201103252016092013023490179"},{"id":90171,"title":"加速大对比 RC F vs AMG C 63 Coupe","type":"花边","time":"2016-09-20","indexdetail":"视频中带来的是RC F vs AMG C 63 Coupe加速大对比。","smallimg":"http://www2.autoimg.cn/newsdfs/g9/M09/53/1A/120x90_0_autohomecar__wKgH31fgoLaAQuLYAAFQmjBMNME106.jpg","replycount":129,"playcount":32967,"nickname":"郭泽松","videoaddress":"http://v.youku.com/player/getM3U8/vid//type/mp4/v.m3u8","shareaddress":"http://v.autohome.com.cn/v_4_90171.html","updatetime":"20160920103641","lastid":"201609201036412016092013023490171"},{"id":90152,"title":"摇身一变 看3008达喀尔拉力赛车宣传片","type":"广告","time":"2016-09-20","indexdetail":"视频是标致3008达喀尔拉力赛车的宣传片，挺有创意的。","smallimg":"http://www3.autoimg.cn/newsdfs/g14/M07/4E/F6/120x90_0_autohomecar__wKgH5Ffgl8uASfVGAADOOkgmw1E669.jpg","replycount":1,"playcount":1691,"nickname":"崔海","videoaddress":"http://v.youku.com/player/getM3U8/vid//type/mp4/v.m3u8","shareaddress":"http://v.autohome.com.cn/v_3_90152.html","updatetime":"20160920095837","lastid":"201609200958382016092013023490152"},{"id":90170,"title":"9秒绝杀 爆改科尔维特C7直线战强敌","type":"花边","time":"2016-09-20","indexdetail":"视频展示了一辆爆改的科尔维特C7直线战强敌的镜头合集。","smallimg":"http://www3.autoimg.cn/newsdfs/g8/M06/52/3A/120x90_0_autohomecar__wKgH3lfgn5WAHDl2AAFLNMcMeio000.jpg","replycount":2,"playcount":1742,"nickname":"艾琦","videoaddress":"http://v.youku.com/player/getM3U8/vid//type/mp4/v.m3u8","shareaddress":"http://v.autohome.com.cn/v_4_90170.html","updatetime":"20160920103150","lastid":"201609201031512016092013023490170"},{"id":90155,"title":"震耳欲聋 改装超跑全油门加速声浪合集","type":"花边","time":"2016-09-20","indexdetail":"视频中带来的是超跑全油门加速声浪合集，绝对听觉盛宴！","smallimg":"http://www3.autoimg.cn/newsdfs/g20/M0B/2D/F3/120x90_0_autohomecar__wKgFVFfgowqAA4eUAAEcAFFPW34305.jpg","replycount":74,"playcount":42415,"nickname":"郭泽松","videoaddress":"http://v.youku.com/player/getM3U8/vid//type/mp4/v.m3u8","shareaddress":"http://v.autohome.com.cn/v_4_90155.html","updatetime":"20160920104635","lastid":"201609201046352016092013023490155"},{"id":90177,"title":"MT驾驶者之车评选Shelby GT350R跑圈速","type":"花边","time":"2016-09-20","indexdetail":"MT驾驶者之车评选Shelby GT350R跑圈速。","smallimg":"http://www2.autoimg.cn/newsdfs/g22/M06/2E/64/120x90_0_autohomecar__wKgFVlfgo6KAG3UiAADoKy-7bNU675.jpg","replycount":22,"playcount":5349,"nickname":"郭泽松","videoaddress":"http://v.youku.com/player/getM3U8/vid//type/mp4/v.m3u8","shareaddress":"http://v.autohome.com.cn/v_4_90177.html","updatetime":"20160920104908","lastid":"201609201049092016092013023490177"},{"id":90189,"title":"盲区看不见 实拍SUV强行并线发生剐蹭","type":"花边","time":"2016-09-20","indexdetail":"视频实拍了SUV强行并线发生剐蹭的一幕。","smallimg":"http://www2.autoimg.cn/newsdfs/g16/M15/4F/7D/120x90_0_autohomecar__wKgH5lfgqr-AeY-iAAFW88Qq9bo110.jpg","replycount":144,"playcount":47252,"nickname":"艾琦","videoaddress":"http://v.youku.com/player/getM3U8/vid//type/mp4/v.m3u8","shareaddress":"http://v.autohome.com.cn/v_4_90189.html","updatetime":"20160920111928","lastid":"201609201119292016092013023490189"},{"id":90178,"title":"MT驾驶者之车评选 迈凯伦570S圈速实录","type":"花边","time":"2016-09-20","indexdetail":"MT驾驶者之车评选 迈凯伦570S拉古娜塞卡圈速实录。","smallimg":"http://www3.autoimg.cn/newsdfs/g23/M06/30/27/120x90_0_autohomecar__wKjBwFfgpBeAJSL1AADyZh3igN4408.jpg","replycount":11,"playcount":4457,"nickname":"郭泽松","videoaddress":"http://v.youku.com/player/getM3U8/vid//type/mp4/v.m3u8","shareaddress":"http://v.autohome.com.cn/v_4_90178.html","updatetime":"20160920130741","lastid":"201609201307412016092013023490178"},{"id":90175,"title":"MT驾驶者之车评选 宝马M4 GTS圈速实录","type":"花边","time":"2016-09-20","indexdetail":"MT驾驶者之车评选 M4 GTS圈速实录，赛道为马自达拉古娜塞卡。","smallimg":"http://www3.autoimg.cn/newsdfs/g20/M06/2E/C1/120x90_0_autohomecar__wKjBw1fgovmAbz78AAE5ZFP3Qhk363.jpg","replycount":17,"playcount":3034,"nickname":"郭泽松","videoaddress":"http://v.youku.com/player/getM3U8/vid//type/mp4/v.m3u8","shareaddress":"http://v.autohome.com.cn/v_4_90175.html","updatetime":"20160920131132","lastid":"201609201311322016092013023490175"},{"id":90172,"title":"老车也酷炫！车友展示老款高尔夫GTI","type":"花边","time":"2016-09-20","indexdetail":"视频中车友带你展示一下聚会上的老款高尔夫GTI。","smallimg":"http://www3.autoimg.cn/newsdfs/g20/M05/2E/BE/120x90_0_autohomecar__wKjBw1fgoWmAWWLpAAF_e-LbttI734.jpg","replycount":1,"playcount":2203,"nickname":"郭泽松","videoaddress":"http://v.youku.com/player/getM3U8/vid//type/mp4/v.m3u8","shareaddress":"http://v.autohome.com.cn/v_4_90172.html","updatetime":"20160920103939","lastid":"201609201039392016092013023490172"},{"id":90173,"title":"行车记录趣 台媒试驾2016款捷豹F-PACE","type":"花边","time":"2016-09-20","indexdetail":"视频中台湾媒体试驾2016款捷豹F-PACE。","smallimg":"http://www2.autoimg.cn/newsdfs/g13/M0A/4F/37/120x90_0_autohomecar__wKjBylfgoeaAU2BBAADyQmxlV64118.jpg","replycount":1,"playcount":2431,"nickname":"郭泽松","videoaddress":"http://v.youku.com/player/getM3U8/vid//type/mp4/v.m3u8","shareaddress":"http://v.autohome.com.cn/v_4_90173.html","updatetime":"20160920104144","lastid":"201609201041452016092013023490173"},{"id":90144,"title":"这下被撞惨了！小轿车鬼探头拦腰被撞","type":"花边","time":"2016-09-20","indexdetail":"视频中展示了小轿车鬼探头拦腰被撞的画面。","smallimg":"http://www3.autoimg.cn/newsdfs/g5/M15/4D/3A/120x90_0_autohomecar__wKgHzFfglFOACyyQAAFEYVVMsyY752.jpg","replycount":11,"playcount":8283,"nickname":"郭泽松","videoaddress":"http://v.youku.com/player/getM3U8/vid//type/mp4/v.m3u8","shareaddress":"http://v.autohome.com.cn/v_4_90144.html","updatetime":"20160920094348","lastid":"201609200943492016092013023490144"}]}
     * returncode : 0
     * message :
     */

    private int returncode;
    private String message;

    public static ArticleMediaBean objectFromData(String str) {

        return new Gson().fromJson(str, ArticleMediaBean.class);
    }

    public static ArticleMediaBean objectFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);

            return new Gson().fromJson(jsonObject.getString(str), ArticleMediaBean.class);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static List<ArticleMediaBean> arrayArticleMediaBeanFromData(String str) {

        Type listType = new TypeToken<ArrayList<ArticleMediaBean>>() {
        }.getType();

        return new Gson().fromJson(str, listType);
    }

    public static List<ArticleMediaBean> arrayArticleMediaBeanFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);
            Type listType = new TypeToken<ArrayList<ArticleMediaBean>>() {
            }.getType();

            return new Gson().fromJson(jsonObject.getString(str), listType);

        } catch (JSONException e) {
            e.printStackTrace();
        }

        return new ArrayList();


    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
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

    public static class ResultBean {
        private boolean isloadmore;
        private int rowcount;
        private int pagecount;
        private int pageindex;
        /**
         * id : 90192
         * title : 《传承.呼啸》--斯巴鲁拉力车队纪录片
         * type : 花边
         * time : 2016-09-20
         * indexdetail : 《传承.呼啸》--斯巴鲁拉力车队纪录片
         * smallimg : http://www2.autoimg.cn/newsdfs/g17/M02/4B/1C/120x90_0_autohomecar__wKgH51fgwKSAdKz7AAG_ESeZpVo459.jpg
         * replycount : 7
         * playcount : 4515
         * nickname : 张超620
         * videoaddress : http://v.youku.com/player/getM3U8/vid//type/mp4/v.m3u8
         * shareaddress : http://v.autohome.com.cn/v_4_90192.html
         * updatetime : 20160920125248
         * lastid : 201609201252482016092017062390192
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

        public boolean isIsloadmore() {
            return isloadmore;
        }

        public void setIsloadmore(boolean isloadmore) {
            this.isloadmore = isloadmore;
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
            private int id;
            private String title;
            private String type;
            private String time;
            private String indexdetail;
            private String smallimg;
            private int replycount;
            private int playcount;
            private String nickname;
            private String videoaddress;
            private String shareaddress;
            private String updatetime;
            private String lastid;

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

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }

            public String getIndexdetail() {
                return indexdetail;
            }

            public void setIndexdetail(String indexdetail) {
                this.indexdetail = indexdetail;
            }

            public String getSmallimg() {
                return smallimg;
            }

            public void setSmallimg(String smallimg) {
                this.smallimg = smallimg;
            }

            public int getReplycount() {
                return replycount;
            }

            public void setReplycount(int replycount) {
                this.replycount = replycount;
            }

            public int getPlaycount() {
                return playcount;
            }

            public void setPlaycount(int playcount) {
                this.playcount = playcount;
            }

            public String getNickname() {
                return nickname;
            }

            public void setNickname(String nickname) {
                this.nickname = nickname;
            }

            public String getVideoaddress() {
                return videoaddress;
            }

            public void setVideoaddress(String videoaddress) {
                this.videoaddress = videoaddress;
            }

            public String getShareaddress() {
                return shareaddress;
            }

            public void setShareaddress(String shareaddress) {
                this.shareaddress = shareaddress;
            }

            public String getUpdatetime() {
                return updatetime;
            }

            public void setUpdatetime(String updatetime) {
                this.updatetime = updatetime;
            }

            public String getLastid() {
                return lastid;
            }

            public void setLastid(String lastid) {
                this.lastid = lastid;
            }
        }
    }
}
