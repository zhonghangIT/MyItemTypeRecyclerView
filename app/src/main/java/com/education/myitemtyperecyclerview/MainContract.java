package com.education.myitemtyperecyclerview;

import com.education.myitemtyperecyclerview.dao.NewsVideo;

/**
 * Created by zhonghang on 16/7/12.
 */

public class MainContract {
    interface View extends IBaseView{
        void onInitSucess(NewsVideo video);
        void onInitFail(String failMsg);
    }
    interface Model extends IBaseModel{
        NewsVideo init();
    }
    interface Presenter<View,Model> extends IBasePresenter{
        void init();
    }
}
