package com.education.myitemtyperecyclerview.httputils;

import java.util.HashMap;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * Created by zhonghang on 16/7/11.
 */

public interface IRetrofitHttp {
    @GET("/{path}/login")
    Call<ResponseBody> login(@Path("path")
                                     String path,
                             @QueryMap
                                     HashMap<String, String> map);

    @GET("/nc/video/Tlist/T1457069041911/0-10.html")
    Call<ResponseBody> getNewsVideo();

    @GET("/nc/video/Tlist/T1457069041911/0-10.html")
    Call<ResponseBody> getNewsVideos();

    @GET("/nc/video/Tlist/T1457069041911/0-10.html")
    Call<Observable> getNewsVideosOb();
}
