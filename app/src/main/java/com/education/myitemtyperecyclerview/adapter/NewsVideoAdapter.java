package com.education.myitemtyperecyclerview.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.TextView;

import com.education.myitemtyperecyclerview.R;
import com.education.myitemtyperecyclerview.dao.NewsVideo;

import java.util.List;

/**
 * Created by zhonghang on 16/7/12.
 */

public class NewsVideoAdapter extends RecyclerView.Adapter<NewsVideoAdapter.MyViewHolder> {
    private List<NewsVideo.T1457069041911Bean> videos;

    public NewsVideoAdapter(List<NewsVideo.T1457069041911Bean> videos ){
        this.videos = videos;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        MyViewHolder holder = null;
        holder = new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_video, null));

        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.tv.setText(videos.get(position).getCover());
    }

    @Override
    public int getItemCount() {
        return videos.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tv;

        public MyViewHolder(View itemView) {
            super(itemView);
            tv = (TextView) itemView.findViewById(R.id.textview);
        }
    }
}
