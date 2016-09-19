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
public class SaleLikeBean {

    /**
     * modulelist : [{"title":"猜你喜欢","list":[{"id":154649,"productid":60002026,"title":"陆风X8","shorttitle":"1元抵扣百元试驾礼包","logo":"http://car0.autoimg.cn/upload/2014/11/3/tp_20141103200910737-111.jpg","price":"1元","fctprice":"100元","adinfo":"1元抵扣百元试驾礼包","murl":"http://mall.m.autohome.com.cn/item/app/item-60002026-0.html#pvareaid=2018163","functionid":0,"type":1,"pvid":"y4m25HhPLWppOmcPHr3NPPWAi7hupRPP","isoperation":0},{"id":158795,"productid":60002203,"title":"广汽本田雅阁","shorttitle":"平安汽融0息购车专场，成功办理汽车分期后10个工作日内获赠百元万里通积分","logo":"http://car2.autoimg.cn/cardfs/product/g23/M10/00/0A/tp_autohomecar__wKgFXFbyAMOAVaayAAE4K6YNqcY641.jpg","price":"1元","fctprice":"100元","adinfo":"平安汽融0息购车专场，成功办理汽车分期后10个工作日内获赠百元万里通积分","murl":"http://mall.m.autohome.com.cn/item/app/item-60002203-0.html#pvareaid=2018163","functionid":0,"type":1,"pvid":"y4m25HhPLWppOmcPHr3NPPWAi7hupRPP","isoperation":0},{"id":154595,"productid":60002022,"title":"悦翔V3（兵财车贷购车）","shorttitle":"线上支付99元，到店购车可获400元联通电话费","logo":"http://car0.autoimg.cn/upload/2014/10/10/tp_2014101010104526526410.jpg","price":"99元","fctprice":"400元","adinfo":"线上支付99元，到店购车可获400元联通电话费","murl":"http://mall.m.autohome.com.cn/item/app/item-60002022-0.html#pvareaid=2018163","functionid":0,"type":1,"pvid":"y4m25HhPLWppOmcPHr3NPPWAi7hupRPP","isoperation":0},{"id":152920,"productid":60001947,"title":"上汽大众斯柯达-全新晶锐","shorttitle":"【订金】全新晶锐 送500元斯柯达车友汇积分 购置税减半","logo":"http://car0.autoimg.cn/car/upload/2015/4/22/tp_20150422142200670264110.jpg","price":"99元","fctprice":"500元","adinfo":"【订金】全新晶锐 送500元斯柯达车友汇积分 购置税减半","murl":"http://mall.m.autohome.com.cn/item/app/item-60001947-0.html#pvareaid=2018163","functionid":0,"type":1,"pvid":"y4m25HhPLWppOmcPHr3NPPWAi7hupRPP","isoperation":0}],"spread":{"bannerimg":"","detailurl":"","spreadid":0}},{"title":"为我推荐","list":[{"id":107839,"productid":0,"title":"本田 本田CR-V 2016款 2.0L 两驱都市版","shorttitle":"本田CR-V 2016款 2.0L 两驱都市版","logo":"http://car0.autoimg.cn/car/upload/2015/6/9/tp_20150609094931681-1112.jpg","price":"17.48万","fctprice":"18.98万","adinfo":"尊享低利率","murl":"http://m.mall.autohome.com.cn/detail/107839-210200-0.html?isapp=1#pvareaid=2018163","functionid":0,"type":0,"pvid":"y4m25HhPLWppOmcPHr3NPPWAi7hupRPP","isoperation":0},{"id":73408,"productid":0,"title":"长安 奔奔MINI 2012款 1.0L 手动亲情版 国IV","shorttitle":"奔奔MINI 2012款 1.0L 手动亲情版 国IV","logo":"http://car0.autoimg.cn/upload/2014/10/22/tp_20141022135134273-110.jpg","price":"3.25万","fctprice":"3.69万","adinfo":"0首付，资料简单，门槛低","murl":"http://m.mall.autohome.com.cn/detail/73408-210200-0.html?isapp=1#pvareaid=2018163","functionid":0,"type":0,"pvid":"y4m25HhPLWppOmcPHr3NPPWAi7hupRPP","isoperation":0},{"id":111366,"productid":0,"title":"斯柯达 明锐 2017款 1.6L 手动智行版","shorttitle":"明锐 2017款 1.6L 手动智行版","logo":"http://car3.autoimg.cn/cardfs/product/g13/M0E/CF/3F/tp_autohomecar__wKjBylY5eY-Afo7TAAE5ZNIIzks790.jpg","price":"12.79万","fctprice":"13.99万","adinfo":"尊享12/18/24期0利率","murl":"http://m.mall.autohome.com.cn/detail/111366-210200-0.html?isapp=1#pvareaid=2018163","functionid":0,"type":0,"pvid":"y4m25HhPLWppOmcPHr3NPPWAi7hupRPP","isoperation":0},{"id":74428,"productid":0,"title":"本田 思铂睿 2015款 2.0L 豪华版","shorttitle":"思铂睿 2015款 2.0L 豪华版","logo":"http://car0.autoimg.cn/car/upload/2015/6/9/tp_20150609095041258-1112.jpg","price":"13.96万","fctprice":"17.98万","adinfo":"尊享低利率","murl":"http://m.mall.autohome.com.cn/detail/74428-210200-0.html?isapp=1#pvareaid=2018163","functionid":0,"type":0,"pvid":"y4m25HhPLWppOmcPHr3NPPWAi7hupRPP","isoperation":0}],"spread":{"bannerimg":"","detailurl":"","spreadid":0}}]
     * goodslist : {"list":[{"id":150217,"productid":0,"title":"别克 英朗 2016款 15N 自动进取型","shorttitle":"英朗 2016款 15N 自动进取型","logo":"http://car3.autoimg.cn/cardfs/product/g20/M0D/33/13/tp_autohomecar__wKjBw1cLBeaADczeAAFCN49Asow450.jpg","price":"11.99万","fctprice":"11.99万","adinfo":"花生好车 0首付，月供2561元起 线上支付99元订金 线下完成交易 实际车款以城市店系统金额为准","murl":"http://m.mall.autohome.com.cn/detail/150217-210200-0.html?isapp=1#pvareaid=2018162","carlable":"特价","state":"现货充足","brandid":38,"seriesid":982,"specid":25862,"seriesname":"英朗","count":0,"type":0,"ishistory":false,"pvid":"y4m25HhPLWppOmcPHr3NPPWAi7hupRPP","isoperation":0},{"id":137460,"productid":0,"title":"北汽绅宝 绅宝D70 2013款 2.3T 精英版","shorttitle":"绅宝D70 2013款 2.3T 精英版","logo":"http://car0.autoimg.cn/upload/2014/11/3/tp_20141103183557129-110.jpg","price":"11.20万","fctprice":"19.58万","adinfo":"全新商品库存车二手车价格销售 只能全款购车 裸车销售","murl":"http://m.mall.autohome.com.cn/detail/137460-210200-0.html?isapp=1#pvareaid=2018162","carlable":"人气","state":"现货充足","brandid":173,"seriesid":2787,"specid":15903,"seriesname":"绅宝D70","count":0,"type":0,"ishistory":false,"pvid":"y4m25HhPLWppOmcPHr3NPPWAi7hupRPP","isoperation":0},{"id":140397,"productid":0,"title":"宝沃 宝沃BX7 2016款 28T 四驱豪华版","shorttitle":"宝沃BX7 2016款 28T 四驱豪华版","logo":"http://car2.autoimg.cn/cardfs/product/g20/M03/45/99/tp_autohomecar__wKjBw1cdr7mAZp6cAAGO9jsifVQ340.jpg","price":"21.68万","fctprice":"21.68万","adinfo":"【德国品质】源自1919，BX7德国宽体智联SUV。店铺一口价与抵扣券活动可同时参与。","murl":"http://m.mall.autohome.com.cn/detail/140397-210200-0.html?isapp=1#pvareaid=2018162","carlable":"","state":"现货充足","brandid":231,"seriesid":3913,"specid":25676,"seriesname":"宝沃BX7","count":0,"type":0,"ishistory":false,"pvid":"y4m25HhPLWppOmcPHr3NPPWAi7hupRPP","isoperation":0},{"id":33829,"productid":0,"title":"马自达 马自达CX-7 2014款 2.5L 2WD 豪华版","shorttitle":"马自达CX-7 2014款 2.5L 2WD 豪华版","logo":"http://car0.autoimg.cn/upload/2014/10/24/tp_20141024170814473-110.jpg","price":"17.98万","fctprice":"22.98万","adinfo":"直降5万元，分期1年免息，赠交强险！#订金金额：2000元#","murl":"http://m.mall.autohome.com.cn/detail/33829-210200-0.html?isapp=1#pvareaid=2018162","carlable":"热卖","state":"现货充足","brandid":58,"seriesid":3066,"specid":19529,"seriesname":"马自达CX-7","count":0,"type":0,"ishistory":false,"pvid":"y4m25HhPLWppOmcPHr3NPPWAi7hupRPP","isoperation":0},{"id":126637,"productid":0,"title":"现代 途胜 2013款 2.0L 手动两驱时尚型","shorttitle":"途胜 2013款 2.0L 手动两驱时尚型","logo":"http://car0.autoimg.cn/upload/2014/11/3/tp_20141103202208533-110.jpg","price":"10.50万","fctprice":"16.98万","adinfo":"开业大酬宾，多重好礼送不停","murl":"http://m.mall.autohome.com.cn/detail/126637-210200-0.html?isapp=1#pvareaid=2018162","carlable":"爆款","state":"现货充足","brandid":12,"seriesid":358,"specid":15163,"seriesname":"途胜","count":0,"type":0,"ishistory":false,"pvid":"y4m25HhPLWppOmcPHr3NPPWAi7hupRPP","isoperation":0},{"id":138683,"productid":0,"title":"标致 标致4008(进口) 2013款 2.0L 两驱时尚型","shorttitle":"标致4008(进口) 2013款 2.0L 两驱时尚型","logo":"http://car0.autoimg.cn/upload/2014/11/6/tp_20141106142726389-110.jpg","price":"15.78万","fctprice":"21.98万","adinfo":"进口4008 优惠6.4万 可分期购车（0首付） 新车有限，售完为止！ 有现车","murl":"http://m.mall.autohome.com.cn/detail/138683-210200-0.html?isapp=1#pvareaid=2018162","carlable":"热卖","state":"现货充足","brandid":13,"seriesid":2472,"specid":15934,"seriesname":"标致4008(进口)","count":0,"type":0,"ishistory":false,"pvid":"y4m25HhPLWppOmcPHr3NPPWAi7hupRPP","isoperation":0},{"id":136778,"productid":0,"title":"铃木 吉姆尼(进口) 2015款 1.3L 自动挡 中东版","shorttitle":"吉姆尼(进口) 2015款 1.3L 自动挡 中东版","logo":"http://car2.autoimg.cn/cardfs/product/g12/M06/C1/02/tp_autohomecar__wKgH4lYt33OATUjVAAG7fik8y0U459.jpg","price":"12.99万","fctprice":"14.88万","adinfo":"最便宜的平行进口车，最强越野小钢炮。仅售12.99万，颜色不多预购从速！","murl":"http://m.mall.autohome.com.cn/detail/136778-210200-0.html?isapp=1#pvareaid=2018162","carlable":"","state":"现货充足","brandid":53,"seriesid":508,"specid":11000076,"seriesname":"吉姆尼(进口)","count":0,"type":0,"ishistory":false,"pvid":"y4m25HhPLWppOmcPHr3NPPWAi7hupRPP","isoperation":0},{"id":132068,"productid":0,"title":"丰田 兰德酷路泽(进口) 2016款 汽油4.0L 丰田兰德酷路泽 中东版","shorttitle":"兰德酷路泽(进口) 2016款 汽油4.0L 丰田兰德酷路泽 中东版","logo":"http://car2.autoimg.cn/cardfs/product/g8/M09/CC/7B/tp_autohomecar__wKjBz1eMQYiAMBcEAAHQQC29VD0031.jpg","price":"67.98万","fctprice":"85.80万","adinfo":"2016款中东版兰德酷路泽4000底挂标配 全新兰德酷路泽 耀目驾临 行走天地万物之道 创想自由新境界 前十名定车客户赠送：行车记录仪、车载吸尘器、车载充气泵。","murl":"http://m.mall.autohome.com.cn/detail/132068-210200-0.html?isapp=1#pvareaid=2018162","carlable":"","state":"现货充足","brandid":3,"seriesid":550,"specid":11000222,"seriesname":"兰德酷路泽(进口)","count":0,"type":0,"ishistory":false,"pvid":"y4m25HhPLWppOmcPHr3NPPWAi7hupRPP","isoperation":0},{"id":129824,"productid":0,"title":"标致 标致301 2016款 1.6L 自动舒适版","shorttitle":"标致301 2016款 1.6L 自动舒适版","logo":"http://car3.autoimg.cn/cardfs/product/g16/M00/39/4C/tp_autohomecar__wKgH5laTPMqABM4cAAFqfB--VHY926.jpg","price":"9.77万","fctprice":"9.77万","adinfo":"东风标致301 款待生活 质感晋级 门店议价立即预订！ 具体车型颜色和配置以当地门店现车为准，线上订金抵扣车款，门店议价，详情咨询就近门店。","murl":"http://m.mall.autohome.com.cn/detail/129824-210200-0.html?isapp=1#pvareaid=2018162","carlable":"","state":"现货充足","brandid":13,"seriesid":3068,"specid":24944,"seriesname":"标致301","count":0,"type":0,"ishistory":false,"pvid":"y4m25HhPLWppOmcPHr3NPPWAi7hupRPP","isoperation":0},{"id":89561,"productid":0,"title":"吉利汽车 金刚 2016款 1.5L 自动尊贵型 国V","shorttitle":"金刚 2016款 1.5L 自动尊贵型 国V","logo":"http://car2.autoimg.cn/cardfs/product/g21/M10/DD/D9/tp_autohomecar__wKgFVVbo9laAUETzAAFmtKalInM888.jpg","price":"6.09万","fctprice":"6.59万","adinfo":"9月19日开启疯抢，一口价6.09万元！仅限10台！（无赠品）#订金1000元#","murl":"http://m.mall.autohome.com.cn/detail/89561-210200-0.html?isapp=1#pvareaid=2018162","carlable":"","state":"现货充足","brandid":25,"seriesid":447,"specid":24816,"seriesname":"金刚","count":0,"type":0,"ishistory":false,"pvid":"y4m25HhPLWppOmcPHr3NPPWAi7hupRPP","isoperation":0},{"id":133904,"productid":0,"title":"捷豹 捷豹XF 2016款 XF 2.0T 两驱风华版","shorttitle":"捷豹XF 2016款 XF 2.0T 两驱风华版","logo":"http://car2.autoimg.cn/cardfs/product/g8/M10/09/D5/tp_autohomecar__wKjBz1Zw0WSATBCAAAGPG5LKaSw958.jpg","price":"40.80万","fctprice":"51.80万","adinfo":"捷豹路虎车型： 可销售全国各地 无区域限制 可享受全国联保 颜色齐全 现车充足 汽车之家车商城来订购...","murl":"http://m.mall.autohome.com.cn/detail/133904-210200-0.html?isapp=1#pvareaid=2018162","carlable":"人气","state":"现货充足","brandid":44,"seriesid":589,"specid":23831,"seriesname":"捷豹XF","count":0,"type":0,"ishistory":false,"pvid":"y4m25HhPLWppOmcPHr3NPPWAi7hupRPP","isoperation":0},{"id":142056,"productid":0,"title":"陆风 陆风X7 2015款 2.0T 全景尊享版","shorttitle":"陆风X7 2015款 2.0T 全景尊享版","logo":"http://car3.autoimg.cn/cardfs/product/g16/M06/B2/A0/tp_autohomecar__wKjBx1dtBdGAcbnXAAFjlcr0Fr8070.jpg","price":"12.98万","fctprice":"12.98万","adinfo":"陆风X7周年庆8月限时大促，陆风X7全车型购置税减半，加送500元油卡，分期还可享受1年免息，首付仅需2.98万起！","murl":"http://m.mall.autohome.com.cn/detail/142056-210200-0.html?isapp=1#pvareaid=2018162","carlable":"","state":"现货充足","brandid":88,"seriesid":3413,"specid":21007,"seriesname":"陆风X7","count":0,"type":0,"ishistory":false,"pvid":"y4m25HhPLWppOmcPHr3NPPWAi7hupRPP","isoperation":0},{"id":129812,"productid":0,"title":"玛莎拉蒂 Ghibli Ghibli 2016款 3.0T S Q4 ","shorttitle":"Ghibli Ghibli 2016款 3.0T S Q4","logo":"http://car2.autoimg.cn/cardfs/product/g9/M02/B4/F4/tp_autohomecar__wKjBzld2KqiAW2tnAAE8AFytfIY787.jpg","price":"91.00万","fctprice":"139.80万","adinfo":"【高性能豪华4门轿跑】美规 玛莎拉蒂 Ghibli 3.0T 四驱 高功率 汽油版，车商城现车直售！实力卖家良心价格！欢迎来梅山体验中心考察，成功购车的用户，当日您的住行花销我们统统包！","murl":"http://m.mall.autohome.com.cn/detail/129812-210200-0.html?isapp=1#pvareaid=2018162","carlable":"","state":"库存紧张","brandid":57,"seriesid":3060,"specid":11000223,"seriesname":"Ghibli","count":0,"type":0,"ishistory":false,"pvid":"y4m25HhPLWppOmcPHr3NPPWAi7hupRPP","isoperation":0},{"id":130394,"productid":0,"title":"奔驰 奔驰S级 2014款 S 320 L 商务型","shorttitle":"奔驰S级 2014款 S 320 L 商务型","logo":"http://car0.autoimg.cn/upload/2014/11/3/tp_20141103185026735-111.jpg","price":"78.80万","fctprice":"93.80万","adinfo":"2016款奔驰S320商务型（2014款奔驰S320+香氛系统）展厅6台现车，现车直降15万！","murl":"http://m.mall.autohome.com.cn/detail/130394-210200-0.html?isapp=1#pvareaid=2018162","carlable":"新品","state":"现货充足","brandid":36,"seriesid":59,"specid":19246,"seriesname":"奔驰S级","count":0,"type":0,"ishistory":false,"pvid":"y4m25HhPLWppOmcPHr3NPPWAi7hupRPP","isoperation":0},{"id":127602,"productid":0,"title":"Jeep 指南者 2014款 改款 2.4L 四驱舒适版","shorttitle":"指南者 2014款 改款 2.4L 四驱舒适版","logo":"http://car0.autoimg.cn/upload/2014/10/22/tp_20141022134702412-110.jpg","price":"17.70万","fctprice":"24.59万","adinfo":"8.12港口粉尘落灰车 空滤已更换 正常质保一年两万公里 专业级豪华--SUV 全国上牌 只提供裸车 无保险及贷款分期业务 若在当地提车 需加收一定的物流运输费用！","murl":"http://m.mall.autohome.com.cn/detail/127602-210200-0.html?isapp=1#pvareaid=2018162","carlable":"","state":"现货充足","brandid":46,"seriesid":504,"specid":18199,"seriesname":"指南者","count":0,"type":0,"ishistory":false,"pvid":"y4m25HhPLWppOmcPHr3NPPWAi7hupRPP","isoperation":0},{"id":158204,"productid":0,"title":"马自达 马自达CX-5 2015款 2.0L 自动两驱都市型","shorttitle":"马自达CX-5 2015款 2.0L 自动两驱都市型","logo":"http://car0.autoimg.cn/upload/2014/10/22/tp_20141022135315810-110.jpg","price":"16.78万","fctprice":"19.08万","adinfo":"新店开业，现金直降2.3万元，还送提车大礼包（整车车衣，冰丝脚垫，除味炭包，车用香水）","murl":"http://m.mall.autohome.com.cn/detail/158204-210200-0.html?isapp=1#pvareaid=2018162","carlable":"","state":"现货充足","brandid":58,"seriesid":2987,"specid":22927,"seriesname":"马自达CX-5","count":0,"type":0,"ishistory":false,"pvid":"y4m25HhPLWppOmcPHr3NPPWAi7hupRPP","isoperation":0},{"id":89238,"productid":0,"title":"双龙 柯兰多 2015款 2.0L 两驱自动致纯版","shorttitle":"柯兰多 2015款 2.0L 两驱自动致纯版（国五）","logo":"http://car0.autoimg.cn/upload/2014/11/3/tp_20141103201326311-111.jpg","price":"14.28万","fctprice":"15.98万","adinfo":"优惠1.7万，订金3000元","murl":"http://m.mall.autohome.com.cn/detail/89238-210200-0.html?isapp=1#pvareaid=2018162","carlable":"","state":"库存紧张","brandid":69,"seriesid":2214,"specid":19708,"seriesname":"柯兰多","count":0,"type":0,"ishistory":false,"pvid":"y4m25HhPLWppOmcPHr3NPPWAi7hupRPP","isoperation":0},{"id":155716,"productid":0,"title":"宝马 宝马X5 2015款 xDrive28i","shorttitle":"宝马X5 2015款 xDrive28i","logo":"http://car2.autoimg.cn/cardfs/product/g20/M0D/0D/D2/tp_autohomecar__wKgFVFfOfpOAIavNAAFKQ3HprtQ533.jpg","price":"64.80万","fctprice":"75.80万","adinfo":"零首付购车，多种方案选择，优惠车价，4S现货车源","murl":"http://m.mall.autohome.com.cn/detail/155716-210200-0.html?isapp=1#pvareaid=2018162","carlable":"","state":"现货充足","brandid":15,"seriesid":159,"specid":23679,"seriesname":"宝马X5","count":0,"type":0,"ishistory":false,"pvid":"y4m25HhPLWppOmcPHr3NPPWAi7hupRPP","isoperation":0},{"id":102363,"productid":0,"title":"丰田 坦途 2016款 5.7L SR5TRD版","shorttitle":"坦途 2016款 5.7L SR5TRD版","logo":"http://car3.autoimg.cn/cardfs/product/g22/M0F/35/98/tp_autohomecar__wKjBwVcMto-AaWvFAAFzvvgcqko702.jpg","price":"44.80万","fctprice":"44.60万","adinfo":"【蓝色 橙色现车】丰田 坦途 2016款 5.7L SR5TRD版","murl":"http://m.mall.autohome.com.cn/detail/102363-210200-0.html?isapp=1#pvareaid=2018162","carlable":"","state":"现货充足","brandid":3,"seriesid":2354,"specid":11000103,"seriesname":"坦途","count":0,"type":0,"ishistory":false,"pvid":"y4m25HhPLWppOmcPHr3NPPWAi7hupRPP","isoperation":0},{"id":149891,"productid":0,"title":"马自达 马自达3 Axela昂克赛拉 2016款 三厢 1.5L 自动豪华型","shorttitle":"马自达3 Axela昂克赛拉 2016款 三厢 1.5L 自动豪华型","logo":"http://car0.autoimg.cn/upload/2014/11/1/tp_20141101150951137-111.jpg","price":"12.59万","fctprice":"13.89万","adinfo":"新店开业，现金直降1.3万元，享两年免息，还送提车大礼包（整车车衣，冰丝脚垫，除味炭包，车用香水）","murl":"http://m.mall.autohome.com.cn/detail/149891-210200-0.html?isapp=1#pvareaid=2018162","carlable":"","state":"现货充足","brandid":58,"seriesid":3294,"specid":23582,"seriesname":"马自达3 Axela昂克赛拉","count":0,"type":0,"ishistory":false,"pvid":"y4m25HhPLWppOmcPHr3NPPWAi7hupRPP","isoperation":0}],"isloadmore":true,"carmallurl":"http://m.mall.autohome.com.cn/?isapp=1#pvareaid=2018177"}
     * issmartrecommendpvtype : 1
     */

    private ResultBean result;
    /**
     * result : {"modulelist":[{"title":"猜你喜欢","list":[{"id":154649,"productid":60002026,"title":"陆风X8","shorttitle":"1元抵扣百元试驾礼包","logo":"http://car0.autoimg.cn/upload/2014/11/3/tp_20141103200910737-111.jpg","price":"1元","fctprice":"100元","adinfo":"1元抵扣百元试驾礼包","murl":"http://mall.m.autohome.com.cn/item/app/item-60002026-0.html#pvareaid=2018163","functionid":0,"type":1,"pvid":"y4m25HhPLWppOmcPHr3NPPWAi7hupRPP","isoperation":0},{"id":158795,"productid":60002203,"title":"广汽本田雅阁","shorttitle":"平安汽融0息购车专场，成功办理汽车分期后10个工作日内获赠百元万里通积分","logo":"http://car2.autoimg.cn/cardfs/product/g23/M10/00/0A/tp_autohomecar__wKgFXFbyAMOAVaayAAE4K6YNqcY641.jpg","price":"1元","fctprice":"100元","adinfo":"平安汽融0息购车专场，成功办理汽车分期后10个工作日内获赠百元万里通积分","murl":"http://mall.m.autohome.com.cn/item/app/item-60002203-0.html#pvareaid=2018163","functionid":0,"type":1,"pvid":"y4m25HhPLWppOmcPHr3NPPWAi7hupRPP","isoperation":0},{"id":154595,"productid":60002022,"title":"悦翔V3（兵财车贷购车）","shorttitle":"线上支付99元，到店购车可获400元联通电话费","logo":"http://car0.autoimg.cn/upload/2014/10/10/tp_2014101010104526526410.jpg","price":"99元","fctprice":"400元","adinfo":"线上支付99元，到店购车可获400元联通电话费","murl":"http://mall.m.autohome.com.cn/item/app/item-60002022-0.html#pvareaid=2018163","functionid":0,"type":1,"pvid":"y4m25HhPLWppOmcPHr3NPPWAi7hupRPP","isoperation":0},{"id":152920,"productid":60001947,"title":"上汽大众斯柯达-全新晶锐","shorttitle":"【订金】全新晶锐 送500元斯柯达车友汇积分 购置税减半","logo":"http://car0.autoimg.cn/car/upload/2015/4/22/tp_20150422142200670264110.jpg","price":"99元","fctprice":"500元","adinfo":"【订金】全新晶锐 送500元斯柯达车友汇积分 购置税减半","murl":"http://mall.m.autohome.com.cn/item/app/item-60001947-0.html#pvareaid=2018163","functionid":0,"type":1,"pvid":"y4m25HhPLWppOmcPHr3NPPWAi7hupRPP","isoperation":0}],"spread":{"bannerimg":"","detailurl":"","spreadid":0}},{"title":"为我推荐","list":[{"id":107839,"productid":0,"title":"本田 本田CR-V 2016款 2.0L 两驱都市版","shorttitle":"本田CR-V 2016款 2.0L 两驱都市版","logo":"http://car0.autoimg.cn/car/upload/2015/6/9/tp_20150609094931681-1112.jpg","price":"17.48万","fctprice":"18.98万","adinfo":"尊享低利率","murl":"http://m.mall.autohome.com.cn/detail/107839-210200-0.html?isapp=1#pvareaid=2018163","functionid":0,"type":0,"pvid":"y4m25HhPLWppOmcPHr3NPPWAi7hupRPP","isoperation":0},{"id":73408,"productid":0,"title":"长安 奔奔MINI 2012款 1.0L 手动亲情版 国IV","shorttitle":"奔奔MINI 2012款 1.0L 手动亲情版 国IV","logo":"http://car0.autoimg.cn/upload/2014/10/22/tp_20141022135134273-110.jpg","price":"3.25万","fctprice":"3.69万","adinfo":"0首付，资料简单，门槛低","murl":"http://m.mall.autohome.com.cn/detail/73408-210200-0.html?isapp=1#pvareaid=2018163","functionid":0,"type":0,"pvid":"y4m25HhPLWppOmcPHr3NPPWAi7hupRPP","isoperation":0},{"id":111366,"productid":0,"title":"斯柯达 明锐 2017款 1.6L 手动智行版","shorttitle":"明锐 2017款 1.6L 手动智行版","logo":"http://car3.autoimg.cn/cardfs/product/g13/M0E/CF/3F/tp_autohomecar__wKjBylY5eY-Afo7TAAE5ZNIIzks790.jpg","price":"12.79万","fctprice":"13.99万","adinfo":"尊享12/18/24期0利率","murl":"http://m.mall.autohome.com.cn/detail/111366-210200-0.html?isapp=1#pvareaid=2018163","functionid":0,"type":0,"pvid":"y4m25HhPLWppOmcPHr3NPPWAi7hupRPP","isoperation":0},{"id":74428,"productid":0,"title":"本田 思铂睿 2015款 2.0L 豪华版","shorttitle":"思铂睿 2015款 2.0L 豪华版","logo":"http://car0.autoimg.cn/car/upload/2015/6/9/tp_20150609095041258-1112.jpg","price":"13.96万","fctprice":"17.98万","adinfo":"尊享低利率","murl":"http://m.mall.autohome.com.cn/detail/74428-210200-0.html?isapp=1#pvareaid=2018163","functionid":0,"type":0,"pvid":"y4m25HhPLWppOmcPHr3NPPWAi7hupRPP","isoperation":0}],"spread":{"bannerimg":"","detailurl":"","spreadid":0}}],"goodslist":{"list":[{"id":150217,"productid":0,"title":"别克 英朗 2016款 15N 自动进取型","shorttitle":"英朗 2016款 15N 自动进取型","logo":"http://car3.autoimg.cn/cardfs/product/g20/M0D/33/13/tp_autohomecar__wKjBw1cLBeaADczeAAFCN49Asow450.jpg","price":"11.99万","fctprice":"11.99万","adinfo":"花生好车 0首付，月供2561元起 线上支付99元订金 线下完成交易 实际车款以城市店系统金额为准","murl":"http://m.mall.autohome.com.cn/detail/150217-210200-0.html?isapp=1#pvareaid=2018162","carlable":"特价","state":"现货充足","brandid":38,"seriesid":982,"specid":25862,"seriesname":"英朗","count":0,"type":0,"ishistory":false,"pvid":"y4m25HhPLWppOmcPHr3NPPWAi7hupRPP","isoperation":0},{"id":137460,"productid":0,"title":"北汽绅宝 绅宝D70 2013款 2.3T 精英版","shorttitle":"绅宝D70 2013款 2.3T 精英版","logo":"http://car0.autoimg.cn/upload/2014/11/3/tp_20141103183557129-110.jpg","price":"11.20万","fctprice":"19.58万","adinfo":"全新商品库存车二手车价格销售 只能全款购车 裸车销售","murl":"http://m.mall.autohome.com.cn/detail/137460-210200-0.html?isapp=1#pvareaid=2018162","carlable":"人气","state":"现货充足","brandid":173,"seriesid":2787,"specid":15903,"seriesname":"绅宝D70","count":0,"type":0,"ishistory":false,"pvid":"y4m25HhPLWppOmcPHr3NPPWAi7hupRPP","isoperation":0},{"id":140397,"productid":0,"title":"宝沃 宝沃BX7 2016款 28T 四驱豪华版","shorttitle":"宝沃BX7 2016款 28T 四驱豪华版","logo":"http://car2.autoimg.cn/cardfs/product/g20/M03/45/99/tp_autohomecar__wKjBw1cdr7mAZp6cAAGO9jsifVQ340.jpg","price":"21.68万","fctprice":"21.68万","adinfo":"【德国品质】源自1919，BX7德国宽体智联SUV。店铺一口价与抵扣券活动可同时参与。","murl":"http://m.mall.autohome.com.cn/detail/140397-210200-0.html?isapp=1#pvareaid=2018162","carlable":"","state":"现货充足","brandid":231,"seriesid":3913,"specid":25676,"seriesname":"宝沃BX7","count":0,"type":0,"ishistory":false,"pvid":"y4m25HhPLWppOmcPHr3NPPWAi7hupRPP","isoperation":0},{"id":33829,"productid":0,"title":"马自达 马自达CX-7 2014款 2.5L 2WD 豪华版","shorttitle":"马自达CX-7 2014款 2.5L 2WD 豪华版","logo":"http://car0.autoimg.cn/upload/2014/10/24/tp_20141024170814473-110.jpg","price":"17.98万","fctprice":"22.98万","adinfo":"直降5万元，分期1年免息，赠交强险！#订金金额：2000元#","murl":"http://m.mall.autohome.com.cn/detail/33829-210200-0.html?isapp=1#pvareaid=2018162","carlable":"热卖","state":"现货充足","brandid":58,"seriesid":3066,"specid":19529,"seriesname":"马自达CX-7","count":0,"type":0,"ishistory":false,"pvid":"y4m25HhPLWppOmcPHr3NPPWAi7hupRPP","isoperation":0},{"id":126637,"productid":0,"title":"现代 途胜 2013款 2.0L 手动两驱时尚型","shorttitle":"途胜 2013款 2.0L 手动两驱时尚型","logo":"http://car0.autoimg.cn/upload/2014/11/3/tp_20141103202208533-110.jpg","price":"10.50万","fctprice":"16.98万","adinfo":"开业大酬宾，多重好礼送不停","murl":"http://m.mall.autohome.com.cn/detail/126637-210200-0.html?isapp=1#pvareaid=2018162","carlable":"爆款","state":"现货充足","brandid":12,"seriesid":358,"specid":15163,"seriesname":"途胜","count":0,"type":0,"ishistory":false,"pvid":"y4m25HhPLWppOmcPHr3NPPWAi7hupRPP","isoperation":0},{"id":138683,"productid":0,"title":"标致 标致4008(进口) 2013款 2.0L 两驱时尚型","shorttitle":"标致4008(进口) 2013款 2.0L 两驱时尚型","logo":"http://car0.autoimg.cn/upload/2014/11/6/tp_20141106142726389-110.jpg","price":"15.78万","fctprice":"21.98万","adinfo":"进口4008 优惠6.4万 可分期购车（0首付） 新车有限，售完为止！ 有现车","murl":"http://m.mall.autohome.com.cn/detail/138683-210200-0.html?isapp=1#pvareaid=2018162","carlable":"热卖","state":"现货充足","brandid":13,"seriesid":2472,"specid":15934,"seriesname":"标致4008(进口)","count":0,"type":0,"ishistory":false,"pvid":"y4m25HhPLWppOmcPHr3NPPWAi7hupRPP","isoperation":0},{"id":136778,"productid":0,"title":"铃木 吉姆尼(进口) 2015款 1.3L 自动挡 中东版","shorttitle":"吉姆尼(进口) 2015款 1.3L 自动挡 中东版","logo":"http://car2.autoimg.cn/cardfs/product/g12/M06/C1/02/tp_autohomecar__wKgH4lYt33OATUjVAAG7fik8y0U459.jpg","price":"12.99万","fctprice":"14.88万","adinfo":"最便宜的平行进口车，最强越野小钢炮。仅售12.99万，颜色不多预购从速！","murl":"http://m.mall.autohome.com.cn/detail/136778-210200-0.html?isapp=1#pvareaid=2018162","carlable":"","state":"现货充足","brandid":53,"seriesid":508,"specid":11000076,"seriesname":"吉姆尼(进口)","count":0,"type":0,"ishistory":false,"pvid":"y4m25HhPLWppOmcPHr3NPPWAi7hupRPP","isoperation":0},{"id":132068,"productid":0,"title":"丰田 兰德酷路泽(进口) 2016款 汽油4.0L 丰田兰德酷路泽 中东版","shorttitle":"兰德酷路泽(进口) 2016款 汽油4.0L 丰田兰德酷路泽 中东版","logo":"http://car2.autoimg.cn/cardfs/product/g8/M09/CC/7B/tp_autohomecar__wKjBz1eMQYiAMBcEAAHQQC29VD0031.jpg","price":"67.98万","fctprice":"85.80万","adinfo":"2016款中东版兰德酷路泽4000底挂标配 全新兰德酷路泽 耀目驾临 行走天地万物之道 创想自由新境界 前十名定车客户赠送：行车记录仪、车载吸尘器、车载充气泵。","murl":"http://m.mall.autohome.com.cn/detail/132068-210200-0.html?isapp=1#pvareaid=2018162","carlable":"","state":"现货充足","brandid":3,"seriesid":550,"specid":11000222,"seriesname":"兰德酷路泽(进口)","count":0,"type":0,"ishistory":false,"pvid":"y4m25HhPLWppOmcPHr3NPPWAi7hupRPP","isoperation":0},{"id":129824,"productid":0,"title":"标致 标致301 2016款 1.6L 自动舒适版","shorttitle":"标致301 2016款 1.6L 自动舒适版","logo":"http://car3.autoimg.cn/cardfs/product/g16/M00/39/4C/tp_autohomecar__wKgH5laTPMqABM4cAAFqfB--VHY926.jpg","price":"9.77万","fctprice":"9.77万","adinfo":"东风标致301 款待生活 质感晋级 门店议价立即预订！ 具体车型颜色和配置以当地门店现车为准，线上订金抵扣车款，门店议价，详情咨询就近门店。","murl":"http://m.mall.autohome.com.cn/detail/129824-210200-0.html?isapp=1#pvareaid=2018162","carlable":"","state":"现货充足","brandid":13,"seriesid":3068,"specid":24944,"seriesname":"标致301","count":0,"type":0,"ishistory":false,"pvid":"y4m25HhPLWppOmcPHr3NPPWAi7hupRPP","isoperation":0},{"id":89561,"productid":0,"title":"吉利汽车 金刚 2016款 1.5L 自动尊贵型 国V","shorttitle":"金刚 2016款 1.5L 自动尊贵型 国V","logo":"http://car2.autoimg.cn/cardfs/product/g21/M10/DD/D9/tp_autohomecar__wKgFVVbo9laAUETzAAFmtKalInM888.jpg","price":"6.09万","fctprice":"6.59万","adinfo":"9月19日开启疯抢，一口价6.09万元！仅限10台！（无赠品）#订金1000元#","murl":"http://m.mall.autohome.com.cn/detail/89561-210200-0.html?isapp=1#pvareaid=2018162","carlable":"","state":"现货充足","brandid":25,"seriesid":447,"specid":24816,"seriesname":"金刚","count":0,"type":0,"ishistory":false,"pvid":"y4m25HhPLWppOmcPHr3NPPWAi7hupRPP","isoperation":0},{"id":133904,"productid":0,"title":"捷豹 捷豹XF 2016款 XF 2.0T 两驱风华版","shorttitle":"捷豹XF 2016款 XF 2.0T 两驱风华版","logo":"http://car2.autoimg.cn/cardfs/product/g8/M10/09/D5/tp_autohomecar__wKjBz1Zw0WSATBCAAAGPG5LKaSw958.jpg","price":"40.80万","fctprice":"51.80万","adinfo":"捷豹路虎车型： 可销售全国各地 无区域限制 可享受全国联保 颜色齐全 现车充足 汽车之家车商城来订购...","murl":"http://m.mall.autohome.com.cn/detail/133904-210200-0.html?isapp=1#pvareaid=2018162","carlable":"人气","state":"现货充足","brandid":44,"seriesid":589,"specid":23831,"seriesname":"捷豹XF","count":0,"type":0,"ishistory":false,"pvid":"y4m25HhPLWppOmcPHr3NPPWAi7hupRPP","isoperation":0},{"id":142056,"productid":0,"title":"陆风 陆风X7 2015款 2.0T 全景尊享版","shorttitle":"陆风X7 2015款 2.0T 全景尊享版","logo":"http://car3.autoimg.cn/cardfs/product/g16/M06/B2/A0/tp_autohomecar__wKjBx1dtBdGAcbnXAAFjlcr0Fr8070.jpg","price":"12.98万","fctprice":"12.98万","adinfo":"陆风X7周年庆8月限时大促，陆风X7全车型购置税减半，加送500元油卡，分期还可享受1年免息，首付仅需2.98万起！","murl":"http://m.mall.autohome.com.cn/detail/142056-210200-0.html?isapp=1#pvareaid=2018162","carlable":"","state":"现货充足","brandid":88,"seriesid":3413,"specid":21007,"seriesname":"陆风X7","count":0,"type":0,"ishistory":false,"pvid":"y4m25HhPLWppOmcPHr3NPPWAi7hupRPP","isoperation":0},{"id":129812,"productid":0,"title":"玛莎拉蒂 Ghibli Ghibli 2016款 3.0T S Q4 ","shorttitle":"Ghibli Ghibli 2016款 3.0T S Q4","logo":"http://car2.autoimg.cn/cardfs/product/g9/M02/B4/F4/tp_autohomecar__wKjBzld2KqiAW2tnAAE8AFytfIY787.jpg","price":"91.00万","fctprice":"139.80万","adinfo":"【高性能豪华4门轿跑】美规 玛莎拉蒂 Ghibli 3.0T 四驱 高功率 汽油版，车商城现车直售！实力卖家良心价格！欢迎来梅山体验中心考察，成功购车的用户，当日您的住行花销我们统统包！","murl":"http://m.mall.autohome.com.cn/detail/129812-210200-0.html?isapp=1#pvareaid=2018162","carlable":"","state":"库存紧张","brandid":57,"seriesid":3060,"specid":11000223,"seriesname":"Ghibli","count":0,"type":0,"ishistory":false,"pvid":"y4m25HhPLWppOmcPHr3NPPWAi7hupRPP","isoperation":0},{"id":130394,"productid":0,"title":"奔驰 奔驰S级 2014款 S 320 L 商务型","shorttitle":"奔驰S级 2014款 S 320 L 商务型","logo":"http://car0.autoimg.cn/upload/2014/11/3/tp_20141103185026735-111.jpg","price":"78.80万","fctprice":"93.80万","adinfo":"2016款奔驰S320商务型（2014款奔驰S320+香氛系统）展厅6台现车，现车直降15万！","murl":"http://m.mall.autohome.com.cn/detail/130394-210200-0.html?isapp=1#pvareaid=2018162","carlable":"新品","state":"现货充足","brandid":36,"seriesid":59,"specid":19246,"seriesname":"奔驰S级","count":0,"type":0,"ishistory":false,"pvid":"y4m25HhPLWppOmcPHr3NPPWAi7hupRPP","isoperation":0},{"id":127602,"productid":0,"title":"Jeep 指南者 2014款 改款 2.4L 四驱舒适版","shorttitle":"指南者 2014款 改款 2.4L 四驱舒适版","logo":"http://car0.autoimg.cn/upload/2014/10/22/tp_20141022134702412-110.jpg","price":"17.70万","fctprice":"24.59万","adinfo":"8.12港口粉尘落灰车 空滤已更换 正常质保一年两万公里 专业级豪华--SUV 全国上牌 只提供裸车 无保险及贷款分期业务 若在当地提车 需加收一定的物流运输费用！","murl":"http://m.mall.autohome.com.cn/detail/127602-210200-0.html?isapp=1#pvareaid=2018162","carlable":"","state":"现货充足","brandid":46,"seriesid":504,"specid":18199,"seriesname":"指南者","count":0,"type":0,"ishistory":false,"pvid":"y4m25HhPLWppOmcPHr3NPPWAi7hupRPP","isoperation":0},{"id":158204,"productid":0,"title":"马自达 马自达CX-5 2015款 2.0L 自动两驱都市型","shorttitle":"马自达CX-5 2015款 2.0L 自动两驱都市型","logo":"http://car0.autoimg.cn/upload/2014/10/22/tp_20141022135315810-110.jpg","price":"16.78万","fctprice":"19.08万","adinfo":"新店开业，现金直降2.3万元，还送提车大礼包（整车车衣，冰丝脚垫，除味炭包，车用香水）","murl":"http://m.mall.autohome.com.cn/detail/158204-210200-0.html?isapp=1#pvareaid=2018162","carlable":"","state":"现货充足","brandid":58,"seriesid":2987,"specid":22927,"seriesname":"马自达CX-5","count":0,"type":0,"ishistory":false,"pvid":"y4m25HhPLWppOmcPHr3NPPWAi7hupRPP","isoperation":0},{"id":89238,"productid":0,"title":"双龙 柯兰多 2015款 2.0L 两驱自动致纯版","shorttitle":"柯兰多 2015款 2.0L 两驱自动致纯版（国五）","logo":"http://car0.autoimg.cn/upload/2014/11/3/tp_20141103201326311-111.jpg","price":"14.28万","fctprice":"15.98万","adinfo":"优惠1.7万，订金3000元","murl":"http://m.mall.autohome.com.cn/detail/89238-210200-0.html?isapp=1#pvareaid=2018162","carlable":"","state":"库存紧张","brandid":69,"seriesid":2214,"specid":19708,"seriesname":"柯兰多","count":0,"type":0,"ishistory":false,"pvid":"y4m25HhPLWppOmcPHr3NPPWAi7hupRPP","isoperation":0},{"id":155716,"productid":0,"title":"宝马 宝马X5 2015款 xDrive28i","shorttitle":"宝马X5 2015款 xDrive28i","logo":"http://car2.autoimg.cn/cardfs/product/g20/M0D/0D/D2/tp_autohomecar__wKgFVFfOfpOAIavNAAFKQ3HprtQ533.jpg","price":"64.80万","fctprice":"75.80万","adinfo":"零首付购车，多种方案选择，优惠车价，4S现货车源","murl":"http://m.mall.autohome.com.cn/detail/155716-210200-0.html?isapp=1#pvareaid=2018162","carlable":"","state":"现货充足","brandid":15,"seriesid":159,"specid":23679,"seriesname":"宝马X5","count":0,"type":0,"ishistory":false,"pvid":"y4m25HhPLWppOmcPHr3NPPWAi7hupRPP","isoperation":0},{"id":102363,"productid":0,"title":"丰田 坦途 2016款 5.7L SR5TRD版","shorttitle":"坦途 2016款 5.7L SR5TRD版","logo":"http://car3.autoimg.cn/cardfs/product/g22/M0F/35/98/tp_autohomecar__wKjBwVcMto-AaWvFAAFzvvgcqko702.jpg","price":"44.80万","fctprice":"44.60万","adinfo":"【蓝色 橙色现车】丰田 坦途 2016款 5.7L SR5TRD版","murl":"http://m.mall.autohome.com.cn/detail/102363-210200-0.html?isapp=1#pvareaid=2018162","carlable":"","state":"现货充足","brandid":3,"seriesid":2354,"specid":11000103,"seriesname":"坦途","count":0,"type":0,"ishistory":false,"pvid":"y4m25HhPLWppOmcPHr3NPPWAi7hupRPP","isoperation":0},{"id":149891,"productid":0,"title":"马自达 马自达3 Axela昂克赛拉 2016款 三厢 1.5L 自动豪华型","shorttitle":"马自达3 Axela昂克赛拉 2016款 三厢 1.5L 自动豪华型","logo":"http://car0.autoimg.cn/upload/2014/11/1/tp_20141101150951137-111.jpg","price":"12.59万","fctprice":"13.89万","adinfo":"新店开业，现金直降1.3万元，享两年免息，还送提车大礼包（整车车衣，冰丝脚垫，除味炭包，车用香水）","murl":"http://m.mall.autohome.com.cn/detail/149891-210200-0.html?isapp=1#pvareaid=2018162","carlable":"","state":"现货充足","brandid":58,"seriesid":3294,"specid":23582,"seriesname":"马自达3 Axela昂克赛拉","count":0,"type":0,"ishistory":false,"pvid":"y4m25HhPLWppOmcPHr3NPPWAi7hupRPP","isoperation":0}],"isloadmore":true,"carmallurl":"http://m.mall.autohome.com.cn/?isapp=1#pvareaid=2018177"},"issmartrecommendpvtype":1}
     * returncode : 0
     * message :
     */

    private int returncode;
    private String message;

    public static SaleLikeBean objectFromData(String str) {

        return new Gson().fromJson(str, SaleLikeBean.class);
    }

    public static SaleLikeBean objectFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);

            return new Gson().fromJson(jsonObject.getString(str), SaleLikeBean.class);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static List<SaleLikeBean> arraySaleLikeBeanFromData(String str) {

        Type listType = new TypeToken<ArrayList<SaleLikeBean>>() {
        }.getType();

        return new Gson().fromJson(str, listType);
    }

    public static List<SaleLikeBean> arraySaleLikeBeanFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);
            Type listType = new TypeToken<ArrayList<SaleLikeBean>>() {
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
        /**
         * list : [{"id":150217,"productid":0,"title":"别克 英朗 2016款 15N 自动进取型","shorttitle":"英朗 2016款 15N 自动进取型","logo":"http://car3.autoimg.cn/cardfs/product/g20/M0D/33/13/tp_autohomecar__wKjBw1cLBeaADczeAAFCN49Asow450.jpg","price":"11.99万","fctprice":"11.99万","adinfo":"花生好车 0首付，月供2561元起 线上支付99元订金 线下完成交易 实际车款以城市店系统金额为准","murl":"http://m.mall.autohome.com.cn/detail/150217-210200-0.html?isapp=1#pvareaid=2018162","carlable":"特价","state":"现货充足","brandid":38,"seriesid":982,"specid":25862,"seriesname":"英朗","count":0,"type":0,"ishistory":false,"pvid":"y4m25HhPLWppOmcPHr3NPPWAi7hupRPP","isoperation":0},{"id":137460,"productid":0,"title":"北汽绅宝 绅宝D70 2013款 2.3T 精英版","shorttitle":"绅宝D70 2013款 2.3T 精英版","logo":"http://car0.autoimg.cn/upload/2014/11/3/tp_20141103183557129-110.jpg","price":"11.20万","fctprice":"19.58万","adinfo":"全新商品库存车二手车价格销售 只能全款购车 裸车销售","murl":"http://m.mall.autohome.com.cn/detail/137460-210200-0.html?isapp=1#pvareaid=2018162","carlable":"人气","state":"现货充足","brandid":173,"seriesid":2787,"specid":15903,"seriesname":"绅宝D70","count":0,"type":0,"ishistory":false,"pvid":"y4m25HhPLWppOmcPHr3NPPWAi7hupRPP","isoperation":0},{"id":140397,"productid":0,"title":"宝沃 宝沃BX7 2016款 28T 四驱豪华版","shorttitle":"宝沃BX7 2016款 28T 四驱豪华版","logo":"http://car2.autoimg.cn/cardfs/product/g20/M03/45/99/tp_autohomecar__wKjBw1cdr7mAZp6cAAGO9jsifVQ340.jpg","price":"21.68万","fctprice":"21.68万","adinfo":"【德国品质】源自1919，BX7德国宽体智联SUV。店铺一口价与抵扣券活动可同时参与。","murl":"http://m.mall.autohome.com.cn/detail/140397-210200-0.html?isapp=1#pvareaid=2018162","carlable":"","state":"现货充足","brandid":231,"seriesid":3913,"specid":25676,"seriesname":"宝沃BX7","count":0,"type":0,"ishistory":false,"pvid":"y4m25HhPLWppOmcPHr3NPPWAi7hupRPP","isoperation":0},{"id":33829,"productid":0,"title":"马自达 马自达CX-7 2014款 2.5L 2WD 豪华版","shorttitle":"马自达CX-7 2014款 2.5L 2WD 豪华版","logo":"http://car0.autoimg.cn/upload/2014/10/24/tp_20141024170814473-110.jpg","price":"17.98万","fctprice":"22.98万","adinfo":"直降5万元，分期1年免息，赠交强险！#订金金额：2000元#","murl":"http://m.mall.autohome.com.cn/detail/33829-210200-0.html?isapp=1#pvareaid=2018162","carlable":"热卖","state":"现货充足","brandid":58,"seriesid":3066,"specid":19529,"seriesname":"马自达CX-7","count":0,"type":0,"ishistory":false,"pvid":"y4m25HhPLWppOmcPHr3NPPWAi7hupRPP","isoperation":0},{"id":126637,"productid":0,"title":"现代 途胜 2013款 2.0L 手动两驱时尚型","shorttitle":"途胜 2013款 2.0L 手动两驱时尚型","logo":"http://car0.autoimg.cn/upload/2014/11/3/tp_20141103202208533-110.jpg","price":"10.50万","fctprice":"16.98万","adinfo":"开业大酬宾，多重好礼送不停","murl":"http://m.mall.autohome.com.cn/detail/126637-210200-0.html?isapp=1#pvareaid=2018162","carlable":"爆款","state":"现货充足","brandid":12,"seriesid":358,"specid":15163,"seriesname":"途胜","count":0,"type":0,"ishistory":false,"pvid":"y4m25HhPLWppOmcPHr3NPPWAi7hupRPP","isoperation":0},{"id":138683,"productid":0,"title":"标致 标致4008(进口) 2013款 2.0L 两驱时尚型","shorttitle":"标致4008(进口) 2013款 2.0L 两驱时尚型","logo":"http://car0.autoimg.cn/upload/2014/11/6/tp_20141106142726389-110.jpg","price":"15.78万","fctprice":"21.98万","adinfo":"进口4008 优惠6.4万 可分期购车（0首付） 新车有限，售完为止！ 有现车","murl":"http://m.mall.autohome.com.cn/detail/138683-210200-0.html?isapp=1#pvareaid=2018162","carlable":"热卖","state":"现货充足","brandid":13,"seriesid":2472,"specid":15934,"seriesname":"标致4008(进口)","count":0,"type":0,"ishistory":false,"pvid":"y4m25HhPLWppOmcPHr3NPPWAi7hupRPP","isoperation":0},{"id":136778,"productid":0,"title":"铃木 吉姆尼(进口) 2015款 1.3L 自动挡 中东版","shorttitle":"吉姆尼(进口) 2015款 1.3L 自动挡 中东版","logo":"http://car2.autoimg.cn/cardfs/product/g12/M06/C1/02/tp_autohomecar__wKgH4lYt33OATUjVAAG7fik8y0U459.jpg","price":"12.99万","fctprice":"14.88万","adinfo":"最便宜的平行进口车，最强越野小钢炮。仅售12.99万，颜色不多预购从速！","murl":"http://m.mall.autohome.com.cn/detail/136778-210200-0.html?isapp=1#pvareaid=2018162","carlable":"","state":"现货充足","brandid":53,"seriesid":508,"specid":11000076,"seriesname":"吉姆尼(进口)","count":0,"type":0,"ishistory":false,"pvid":"y4m25HhPLWppOmcPHr3NPPWAi7hupRPP","isoperation":0},{"id":132068,"productid":0,"title":"丰田 兰德酷路泽(进口) 2016款 汽油4.0L 丰田兰德酷路泽 中东版","shorttitle":"兰德酷路泽(进口) 2016款 汽油4.0L 丰田兰德酷路泽 中东版","logo":"http://car2.autoimg.cn/cardfs/product/g8/M09/CC/7B/tp_autohomecar__wKjBz1eMQYiAMBcEAAHQQC29VD0031.jpg","price":"67.98万","fctprice":"85.80万","adinfo":"2016款中东版兰德酷路泽4000底挂标配 全新兰德酷路泽 耀目驾临 行走天地万物之道 创想自由新境界 前十名定车客户赠送：行车记录仪、车载吸尘器、车载充气泵。","murl":"http://m.mall.autohome.com.cn/detail/132068-210200-0.html?isapp=1#pvareaid=2018162","carlable":"","state":"现货充足","brandid":3,"seriesid":550,"specid":11000222,"seriesname":"兰德酷路泽(进口)","count":0,"type":0,"ishistory":false,"pvid":"y4m25HhPLWppOmcPHr3NPPWAi7hupRPP","isoperation":0},{"id":129824,"productid":0,"title":"标致 标致301 2016款 1.6L 自动舒适版","shorttitle":"标致301 2016款 1.6L 自动舒适版","logo":"http://car3.autoimg.cn/cardfs/product/g16/M00/39/4C/tp_autohomecar__wKgH5laTPMqABM4cAAFqfB--VHY926.jpg","price":"9.77万","fctprice":"9.77万","adinfo":"东风标致301 款待生活 质感晋级 门店议价立即预订！ 具体车型颜色和配置以当地门店现车为准，线上订金抵扣车款，门店议价，详情咨询就近门店。","murl":"http://m.mall.autohome.com.cn/detail/129824-210200-0.html?isapp=1#pvareaid=2018162","carlable":"","state":"现货充足","brandid":13,"seriesid":3068,"specid":24944,"seriesname":"标致301","count":0,"type":0,"ishistory":false,"pvid":"y4m25HhPLWppOmcPHr3NPPWAi7hupRPP","isoperation":0},{"id":89561,"productid":0,"title":"吉利汽车 金刚 2016款 1.5L 自动尊贵型 国V","shorttitle":"金刚 2016款 1.5L 自动尊贵型 国V","logo":"http://car2.autoimg.cn/cardfs/product/g21/M10/DD/D9/tp_autohomecar__wKgFVVbo9laAUETzAAFmtKalInM888.jpg","price":"6.09万","fctprice":"6.59万","adinfo":"9月19日开启疯抢，一口价6.09万元！仅限10台！（无赠品）#订金1000元#","murl":"http://m.mall.autohome.com.cn/detail/89561-210200-0.html?isapp=1#pvareaid=2018162","carlable":"","state":"现货充足","brandid":25,"seriesid":447,"specid":24816,"seriesname":"金刚","count":0,"type":0,"ishistory":false,"pvid":"y4m25HhPLWppOmcPHr3NPPWAi7hupRPP","isoperation":0},{"id":133904,"productid":0,"title":"捷豹 捷豹XF 2016款 XF 2.0T 两驱风华版","shorttitle":"捷豹XF 2016款 XF 2.0T 两驱风华版","logo":"http://car2.autoimg.cn/cardfs/product/g8/M10/09/D5/tp_autohomecar__wKjBz1Zw0WSATBCAAAGPG5LKaSw958.jpg","price":"40.80万","fctprice":"51.80万","adinfo":"捷豹路虎车型： 可销售全国各地 无区域限制 可享受全国联保 颜色齐全 现车充足 汽车之家车商城来订购...","murl":"http://m.mall.autohome.com.cn/detail/133904-210200-0.html?isapp=1#pvareaid=2018162","carlable":"人气","state":"现货充足","brandid":44,"seriesid":589,"specid":23831,"seriesname":"捷豹XF","count":0,"type":0,"ishistory":false,"pvid":"y4m25HhPLWppOmcPHr3NPPWAi7hupRPP","isoperation":0},{"id":142056,"productid":0,"title":"陆风 陆风X7 2015款 2.0T 全景尊享版","shorttitle":"陆风X7 2015款 2.0T 全景尊享版","logo":"http://car3.autoimg.cn/cardfs/product/g16/M06/B2/A0/tp_autohomecar__wKjBx1dtBdGAcbnXAAFjlcr0Fr8070.jpg","price":"12.98万","fctprice":"12.98万","adinfo":"陆风X7周年庆8月限时大促，陆风X7全车型购置税减半，加送500元油卡，分期还可享受1年免息，首付仅需2.98万起！","murl":"http://m.mall.autohome.com.cn/detail/142056-210200-0.html?isapp=1#pvareaid=2018162","carlable":"","state":"现货充足","brandid":88,"seriesid":3413,"specid":21007,"seriesname":"陆风X7","count":0,"type":0,"ishistory":false,"pvid":"y4m25HhPLWppOmcPHr3NPPWAi7hupRPP","isoperation":0},{"id":129812,"productid":0,"title":"玛莎拉蒂 Ghibli Ghibli 2016款 3.0T S Q4 ","shorttitle":"Ghibli Ghibli 2016款 3.0T S Q4","logo":"http://car2.autoimg.cn/cardfs/product/g9/M02/B4/F4/tp_autohomecar__wKjBzld2KqiAW2tnAAE8AFytfIY787.jpg","price":"91.00万","fctprice":"139.80万","adinfo":"【高性能豪华4门轿跑】美规 玛莎拉蒂 Ghibli 3.0T 四驱 高功率 汽油版，车商城现车直售！实力卖家良心价格！欢迎来梅山体验中心考察，成功购车的用户，当日您的住行花销我们统统包！","murl":"http://m.mall.autohome.com.cn/detail/129812-210200-0.html?isapp=1#pvareaid=2018162","carlable":"","state":"库存紧张","brandid":57,"seriesid":3060,"specid":11000223,"seriesname":"Ghibli","count":0,"type":0,"ishistory":false,"pvid":"y4m25HhPLWppOmcPHr3NPPWAi7hupRPP","isoperation":0},{"id":130394,"productid":0,"title":"奔驰 奔驰S级 2014款 S 320 L 商务型","shorttitle":"奔驰S级 2014款 S 320 L 商务型","logo":"http://car0.autoimg.cn/upload/2014/11/3/tp_20141103185026735-111.jpg","price":"78.80万","fctprice":"93.80万","adinfo":"2016款奔驰S320商务型（2014款奔驰S320+香氛系统）展厅6台现车，现车直降15万！","murl":"http://m.mall.autohome.com.cn/detail/130394-210200-0.html?isapp=1#pvareaid=2018162","carlable":"新品","state":"现货充足","brandid":36,"seriesid":59,"specid":19246,"seriesname":"奔驰S级","count":0,"type":0,"ishistory":false,"pvid":"y4m25HhPLWppOmcPHr3NPPWAi7hupRPP","isoperation":0},{"id":127602,"productid":0,"title":"Jeep 指南者 2014款 改款 2.4L 四驱舒适版","shorttitle":"指南者 2014款 改款 2.4L 四驱舒适版","logo":"http://car0.autoimg.cn/upload/2014/10/22/tp_20141022134702412-110.jpg","price":"17.70万","fctprice":"24.59万","adinfo":"8.12港口粉尘落灰车 空滤已更换 正常质保一年两万公里 专业级豪华--SUV 全国上牌 只提供裸车 无保险及贷款分期业务 若在当地提车 需加收一定的物流运输费用！","murl":"http://m.mall.autohome.com.cn/detail/127602-210200-0.html?isapp=1#pvareaid=2018162","carlable":"","state":"现货充足","brandid":46,"seriesid":504,"specid":18199,"seriesname":"指南者","count":0,"type":0,"ishistory":false,"pvid":"y4m25HhPLWppOmcPHr3NPPWAi7hupRPP","isoperation":0},{"id":158204,"productid":0,"title":"马自达 马自达CX-5 2015款 2.0L 自动两驱都市型","shorttitle":"马自达CX-5 2015款 2.0L 自动两驱都市型","logo":"http://car0.autoimg.cn/upload/2014/10/22/tp_20141022135315810-110.jpg","price":"16.78万","fctprice":"19.08万","adinfo":"新店开业，现金直降2.3万元，还送提车大礼包（整车车衣，冰丝脚垫，除味炭包，车用香水）","murl":"http://m.mall.autohome.com.cn/detail/158204-210200-0.html?isapp=1#pvareaid=2018162","carlable":"","state":"现货充足","brandid":58,"seriesid":2987,"specid":22927,"seriesname":"马自达CX-5","count":0,"type":0,"ishistory":false,"pvid":"y4m25HhPLWppOmcPHr3NPPWAi7hupRPP","isoperation":0},{"id":89238,"productid":0,"title":"双龙 柯兰多 2015款 2.0L 两驱自动致纯版","shorttitle":"柯兰多 2015款 2.0L 两驱自动致纯版（国五）","logo":"http://car0.autoimg.cn/upload/2014/11/3/tp_20141103201326311-111.jpg","price":"14.28万","fctprice":"15.98万","adinfo":"优惠1.7万，订金3000元","murl":"http://m.mall.autohome.com.cn/detail/89238-210200-0.html?isapp=1#pvareaid=2018162","carlable":"","state":"库存紧张","brandid":69,"seriesid":2214,"specid":19708,"seriesname":"柯兰多","count":0,"type":0,"ishistory":false,"pvid":"y4m25HhPLWppOmcPHr3NPPWAi7hupRPP","isoperation":0},{"id":155716,"productid":0,"title":"宝马 宝马X5 2015款 xDrive28i","shorttitle":"宝马X5 2015款 xDrive28i","logo":"http://car2.autoimg.cn/cardfs/product/g20/M0D/0D/D2/tp_autohomecar__wKgFVFfOfpOAIavNAAFKQ3HprtQ533.jpg","price":"64.80万","fctprice":"75.80万","adinfo":"零首付购车，多种方案选择，优惠车价，4S现货车源","murl":"http://m.mall.autohome.com.cn/detail/155716-210200-0.html?isapp=1#pvareaid=2018162","carlable":"","state":"现货充足","brandid":15,"seriesid":159,"specid":23679,"seriesname":"宝马X5","count":0,"type":0,"ishistory":false,"pvid":"y4m25HhPLWppOmcPHr3NPPWAi7hupRPP","isoperation":0},{"id":102363,"productid":0,"title":"丰田 坦途 2016款 5.7L SR5TRD版","shorttitle":"坦途 2016款 5.7L SR5TRD版","logo":"http://car3.autoimg.cn/cardfs/product/g22/M0F/35/98/tp_autohomecar__wKjBwVcMto-AaWvFAAFzvvgcqko702.jpg","price":"44.80万","fctprice":"44.60万","adinfo":"【蓝色 橙色现车】丰田 坦途 2016款 5.7L SR5TRD版","murl":"http://m.mall.autohome.com.cn/detail/102363-210200-0.html?isapp=1#pvareaid=2018162","carlable":"","state":"现货充足","brandid":3,"seriesid":2354,"specid":11000103,"seriesname":"坦途","count":0,"type":0,"ishistory":false,"pvid":"y4m25HhPLWppOmcPHr3NPPWAi7hupRPP","isoperation":0},{"id":149891,"productid":0,"title":"马自达 马自达3 Axela昂克赛拉 2016款 三厢 1.5L 自动豪华型","shorttitle":"马自达3 Axela昂克赛拉 2016款 三厢 1.5L 自动豪华型","logo":"http://car0.autoimg.cn/upload/2014/11/1/tp_20141101150951137-111.jpg","price":"12.59万","fctprice":"13.89万","adinfo":"新店开业，现金直降1.3万元，享两年免息，还送提车大礼包（整车车衣，冰丝脚垫，除味炭包，车用香水）","murl":"http://m.mall.autohome.com.cn/detail/149891-210200-0.html?isapp=1#pvareaid=2018162","carlable":"","state":"现货充足","brandid":58,"seriesid":3294,"specid":23582,"seriesname":"马自达3 Axela昂克赛拉","count":0,"type":0,"ishistory":false,"pvid":"y4m25HhPLWppOmcPHr3NPPWAi7hupRPP","isoperation":0}]
         * isloadmore : true
         * carmallurl : http://m.mall.autohome.com.cn/?isapp=1#pvareaid=2018177
         */

        private GoodslistBean goodslist;
        private int issmartrecommendpvtype;
        /**
         * title : 猜你喜欢
         * list : [{"id":154649,"productid":60002026,"title":"陆风X8","shorttitle":"1元抵扣百元试驾礼包","logo":"http://car0.autoimg.cn/upload/2014/11/3/tp_20141103200910737-111.jpg","price":"1元","fctprice":"100元","adinfo":"1元抵扣百元试驾礼包","murl":"http://mall.m.autohome.com.cn/item/app/item-60002026-0.html#pvareaid=2018163","functionid":0,"type":1,"pvid":"y4m25HhPLWppOmcPHr3NPPWAi7hupRPP","isoperation":0},{"id":158795,"productid":60002203,"title":"广汽本田雅阁","shorttitle":"平安汽融0息购车专场，成功办理汽车分期后10个工作日内获赠百元万里通积分","logo":"http://car2.autoimg.cn/cardfs/product/g23/M10/00/0A/tp_autohomecar__wKgFXFbyAMOAVaayAAE4K6YNqcY641.jpg","price":"1元","fctprice":"100元","adinfo":"平安汽融0息购车专场，成功办理汽车分期后10个工作日内获赠百元万里通积分","murl":"http://mall.m.autohome.com.cn/item/app/item-60002203-0.html#pvareaid=2018163","functionid":0,"type":1,"pvid":"y4m25HhPLWppOmcPHr3NPPWAi7hupRPP","isoperation":0},{"id":154595,"productid":60002022,"title":"悦翔V3（兵财车贷购车）","shorttitle":"线上支付99元，到店购车可获400元联通电话费","logo":"http://car0.autoimg.cn/upload/2014/10/10/tp_2014101010104526526410.jpg","price":"99元","fctprice":"400元","adinfo":"线上支付99元，到店购车可获400元联通电话费","murl":"http://mall.m.autohome.com.cn/item/app/item-60002022-0.html#pvareaid=2018163","functionid":0,"type":1,"pvid":"y4m25HhPLWppOmcPHr3NPPWAi7hupRPP","isoperation":0},{"id":152920,"productid":60001947,"title":"上汽大众斯柯达-全新晶锐","shorttitle":"【订金】全新晶锐 送500元斯柯达车友汇积分 购置税减半","logo":"http://car0.autoimg.cn/car/upload/2015/4/22/tp_20150422142200670264110.jpg","price":"99元","fctprice":"500元","adinfo":"【订金】全新晶锐 送500元斯柯达车友汇积分 购置税减半","murl":"http://mall.m.autohome.com.cn/item/app/item-60001947-0.html#pvareaid=2018163","functionid":0,"type":1,"pvid":"y4m25HhPLWppOmcPHr3NPPWAi7hupRPP","isoperation":0}]
         * spread : {"bannerimg":"","detailurl":"","spreadid":0}
         */

        private List<ModulelistBean> modulelist;

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

        public GoodslistBean getGoodslist() {
            return goodslist;
        }

        public void setGoodslist(GoodslistBean goodslist) {
            this.goodslist = goodslist;
        }

        public int getIssmartrecommendpvtype() {
            return issmartrecommendpvtype;
        }

        public void setIssmartrecommendpvtype(int issmartrecommendpvtype) {
            this.issmartrecommendpvtype = issmartrecommendpvtype;
        }

        public List<ModulelistBean> getModulelist() {
            return modulelist;
        }

        public void setModulelist(List<ModulelistBean> modulelist) {
            this.modulelist = modulelist;
        }

        public static class GoodslistBean {
            private boolean isloadmore;
            private String carmallurl;
            /**
             * id : 150217
             * productid : 0
             * title : 别克 英朗 2016款 15N 自动进取型
             * shorttitle : 英朗 2016款 15N 自动进取型
             * logo : http://car3.autoimg.cn/cardfs/product/g20/M0D/33/13/tp_autohomecar__wKjBw1cLBeaADczeAAFCN49Asow450.jpg
             * price : 11.99万
             * fctprice : 11.99万
             * adinfo : 花生好车 0首付，月供2561元起 线上支付99元订金 线下完成交易 实际车款以城市店系统金额为准
             * murl : http://m.mall.autohome.com.cn/detail/150217-210200-0.html?isapp=1#pvareaid=2018162
             * carlable : 特价
             * state : 现货充足
             * brandid : 38
             * seriesid : 982
             * specid : 25862
             * seriesname : 英朗
             * count : 0
             * type : 0
             * ishistory : false
             * pvid : y4m25HhPLWppOmcPHr3NPPWAi7hupRPP
             * isoperation : 0
             */

            private List<ListBean> list;

            public static GoodslistBean objectFromData(String str) {

                return new Gson().fromJson(str, GoodslistBean.class);
            }

            public static GoodslistBean objectFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);

                    return new Gson().fromJson(jsonObject.getString(str), GoodslistBean.class);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return null;
            }

            public static List<GoodslistBean> arrayGoodslistBeanFromData(String str) {

                Type listType = new TypeToken<ArrayList<GoodslistBean>>() {
                }.getType();

                return new Gson().fromJson(str, listType);
            }

            public static List<GoodslistBean> arrayGoodslistBeanFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);
                    Type listType = new TypeToken<ArrayList<GoodslistBean>>() {
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

            public String getCarmallurl() {
                return carmallurl;
            }

            public void setCarmallurl(String carmallurl) {
                this.carmallurl = carmallurl;
            }

            public List<ListBean> getList() {
                return list;
            }

            public void setList(List<ListBean> list) {
                this.list = list;
            }

            public static class ListBean {
                private int id;
                private int productid;
                private String title;
                private String shorttitle;
                private String logo;
                private String price;
                private String fctprice;
                private String adinfo;
                private String murl;
                private String carlable;
                private String state;
                private int brandid;
                private int seriesid;
                private int specid;
                private String seriesname;
                private int count;
                private int type;
                private boolean ishistory;
                private String pvid;
                private int isoperation;

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

                public int getProductid() {
                    return productid;
                }

                public void setProductid(int productid) {
                    this.productid = productid;
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

                public String getLogo() {
                    return logo;
                }

                public void setLogo(String logo) {
                    this.logo = logo;
                }

                public String getPrice() {
                    return price;
                }

                public void setPrice(String price) {
                    this.price = price;
                }

                public String getFctprice() {
                    return fctprice;
                }

                public void setFctprice(String fctprice) {
                    this.fctprice = fctprice;
                }

                public String getAdinfo() {
                    return adinfo;
                }

                public void setAdinfo(String adinfo) {
                    this.adinfo = adinfo;
                }

                public String getMurl() {
                    return murl;
                }

                public void setMurl(String murl) {
                    this.murl = murl;
                }

                public String getCarlable() {
                    return carlable;
                }

                public void setCarlable(String carlable) {
                    this.carlable = carlable;
                }

                public String getState() {
                    return state;
                }

                public void setState(String state) {
                    this.state = state;
                }

                public int getBrandid() {
                    return brandid;
                }

                public void setBrandid(int brandid) {
                    this.brandid = brandid;
                }

                public int getSeriesid() {
                    return seriesid;
                }

                public void setSeriesid(int seriesid) {
                    this.seriesid = seriesid;
                }

                public int getSpecid() {
                    return specid;
                }

                public void setSpecid(int specid) {
                    this.specid = specid;
                }

                public String getSeriesname() {
                    return seriesname;
                }

                public void setSeriesname(String seriesname) {
                    this.seriesname = seriesname;
                }

                public int getCount() {
                    return count;
                }

                public void setCount(int count) {
                    this.count = count;
                }

                public int getType() {
                    return type;
                }

                public void setType(int type) {
                    this.type = type;
                }

                public boolean isIshistory() {
                    return ishistory;
                }

                public void setIshistory(boolean ishistory) {
                    this.ishistory = ishistory;
                }

                public String getPvid() {
                    return pvid;
                }

                public void setPvid(String pvid) {
                    this.pvid = pvid;
                }

                public int getIsoperation() {
                    return isoperation;
                }

                public void setIsoperation(int isoperation) {
                    this.isoperation = isoperation;
                }
            }
        }

        public static class ModulelistBean {
            private String title;
            /**
             * bannerimg :
             * detailurl :
             * spreadid : 0
             */

            private SpreadBean spread;
            /**
             * id : 154649
             * productid : 60002026
             * title : 陆风X8
             * shorttitle : 1元抵扣百元试驾礼包
             * logo : http://car0.autoimg.cn/upload/2014/11/3/tp_20141103200910737-111.jpg
             * price : 1元
             * fctprice : 100元
             * adinfo : 1元抵扣百元试驾礼包
             * murl : http://mall.m.autohome.com.cn/item/app/item-60002026-0.html#pvareaid=2018163
             * functionid : 0
             * type : 1
             * pvid : y4m25HhPLWppOmcPHr3NPPWAi7hupRPP
             * isoperation : 0
             */

            private List<ListBean> list;

            public static ModulelistBean objectFromData(String str) {

                return new Gson().fromJson(str, ModulelistBean.class);
            }

            public static ModulelistBean objectFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);

                    return new Gson().fromJson(jsonObject.getString(str), ModulelistBean.class);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return null;
            }

            public static List<ModulelistBean> arrayModulelistBeanFromData(String str) {

                Type listType = new TypeToken<ArrayList<ModulelistBean>>() {
                }.getType();

                return new Gson().fromJson(str, listType);
            }

            public static List<ModulelistBean> arrayModulelistBeanFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);
                    Type listType = new TypeToken<ArrayList<ModulelistBean>>() {
                    }.getType();

                    return new Gson().fromJson(jsonObject.getString(str), listType);

                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return new ArrayList();


            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public SpreadBean getSpread() {
                return spread;
            }

            public void setSpread(SpreadBean spread) {
                this.spread = spread;
            }

            public List<ListBean> getList() {
                return list;
            }

            public void setList(List<ListBean> list) {
                this.list = list;
            }

            public static class SpreadBean {
                private String bannerimg;
                private String detailurl;
                private int spreadid;

                public static SpreadBean objectFromData(String str) {

                    return new Gson().fromJson(str, SpreadBean.class);
                }

                public static SpreadBean objectFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);

                        return new Gson().fromJson(jsonObject.getString(str), SpreadBean.class);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return null;
                }

                public static List<SpreadBean> arraySpreadBeanFromData(String str) {

                    Type listType = new TypeToken<ArrayList<SpreadBean>>() {
                    }.getType();

                    return new Gson().fromJson(str, listType);
                }

                public static List<SpreadBean> arraySpreadBeanFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);
                        Type listType = new TypeToken<ArrayList<SpreadBean>>() {
                        }.getType();

                        return new Gson().fromJson(jsonObject.getString(str), listType);

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return new ArrayList();


                }

                public String getBannerimg() {
                    return bannerimg;
                }

                public void setBannerimg(String bannerimg) {
                    this.bannerimg = bannerimg;
                }

                public String getDetailurl() {
                    return detailurl;
                }

                public void setDetailurl(String detailurl) {
                    this.detailurl = detailurl;
                }

                public int getSpreadid() {
                    return spreadid;
                }

                public void setSpreadid(int spreadid) {
                    this.spreadid = spreadid;
                }
            }

            public static class ListBean {
                private int id;
                private int productid;
                private String title;
                private String shorttitle;
                private String logo;
                private String price;
                private String fctprice;
                private String adinfo;
                private String murl;
                private int functionid;
                private int type;
                private String pvid;
                private int isoperation;

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

                public int getProductid() {
                    return productid;
                }

                public void setProductid(int productid) {
                    this.productid = productid;
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

                public String getLogo() {
                    return logo;
                }

                public void setLogo(String logo) {
                    this.logo = logo;
                }

                public String getPrice() {
                    return price;
                }

                public void setPrice(String price) {
                    this.price = price;
                }

                public String getFctprice() {
                    return fctprice;
                }

                public void setFctprice(String fctprice) {
                    this.fctprice = fctprice;
                }

                public String getAdinfo() {
                    return adinfo;
                }

                public void setAdinfo(String adinfo) {
                    this.adinfo = adinfo;
                }

                public String getMurl() {
                    return murl;
                }

                public void setMurl(String murl) {
                    this.murl = murl;
                }

                public int getFunctionid() {
                    return functionid;
                }

                public void setFunctionid(int functionid) {
                    this.functionid = functionid;
                }

                public int getType() {
                    return type;
                }

                public void setType(int type) {
                    this.type = type;
                }

                public String getPvid() {
                    return pvid;
                }

                public void setPvid(String pvid) {
                    this.pvid = pvid;
                }

                public int getIsoperation() {
                    return isoperation;
                }

                public void setIsoperation(int isoperation) {
                    this.isoperation = isoperation;
                }
            }
        }
    }
}
