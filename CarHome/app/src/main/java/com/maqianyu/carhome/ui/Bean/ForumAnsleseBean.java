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
public class ForumAnsleseBean {

    /**
     * message :
     * returncode : 0
     * result : {"pageindex":1,"pagecount":2647,"rowcount":52939,"list":[{"topicid":55754217,"title":"活出自我滋味 奔驰CLA 220购车心路","lastreplydate":"47秒前","postusername":"marswind16","replycounts":94,"isclosed":0,"bigpic":"","smallpic":"http://club2.autoimg.cn/album/g14/M09/30/E0/userphotos/2016/09/08/11/240180_wKgH5FfQ1fWAdRdJAAEdOQIxEiw600.jpg","topictype":"精","views":41234,"postmemberid":0,"imgurl":"","bbsid":2966,"bbstype":"c","bbsname":"汇买车16430季"},{"topicid":54572668,"title":"可谓不虚此行 乌兰布统露营自驾游","lastreplydate":"12分钟前","postusername":"loto169","replycounts":42,"isclosed":0,"bigpic":"","smallpic":"http://club2.autoimg.cn/album/g19/M12/BD/2B/userphotos/2016/07/25/09/240180_wKgFWFeVbh-AcaphAAEnbyBgjkA160.jpg","topictype":"精","views":9096,"postmemberid":0,"imgurl":"","bbsid":3411,"bbstype":"c","bbsname":"华北游记1177季"},{"topicid":52707786,"title":"外观太惊艳 昂克赛拉1.5L用车分享","lastreplydate":"3分钟前","postusername":"肥仔食同学","replycounts":179,"isclosed":0,"bigpic":"","smallpic":"http://club2.autoimg.cn/album/g15/M03/89/4A/userphotos/2016/05/23/16/240180_wKjByFdCu82AHqpOAAEh7A3JimI449.jpg","topictype":"精","views":35349,"postmemberid":0,"imgurl":"","bbsid":3294,"bbstype":"c","bbsname":"行车点评6505季"},{"topicid":55002236,"title":"跑高速真心爽 艾瑞泽7 1.5T选购记","lastreplydate":"2分钟前","postusername":"ltt38139785","replycounts":60,"isclosed":0,"bigpic":"","smallpic":"http://club2.autoimg.cn/album/g12/M0D/F7/EC/userphotos/2016/08/11/10/240180_wKjBy1er40yAYkClAAElbu9cV8Y601.jpg","topictype":"精","views":17565,"postmemberid":0,"imgurl":"","bbsid":2980,"bbstype":"c","bbsname":"汇买车16429季"},{"topicid":54182789,"title":"空间大动力足 哈弗H6 1.5T购车始末","lastreplydate":"9分钟前","postusername":"蜻蜓飞2013","replycounts":125,"isclosed":0,"bigpic":"","smallpic":"http://club2.autoimg.cn/album/g13/M05/CD/30/userphotos/2016/07/12/11/240180_wKgH41eEZN-AOUplAAEbV0HR-vY179.jpg","topictype":"精","views":21915,"postmemberid":0,"imgurl":"","bbsid":2123,"bbstype":"c","bbsname":"汇买车16428季"},{"topicid":53086850,"title":"动力源源不断 博越1.8TD购车心路","lastreplydate":"1分钟前","postusername":"werad0","replycounts":106,"isclosed":0,"bigpic":"","smallpic":"http://club2.autoimg.cn/album/g20/M01/7C/87/userphotos/2016/06/05/11/240180_wKgFVFdToYKAfTn0AAEddGhOGUo172.jpg","topictype":"精","views":35966,"postmemberid":0,"imgurl":"","bbsid":3788,"bbstype":"c","bbsname":"汇买车16427季"},{"topicid":54157239,"title":"里坊制度活化石 福州夜巡三坊七巷","lastreplydate":"23分钟前","postusername":"zhairain","replycounts":100,"isclosed":0,"bigpic":"","smallpic":"http://club2.autoimg.cn/album/g15/M06/CC/2B/userphotos/2016/07/11/13/240180_wKjByFeDNQOAYM09AAEeFwg_nRo966.jpg","topictype":"精","views":2062,"postmemberid":0,"imgurl":"","bbsid":3618,"bbstype":"c","bbsname":"华南游记725季"},{"topicid":55442541,"title":"血脉喷张的体验 喜提丰田RAV4荣放","lastreplydate":"4分钟前","postusername":"小猫旺财","replycounts":254,"isclosed":0,"bigpic":"","smallpic":"http://club2.autoimg.cn/album/g16/M0A/1E/4A/userphotos/2016/08/28/12/240180_wKgH5lfCZjGAXyl3AAE6-9CT8K8947.jpg","topictype":"精","views":58138,"postmemberid":0,"imgurl":"","bbsid":770,"bbstype":"c","bbsname":"顶配风采615季"},{"topicid":55950568,"title":"告别风吹雨淋 远景SUV 1.8L提车记","lastreplydate":"20分钟前","postusername":"幻想Logo","replycounts":96,"isclosed":0,"bigpic":"","smallpic":"http://club2.autoimg.cn/album/g22/M15/29/26/userphotos/2016/09/15/22/240180_wKgFW1farG2AFuBYAAEvSOBE2nI499.jpg","topictype":"精","views":21583,"postmemberid":0,"imgurl":"","bbsid":4133,"bbstype":"c","bbsname":"汇买车16426季"},{"topicid":54513443,"title":"不后悔的选择 提瑞虎3 1.6L智尚版","lastreplydate":"1分钟前","postusername":"东北汉子在合肥","replycounts":38,"isclosed":0,"bigpic":"","smallpic":"http://club2.autoimg.cn/album/g12/M08/DB/F4/userphotos/2016/07/23/20/240180_wKjBy1eTZwiAZBsjAAE0hD0Fff8010.jpg","topictype":"精","views":7394,"postmemberid":0,"imgurl":"","bbsid":3397,"bbstype":"c","bbsname":"汇买车16425季"},{"topicid":55412147,"title":"发动机舱简单粗暴 Amarok用车浅谈","lastreplydate":"19分钟前","postusername":"先生知不道","replycounts":32,"isclosed":0,"bigpic":"","smallpic":"http://club2.autoimg.cn/album/g12/M05/18/95/userphotos/2016/08/26/10/240180_wKgH4le_sHyAJmjuAAE8Wcqg6fo477.jpg","topictype":"精","views":20940,"postmemberid":0,"imgurl":"","bbsid":2380,"bbstype":"c","bbsname":"海外购车1133季"},{"topicid":54222915,"title":"三十而立不容易 坚定所爱提威朗15S","lastreplydate":"30分钟前","postusername":"圣子到kjh","replycounts":41,"isclosed":0,"bigpic":"","smallpic":"http://club2.autoimg.cn/album/g16/M08/CD/FC/userphotos/2016/07/13/15/240180_wKgH5leF7PiAYfUiAAEYxPXTtlU074.jpg","topictype":"精","views":12717,"postmemberid":0,"imgurl":"","bbsid":3751,"bbstype":"c","bbsname":"汇买车16424季"},{"topicid":54826834,"title":"自己动手乐趣多 赛欧3 1.5L打蜡记","lastreplydate":"2小时前","postusername":"zmlonger1","replycounts":17,"isclosed":0,"bigpic":"","smallpic":"http://club2.autoimg.cn/album/g16/M00/EB/E6/userphotos/2016/08/04/16/240180_wKgH11ei_qCAEZ0EAAEcP6i9rzs516.jpg","topictype":"精","views":2666,"postmemberid":0,"imgurl":"","bbsid":163,"bbstype":"c","bbsname":"养车有道1034季"},{"topicid":55507351,"title":"拥有强劲的体魄 牧马人车模型展示","lastreplydate":"3分钟前","postusername":"逍遥游78","replycounts":27,"isclosed":0,"bigpic":"","smallpic":"http://club2.autoimg.cn/album/g5/M15/21/D8/userphotos/2016/08/30/15/240180_wKgHzFfFOhqAAUnMAAEydyp6GFw075.jpg","topictype":"精","views":5682,"postmemberid":0,"imgurl":"","bbsid":200203,"bbstype":"o","bbsname":"杂谈俱乐部857季"},{"topicid":54674279,"title":"爱车配豪牌 艾瑞泽5 1.5L购车分享","lastreplydate":"18分钟前","postusername":"8023熊猫","replycounts":455,"isclosed":0,"bigpic":"","smallpic":"http://club2.autoimg.cn/album/g23/M0A/C2/6B/userphotos/2016/07/28/16/240180_wKgFXFeZxJKAWNMaAAEbVm3uKSA552.jpg","topictype":"精","views":115877,"postmemberid":0,"imgurl":"","bbsid":3405,"bbstype":"c","bbsname":"汇买车16423季"},{"topicid":55759139,"title":"多口之家之选 气质媳妇助阵华颂7","lastreplydate":"3分钟前","postusername":"沈阳_大海","replycounts":143,"isclosed":0,"bigpic":"","smallpic":"http://club2.autoimg.cn/album/g12/M14/33/4C/userphotos/2016/09/08/13/240180_wKgH4lfQ_haASWc6AAE-F3myZk4828.jpg","topictype":"精","views":87588,"postmemberid":0,"imgurl":"","bbsid":3607,"bbstype":"c","bbsname":"媳妇当车模789季"},{"topicid":55272380,"title":"人生第一台车 宝骏730 1.5T购置记","lastreplydate":"2周前","postusername":"大王x叫我来巡山","replycounts":106,"isclosed":0,"bigpic":"","smallpic":"http://club2.autoimg.cn/album/g5/M0C/0D/1F/userphotos/2016/08/22/10/240180_wKgH21e6Y5WANnkEAAFBvEUayrM946.jpg","topictype":"精","views":8586,"postmemberid":0,"imgurl":"","bbsid":3412,"bbstype":"c","bbsname":"汇买车16422季"},{"topicid":54514881,"title":"躲避夏日的阳光 逸动DIY装遮阳窗帘","lastreplydate":"1小时前","postusername":"liuqin6507","replycounts":30,"isclosed":0,"bigpic":"","smallpic":"http://club2.autoimg.cn/album/g20/M0F/BB/D3/userphotos/2016/07/23/23/240180_wKgFWVeTh3aAD-xRAAE0-H48ruk795.jpg","topictype":"精","views":3365,"postmemberid":0,"imgurl":"","bbsid":2429,"bbstype":"c","bbsname":"改装有理1726季"},{"topicid":54301295,"title":"金色琉璃朱红宫墙 故宫拍摄三大殿","lastreplydate":"26分钟前","postusername":"lichanglai","replycounts":28,"isclosed":0,"bigpic":"","smallpic":"http://club2.autoimg.cn/album/g15/M00/D2/42/userphotos/2016/07/16/11/240180_wKjByFeJp8GAIDfsAAEwyHhjUuw450.jpg","topictype":"精","views":1235,"postmemberid":0,"imgurl":"","bbsid":482,"bbstype":"c","bbsname":"华北游记1176季"},{"topicid":55909212,"title":"惊艳的大空间 高尔夫·嘉旅选用心得","lastreplydate":"41分钟前","postusername":"冰镇_雪碧","replycounts":109,"isclosed":0,"bigpic":"","smallpic":"http://club2.autoimg.cn/album/g12/M10/42/5D/userphotos/2016/09/14/09/240180_wKgH4lfYq66AaDVSAAE3h9aD4qE594.jpg","topictype":"精","views":13708,"postmemberid":0,"imgurl":"","bbsid":3964,"bbstype":"c","bbsname":"行车点评6504季"}]}
     */

    private String message;
    private int returncode;
    /**
     * pageindex : 1
     * pagecount : 2647
     * rowcount : 52939
     * list : [{"topicid":55754217,"title":"活出自我滋味 奔驰CLA 220购车心路","lastreplydate":"47秒前","postusername":"marswind16","replycounts":94,"isclosed":0,"bigpic":"","smallpic":"http://club2.autoimg.cn/album/g14/M09/30/E0/userphotos/2016/09/08/11/240180_wKgH5FfQ1fWAdRdJAAEdOQIxEiw600.jpg","topictype":"精","views":41234,"postmemberid":0,"imgurl":"","bbsid":2966,"bbstype":"c","bbsname":"汇买车16430季"},{"topicid":54572668,"title":"可谓不虚此行 乌兰布统露营自驾游","lastreplydate":"12分钟前","postusername":"loto169","replycounts":42,"isclosed":0,"bigpic":"","smallpic":"http://club2.autoimg.cn/album/g19/M12/BD/2B/userphotos/2016/07/25/09/240180_wKgFWFeVbh-AcaphAAEnbyBgjkA160.jpg","topictype":"精","views":9096,"postmemberid":0,"imgurl":"","bbsid":3411,"bbstype":"c","bbsname":"华北游记1177季"},{"topicid":52707786,"title":"外观太惊艳 昂克赛拉1.5L用车分享","lastreplydate":"3分钟前","postusername":"肥仔食同学","replycounts":179,"isclosed":0,"bigpic":"","smallpic":"http://club2.autoimg.cn/album/g15/M03/89/4A/userphotos/2016/05/23/16/240180_wKjByFdCu82AHqpOAAEh7A3JimI449.jpg","topictype":"精","views":35349,"postmemberid":0,"imgurl":"","bbsid":3294,"bbstype":"c","bbsname":"行车点评6505季"},{"topicid":55002236,"title":"跑高速真心爽 艾瑞泽7 1.5T选购记","lastreplydate":"2分钟前","postusername":"ltt38139785","replycounts":60,"isclosed":0,"bigpic":"","smallpic":"http://club2.autoimg.cn/album/g12/M0D/F7/EC/userphotos/2016/08/11/10/240180_wKjBy1er40yAYkClAAElbu9cV8Y601.jpg","topictype":"精","views":17565,"postmemberid":0,"imgurl":"","bbsid":2980,"bbstype":"c","bbsname":"汇买车16429季"},{"topicid":54182789,"title":"空间大动力足 哈弗H6 1.5T购车始末","lastreplydate":"9分钟前","postusername":"蜻蜓飞2013","replycounts":125,"isclosed":0,"bigpic":"","smallpic":"http://club2.autoimg.cn/album/g13/M05/CD/30/userphotos/2016/07/12/11/240180_wKgH41eEZN-AOUplAAEbV0HR-vY179.jpg","topictype":"精","views":21915,"postmemberid":0,"imgurl":"","bbsid":2123,"bbstype":"c","bbsname":"汇买车16428季"},{"topicid":53086850,"title":"动力源源不断 博越1.8TD购车心路","lastreplydate":"1分钟前","postusername":"werad0","replycounts":106,"isclosed":0,"bigpic":"","smallpic":"http://club2.autoimg.cn/album/g20/M01/7C/87/userphotos/2016/06/05/11/240180_wKgFVFdToYKAfTn0AAEddGhOGUo172.jpg","topictype":"精","views":35966,"postmemberid":0,"imgurl":"","bbsid":3788,"bbstype":"c","bbsname":"汇买车16427季"},{"topicid":54157239,"title":"里坊制度活化石 福州夜巡三坊七巷","lastreplydate":"23分钟前","postusername":"zhairain","replycounts":100,"isclosed":0,"bigpic":"","smallpic":"http://club2.autoimg.cn/album/g15/M06/CC/2B/userphotos/2016/07/11/13/240180_wKjByFeDNQOAYM09AAEeFwg_nRo966.jpg","topictype":"精","views":2062,"postmemberid":0,"imgurl":"","bbsid":3618,"bbstype":"c","bbsname":"华南游记725季"},{"topicid":55442541,"title":"血脉喷张的体验 喜提丰田RAV4荣放","lastreplydate":"4分钟前","postusername":"小猫旺财","replycounts":254,"isclosed":0,"bigpic":"","smallpic":"http://club2.autoimg.cn/album/g16/M0A/1E/4A/userphotos/2016/08/28/12/240180_wKgH5lfCZjGAXyl3AAE6-9CT8K8947.jpg","topictype":"精","views":58138,"postmemberid":0,"imgurl":"","bbsid":770,"bbstype":"c","bbsname":"顶配风采615季"},{"topicid":55950568,"title":"告别风吹雨淋 远景SUV 1.8L提车记","lastreplydate":"20分钟前","postusername":"幻想Logo","replycounts":96,"isclosed":0,"bigpic":"","smallpic":"http://club2.autoimg.cn/album/g22/M15/29/26/userphotos/2016/09/15/22/240180_wKgFW1farG2AFuBYAAEvSOBE2nI499.jpg","topictype":"精","views":21583,"postmemberid":0,"imgurl":"","bbsid":4133,"bbstype":"c","bbsname":"汇买车16426季"},{"topicid":54513443,"title":"不后悔的选择 提瑞虎3 1.6L智尚版","lastreplydate":"1分钟前","postusername":"东北汉子在合肥","replycounts":38,"isclosed":0,"bigpic":"","smallpic":"http://club2.autoimg.cn/album/g12/M08/DB/F4/userphotos/2016/07/23/20/240180_wKjBy1eTZwiAZBsjAAE0hD0Fff8010.jpg","topictype":"精","views":7394,"postmemberid":0,"imgurl":"","bbsid":3397,"bbstype":"c","bbsname":"汇买车16425季"},{"topicid":55412147,"title":"发动机舱简单粗暴 Amarok用车浅谈","lastreplydate":"19分钟前","postusername":"先生知不道","replycounts":32,"isclosed":0,"bigpic":"","smallpic":"http://club2.autoimg.cn/album/g12/M05/18/95/userphotos/2016/08/26/10/240180_wKgH4le_sHyAJmjuAAE8Wcqg6fo477.jpg","topictype":"精","views":20940,"postmemberid":0,"imgurl":"","bbsid":2380,"bbstype":"c","bbsname":"海外购车1133季"},{"topicid":54222915,"title":"三十而立不容易 坚定所爱提威朗15S","lastreplydate":"30分钟前","postusername":"圣子到kjh","replycounts":41,"isclosed":0,"bigpic":"","smallpic":"http://club2.autoimg.cn/album/g16/M08/CD/FC/userphotos/2016/07/13/15/240180_wKgH5leF7PiAYfUiAAEYxPXTtlU074.jpg","topictype":"精","views":12717,"postmemberid":0,"imgurl":"","bbsid":3751,"bbstype":"c","bbsname":"汇买车16424季"},{"topicid":54826834,"title":"自己动手乐趣多 赛欧3 1.5L打蜡记","lastreplydate":"2小时前","postusername":"zmlonger1","replycounts":17,"isclosed":0,"bigpic":"","smallpic":"http://club2.autoimg.cn/album/g16/M00/EB/E6/userphotos/2016/08/04/16/240180_wKgH11ei_qCAEZ0EAAEcP6i9rzs516.jpg","topictype":"精","views":2666,"postmemberid":0,"imgurl":"","bbsid":163,"bbstype":"c","bbsname":"养车有道1034季"},{"topicid":55507351,"title":"拥有强劲的体魄 牧马人车模型展示","lastreplydate":"3分钟前","postusername":"逍遥游78","replycounts":27,"isclosed":0,"bigpic":"","smallpic":"http://club2.autoimg.cn/album/g5/M15/21/D8/userphotos/2016/08/30/15/240180_wKgHzFfFOhqAAUnMAAEydyp6GFw075.jpg","topictype":"精","views":5682,"postmemberid":0,"imgurl":"","bbsid":200203,"bbstype":"o","bbsname":"杂谈俱乐部857季"},{"topicid":54674279,"title":"爱车配豪牌 艾瑞泽5 1.5L购车分享","lastreplydate":"18分钟前","postusername":"8023熊猫","replycounts":455,"isclosed":0,"bigpic":"","smallpic":"http://club2.autoimg.cn/album/g23/M0A/C2/6B/userphotos/2016/07/28/16/240180_wKgFXFeZxJKAWNMaAAEbVm3uKSA552.jpg","topictype":"精","views":115877,"postmemberid":0,"imgurl":"","bbsid":3405,"bbstype":"c","bbsname":"汇买车16423季"},{"topicid":55759139,"title":"多口之家之选 气质媳妇助阵华颂7","lastreplydate":"3分钟前","postusername":"沈阳_大海","replycounts":143,"isclosed":0,"bigpic":"","smallpic":"http://club2.autoimg.cn/album/g12/M14/33/4C/userphotos/2016/09/08/13/240180_wKgH4lfQ_haASWc6AAE-F3myZk4828.jpg","topictype":"精","views":87588,"postmemberid":0,"imgurl":"","bbsid":3607,"bbstype":"c","bbsname":"媳妇当车模789季"},{"topicid":55272380,"title":"人生第一台车 宝骏730 1.5T购置记","lastreplydate":"2周前","postusername":"大王x叫我来巡山","replycounts":106,"isclosed":0,"bigpic":"","smallpic":"http://club2.autoimg.cn/album/g5/M0C/0D/1F/userphotos/2016/08/22/10/240180_wKgH21e6Y5WANnkEAAFBvEUayrM946.jpg","topictype":"精","views":8586,"postmemberid":0,"imgurl":"","bbsid":3412,"bbstype":"c","bbsname":"汇买车16422季"},{"topicid":54514881,"title":"躲避夏日的阳光 逸动DIY装遮阳窗帘","lastreplydate":"1小时前","postusername":"liuqin6507","replycounts":30,"isclosed":0,"bigpic":"","smallpic":"http://club2.autoimg.cn/album/g20/M0F/BB/D3/userphotos/2016/07/23/23/240180_wKgFWVeTh3aAD-xRAAE0-H48ruk795.jpg","topictype":"精","views":3365,"postmemberid":0,"imgurl":"","bbsid":2429,"bbstype":"c","bbsname":"改装有理1726季"},{"topicid":54301295,"title":"金色琉璃朱红宫墙 故宫拍摄三大殿","lastreplydate":"26分钟前","postusername":"lichanglai","replycounts":28,"isclosed":0,"bigpic":"","smallpic":"http://club2.autoimg.cn/album/g15/M00/D2/42/userphotos/2016/07/16/11/240180_wKjByFeJp8GAIDfsAAEwyHhjUuw450.jpg","topictype":"精","views":1235,"postmemberid":0,"imgurl":"","bbsid":482,"bbstype":"c","bbsname":"华北游记1176季"},{"topicid":55909212,"title":"惊艳的大空间 高尔夫·嘉旅选用心得","lastreplydate":"41分钟前","postusername":"冰镇_雪碧","replycounts":109,"isclosed":0,"bigpic":"","smallpic":"http://club2.autoimg.cn/album/g12/M10/42/5D/userphotos/2016/09/14/09/240180_wKgH4lfYq66AaDVSAAE3h9aD4qE594.jpg","topictype":"精","views":13708,"postmemberid":0,"imgurl":"","bbsid":3964,"bbstype":"c","bbsname":"行车点评6504季"}]
     */

    private ResultBean result;

    public static ForumAnsleseBean objectFromData(String str) {

        return new Gson().fromJson(str, ForumAnsleseBean.class);
    }

    public static ForumAnsleseBean objectFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);

            return new Gson().fromJson(jsonObject.getString(str), ForumAnsleseBean.class);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static List<ForumAnsleseBean> arrayForumAnsleseBeanFromData(String str) {

        Type listType = new TypeToken<ArrayList<ForumAnsleseBean>>() {
        }.getType();

        return new Gson().fromJson(str, listType);
    }

    public static List<ForumAnsleseBean> arrayForumAnsleseBeanFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);
            Type listType = new TypeToken<ArrayList<ForumAnsleseBean>>() {
            }.getType();

            return new Gson().fromJson(jsonObject.getString(str), listType);

        } catch (JSONException e) {
            e.printStackTrace();
        }

        return new ArrayList();


    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getReturncode() {
        return returncode;
    }

    public void setReturncode(int returncode) {
        this.returncode = returncode;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        private int pageindex;
        private int pagecount;
        private int rowcount;
        /**
         * topicid : 55754217
         * title : 活出自我滋味 奔驰CLA 220购车心路
         * lastreplydate : 47秒前
         * postusername : marswind16
         * replycounts : 94
         * isclosed : 0
         * bigpic :
         * smallpic : http://club2.autoimg.cn/album/g14/M09/30/E0/userphotos/2016/09/08/11/240180_wKgH5FfQ1fWAdRdJAAEdOQIxEiw600.jpg
         * topictype : 精
         * views : 41234
         * postmemberid : 0
         * imgurl :
         * bbsid : 2966
         * bbstype : c
         * bbsname : 汇买车16430季
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

        public int getPageindex() {
            return pageindex;
        }

        public void setPageindex(int pageindex) {
            this.pageindex = pageindex;
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
            private int isclosed;
            private String bigpic;
            private String smallpic;
            private String topictype;
            private int views;
            private int postmemberid;
            private String imgurl;
            private int bbsid;
            private String bbstype;
            private String bbsname;

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

            public int getIsclosed() {
                return isclosed;
            }

            public void setIsclosed(int isclosed) {
                this.isclosed = isclosed;
            }

            public String getBigpic() {
                return bigpic;
            }

            public void setBigpic(String bigpic) {
                this.bigpic = bigpic;
            }

            public String getSmallpic() {
                return smallpic;
            }

            public void setSmallpic(String smallpic) {
                this.smallpic = smallpic;
            }

            public String getTopictype() {
                return topictype;
            }

            public void setTopictype(String topictype) {
                this.topictype = topictype;
            }

            public int getViews() {
                return views;
            }

            public void setViews(int views) {
                this.views = views;
            }

            public int getPostmemberid() {
                return postmemberid;
            }

            public void setPostmemberid(int postmemberid) {
                this.postmemberid = postmemberid;
            }

            public String getImgurl() {
                return imgurl;
            }

            public void setImgurl(String imgurl) {
                this.imgurl = imgurl;
            }

            public int getBbsid() {
                return bbsid;
            }

            public void setBbsid(int bbsid) {
                this.bbsid = bbsid;
            }

            public String getBbstype() {
                return bbstype;
            }

            public void setBbstype(String bbstype) {
                this.bbstype = bbstype;
            }

            public String getBbsname() {
                return bbsname;
            }

            public void setBbsname(String bbsname) {
                this.bbsname = bbsname;
            }
        }
    }
}
