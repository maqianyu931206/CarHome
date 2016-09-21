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
 * 快报详情实体类
 */
public class ArticleLetterInfoBean {

    private ResultBean result;

    private int returncode;
    private String message;

    public static ArticleLetterInfoBean objectFromData(String str) {

        return new Gson().fromJson(str, ArticleLetterInfoBean.class);
    }

    public static ArticleLetterInfoBean objectFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);

            return new Gson().fromJson(jsonObject.getString(str), ArticleLetterInfoBean.class);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static List<ArticleLetterInfoBean> arrayArticleLetterInfoBeanFromData(String str) {

        Type listType = new TypeToken<ArrayList<ArticleLetterInfoBean>>() {
        }.getType();

        return new Gson().fromJson(str, listType);
    }

    public static List<ArticleLetterInfoBean> arrayArticleLetterInfoBeanFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);
            Type listType = new TypeToken<ArrayList<ArticleLetterInfoBean>>() {
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
        private int rowcount;
        private boolean isloadmore;

        private NewsdataBean newsdata;
        private boolean canedit;

        public boolean isloadmore() {
            return isloadmore;
        }

        /**
         * attachments : [{"attachtype":0,"picurl":"http://www3.autoimg.cn/newsdfs/g21/M13/30/16/620x0_0_autohomecar__wKgFWlfhIMaAQu9mAAFVMaYStNs153.jpg","videourl":"","width":700,"height":525,"ordernum":0},{"attachtype":0,"picurl":"http://www3.autoimg.cn/newsdfs/g21/M14/30/16/620x0_0_autohomecar__wKgFWlfhIMeAWjanAAE_e7TGt1Y937.jpg","videourl":"","width":700,"height":525,"ordernum":0},{"attachtype":0,"picurl":"http://www2.autoimg.cn/newsdfs/g22/M07/31/52/620x0_0_autohomecar__wKgFW1fhIMiAHGxkAAEIYbIzKSo209.jpg","videourl":"","width":700,"height":525,"ordernum":0},{"attachtype":0,"picurl":"http://www2.autoimg.cn/newsdfs/g22/M0B/2F/38/620x0_0_autohomecar__wKgFVlfhIMqAD7miAAGQkFCdo40168.jpg","videourl":"","width":700,"height":525,"ordernum":0}]
         * commentlist : [{"userid":8640619,"username":"mix186车","headimg":"http://i1.autoimg.cn/album/userheaders/g18/M15/A8/42/120X120_0_q87_autohomecar__wKgH6FdiXTyAQys8AARQHW4pCpw057.jpg","issocialize":0,"iscarower":0,"isbusinessauth":0,"carname":"","sourcename":"","sourcecontent":"","content":"叼好","createtime":"1小时前"},{"userid":31333314,"username":"刁昊","headimg":"","issocialize":0,"iscarower":0,"isbusinessauth":0,"carname":"","sourcename":"","sourcecontent":"","content":"你们在夸我名字吗","createtime":"4小时前"},{"userid":24818493,"username":"逸风008123456","headimg":"","issocialize":0,"iscarower":0,"isbusinessauth":0,"carname":"","sourcename":"","sourcecontent":"","content":"。。。。","createtime":"20小时前"}]
         * messageid : 10108
         * authorid : 5927
         * authorname : 刁昊
         * headimg : http://i1.autoimg.cn/album/userheaders/g17/M0E/DB/77/120X120_0_q87_autohomecar__wKgH51eYXceAK3OfAAFP24GRms0541.jpg
         * publishtime : 09/20 19:43
         * publishtiptime : 1474371784
         * messagestate : 1
         * content : 各位网友大家好，我是本次活动前线编辑刁昊。帝豪GL上市发布会将于20:00开始，请大家再耐心等待一下，感谢关注！
         * upcount : 131
         * replycount : 76
         * shareimg : http://app0.autoimg.cn/autoapp/dis/logo180.png
         * pageid : 2016092019430461010108
         * memberid : 3168044
         */


        private List<MessagelistBean> messagelist;

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

        public boolean isIsloadmore() {
            return isloadmore;
        }

        public void setIsloadmore(boolean isloadmore) {
            this.isloadmore = isloadmore;
        }

        public NewsdataBean getNewsdata() {
            return newsdata;
        }

        public void setNewsdata(NewsdataBean newsdata) {
            this.newsdata = newsdata;
        }

        public boolean isCanedit() {
            return canedit;
        }

        public void setCanedit(boolean canedit) {
            this.canedit = canedit;
        }

        public List<MessagelistBean> getMessagelist() {
            return messagelist;
        }

        public void setMessagelist(List<MessagelistBean> messagelist) {
            this.messagelist = messagelist;
        }

        public static class NewsdataBean {
            private int newsid;
            private int newstypeid;
            private String newstypeanme;
            private String title;
            private String summary;
            private int newsstate;
            private int showstate;
            private int newsauthorid;
            private String newsauthor;
            private String img;
            private int reviewcount;
            private String shareimg;
            private String createtime;
            private int memberid;
            private String headimg;
            private String publishtiptime;


            public static NewsdataBean objectFromData(String str) {

                return new Gson().fromJson(str, NewsdataBean.class);
            }

            public static NewsdataBean objectFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);

                    return new Gson().fromJson(jsonObject.getString(str), NewsdataBean.class);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return null;
            }

            public static List<NewsdataBean> arrayNewsdataBeanFromData(String str) {

                Type listType = new TypeToken<ArrayList<NewsdataBean>>() {
                }.getType();

                return new Gson().fromJson(str, listType);
            }

            public static List<NewsdataBean> arrayNewsdataBeanFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);
                    Type listType = new TypeToken<ArrayList<NewsdataBean>>() {
                    }.getType();

                    return new Gson().fromJson(jsonObject.getString(str), listType);

                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return new ArrayList();


            }

            public int getNewsid() {
                return newsid;
            }

            public void setNewsid(int newsid) {
                this.newsid = newsid;
            }

            public int getNewstypeid() {
                return newstypeid;
            }

            public void setNewstypeid(int newstypeid) {
                this.newstypeid = newstypeid;
            }

            public String getNewstypeanme() {
                return newstypeanme;
            }

            public void setNewstypeanme(String newstypeanme) {
                this.newstypeanme = newstypeanme;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getSummary() {
                return summary;
            }

            public void setSummary(String summary) {
                this.summary = summary;
            }

            public int getNewsstate() {
                return newsstate;
            }

            public void setNewsstate(int newsstate) {
                this.newsstate = newsstate;
            }

            public int getShowstate() {
                return showstate;
            }

            public void setShowstate(int showstate) {
                this.showstate = showstate;
            }

            public int getNewsauthorid() {
                return newsauthorid;
            }

            public void setNewsauthorid(int newsauthorid) {
                this.newsauthorid = newsauthorid;
            }

            public String getNewsauthor() {
                return newsauthor;
            }

            public void setNewsauthor(String newsauthor) {
                this.newsauthor = newsauthor;
            }

            public String getImg() {
                return img;
            }

            public void setImg(String img) {
                this.img = img;
            }

            public int getReviewcount() {
                return reviewcount;
            }

            public void setReviewcount(int reviewcount) {
                this.reviewcount = reviewcount;
            }

            public String getShareimg() {
                return shareimg;
            }

            public void setShareimg(String shareimg) {
                this.shareimg = shareimg;
            }

            public String getCreatetime() {
                return createtime;
            }

            public void setCreatetime(String createtime) {
                this.createtime = createtime;
            }

            public int getMemberid() {
                return memberid;
            }

            public void setMemberid(int memberid) {
                this.memberid = memberid;
            }

            public String getHeadimg() {
                return headimg;
            }

            public void setHeadimg(String headimg) {
                this.headimg = headimg;
            }

            public String getPublishtiptime() {
                return publishtiptime;
            }

            public void setPublishtiptime(String publishtiptime) {
                this.publishtiptime = publishtiptime;
            }
        }

        public static class MessagelistBean {
            private int messageid;
            private int authorid;
            private String authorname;
            private String headimg;
            private String publishtime;
            private String publishtiptime;
            private int messagestate;
            private String content;
            private int upcount;
            private int replycount;
            private String shareimg;
            private String pageid;
            private int memberid;
            /**
             * attachtype : 0
             * picurl : http://www3.autoimg.cn/newsdfs/g21/M13/30/16/620x0_0_autohomecar__wKgFWlfhIMaAQu9mAAFVMaYStNs153.jpg
             * videourl :
             * width : 700
             * height : 525
             * ordernum : 0
             */

            private List<AttachmentsBean> attachments;
            /**
             * userid : 8640619
             * username : mix186车
             * headimg : http://i1.autoimg.cn/album/userheaders/g18/M15/A8/42/120X120_0_q87_autohomecar__wKgH6FdiXTyAQys8AARQHW4pCpw057.jpg
             * issocialize : 0
             * iscarower : 0
             * isbusinessauth : 0
             * carname :
             * sourcename :
             * sourcecontent :
             * content : 叼好
             * createtime : 1小时前
             */

            private List<CommentlistBean> commentlist;

            public static MessagelistBean objectFromData(String str) {

                return new Gson().fromJson(str, MessagelistBean.class);
            }

            public static MessagelistBean objectFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);

                    return new Gson().fromJson(jsonObject.getString(str), MessagelistBean.class);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return null;
            }

            public static List<MessagelistBean> arrayMessagelistBeanFromData(String str) {

                Type listType = new TypeToken<ArrayList<MessagelistBean>>() {
                }.getType();

                return new Gson().fromJson(str, listType);
            }

            public static List<MessagelistBean> arrayMessagelistBeanFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);
                    Type listType = new TypeToken<ArrayList<MessagelistBean>>() {
                    }.getType();

                    return new Gson().fromJson(jsonObject.getString(str), listType);

                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return new ArrayList();


            }

            public int getMessageid() {
                return messageid;
            }

            public void setMessageid(int messageid) {
                this.messageid = messageid;
            }

            public int getAuthorid() {
                return authorid;
            }

            public void setAuthorid(int authorid) {
                this.authorid = authorid;
            }

            public String getAuthorname() {
                return authorname;
            }

            public void setAuthorname(String authorname) {
                this.authorname = authorname;
            }

            public String getHeadimg() {
                return headimg;
            }

            public void setHeadimg(String headimg) {
                this.headimg = headimg;
            }

            public String getPublishtime() {
                return publishtime;
            }

            public void setPublishtime(String publishtime) {
                this.publishtime = publishtime;
            }

            public String getPublishtiptime() {
                return publishtiptime;
            }

            public void setPublishtiptime(String publishtiptime) {
                this.publishtiptime = publishtiptime;
            }

            public int getMessagestate() {
                return messagestate;
            }

            public void setMessagestate(int messagestate) {
                this.messagestate = messagestate;
            }

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public int getUpcount() {
                return upcount;
            }

            public void setUpcount(int upcount) {
                this.upcount = upcount;
            }

            public int getReplycount() {
                return replycount;
            }

            public void setReplycount(int replycount) {
                this.replycount = replycount;
            }

            public String getShareimg() {
                return shareimg;
            }

            public void setShareimg(String shareimg) {
                this.shareimg = shareimg;
            }

            public String getPageid() {
                return pageid;
            }

            public void setPageid(String pageid) {
                this.pageid = pageid;
            }

            public int getMemberid() {
                return memberid;
            }

            public void setMemberid(int memberid) {
                this.memberid = memberid;
            }

            public List<AttachmentsBean> getAttachments() {
                return attachments;
            }

            public void setAttachments(List<AttachmentsBean> attachments) {
                this.attachments = attachments;
            }

            public List<CommentlistBean> getCommentlist() {
                return commentlist;
            }

            public void setCommentlist(List<CommentlistBean> commentlist) {
                this.commentlist = commentlist;
            }

            public static class AttachmentsBean {
                private int attachtype;
                private String picurl;
                private String videourl;
                private int width;
                private int height;
                private int ordernum;

                public static AttachmentsBean objectFromData(String str) {

                    return new Gson().fromJson(str, AttachmentsBean.class);
                }

                public static AttachmentsBean objectFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);

                        return new Gson().fromJson(jsonObject.getString(str), AttachmentsBean.class);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return null;
                }

                public static List<AttachmentsBean> arrayAttachmentsBeanFromData(String str) {

                    Type listType = new TypeToken<ArrayList<AttachmentsBean>>() {
                    }.getType();

                    return new Gson().fromJson(str, listType);
                }

                public static List<AttachmentsBean> arrayAttachmentsBeanFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);
                        Type listType = new TypeToken<ArrayList<AttachmentsBean>>() {
                        }.getType();

                        return new Gson().fromJson(jsonObject.getString(str), listType);

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return new ArrayList();


                }

                public int getAttachtype() {
                    return attachtype;
                }

                public void setAttachtype(int attachtype) {
                    this.attachtype = attachtype;
                }

                public String getPicurl() {
                    return picurl;
                }

                public void setPicurl(String picurl) {
                    this.picurl = picurl;
                }

                public String getVideourl() {
                    return videourl;
                }

                public void setVideourl(String videourl) {
                    this.videourl = videourl;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public int getOrdernum() {
                    return ordernum;
                }

                public void setOrdernum(int ordernum) {
                    this.ordernum = ordernum;
                }
            }

            public static class CommentlistBean {
                private int userid;
                private String username;
                private String headimg;
                private int issocialize;
                private int iscarower;
                private int isbusinessauth;
                private String carname;
                private String sourcename;
                private String sourcecontent;
                private String content;
                private String createtime;

                public static CommentlistBean objectFromData(String str) {

                    return new Gson().fromJson(str, CommentlistBean.class);
                }

                public static CommentlistBean objectFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);

                        return new Gson().fromJson(jsonObject.getString(str), CommentlistBean.class);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return null;
                }

                public static List<CommentlistBean> arrayCommentlistBeanFromData(String str) {

                    Type listType = new TypeToken<ArrayList<CommentlistBean>>() {
                    }.getType();

                    return new Gson().fromJson(str, listType);
                }

                public static List<CommentlistBean> arrayCommentlistBeanFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);
                        Type listType = new TypeToken<ArrayList<CommentlistBean>>() {
                        }.getType();

                        return new Gson().fromJson(jsonObject.getString(str), listType);

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return new ArrayList();


                }

                public int getUserid() {
                    return userid;
                }

                public void setUserid(int userid) {
                    this.userid = userid;
                }

                public String getUsername() {
                    return username;
                }

                public void setUsername(String username) {
                    this.username = username;
                }

                public String getHeadimg() {
                    return headimg;
                }

                public void setHeadimg(String headimg) {
                    this.headimg = headimg;
                }

                public int getIssocialize() {
                    return issocialize;
                }

                public void setIssocialize(int issocialize) {
                    this.issocialize = issocialize;
                }

                public int getIscarower() {
                    return iscarower;
                }

                public void setIscarower(int iscarower) {
                    this.iscarower = iscarower;
                }

                public int getIsbusinessauth() {
                    return isbusinessauth;
                }

                public void setIsbusinessauth(int isbusinessauth) {
                    this.isbusinessauth = isbusinessauth;
                }

                public String getCarname() {
                    return carname;
                }

                public void setCarname(String carname) {
                    this.carname = carname;
                }

                public String getSourcename() {
                    return sourcename;
                }

                public void setSourcename(String sourcename) {
                    this.sourcename = sourcename;
                }

                public String getSourcecontent() {
                    return sourcecontent;
                }

                public void setSourcecontent(String sourcecontent) {
                    this.sourcecontent = sourcecontent;
                }

                public String getContent() {
                    return content;
                }

                public void setContent(String content) {
                    this.content = content;
                }

                public String getCreatetime() {
                    return createtime;
                }

                public void setCreatetime(String createtime) {
                    this.createtime = createtime;
                }
            }
        }
    }
}
