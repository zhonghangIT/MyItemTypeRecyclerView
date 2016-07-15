package com.education.myitemtyperecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ListView;
import android.widget.Toast;

import com.education.myitemtyperecyclerview.adapter.NewsVideoAdapter;
import com.education.myitemtyperecyclerview.dao.NewsVideo;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MainContract.View {
    private RecyclerView recyclerView;
    private List<NewsVideo.T1457069041911Bean> mVideos;
    private NewsVideoAdapter adapter;
    private MainContract.Model mModel;
    private MainContract.Presenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(manager);
        mVideos = new ArrayList<>();
        adapter = new NewsVideoAdapter(mVideos);
        recyclerView.setAdapter(adapter);
        mModel = new MainModel();
        mPresenter = new MainPresenter(this, mModel);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mPresenter.init();
    }

    @Override
    public void onInitSucess(NewsVideo video) {
        mVideos.addAll(video.getT1457069041911());
        adapter.notifyDataSetChanged();
    }

    @Override
    public void onInitFail(String failMsg) {
        Toast.makeText(this, "cuowu" + failMsg, Toast.LENGTH_SHORT).show();
    }
}
