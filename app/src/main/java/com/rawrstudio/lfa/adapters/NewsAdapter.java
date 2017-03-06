package com.rawrstudio.lfa.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rawrstudio.lfa.R;
import com.rawrstudio.lfa.model.News;
import com.rawrstudio.lfa.viewholders.NewsViewHolder;
import com.rawrstudio.lfa.viewholders.NewsWithoutImageFeatureViewHolder;

import java.util.List;

/**
 * Created by Ricardo on 27/02/2017.
 */
public class NewsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<News> mListNews;

    private static final int ID_LAYOUT_WITHOUT_IMAGE_FEATURE = 0;
    private static final int ID_LAYOUT_WITH_IMAGE_FEATURE = 1;


    /**
     * Instantiates a new News adapter.
     *
     * @param listNews the list news
     */
    public NewsAdapter(List<News> listNews) {
        this.mListNews = listNews;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = null;

        if (ID_LAYOUT_WITHOUT_IMAGE_FEATURE == viewType){
            itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_news_without_feature_image, parent, false);
            return new NewsWithoutImageFeatureViewHolder(itemView);
        } else {
            itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_news_basic, parent, false);
            return new NewsViewHolder(itemView);
        }



    }


    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        String titulo;
        Integer id;
        int flag = 0 ;

        if (mListNews.get(position).getBetter_featured_image() != null) {
            flag = 1;

        }
        switch (flag) {
            case ID_LAYOUT_WITHOUT_IMAGE_FEATURE:
                NewsWithoutImageFeatureViewHolder holderWithout = new NewsWithoutImageFeatureViewHolder(holder.itemView);

                titulo = mListNews.get(position).getTitle().getRendered();
                holderWithout.setTitle(titulo);

                id = mListNews.get(position).getId();
                holderWithout.setId(id);

                break;

            case ID_LAYOUT_WITH_IMAGE_FEATURE:
                NewsViewHolder mHolder = new NewsViewHolder(holder.itemView);

                titulo = mListNews.get(position).getTitle().getRendered();
                mHolder.setTitle(titulo);

                id = mListNews.get(position).getId();
                mHolder.setId(id);

                //if (mListNews.get(position).getBetter_featured_image() != null) {
                    String urlImage = mListNews.get(position).getBetter_featured_image().getSource_url();
                    mHolder.setFeatureImage(urlImage);
                //}
                break;
        }

    }

    @Override
    public int getItemCount() {
        return mListNews.size();
    }

    @Override
    public int getItemViewType(int position) {

        News itemNews = mListNews.get(position);

        if (itemNews.getBetter_featured_image() == null) {
            return ID_LAYOUT_WITHOUT_IMAGE_FEATURE;
        } else {
            return ID_LAYOUT_WITH_IMAGE_FEATURE;
        }


    }


}
