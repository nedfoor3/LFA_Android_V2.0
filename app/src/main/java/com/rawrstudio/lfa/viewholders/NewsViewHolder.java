package com.rawrstudio.lfa.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.rawrstudio.lfa.R;
import com.thefinestartist.finestwebview.FinestWebView;

/**
 * News View Holder - Crea elementos para renglon de RecyclerView de Blog
 * Created by Ricardo on 27/02/2017.
 */
public class NewsViewHolder extends RecyclerView.ViewHolder  implements View.OnClickListener{

    private TextView mTitleTV;
    private ImageView mFeatureImage;
    private Integer idNote;


    /**
     * Instantiates a new News view holder.
     *
     * @param itemView the item view
     */
    public NewsViewHolder(View itemView) {
        super(itemView);

        itemView.setOnClickListener(this);
        mTitleTV = (TextView) itemView.findViewById(R.id.news_title);
        mFeatureImage = (ImageView) itemView.findViewById(R.id.news_image_feature);
    }

    /**
     * Set title.
     *
     * @param title the title
     */
    public void setTitle(String title){
        mTitleTV.setText(title);
    }

    /**
     * Set id.
     *
     * @param id the id
     */
    public void setId(Integer id){ idNote = id;}

    public void setFeatureImage(String UrlFeatureImage) {
        Glide.with(itemView.getContext()).load(UrlFeatureImage).into(mFeatureImage);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(view.getContext(), "ID: " + idNote, Toast.LENGTH_SHORT).show();

        new FinestWebView.Builder(itemView.getContext()).
                showIconMenu(false).
                showSwipeRefreshLayout(false).
                titleDefault("LFA").
                updateTitleFromHtml(false).
                showUrl(false).
                show("http://rawrstudio.com");
    }
}
