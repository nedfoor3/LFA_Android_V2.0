package com.rawrstudio.lfa.presenters;

import android.os.AsyncTask;
import android.support.v7.widget.RecyclerView;


import com.rawrstudio.lfa.adapters.NewsAdapter;
import com.rawrstudio.lfa.interactors.MainActivityInteractorImpl;
import com.rawrstudio.lfa.interfaces.MainActivity.MainActivityInteractor;
import com.rawrstudio.lfa.interfaces.MainActivity.MainActivityPresenter;
import com.rawrstudio.lfa.model.News;
import com.rawrstudio.lfa.views.MainActivity;

import java.util.List;

/**
 * Created by Ricardo on 25/02/2017.
 */

public class MainActivityPresenterImpl implements MainActivityPresenter {

    private MainActivity view;
    private MainActivityInteractor interactor;
    private RecyclerView mRecyclerView;

    List<News> mListNews = null;

    public MainActivityPresenterImpl(MainActivity mainActivity, RecyclerView recyclerviewNews) {
        this.view = mainActivity;
        this. mRecyclerView = recyclerviewNews;
        interactor = new MainActivityInteractorImpl();
    }

    @Override
    public void loadNews() {
        if (view != null) {
            AsyncGetRecentNewsList asyncNewsList = new AsyncGetRecentNewsList();
            asyncNewsList.execute();
        }

    }

    private class AsyncGetRecentNewsList extends AsyncTask<Void, Integer, Boolean> {

        @Override
        protected void onPreExecute() {
            view.showProgress();
        }

        @Override
        protected void onPostExecute(Boolean aBoolean) {
            NewsAdapter newsAdapter = new NewsAdapter(mListNews);
            mRecyclerView.setAdapter(newsAdapter);
            view.hideProgress();

        }

        @Override
        protected Boolean doInBackground(Void... voids) {
            mListNews = interactor.getRecentNews();

            return true;
        }
    }

}
