package com.rawrstudio.lfa.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.rawrstudio.lfa.R;

/**
 * Created by Ricardo on 27/02/2017.
 */

public class NewsViewHolder extends RecyclerView.ViewHolder  implements View.OnClickListener{

    private TextView textView;


    public NewsViewHolder(View itemView) {
        super(itemView);

        itemView.setOnClickListener(this);
        textView = (TextView) itemView.findViewById(R.id.news_title);
    }

    public void setTitle(String title){
        textView.setText(title);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(view.getContext(), "ID" + textView.getText(), Toast.LENGTH_SHORT).show();
    }
}
