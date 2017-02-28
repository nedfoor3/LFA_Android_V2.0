package com.rawrstudio.lfa.interactors;

import com.rawrstudio.lfa.dao.RetrofitNewsDao;
import com.rawrstudio.lfa.interfaces.MainActivity.MainActivityInteractor;
import com.rawrstudio.lfa.model.News;
import com.rawrstudio.lfa.utils.Strings;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Ricardo on 25/02/2017.
 */

public class MainActivityInteractorImpl implements MainActivityInteractor {

    private static final String ON_RESPONSE = "onResponse";

    @Override
    public List<News> getRecentNews() {

        Retrofit retrofit = new Retrofit.Builder().
                baseUrl(Strings.BASE_NEWS_API_URL).
                addConverterFactory(GsonConverterFactory.create()).
                build();

        RetrofitNewsDao service = retrofit.create(RetrofitNewsDao.class);

        Call<List<News>> call = service.getRecentListNews();

        List<News> mListNews = new ArrayList<>();


        try {

            if (200 == call.execute().code()) {

                Call<List<News>> mCall = call.clone();
                mListNews = mCall.execute().body();
            } else {
                mListNews = null;
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

        return mListNews;

    }


}
