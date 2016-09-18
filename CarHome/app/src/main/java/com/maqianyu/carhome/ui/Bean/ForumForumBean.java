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
public class ForumForumBean  {

    /**
     * pagecount : 4
     * rowcount : 29172
     * pageindex : 1
     * list : [{"topicid":56264796,"title":"真爱所以拥有，执着所以幸运\u2014\u2014与马自达结缘的心路历程","lastreplydate":"2016-09-18 11:32:14","postusername":"bj他他","replycounts":8,"ispictopic":1,"bbsid":3968,"bbsname":"马自达CX-4论坛","postdate":"2016-09-18 05:40:07"},{"topicid":56241868,"title":"GL价格曝光\u2026\u2026最新，不要太开心","lastreplydate":"2016-09-18 10:33:19","postusername":"vip371244317","replycounts":71,"ispictopic":1,"bbsid":4139,"bbsname":"帝豪GL论坛","postdate":"2016-09-17 12:00:29"},{"topicid":56252688,"title":"马自达兰州提车作业提交","lastreplydate":"2016-09-18 11:37:38","postusername":"ChristianoYoung","replycounts":8,"ispictopic":1,"bbsid":3968,"bbsname":"马自达CX-4论坛","postdate":"2016-09-17 18:22:29"},{"topicid":56245269,"title":"E300豪华版骚气红全款当日提车，更新驾驶感受及奔驰坑爹金融方案","lastreplydate":"2016-09-18 11:36:11","postusername":"好运998","replycounts":55,"ispictopic":1,"bbsid":197,"bbsname":"奔驰E级论坛","postdate":"2016-09-17 14:08:05"},{"topicid":56243715,"title":"提车日程进去倒计时篇，小三终于要回家了！","lastreplydate":"2016-09-18 09:28:12","postusername":"没事闹闹","replycounts":19,"ispictopic":1,"bbsid":3080,"bbsname":"瑞风S3论坛","postdate":"2016-09-17 13:09:17"},{"topicid":56251012,"title":"新E300L，轮胎过坑容易嗑破。","lastreplydate":"2016-09-18 11:39:04","postusername":"WJJ168_88","replycounts":76,"ispictopic":1,"bbsid":197,"bbsname":"奔驰E级论坛","postdate":"2016-09-17 17:23:51"},{"topicid":56260289,"title":"优雅的绅士 沃尔沃S90限量版全国首提","lastreplydate":"2016-09-18 11:41:55","postusername":"看车看了二十载","replycounts":23,"ispictopic":1,"bbsid":3861,"bbsname":"沃尔沃S90论坛","postdate":"2016-09-17 22:29:53"},{"topicid":56266788,"title":"17款 2.0豪华银  少图~~~~~~","lastreplydate":"2016-09-18 11:39:15","postusername":"miro米洛change","replycounts":15,"ispictopic":1,"bbsid":3154,"bbsname":"阿特兹论坛","postdate":"2016-09-18 08:54:05"},{"topicid":56246460,"title":"【申精】博越带我离开喧嚣的大都市寻找安静的大自然和免费渔场。","lastreplydate":"2016-09-18 11:37:53","postusername":"夯昆勥茓巭昇","replycounts":187,"ispictopic":1,"bbsid":3788,"bbsname":"博越论坛","postdate":"2016-09-17 14:51:44"},{"topicid":56253050,"title":"魂动之翼灯带上身，画面太美","lastreplydate":"2016-09-18 11:26:27","postusername":"YWZZ2011","replycounts":31,"ispictopic":1,"bbsid":3154,"bbsname":"阿特兹论坛","postdate":"2016-09-17 18:36:38"},{"topicid":56252846,"title":"江门首台2.5激情版提车记","lastreplydate":"2016-09-18 11:05:11","postusername":"多膠魚","replycounts":2,"ispictopic":1,"bbsid":3968,"bbsname":"马自达CX-4论坛","postdate":"2016-09-17 18:28:13"},{"topicid":56255670,"title":"忘了满足大家大早去偷拍.....做贼似的\u2026\u2026","lastreplydate":"2016-09-18 11:34:45","postusername":"gudulanlei1","replycounts":50,"ispictopic":1,"bbsid":4094,"bbsname":"传祺GS8论坛","postdate":"2016-09-17 20:13:54"},{"topicid":56246606,"title":"皇冠已经沦落到20多万了，哎","lastreplydate":"2016-09-18 11:37:03","postusername":"KOBEMVP1","replycounts":92,"ispictopic":1,"bbsid":882,"bbsname":"皇冠论坛","postdate":"2016-09-17 14:58:02"},{"topicid":56243594,"title":"多、多、多图实拍南充高坪帝豪GL实车到店，内有细节，一起分享","lastreplydate":"2016-09-18 11:39:45","postusername":"qj121161332","replycounts":101,"ispictopic":1,"bbsid":4139,"bbsname":"帝豪GL论坛","postdate":"2016-09-17 13:04:30"},{"topicid":56248316,"title":"月圆时节思忆秋 儿时回忆历历往【魔都俱乐部】","lastreplydate":"2016-09-18 11:28:00","postusername":"小子1浩天","replycounts":179,"ispictopic":1,"bbsid":3788,"bbsname":"博越论坛","postdate":"2016-09-17 15:57:18"},{"topicid":56245806,"title":"2018款福特撼路者改款照片","lastreplydate":"2016-09-18 10:49:00","postusername":"雨桐雨桐","replycounts":45,"ispictopic":1,"bbsid":3518,"bbsname":"撼路者论坛","postdate":"2016-09-17 14:28:07"},{"topicid":56252662,"title":"【品味白安装隐藏式行车记录仪+锁车一键升窗作业】","lastreplydate":"2016-09-18 10:37:20","postusername":"王者风范11111","replycounts":10,"ispictopic":1,"bbsid":3968,"bbsname":"马自达CX-4论坛","postdate":"2016-09-17 18:21:23"},{"topicid":56252244,"title":"GS撞上H7，希望车主没事","lastreplydate":"2016-09-18 11:37:09","postusername":"太自信","replycounts":196,"ispictopic":1,"bbsid":3465,"bbsname":"帝豪GS论坛","postdate":"2016-09-17 18:06:53"},{"topicid":56267712,"title":"阿特兹2017，1000公里使用感受","lastreplydate":"2016-09-18 11:36:25","postusername":"V_Hongyun","replycounts":11,"ispictopic":1,"bbsid":3154,"bbsname":"阿特兹论坛","postdate":"2016-09-18 09:28:45"},{"topicid":56241622,"title":"不忘初心，又一款良心之作","lastreplydate":"2016-09-18 10:38:13","postusername":"li2015V3","replycounts":42,"ispictopic":1,"bbsid":3080,"bbsname":"瑞风S3论坛","postdate":"2016-09-17 11:51:50"},{"topicid":56256219,"title":"终于等到你，还好我没放弃\u2014\u2014帕萨特3.0L V6旗舰版","lastreplydate":"2016-09-18 11:25:59","postusername":"YWZZ2011","replycounts":62,"ispictopic":1,"bbsid":528,"bbsname":"帕萨特论坛","postdate":"2016-09-17 20:32:04"},{"topicid":56254324,"title":"迈腾1.8T乞丐变顶配，瞬间觉的没必要买高配了，","lastreplydate":"2016-09-18 11:37:41","postusername":"chx9500","replycounts":102,"ispictopic":1,"bbsid":496,"bbsname":"迈腾论坛","postdate":"2016-09-17 19:26:29"},{"topicid":56243077,"title":"三代瑞风S3上市倒计时：3！","lastreplydate":"2016-09-18 09:39:35","postusername":"魔法小豆叮","replycounts":12,"ispictopic":1,"bbsid":3080,"bbsname":"瑞风S3论坛","postdate":"2016-09-17 12:45:49"},{"topicid":56242915,"title":"传祺GS8豪华智联版配置图","lastreplydate":"2016-09-18 09:45:03","postusername":"eaude","replycounts":47,"ispictopic":1,"bbsid":4094,"bbsname":"传祺GS8论坛","postdate":"2016-09-17 12:39:07"},{"topicid":56247768,"title":"少去外面按摩吧 血淋淋的教训啊 吓死了","lastreplydate":"2016-09-18 11:33:51","postusername":"L_ostz","replycounts":69,"ispictopic":1,"bbsid":100024,"bbsname":"上海论坛","postdate":"2016-09-17 15:39:09"},{"topicid":56249520,"title":"车祸现场","lastreplydate":"2016-09-18 11:20:21","postusername":"黑色订书机","replycounts":119,"ispictopic":1,"bbsid":3074,"bbsname":"哈弗H7论坛","postdate":"2016-09-17 16:35:42"},{"topicid":56246883,"title":"哈哈，到镇上玩居然看到有人开新款A4L，上图","lastreplydate":"2016-09-18 10:45:19","postusername":"新手开雅阁","replycounts":38,"ispictopic":1,"bbsid":692,"bbsname":"奥迪A4L论坛","postdate":"2016-09-17 15:08:15"},{"topicid":56249762,"title":"乔任梁去世，真的太悲剧了，住我隔壁小区","lastreplydate":"2016-09-18 11:41:37","postusername":"wishing1je","replycounts":132,"ispictopic":0,"bbsid":100024,"bbsname":"上海论坛","postdate":"2016-09-17 16:43:19"},{"topicid":56254145,"title":"新手求救！把车子开到一丁点油都不剩了，现在怎么办？","lastreplydate":"2016-09-18 11:40:47","postusername":"david_carol","replycounts":169,"ispictopic":1,"bbsid":100024,"bbsname":"上海论坛","postdate":"2016-09-17 19:19:19"},{"topicid":56249194,"title":"前方高能 GS8大片来（来了个GS8，多图，流量狗慎入）","lastreplydate":"2016-09-18 08:58:09","postusername":"Always0nline","replycounts":44,"ispictopic":1,"bbsid":4094,"bbsname":"传祺GS8论坛","postdate":"2016-09-17 16:25:31"},{"topicid":56258787,"title":"乐山地区新款到店，今天发现居然可以显示实时数字胎压","lastreplydate":"2016-09-18 10:22:02","postusername":"liushun","replycounts":19,"ispictopic":1,"bbsid":3000,"bbsname":"奔腾X80论坛","postdate":"2016-09-17 21:47:29"},{"topicid":56258564,"title":"提车第五天\u2014全车所有面严重划伤","lastreplydate":"2016-09-18 11:24:27","postusername":"jjpt123","replycounts":99,"ispictopic":1,"bbsid":3788,"bbsname":"博越论坛","postdate":"2016-09-17 21:41:24"},{"topicid":56247643,"title":"媳妇当车模，稀少真皮版提车作业","lastreplydate":"2016-09-18 11:41:42","postusername":"广汽大帝","replycounts":82,"ispictopic":1,"bbsid":3968,"bbsname":"马自达CX-4论坛","postdate":"2016-09-17 15:34:45"},{"topicid":56261605,"title":"创驰蓝天技术真的很省油啊！！！","lastreplydate":"2016-09-18 11:38:42","postusername":"lj419632","replycounts":39,"ispictopic":1,"bbsid":3154,"bbsname":"阿特兹论坛","postdate":"2016-09-17 23:10:52"},{"topicid":56264714,"title":"一场说走就走的撩妹之旅：型男为伴，烟雨江南。","lastreplydate":"2016-09-18 11:40:21","postusername":"jesonterry","replycounts":28,"ispictopic":1,"bbsid":3154,"bbsname":"阿特兹论坛","postdate":"2016-09-18 04:56:27"},{"topicid":56254372,"title":"高速6车追尾，我是第三辆！","lastreplydate":"2016-09-18 11:37:07","postusername":"今夜我来探探险","replycounts":170,"ispictopic":1,"bbsid":3862,"bbsname":"奔驰GLC论坛","postdate":"2016-09-17 19:28:09"},{"topicid":56242191,"title":"新E300豪华，成都，今天提车了","lastreplydate":"2016-09-18 10:41:03","postusername":"zhou55744326","replycounts":60,"ispictopic":1,"bbsid":197,"bbsname":"奔驰E级论坛","postdate":"2016-09-17 12:12:27"},{"topicid":56260211,"title":"【    碰 油 箱 的 车 主 终 于 给 出 了 说 法    】","lastreplydate":"2016-09-18 11:41:20","postusername":"马钱子2014","replycounts":228,"ispictopic":1,"bbsid":3788,"bbsname":"博越论坛","postdate":"2016-09-17 22:27:49"},{"topicid":56249905,"title":"毫无疑问，trk502是史上拥有最烂骑行三角的拉力车！","lastreplydate":"2016-09-18 11:25:27","postusername":"幻影150GP","replycounts":160,"ispictopic":1,"bbsid":200063,"bbsname":"摩托车论坛","postdate":"2016-09-17 16:48:01"},{"topicid":56241352,"title":"以色列财团停止注资","lastreplydate":"2016-09-18 10:59:57","postusername":"哈桑奇","replycounts":94,"ispictopic":0,"bbsid":3662,"bbsname":"观致5论坛","postdate":"2016-09-17 11:42:20"},{"topicid":56245025,"title":"优6时尚升级款提车半年，外观内饰小改作业！","lastreplydate":"2016-09-18 10:46:52","postusername":"唯一的幻灭","replycounts":36,"ispictopic":1,"bbsid":3293,"bbsname":"优6 SUV论坛","postdate":"2016-09-17 13:58:47"},{"topicid":56257021,"title":"8.19提回来的钢丝活力乞丐版","lastreplydate":"2016-09-18 10:54:14","postusername":"wenqi4859","replycounts":16,"ispictopic":1,"bbsid":3968,"bbsname":"马自达CX-4论坛","postdate":"2016-09-17 20:56:51"},{"topicid":56241550,"title":"【一个半月体验---心得分享---快乐人生，吉利相伴。哈哈！！！】","lastreplydate":"2016-09-18 11:13:09","postusername":"无边思雨1125","replycounts":172,"ispictopic":1,"bbsid":3788,"bbsname":"博越论坛","postdate":"2016-09-17 11:48:56"},{"topicid":56246967,"title":"开大G的玲，屏蔽我干嘛！","lastreplydate":"2016-09-18 11:24:31","postusername":"云中漫步1991","replycounts":110,"ispictopic":1,"bbsid":100024,"bbsname":"上海论坛","postdate":"2016-09-17 15:11:14"},{"topicid":56248805,"title":"哎，烦死了，一个随便乱说的短信被老婆看到了。。","lastreplydate":"2016-09-18 11:40:14","postusername":"hhdd9789","replycounts":150,"ispictopic":0,"bbsid":100024,"bbsname":"上海论坛","postdate":"2016-09-17 16:13:12"},{"topicid":56241977,"title":"S2车主看了三代S3，内饰印象深刻，配置20万级别水平","lastreplydate":"2016-09-18 11:23:44","postusername":"小时候最猛","replycounts":37,"ispictopic":1,"bbsid":3080,"bbsname":"瑞风S3论坛","postdate":"2016-09-17 12:05:02"},{"topicid":56254149,"title":"全国远景第一例自动变速箱故障，用生命在驾驶","lastreplydate":"2016-09-18 11:41:17","postusername":"b900293956","replycounts":150,"ispictopic":1,"bbsid":4133,"bbsname":"远景SUV论坛","postdate":"2016-09-17 19:19:30"},{"topicid":56243013,"title":"家庭新成员即将就位（第三代瑞风S3）","lastreplydate":"2016-09-18 10:44:16","postusername":"li2015V3","replycounts":17,"ispictopic":1,"bbsid":3080,"bbsname":"瑞风S3论坛","postdate":"2016-09-17 12:43:10"},{"topicid":56248738,"title":"做自己的女王大人。。。自己当车模！","lastreplydate":"2016-09-18 11:41:06","postusername":"2fulwin","replycounts":209,"ispictopic":1,"bbsid":3126,"bbsname":"YARiS L 致炫论坛","postdate":"2016-09-17 16:11:23"}]
     */

    private ResultBean result;
    /**
     * result : {"pagecount":4,"rowcount":29172,"pageindex":1,"list":[{"topicid":56264796,"title":"真爱所以拥有，执着所以幸运\u2014\u2014与马自达结缘的心路历程","lastreplydate":"2016-09-18 11:32:14","postusername":"bj他他","replycounts":8,"ispictopic":1,"bbsid":3968,"bbsname":"马自达CX-4论坛","postdate":"2016-09-18 05:40:07"},{"topicid":56241868,"title":"GL价格曝光\u2026\u2026最新，不要太开心","lastreplydate":"2016-09-18 10:33:19","postusername":"vip371244317","replycounts":71,"ispictopic":1,"bbsid":4139,"bbsname":"帝豪GL论坛","postdate":"2016-09-17 12:00:29"},{"topicid":56252688,"title":"马自达兰州提车作业提交","lastreplydate":"2016-09-18 11:37:38","postusername":"ChristianoYoung","replycounts":8,"ispictopic":1,"bbsid":3968,"bbsname":"马自达CX-4论坛","postdate":"2016-09-17 18:22:29"},{"topicid":56245269,"title":"E300豪华版骚气红全款当日提车，更新驾驶感受及奔驰坑爹金融方案","lastreplydate":"2016-09-18 11:36:11","postusername":"好运998","replycounts":55,"ispictopic":1,"bbsid":197,"bbsname":"奔驰E级论坛","postdate":"2016-09-17 14:08:05"},{"topicid":56243715,"title":"提车日程进去倒计时篇，小三终于要回家了！","lastreplydate":"2016-09-18 09:28:12","postusername":"没事闹闹","replycounts":19,"ispictopic":1,"bbsid":3080,"bbsname":"瑞风S3论坛","postdate":"2016-09-17 13:09:17"},{"topicid":56251012,"title":"新E300L，轮胎过坑容易嗑破。","lastreplydate":"2016-09-18 11:39:04","postusername":"WJJ168_88","replycounts":76,"ispictopic":1,"bbsid":197,"bbsname":"奔驰E级论坛","postdate":"2016-09-17 17:23:51"},{"topicid":56260289,"title":"优雅的绅士 沃尔沃S90限量版全国首提","lastreplydate":"2016-09-18 11:41:55","postusername":"看车看了二十载","replycounts":23,"ispictopic":1,"bbsid":3861,"bbsname":"沃尔沃S90论坛","postdate":"2016-09-17 22:29:53"},{"topicid":56266788,"title":"17款 2.0豪华银  少图~~~~~~","lastreplydate":"2016-09-18 11:39:15","postusername":"miro米洛change","replycounts":15,"ispictopic":1,"bbsid":3154,"bbsname":"阿特兹论坛","postdate":"2016-09-18 08:54:05"},{"topicid":56246460,"title":"【申精】博越带我离开喧嚣的大都市寻找安静的大自然和免费渔场。","lastreplydate":"2016-09-18 11:37:53","postusername":"夯昆勥茓巭昇","replycounts":187,"ispictopic":1,"bbsid":3788,"bbsname":"博越论坛","postdate":"2016-09-17 14:51:44"},{"topicid":56253050,"title":"魂动之翼灯带上身，画面太美","lastreplydate":"2016-09-18 11:26:27","postusername":"YWZZ2011","replycounts":31,"ispictopic":1,"bbsid":3154,"bbsname":"阿特兹论坛","postdate":"2016-09-17 18:36:38"},{"topicid":56252846,"title":"江门首台2.5激情版提车记","lastreplydate":"2016-09-18 11:05:11","postusername":"多膠魚","replycounts":2,"ispictopic":1,"bbsid":3968,"bbsname":"马自达CX-4论坛","postdate":"2016-09-17 18:28:13"},{"topicid":56255670,"title":"忘了满足大家大早去偷拍.....做贼似的\u2026\u2026","lastreplydate":"2016-09-18 11:34:45","postusername":"gudulanlei1","replycounts":50,"ispictopic":1,"bbsid":4094,"bbsname":"传祺GS8论坛","postdate":"2016-09-17 20:13:54"},{"topicid":56246606,"title":"皇冠已经沦落到20多万了，哎","lastreplydate":"2016-09-18 11:37:03","postusername":"KOBEMVP1","replycounts":92,"ispictopic":1,"bbsid":882,"bbsname":"皇冠论坛","postdate":"2016-09-17 14:58:02"},{"topicid":56243594,"title":"多、多、多图实拍南充高坪帝豪GL实车到店，内有细节，一起分享","lastreplydate":"2016-09-18 11:39:45","postusername":"qj121161332","replycounts":101,"ispictopic":1,"bbsid":4139,"bbsname":"帝豪GL论坛","postdate":"2016-09-17 13:04:30"},{"topicid":56248316,"title":"月圆时节思忆秋 儿时回忆历历往【魔都俱乐部】","lastreplydate":"2016-09-18 11:28:00","postusername":"小子1浩天","replycounts":179,"ispictopic":1,"bbsid":3788,"bbsname":"博越论坛","postdate":"2016-09-17 15:57:18"},{"topicid":56245806,"title":"2018款福特撼路者改款照片","lastreplydate":"2016-09-18 10:49:00","postusername":"雨桐雨桐","replycounts":45,"ispictopic":1,"bbsid":3518,"bbsname":"撼路者论坛","postdate":"2016-09-17 14:28:07"},{"topicid":56252662,"title":"【品味白安装隐藏式行车记录仪+锁车一键升窗作业】","lastreplydate":"2016-09-18 10:37:20","postusername":"王者风范11111","replycounts":10,"ispictopic":1,"bbsid":3968,"bbsname":"马自达CX-4论坛","postdate":"2016-09-17 18:21:23"},{"topicid":56252244,"title":"GS撞上H7，希望车主没事","lastreplydate":"2016-09-18 11:37:09","postusername":"太自信","replycounts":196,"ispictopic":1,"bbsid":3465,"bbsname":"帝豪GS论坛","postdate":"2016-09-17 18:06:53"},{"topicid":56267712,"title":"阿特兹2017，1000公里使用感受","lastreplydate":"2016-09-18 11:36:25","postusername":"V_Hongyun","replycounts":11,"ispictopic":1,"bbsid":3154,"bbsname":"阿特兹论坛","postdate":"2016-09-18 09:28:45"},{"topicid":56241622,"title":"不忘初心，又一款良心之作","lastreplydate":"2016-09-18 10:38:13","postusername":"li2015V3","replycounts":42,"ispictopic":1,"bbsid":3080,"bbsname":"瑞风S3论坛","postdate":"2016-09-17 11:51:50"},{"topicid":56256219,"title":"终于等到你，还好我没放弃\u2014\u2014帕萨特3.0L V6旗舰版","lastreplydate":"2016-09-18 11:25:59","postusername":"YWZZ2011","replycounts":62,"ispictopic":1,"bbsid":528,"bbsname":"帕萨特论坛","postdate":"2016-09-17 20:32:04"},{"topicid":56254324,"title":"迈腾1.8T乞丐变顶配，瞬间觉的没必要买高配了，","lastreplydate":"2016-09-18 11:37:41","postusername":"chx9500","replycounts":102,"ispictopic":1,"bbsid":496,"bbsname":"迈腾论坛","postdate":"2016-09-17 19:26:29"},{"topicid":56243077,"title":"三代瑞风S3上市倒计时：3！","lastreplydate":"2016-09-18 09:39:35","postusername":"魔法小豆叮","replycounts":12,"ispictopic":1,"bbsid":3080,"bbsname":"瑞风S3论坛","postdate":"2016-09-17 12:45:49"},{"topicid":56242915,"title":"传祺GS8豪华智联版配置图","lastreplydate":"2016-09-18 09:45:03","postusername":"eaude","replycounts":47,"ispictopic":1,"bbsid":4094,"bbsname":"传祺GS8论坛","postdate":"2016-09-17 12:39:07"},{"topicid":56247768,"title":"少去外面按摩吧 血淋淋的教训啊 吓死了","lastreplydate":"2016-09-18 11:33:51","postusername":"L_ostz","replycounts":69,"ispictopic":1,"bbsid":100024,"bbsname":"上海论坛","postdate":"2016-09-17 15:39:09"},{"topicid":56249520,"title":"车祸现场","lastreplydate":"2016-09-18 11:20:21","postusername":"黑色订书机","replycounts":119,"ispictopic":1,"bbsid":3074,"bbsname":"哈弗H7论坛","postdate":"2016-09-17 16:35:42"},{"topicid":56246883,"title":"哈哈，到镇上玩居然看到有人开新款A4L，上图","lastreplydate":"2016-09-18 10:45:19","postusername":"新手开雅阁","replycounts":38,"ispictopic":1,"bbsid":692,"bbsname":"奥迪A4L论坛","postdate":"2016-09-17 15:08:15"},{"topicid":56249762,"title":"乔任梁去世，真的太悲剧了，住我隔壁小区","lastreplydate":"2016-09-18 11:41:37","postusername":"wishing1je","replycounts":132,"ispictopic":0,"bbsid":100024,"bbsname":"上海论坛","postdate":"2016-09-17 16:43:19"},{"topicid":56254145,"title":"新手求救！把车子开到一丁点油都不剩了，现在怎么办？","lastreplydate":"2016-09-18 11:40:47","postusername":"david_carol","replycounts":169,"ispictopic":1,"bbsid":100024,"bbsname":"上海论坛","postdate":"2016-09-17 19:19:19"},{"topicid":56249194,"title":"前方高能 GS8大片来（来了个GS8，多图，流量狗慎入）","lastreplydate":"2016-09-18 08:58:09","postusername":"Always0nline","replycounts":44,"ispictopic":1,"bbsid":4094,"bbsname":"传祺GS8论坛","postdate":"2016-09-17 16:25:31"},{"topicid":56258787,"title":"乐山地区新款到店，今天发现居然可以显示实时数字胎压","lastreplydate":"2016-09-18 10:22:02","postusername":"liushun","replycounts":19,"ispictopic":1,"bbsid":3000,"bbsname":"奔腾X80论坛","postdate":"2016-09-17 21:47:29"},{"topicid":56258564,"title":"提车第五天\u2014全车所有面严重划伤","lastreplydate":"2016-09-18 11:24:27","postusername":"jjpt123","replycounts":99,"ispictopic":1,"bbsid":3788,"bbsname":"博越论坛","postdate":"2016-09-17 21:41:24"},{"topicid":56247643,"title":"媳妇当车模，稀少真皮版提车作业","lastreplydate":"2016-09-18 11:41:42","postusername":"广汽大帝","replycounts":82,"ispictopic":1,"bbsid":3968,"bbsname":"马自达CX-4论坛","postdate":"2016-09-17 15:34:45"},{"topicid":56261605,"title":"创驰蓝天技术真的很省油啊！！！","lastreplydate":"2016-09-18 11:38:42","postusername":"lj419632","replycounts":39,"ispictopic":1,"bbsid":3154,"bbsname":"阿特兹论坛","postdate":"2016-09-17 23:10:52"},{"topicid":56264714,"title":"一场说走就走的撩妹之旅：型男为伴，烟雨江南。","lastreplydate":"2016-09-18 11:40:21","postusername":"jesonterry","replycounts":28,"ispictopic":1,"bbsid":3154,"bbsname":"阿特兹论坛","postdate":"2016-09-18 04:56:27"},{"topicid":56254372,"title":"高速6车追尾，我是第三辆！","lastreplydate":"2016-09-18 11:37:07","postusername":"今夜我来探探险","replycounts":170,"ispictopic":1,"bbsid":3862,"bbsname":"奔驰GLC论坛","postdate":"2016-09-17 19:28:09"},{"topicid":56242191,"title":"新E300豪华，成都，今天提车了","lastreplydate":"2016-09-18 10:41:03","postusername":"zhou55744326","replycounts":60,"ispictopic":1,"bbsid":197,"bbsname":"奔驰E级论坛","postdate":"2016-09-17 12:12:27"},{"topicid":56260211,"title":"【    碰 油 箱 的 车 主 终 于 给 出 了 说 法    】","lastreplydate":"2016-09-18 11:41:20","postusername":"马钱子2014","replycounts":228,"ispictopic":1,"bbsid":3788,"bbsname":"博越论坛","postdate":"2016-09-17 22:27:49"},{"topicid":56249905,"title":"毫无疑问，trk502是史上拥有最烂骑行三角的拉力车！","lastreplydate":"2016-09-18 11:25:27","postusername":"幻影150GP","replycounts":160,"ispictopic":1,"bbsid":200063,"bbsname":"摩托车论坛","postdate":"2016-09-17 16:48:01"},{"topicid":56241352,"title":"以色列财团停止注资","lastreplydate":"2016-09-18 10:59:57","postusername":"哈桑奇","replycounts":94,"ispictopic":0,"bbsid":3662,"bbsname":"观致5论坛","postdate":"2016-09-17 11:42:20"},{"topicid":56245025,"title":"优6时尚升级款提车半年，外观内饰小改作业！","lastreplydate":"2016-09-18 10:46:52","postusername":"唯一的幻灭","replycounts":36,"ispictopic":1,"bbsid":3293,"bbsname":"优6 SUV论坛","postdate":"2016-09-17 13:58:47"},{"topicid":56257021,"title":"8.19提回来的钢丝活力乞丐版","lastreplydate":"2016-09-18 10:54:14","postusername":"wenqi4859","replycounts":16,"ispictopic":1,"bbsid":3968,"bbsname":"马自达CX-4论坛","postdate":"2016-09-17 20:56:51"},{"topicid":56241550,"title":"【一个半月体验---心得分享---快乐人生，吉利相伴。哈哈！！！】","lastreplydate":"2016-09-18 11:13:09","postusername":"无边思雨1125","replycounts":172,"ispictopic":1,"bbsid":3788,"bbsname":"博越论坛","postdate":"2016-09-17 11:48:56"},{"topicid":56246967,"title":"开大G的玲，屏蔽我干嘛！","lastreplydate":"2016-09-18 11:24:31","postusername":"云中漫步1991","replycounts":110,"ispictopic":1,"bbsid":100024,"bbsname":"上海论坛","postdate":"2016-09-17 15:11:14"},{"topicid":56248805,"title":"哎，烦死了，一个随便乱说的短信被老婆看到了。。","lastreplydate":"2016-09-18 11:40:14","postusername":"hhdd9789","replycounts":150,"ispictopic":0,"bbsid":100024,"bbsname":"上海论坛","postdate":"2016-09-17 16:13:12"},{"topicid":56241977,"title":"S2车主看了三代S3，内饰印象深刻，配置20万级别水平","lastreplydate":"2016-09-18 11:23:44","postusername":"小时候最猛","replycounts":37,"ispictopic":1,"bbsid":3080,"bbsname":"瑞风S3论坛","postdate":"2016-09-17 12:05:02"},{"topicid":56254149,"title":"全国远景第一例自动变速箱故障，用生命在驾驶","lastreplydate":"2016-09-18 11:41:17","postusername":"b900293956","replycounts":150,"ispictopic":1,"bbsid":4133,"bbsname":"远景SUV论坛","postdate":"2016-09-17 19:19:30"},{"topicid":56243013,"title":"家庭新成员即将就位（第三代瑞风S3）","lastreplydate":"2016-09-18 10:44:16","postusername":"li2015V3","replycounts":17,"ispictopic":1,"bbsid":3080,"bbsname":"瑞风S3论坛","postdate":"2016-09-17 12:43:10"},{"topicid":56248738,"title":"做自己的女王大人。。。自己当车模！","lastreplydate":"2016-09-18 11:41:06","postusername":"2fulwin","replycounts":209,"ispictopic":1,"bbsid":3126,"bbsname":"YARiS L 致炫论坛","postdate":"2016-09-17 16:11:23"}]}
     * returncode : 0
     * message :
     */

    private int returncode;
    private String message;

    public static ForumForumBean objectFromData(String str) {

        return new Gson().fromJson(str, ForumForumBean.class);
    }

    public static ForumForumBean objectFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);

            return new Gson().fromJson(jsonObject.getString(str), ForumForumBean.class);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static List<ForumForumBean> arrayForumForumBeanFromData(String str) {

        Type listType = new TypeToken<ArrayList<ForumForumBean>>() {
        }.getType();

        return new Gson().fromJson(str, listType);
    }

    public static List<ForumForumBean> arrayForumForumBeanFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);
            Type listType = new TypeToken<ArrayList<ForumForumBean>>() {
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
        private int pagecount;
        private int rowcount;
        private int pageindex;
        /**
         * topicid : 56264796
         * title : 真爱所以拥有，执着所以幸运——与马自达结缘的心路历程
         * lastreplydate : 2016-09-18 11:32:14
         * postusername : bj他他
         * replycounts : 8
         * ispictopic : 1
         * bbsid : 3968
         * bbsname : 马自达CX-4论坛
         * postdate : 2016-09-18 05:40:07
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

        public int getPagecount() {
            return pagecount;
        }

        public void setPagecount(int pagecount) {
            this.pagecount = pagecount;
        }

        public int getRowcount() {
            return rowcount;
        }

        public void setRowcount(int rowcount) {
            this.rowcount = rowcount;
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
            private int topicid;
            private String title;
            private String lastreplydate;
            private String postusername;
            private int replycounts;
            private int ispictopic;
            private int bbsid;
            private String bbsname;
            private String postdate;

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

            public int getTopicid() {
                return topicid;
            }

            public void setTopicid(int topicid) {
                this.topicid = topicid;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getLastreplydate() {
                return lastreplydate;
            }

            public void setLastreplydate(String lastreplydate) {
                this.lastreplydate = lastreplydate;
            }

            public String getPostusername() {
                return postusername;
            }

            public void setPostusername(String postusername) {
                this.postusername = postusername;
            }

            public int getReplycounts() {
                return replycounts;
            }

            public void setReplycounts(int replycounts) {
                this.replycounts = replycounts;
            }

            public int getIspictopic() {
                return ispictopic;
            }

            public void setIspictopic(int ispictopic) {
                this.ispictopic = ispictopic;
            }

            public int getBbsid() {
                return bbsid;
            }

            public void setBbsid(int bbsid) {
                this.bbsid = bbsid;
            }

            public String getBbsname() {
                return bbsname;
            }

            public void setBbsname(String bbsname) {
                this.bbsname = bbsname;
            }

            public String getPostdate() {
                return postdate;
            }

            public void setPostdate(String postdate) {
                this.postdate = postdate;
            }
        }
    }
}
