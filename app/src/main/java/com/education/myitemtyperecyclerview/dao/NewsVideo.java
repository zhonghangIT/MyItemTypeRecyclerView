package com.education.myitemtyperecyclerview.dao;

import java.util.List;

/**
 * Created by zhonghang on 16/7/12.
 */

public class NewsVideo {

    /**
     * topicImg : http://vimg1.ws.126.net/image/snapshot/2016/4/3/D/VBJ41OE3D.jpg
     * replyCount : 0
     * videosource : 新媒体
     * mp4Hd_url : http://flv2.bn.netease.com/videolib3/1607/12/IvwjE3801/HD/IvwjE3801-mobile.mp4
     * topicDesc : 搜集各种搞笑视频
     * topicSid : VBJ41OE3A
     * cover : http://vimg1.ws.126.net/image/snapshot/2016/7/J/A/VBQRVSOJA.jpg
     * title : 当恐怖电影演得比较不恐怖会怎么样？
     * playCount : 23048
     * replyBoard : video_bbs
     * videoTopic : {"alias":"搜集各种搞笑视频","tname":"逗比蜀黍","ename":"T1460515708707","tid":"T1460515708707"}
     * sectiontitle :
     * replyid : BQRVSOJ9008535RB
     * description :
     * mp4_url : http://flv2.bn.netease.com/videolib3/1607/12/IvwjE3801/SD/IvwjE3801-mobile.mp4
     * length : 552
     * playersize : 1
     * m3u8Hd_url : http://flv2.bn.netease.com/videolib3/1607/12/IvwjE3801/HD/movie_index.m3u8
     * vid : VBQRVSOJ9
     * m3u8_url : http://flv2.bn.netease.com/videolib3/1607/12/IvwjE3801/SD/movie_index.m3u8
     * ptime : 2016-07-12 16:57:07
     * topicName : 逗比蜀黍
     */

    private List<T1457069041911Bean> T1457069041911;

    public List<T1457069041911Bean> getT1457069041911() {
        return T1457069041911;
    }

    public void setT1457069041911(List<T1457069041911Bean> T1457069041911) {
        this.T1457069041911 = T1457069041911;
    }

    public static class T1457069041911Bean {
        private String topicImg;
        private int replyCount;
        private String videosource;
        private String mp4Hd_url;
        private String topicDesc;
        private String topicSid;
        private String cover;
        private String title;
        private int playCount;
        private String replyBoard;
        /**
         * alias : 搜集各种搞笑视频
         * tname : 逗比蜀黍
         * ename : T1460515708707
         * tid : T1460515708707
         */

        private VideoTopicBean videoTopic;
        private String sectiontitle;
        private String replyid;
        private String description;
        private String mp4_url;
        private int length;
        private int playersize;
        private String m3u8Hd_url;
        private String vid;
        private String m3u8_url;
        private String ptime;
        private String topicName;

        public String getTopicImg() {
            return topicImg;
        }

        public void setTopicImg(String topicImg) {
            this.topicImg = topicImg;
        }

        public int getReplyCount() {
            return replyCount;
        }

        public void setReplyCount(int replyCount) {
            this.replyCount = replyCount;
        }

        public String getVideosource() {
            return videosource;
        }

        public void setVideosource(String videosource) {
            this.videosource = videosource;
        }

        public String getMp4Hd_url() {
            return mp4Hd_url;
        }

        public void setMp4Hd_url(String mp4Hd_url) {
            this.mp4Hd_url = mp4Hd_url;
        }

        public String getTopicDesc() {
            return topicDesc;
        }

        public void setTopicDesc(String topicDesc) {
            this.topicDesc = topicDesc;
        }

        public String getTopicSid() {
            return topicSid;
        }

        public void setTopicSid(String topicSid) {
            this.topicSid = topicSid;
        }

        public String getCover() {
            return cover;
        }

        public void setCover(String cover) {
            this.cover = cover;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getPlayCount() {
            return playCount;
        }

        public void setPlayCount(int playCount) {
            this.playCount = playCount;
        }

        public String getReplyBoard() {
            return replyBoard;
        }

        public void setReplyBoard(String replyBoard) {
            this.replyBoard = replyBoard;
        }

        public VideoTopicBean getVideoTopic() {
            return videoTopic;
        }

        public void setVideoTopic(VideoTopicBean videoTopic) {
            this.videoTopic = videoTopic;
        }

        public String getSectiontitle() {
            return sectiontitle;
        }

        public void setSectiontitle(String sectiontitle) {
            this.sectiontitle = sectiontitle;
        }

        public String getReplyid() {
            return replyid;
        }

        public void setReplyid(String replyid) {
            this.replyid = replyid;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getMp4_url() {
            return mp4_url;
        }

        public void setMp4_url(String mp4_url) {
            this.mp4_url = mp4_url;
        }

        public int getLength() {
            return length;
        }

        public void setLength(int length) {
            this.length = length;
        }

        public int getPlayersize() {
            return playersize;
        }

        public void setPlayersize(int playersize) {
            this.playersize = playersize;
        }

        public String getM3u8Hd_url() {
            return m3u8Hd_url;
        }

        public void setM3u8Hd_url(String m3u8Hd_url) {
            this.m3u8Hd_url = m3u8Hd_url;
        }

        public String getVid() {
            return vid;
        }

        public void setVid(String vid) {
            this.vid = vid;
        }

        public String getM3u8_url() {
            return m3u8_url;
        }

        public void setM3u8_url(String m3u8_url) {
            this.m3u8_url = m3u8_url;
        }

        public String getPtime() {
            return ptime;
        }

        public void setPtime(String ptime) {
            this.ptime = ptime;
        }

        public String getTopicName() {
            return topicName;
        }

        public void setTopicName(String topicName) {
            this.topicName = topicName;
        }

        public static class VideoTopicBean {
            private String alias;
            private String tname;
            private String ename;
            private String tid;

            public String getAlias() {
                return alias;
            }

            public void setAlias(String alias) {
                this.alias = alias;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getEname() {
                return ename;
            }

            public void setEname(String ename) {
                this.ename = ename;
            }

            public String getTid() {
                return tid;
            }

            public void setTid(String tid) {
                this.tid = tid;
            }
        }
    }
}
