package com.education.myitemtyperecyclerview;

import com.education.myitemtyperecyclerview.dao.NewsVideo;
import com.education.myitemtyperecyclerview.httputils.HttpUtils;

/**
 * Created by zhonghang on 16/7/12.
 */

public class MainModel implements MainContract.Model {
    @Override
    public NewsVideo init() {
       return  HttpUtils.newInstance().getNewsVideos();
    }
}
