package com.education.myitemtyperecyclerview.httputils;

import android.provider.CalendarContract;
import android.util.Log;

import com.alibaba.fastjson.JSON;
import com.education.myitemtyperecyclerview.dao.NewsVideo;

import org.greenrobot.eventbus.EventBus;

import java.io.IOException;
import java.util.HashMap;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import rx.Observable;

/**
 * Created by zhonghang on 16/7/11.
 */

public class HttpUtils {
    private IRetrofitHttp http;


    private MyHttpCallBack callBack;

    public interface MyHttpCallBack {
        void sucess();

        void fail();
    }

    private HttpUtils() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl(UrlConfig.BASE_URL).build();
        http = retrofit.create(IRetrofitHttp.class);
    }

    private static HttpUtils httpUtils;

    public synchronized static HttpUtils newInstance() {
        if (httpUtils == null) {
            httpUtils = new HttpUtils();
        }
        return httpUtils;
    }

    public void login(HashMap<String, String> params, final MyHttpCallBack callBack) {
        Call<ResponseBody> call = http.login("", params);
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                callBack.sucess();
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                callBack.fail();
            }
        });
    }

    public NewsVideo getNewsVideos() {
        NewsVideo video = null;
        Call<ResponseBody> call = http.getNewsVideo();
        try {
            Log.d("----", "----1");
            Response<ResponseBody> response = call.execute();
            Log.d("----", "----2");
            if (response.code() == 200) {
                video = JSON.parseObject(response.body().string(), NewsVideo.class);
            }
        } catch (IOException e) {
            Log.d("----", "----3");
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Log.d("----", "----5");
        }
        Log.d("----", "----4");
        return video;
    }

    public void getNewsVideo() {
        Call<ResponseBody> call = http.getNewsVideo();
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    NewsVideo video = JSON.parseObject(response.body().string(), NewsVideo.class);
                    EventBus.getDefault().post(video);
                } catch (IOException e) {
                    e.printStackTrace();
                    EventBus.getDefault().post(null);
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                EventBus.getDefault().post(null);
            }
        });
    }

}
