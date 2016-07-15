package com.education.myitemtyperecyclerview;

import com.education.myitemtyperecyclerview.dao.NewsVideo;
import com.education.myitemtyperecyclerview.httputils.HttpUtils;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import rx.Observable;
import rx.Observer;
import rx.Scheduler;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by zhonghang on 16/7/12.
 */

public class MainPresenter implements MainContract.Presenter<MainContract.View, MainContract.Model> {
    private MainContract.View view;
    private MainContract.Model model;

    public MainPresenter(MainContract.View view, MainContract.Model model) {
        this.view = view;
        this.model = model;
        EventBus.getDefault().register(this);
    }

    @Override
    public void init() {
        Observable.create(new Observable.OnSubscribe<NewsVideo>() {
            @Override
            public void call(Subscriber<? super NewsVideo> subscriber) {
                NewsVideo video = model.init();
                if (video != null) {
                    subscriber.onNext(video);
                } else {
                    subscriber.onError(new Exception());
                }
            }
        }).subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<NewsVideo>() {
                    @Override
                    public void onCompleted() {
                        view.onInitFail("完成");
                    }

                    @Override
                    public void onError(Throwable e) {
                        view.onInitFail("报错");
                    }

                    @Override
                    public void onNext(NewsVideo video) {
                        view.onInitSucess(video);
                    }
                });
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void sub(NewsVideo video) {
        if (video == null) {
            view.onInitFail("cuowu");
        } else {
            view.onInitSucess(video);
        }
    }
}
