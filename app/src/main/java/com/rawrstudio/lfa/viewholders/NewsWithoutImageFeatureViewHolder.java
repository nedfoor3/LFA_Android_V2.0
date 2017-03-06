package com.rawrstudio.lfa.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.rawrstudio.lfa.R;
import com.thefinestartist.finestwebview.FinestWebView;

/**
 * Created by Ricardo on 04/03/2017.
 */

public class NewsWithoutImageFeatureViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    private TextView mTitleTV;

    private Integer idNote;

    public NewsWithoutImageFeatureViewHolder(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
        mTitleTV = (TextView) itemView.findViewById(R.id.news_title);
    }

    /**
     * Set title.
     *
     * @param title the title
     */
    public void setTitle(String title){
        mTitleTV.setText(title.toUpperCase());
    }

    /**
     * Set id.
     *
     * @param id the id
     */
    public void setId(Integer id){ idNote = id;}

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
