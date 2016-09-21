package com.maqianyu.carhome.ui.Bean;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dllo on 16/9/21.
 * 推荐-说客-实体类
 */
public class ArticleLobbyistBean {


    /**
     * returncode : 0
     * message :
     * result : {"total":10400,"isloadmore":true,"list":[{"id":537114,"title":"雷克萨斯推出\u201c蜘蛛精\u201d概念座椅","time":"2016-09-21","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g22/M0C/32/79/160x120_0_autohomecar__wKgFW1fiNqmATUSnAAJk2oOwAWU269.jpg","replycount":0,"pagecount":1,"jumppage":1,"updatetime":"20160921153451","lastid":"20160921153600537114"},{"id":536939,"title":"美国人为何不怎么用\u201c燃油宝\u201d了？","time":"2016-09-21","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g19/M14/30/36/160x120_0_autohomecar__wKjBxFfhHp6AeQmQAAK5j-CT8X0358.jpg","replycount":155,"pagecount":1,"jumppage":1,"updatetime":"20160921141010","lastid":"20160921144000536939"},{"id":536478,"title":"共和国经典\u201c军车巡礼\u201d之一汽解放","time":"2016-09-21","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g6/M09/4B/ED/160x120_0_autohomecar__wKgH3FfeZUaAOu6aAAIJ7DEU_0M296.jpg","replycount":54,"pagecount":1,"jumppage":1,"updatetime":"20160918180305","lastid":"20160921140000536478"},{"id":536918,"title":"一句话点评8月份新能源","time":"2016-09-21","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g7/M09/50/EB/160x120_0_autohomecar__wKgH3VfhAuGAMAAWAAJdL_SFo4A847.jpg","replycount":323,"pagecount":1,"jumppage":1,"updatetime":"20160920173531","lastid":"20160921133000536918"},{"id":536900,"title":"差6000你买谁 宝骏310对吉利金刚CROSS","time":"2016-09-21","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g4/M01/51/44/160x120_0_autohomecar__wKgH2lfiGR2APFJNAARG1pZsc34194.jpg","replycount":162,"pagecount":1,"jumppage":1,"updatetime":"20160921132240","lastid":"20160921125500536900"},{"id":536980,"title":"沃尔沃靠这款车打败E级能做到么？","time":"2016-09-21","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g23/M10/32/35/160x120_0_autohomecar__wKgFXFfh5BKANYHrAALePHmJQlU632.jpg","replycount":920,"pagecount":1,"jumppage":1,"updatetime":"20160921093619","lastid":"20160921113500536980"},{"id":536285,"title":"中国藏家的银魂为什么能在圆石滩获奖","time":"2016-09-21","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g15/M0F/4F/F1/160x120_0_autohomecar__wKjByFfgqmuAS_IdAAJMM9U-Gxg283.jpg","replycount":55,"pagecount":1,"jumppage":1,"updatetime":"20160920111806","lastid":"20160921110500536285"},{"id":536811,"title":"胜利Octane 最便宜的公升级？","time":"2016-09-21","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g5/M15/4D/F2/160x120_0_autohomecar__wKjB0lfglo6Acl2CAArWTw6e8F0839.jpg","replycount":94,"pagecount":1,"jumppage":1,"updatetime":"20160920131405","lastid":"20160921104200536811"},{"id":536776,"title":"今年中国车市走势将超出业界预期？","time":"2016-09-21","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g15/M04/4D/64/160x120_0_autohomecar__wKgH5Vfg5_OAZPmJACqwXMOFGjc910.jpg","replycount":46,"pagecount":1,"jumppage":1,"updatetime":"20160920154037","lastid":"20160921100000536776"},{"id":536927,"title":"曾经流行但现在消失的汽车配置","time":"2016-09-21","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g5/M14/4E/BB/160x120_0_autohomecar__wKjB0lfhBCCAdsXcAAYE5ihygJM783.jpg","replycount":167,"pagecount":1,"jumppage":1,"updatetime":"20160921085256","lastid":"20160921095000536927"},{"id":536932,"title":"懒到家的个人交通工具 一百年前就有了","time":"2016-09-21","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g11/M02/50/69/160x120_0_autohomecar__wKgH4VfhxGqAQxYxAAKJMYEoyfM217.jpg","replycount":83,"pagecount":1,"jumppage":1,"updatetime":"20160921072115","lastid":"20160921091000536932"},{"id":536671,"title":"旅行车圈的一股清流丨Volvo V90系列","time":"2016-09-21","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g9/M12/48/9C/160x120_0_autohomecar__wKjBzlfglbiATWxgAAl3RZjvGyg670.jpg","replycount":220,"pagecount":1,"jumppage":1,"updatetime":"20160920095005","lastid":"20160921090000536671"},{"id":536688,"title":"2015年美国库存周期最长的15台车","time":"2016-09-21","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g10/M0F/4D/4C/160x120_0_autohomecar__wKjBzVffhaOAPa5IAAIK33V-91s540.jpg","replycount":303,"pagecount":1,"jumppage":1,"updatetime":"20160921151556","lastid":"20160921073000536688"},{"id":536801,"title":"独家：2016年8月一汽-大众新车销量解读","time":"2016-09-21","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g19/M0B/2F/38/160x120_0_autohomecar__wKjBxFfglDeAYCi6AAOCoBe65Tc856.jpg","replycount":467,"pagecount":1,"jumppage":1,"updatetime":"20160920094321","lastid":"20160921060500536801"},{"id":536696,"title":"四款红极一时的日系跑车，你认识几辆?","time":"2016-09-21","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g12/M09/4A/07/160x120_0_autohomecar__wKgH01ffijmAL1voAAJJe8acvtU870.jpg","replycount":258,"pagecount":1,"jumppage":1,"updatetime":"20160919150722","lastid":"20160921000100536696"},{"id":536874,"title":"测三万元的\"山游勤\"全能摩托 光阳赛艇","time":"2016-09-20","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g11/M06/4E/BA/160x120_0_autohomecar__wKjBzFfgzhmAGx3LAAj3XGnBM7c085.jpg","replycount":211,"pagecount":1,"jumppage":1,"updatetime":"20160920144447","lastid":"20160920220000536874"},{"id":534857,"title":"惊掉下巴的赛道神器 爆改宝马1系M啥样","time":"2016-09-20","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g13/M15/4F/B2/160x120_0_autohomecar__wKgH41fgofiAdzQmAAKiUFX_6n8984.jpg","replycount":80,"pagecount":1,"jumppage":1,"updatetime":"20160920152224","lastid":"20160920210000534857"},{"id":536877,"title":"化身越野神器 试驾依维柯Daily 4×4","time":"2016-09-20","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g9/M12/53/7E/160x120_0_autohomecar__wKgH31fg1fqAbOUZAALZxfu00Qc169.jpg","replycount":84,"pagecount":1,"jumppage":1,"updatetime":"20160920142434","lastid":"20160920200000536877"},{"id":527780,"title":"算一算！你到底该花多少钱买辆车？","time":"2016-09-20","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g10/M09/4F/43/160x120_0_autohomecar__wKjBzVfg8-SAJhUgAAOU3Q9HX2M567.png","replycount":974,"pagecount":1,"jumppage":1,"updatetime":"20160920163135","lastid":"20160920190000527780"},{"id":536680,"title":"揭秘汽车内饰异味的罪魁祸首","time":"2016-09-20","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g22/M0E/30/F9/160x120_0_autohomecar__wKgFW1fg7Y6ANAroAAG20OoeBYA599.jpg","replycount":430,"pagecount":1,"jumppage":1,"updatetime":"20160920160432","lastid":"20160920173500536680"},{"id":536761,"title":"CRC版重大改型秦赛车：基础技术篇(1)","time":"2016-09-20","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g5/M12/4E/85/160x120_0_autohomecar__wKjB0lfg53aAamrxAAHJD_cwXV4837.jpg","replycount":89,"pagecount":1,"jumppage":1,"updatetime":"20160920153832","lastid":"20160920170000536761"},{"id":536824,"title":"个性值多少钱？15万的小车太会装？","time":"2016-09-20","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g14/M13/4B/9F/160x120_0_autohomecar__wKgH1VfgnISAZ0dPAAipKv_LddI316.jpg","replycount":522,"pagecount":1,"jumppage":1,"updatetime":"20160920145300","lastid":"20160920160000536824"},{"id":536536,"title":"巴黎车展依然很\"6\" 一堆靓货即将登台！","time":"2016-09-20","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g14/M11/4B/C1/160x120_0_autohomecar__wKjByVffRa6AAC7GAAKZeSNCR7U162.jpg","replycount":230,"pagecount":1,"jumppage":1,"updatetime":"20160920104641","lastid":"20160920150000536536"},{"id":534665,"title":"看雷克萨斯ES300h车主 如何谈这款车","time":"2016-09-20","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g10/M0D/4E/E9/160x120_0_autohomecar__wKjBzVfgyOmAWtmpAAL1i4uD6DA691.jpg","replycount":573,"pagecount":1,"jumppage":1,"updatetime":"20160920224415","lastid":"20160920143000534665"},{"id":536501,"title":"你的头盔安全吗？摩托车头盔标准知识","time":"2016-09-20","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g15/M0E/4C/D8/160x120_0_autohomecar__wKjByFfeQvyAUWiXAAEoP3tbUAE606.jpg","replycount":113,"pagecount":1,"jumppage":1,"updatetime":"20160919144727","lastid":"20160920140000536501"},{"id":536840,"title":"一句话点评8月份小型车","time":"2016-09-20","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g17/M0A/4A/F7/160x120_0_autohomecar__wKgH51fgrIaAL6r7AANYEFrVYEI085.jpg","replycount":372,"pagecount":1,"jumppage":1,"updatetime":"20160920112948","lastid":"20160920133000536840"},{"id":536826,"title":"年轻车迷圆梦，几千元也买到经典旅行车","time":"2016-09-20","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g14/M0F/4F/0F/160x120_0_autohomecar__wKgH5FfgociAWWIfAAKd32Xd9yU527.jpg","replycount":77,"pagecount":1,"jumppage":1,"updatetime":"20160920104114","lastid":"20160920130000536826"},{"id":535338,"title":"为什么帕杰罗败给了普拉多？","time":"2016-09-20","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g23/M03/30/A2/160x120_0_autohomecar__wKgFXFfgm0OAP7dnABkZMhFro0w507.jpg","replycount":813,"pagecount":1,"jumppage":1,"updatetime":"20160920101327","lastid":"20160920123000535338"},{"id":536021,"title":"站在车商角度，什么样的二手车能卖高价","time":"2016-09-20","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g10/M06/40/26/160x120_0_autohomecar__wKjBzVfYwo2AU_soAAMbY4zf0Is302.jpg","replycount":91,"pagecount":1,"jumppage":1,"updatetime":"20160914182341","lastid":"20160920120000536021"},{"id":535970,"title":"7座车的第三排座椅安全吗？","time":"2016-09-20","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g19/M02/2D/9C/160x120_0_autohomecar__wKgFU1fgqO-ASEoRAAK_jRV7yVE984.jpg","replycount":382,"pagecount":1,"jumppage":1,"updatetime":"20160920111207","lastid":"20160920113500535970"}]}
     */

    private int returncode;
    private String message;
    /**
     * total : 10400
     * isloadmore : true
     * list : [{"id":537114,"title":"雷克萨斯推出\u201c蜘蛛精\u201d概念座椅","time":"2016-09-21","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g22/M0C/32/79/160x120_0_autohomecar__wKgFW1fiNqmATUSnAAJk2oOwAWU269.jpg","replycount":0,"pagecount":1,"jumppage":1,"updatetime":"20160921153451","lastid":"20160921153600537114"},{"id":536939,"title":"美国人为何不怎么用\u201c燃油宝\u201d了？","time":"2016-09-21","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g19/M14/30/36/160x120_0_autohomecar__wKjBxFfhHp6AeQmQAAK5j-CT8X0358.jpg","replycount":155,"pagecount":1,"jumppage":1,"updatetime":"20160921141010","lastid":"20160921144000536939"},{"id":536478,"title":"共和国经典\u201c军车巡礼\u201d之一汽解放","time":"2016-09-21","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g6/M09/4B/ED/160x120_0_autohomecar__wKgH3FfeZUaAOu6aAAIJ7DEU_0M296.jpg","replycount":54,"pagecount":1,"jumppage":1,"updatetime":"20160918180305","lastid":"20160921140000536478"},{"id":536918,"title":"一句话点评8月份新能源","time":"2016-09-21","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g7/M09/50/EB/160x120_0_autohomecar__wKgH3VfhAuGAMAAWAAJdL_SFo4A847.jpg","replycount":323,"pagecount":1,"jumppage":1,"updatetime":"20160920173531","lastid":"20160921133000536918"},{"id":536900,"title":"差6000你买谁 宝骏310对吉利金刚CROSS","time":"2016-09-21","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g4/M01/51/44/160x120_0_autohomecar__wKgH2lfiGR2APFJNAARG1pZsc34194.jpg","replycount":162,"pagecount":1,"jumppage":1,"updatetime":"20160921132240","lastid":"20160921125500536900"},{"id":536980,"title":"沃尔沃靠这款车打败E级能做到么？","time":"2016-09-21","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g23/M10/32/35/160x120_0_autohomecar__wKgFXFfh5BKANYHrAALePHmJQlU632.jpg","replycount":920,"pagecount":1,"jumppage":1,"updatetime":"20160921093619","lastid":"20160921113500536980"},{"id":536285,"title":"中国藏家的银魂为什么能在圆石滩获奖","time":"2016-09-21","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g15/M0F/4F/F1/160x120_0_autohomecar__wKjByFfgqmuAS_IdAAJMM9U-Gxg283.jpg","replycount":55,"pagecount":1,"jumppage":1,"updatetime":"20160920111806","lastid":"20160921110500536285"},{"id":536811,"title":"胜利Octane 最便宜的公升级？","time":"2016-09-21","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g5/M15/4D/F2/160x120_0_autohomecar__wKjB0lfglo6Acl2CAArWTw6e8F0839.jpg","replycount":94,"pagecount":1,"jumppage":1,"updatetime":"20160920131405","lastid":"20160921104200536811"},{"id":536776,"title":"今年中国车市走势将超出业界预期？","time":"2016-09-21","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g15/M04/4D/64/160x120_0_autohomecar__wKgH5Vfg5_OAZPmJACqwXMOFGjc910.jpg","replycount":46,"pagecount":1,"jumppage":1,"updatetime":"20160920154037","lastid":"20160921100000536776"},{"id":536927,"title":"曾经流行但现在消失的汽车配置","time":"2016-09-21","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g5/M14/4E/BB/160x120_0_autohomecar__wKjB0lfhBCCAdsXcAAYE5ihygJM783.jpg","replycount":167,"pagecount":1,"jumppage":1,"updatetime":"20160921085256","lastid":"20160921095000536927"},{"id":536932,"title":"懒到家的个人交通工具 一百年前就有了","time":"2016-09-21","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g11/M02/50/69/160x120_0_autohomecar__wKgH4VfhxGqAQxYxAAKJMYEoyfM217.jpg","replycount":83,"pagecount":1,"jumppage":1,"updatetime":"20160921072115","lastid":"20160921091000536932"},{"id":536671,"title":"旅行车圈的一股清流丨Volvo V90系列","time":"2016-09-21","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g9/M12/48/9C/160x120_0_autohomecar__wKjBzlfglbiATWxgAAl3RZjvGyg670.jpg","replycount":220,"pagecount":1,"jumppage":1,"updatetime":"20160920095005","lastid":"20160921090000536671"},{"id":536688,"title":"2015年美国库存周期最长的15台车","time":"2016-09-21","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g10/M0F/4D/4C/160x120_0_autohomecar__wKjBzVffhaOAPa5IAAIK33V-91s540.jpg","replycount":303,"pagecount":1,"jumppage":1,"updatetime":"20160921151556","lastid":"20160921073000536688"},{"id":536801,"title":"独家：2016年8月一汽-大众新车销量解读","time":"2016-09-21","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g19/M0B/2F/38/160x120_0_autohomecar__wKjBxFfglDeAYCi6AAOCoBe65Tc856.jpg","replycount":467,"pagecount":1,"jumppage":1,"updatetime":"20160920094321","lastid":"20160921060500536801"},{"id":536696,"title":"四款红极一时的日系跑车，你认识几辆?","time":"2016-09-21","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g12/M09/4A/07/160x120_0_autohomecar__wKgH01ffijmAL1voAAJJe8acvtU870.jpg","replycount":258,"pagecount":1,"jumppage":1,"updatetime":"20160919150722","lastid":"20160921000100536696"},{"id":536874,"title":"测三万元的\"山游勤\"全能摩托 光阳赛艇","time":"2016-09-20","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g11/M06/4E/BA/160x120_0_autohomecar__wKjBzFfgzhmAGx3LAAj3XGnBM7c085.jpg","replycount":211,"pagecount":1,"jumppage":1,"updatetime":"20160920144447","lastid":"20160920220000536874"},{"id":534857,"title":"惊掉下巴的赛道神器 爆改宝马1系M啥样","time":"2016-09-20","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g13/M15/4F/B2/160x120_0_autohomecar__wKgH41fgofiAdzQmAAKiUFX_6n8984.jpg","replycount":80,"pagecount":1,"jumppage":1,"updatetime":"20160920152224","lastid":"20160920210000534857"},{"id":536877,"title":"化身越野神器 试驾依维柯Daily 4×4","time":"2016-09-20","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g9/M12/53/7E/160x120_0_autohomecar__wKgH31fg1fqAbOUZAALZxfu00Qc169.jpg","replycount":84,"pagecount":1,"jumppage":1,"updatetime":"20160920142434","lastid":"20160920200000536877"},{"id":527780,"title":"算一算！你到底该花多少钱买辆车？","time":"2016-09-20","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g10/M09/4F/43/160x120_0_autohomecar__wKjBzVfg8-SAJhUgAAOU3Q9HX2M567.png","replycount":974,"pagecount":1,"jumppage":1,"updatetime":"20160920163135","lastid":"20160920190000527780"},{"id":536680,"title":"揭秘汽车内饰异味的罪魁祸首","time":"2016-09-20","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g22/M0E/30/F9/160x120_0_autohomecar__wKgFW1fg7Y6ANAroAAG20OoeBYA599.jpg","replycount":430,"pagecount":1,"jumppage":1,"updatetime":"20160920160432","lastid":"20160920173500536680"},{"id":536761,"title":"CRC版重大改型秦赛车：基础技术篇(1)","time":"2016-09-20","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g5/M12/4E/85/160x120_0_autohomecar__wKjB0lfg53aAamrxAAHJD_cwXV4837.jpg","replycount":89,"pagecount":1,"jumppage":1,"updatetime":"20160920153832","lastid":"20160920170000536761"},{"id":536824,"title":"个性值多少钱？15万的小车太会装？","time":"2016-09-20","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g14/M13/4B/9F/160x120_0_autohomecar__wKgH1VfgnISAZ0dPAAipKv_LddI316.jpg","replycount":522,"pagecount":1,"jumppage":1,"updatetime":"20160920145300","lastid":"20160920160000536824"},{"id":536536,"title":"巴黎车展依然很\"6\" 一堆靓货即将登台！","time":"2016-09-20","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g14/M11/4B/C1/160x120_0_autohomecar__wKjByVffRa6AAC7GAAKZeSNCR7U162.jpg","replycount":230,"pagecount":1,"jumppage":1,"updatetime":"20160920104641","lastid":"20160920150000536536"},{"id":534665,"title":"看雷克萨斯ES300h车主 如何谈这款车","time":"2016-09-20","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g10/M0D/4E/E9/160x120_0_autohomecar__wKjBzVfgyOmAWtmpAAL1i4uD6DA691.jpg","replycount":573,"pagecount":1,"jumppage":1,"updatetime":"20160920224415","lastid":"20160920143000534665"},{"id":536501,"title":"你的头盔安全吗？摩托车头盔标准知识","time":"2016-09-20","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g15/M0E/4C/D8/160x120_0_autohomecar__wKjByFfeQvyAUWiXAAEoP3tbUAE606.jpg","replycount":113,"pagecount":1,"jumppage":1,"updatetime":"20160919144727","lastid":"20160920140000536501"},{"id":536840,"title":"一句话点评8月份小型车","time":"2016-09-20","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g17/M0A/4A/F7/160x120_0_autohomecar__wKgH51fgrIaAL6r7AANYEFrVYEI085.jpg","replycount":372,"pagecount":1,"jumppage":1,"updatetime":"20160920112948","lastid":"20160920133000536840"},{"id":536826,"title":"年轻车迷圆梦，几千元也买到经典旅行车","time":"2016-09-20","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g14/M0F/4F/0F/160x120_0_autohomecar__wKgH5FfgociAWWIfAAKd32Xd9yU527.jpg","replycount":77,"pagecount":1,"jumppage":1,"updatetime":"20160920104114","lastid":"20160920130000536826"},{"id":535338,"title":"为什么帕杰罗败给了普拉多？","time":"2016-09-20","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g23/M03/30/A2/160x120_0_autohomecar__wKgFXFfgm0OAP7dnABkZMhFro0w507.jpg","replycount":813,"pagecount":1,"jumppage":1,"updatetime":"20160920101327","lastid":"20160920123000535338"},{"id":536021,"title":"站在车商角度，什么样的二手车能卖高价","time":"2016-09-20","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g10/M06/40/26/160x120_0_autohomecar__wKjBzVfYwo2AU_soAAMbY4zf0Is302.jpg","replycount":91,"pagecount":1,"jumppage":1,"updatetime":"20160914182341","lastid":"20160920120000536021"},{"id":535970,"title":"7座车的第三排座椅安全吗？","time":"2016-09-20","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g19/M02/2D/9C/160x120_0_autohomecar__wKgFU1fgqO-ASEoRAAK_jRV7yVE984.jpg","replycount":382,"pagecount":1,"jumppage":1,"updatetime":"20160920111207","lastid":"20160920113500535970"}]
     */

    private ResultBean result;

    public static ArticleLobbyistBean objectFromData(String str) {

        return new Gson().fromJson(str, ArticleLobbyistBean.class);
    }

    public static ArticleLobbyistBean objectFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);

            return new Gson().fromJson(jsonObject.getString(str), ArticleLobbyistBean.class);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static List<ArticleLobbyistBean> arrayArticleLobbyistBeanFromData(String str) {

        Type listType = new TypeToken<ArrayList<ArticleLobbyistBean>>() {
        }.getType();

        return new Gson().fromJson(str, listType);
    }

    public static List<ArticleLobbyistBean> arrayArticleLobbyistBeanFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);
            Type listType = new TypeToken<ArrayList<ArticleLobbyistBean>>() {
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
        private int total;
        private boolean isloadmore;
        /**
         * id : 537114
         * title : 雷克萨斯推出“蜘蛛精”概念座椅
         * time : 2016-09-21
         * type :
         * smallpic : http://www3.autoimg.cn/newsdfs/g22/M0C/32/79/160x120_0_autohomecar__wKgFW1fiNqmATUSnAAJk2oOwAWU269.jpg
         * replycount : 0
         * pagecount : 1
         * jumppage : 1
         * updatetime : 20160921153451
         * lastid : 20160921153600537114
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

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public boolean isIsloadmore() {
            return isloadmore;
        }

        public void setIsloadmore(boolean isloadmore) {
            this.isloadmore = isloadmore;
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
            private String time;
            private String type;
            private String smallpic;
            private int replycount;
            private int pagecount;
            private int jumppage;
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

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getSmallpic() {
                return smallpic;
            }

            public void setSmallpic(String smallpic) {
                this.smallpic = smallpic;
            }

            public int getReplycount() {
                return replycount;
            }

            public void setReplycount(int replycount) {
                this.replycount = replycount;
            }

            public int getPagecount() {
                return pagecount;
            }

            public void setPagecount(int pagecount) {
                this.pagecount = pagecount;
            }

            public int getJumppage() {
                return jumppage;
            }

            public void setJumppage(int jumppage) {
                this.jumppage = jumppage;
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
