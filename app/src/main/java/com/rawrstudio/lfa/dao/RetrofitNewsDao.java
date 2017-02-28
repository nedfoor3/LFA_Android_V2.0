package com.rawrstudio.lfa.dao;


import com.rawrstudio.lfa.model.News;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * La implementación de este dao, es parte de la librería de retrofit
 * por lo tanto noexiste un archivo como tal
 * Created by Ricardo on 26/02/2017.
 */

public interface RetrofitNewsDao {

    /**
     * Get the most recent post
     *
     * @return
     */
    @GET("posts")
    Call<List<News>> getRecentListNews();
}
