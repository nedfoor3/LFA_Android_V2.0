package com.rawrstudio.lfa.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.rawrstudio.lfa.R;
import com.rawrstudio.lfa.model.News;
import com.rawrstudio.lfa.viewholders.NewsViewHolder;

import java.util.List;

/**
 * Created by Ricardo on 27/02/2017.
 */
public class NewsAdapter extends RecyclerView.Adapter<NewsViewHolder>{

    private List<News> mListNews;

    public NewsAdapter(List<News> listNews) {
        this.mListNews = listNews;
    }

    @Override
    public NewsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.row_news_basic, parent, false);
        NewsViewHolder newsViewHolder = new NewsViewHolder(itemView);
        return newsViewHolder;
    }

    @Override
    public void onBindViewHolder(NewsViewHolder holder, int position) {
        String titulo = mListNews.get(position).getTitle().getRendered();
        holder.setTitle(titulo);

        Integer id = mListNews.get(position).getId();
        holder.setId(id);

    }

    @Override
    public int getItemCount() {
        return mListNews.size();
    }


}
