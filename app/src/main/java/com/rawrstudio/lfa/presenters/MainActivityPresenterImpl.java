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
 * Implementacion de Main Activity Presenter
 * Created by Ricardo on 25/02/2017.
 */
public class MainActivityPresenterImpl implements MainActivityPresenter {

    private MainActivity view;
    private MainActivityInteractor interactor;
    private RecyclerView mRecyclerView;
    private List<News> mListNews = null;
    private int flagLoader = 0;

    /**
     * Instantiates a new Main activity presenter.
     *
     * @param mainActivity     the main activity
     * @param recyclerviewNews the recyclerview news
     */
    public MainActivityPresenterImpl(MainActivity mainActivity, RecyclerView recyclerviewNews) {
        this.view = mainActivity;
        this. mRecyclerView = recyclerviewNews;
        interactor = new MainActivityInteractorImpl();
    }

    @Override
    public void loadNews(int i) {
        flagLoader = i;
        if (view != null) {
            AsyncGetRecentNewsList asyncNewsList = new AsyncGetRecentNewsList();
            asyncNewsList.execute();
        }

    }

    /**
     * Load news swipe container.
     * @param i
     */
    @Override
    public void loadNewsSwipeContainer(int i) {
        flagLoader = i;
        if (view != null) {
            AsyncGetRecentNewsList asyncNewsList = new AsyncGetRecentNewsList();
            asyncNewsList.execute();
        }

    }

    private class AsyncGetRecentNewsList extends AsyncTask<Void, Integer, Boolean> {

        @Override
        protected void onPreExecute() {
            switch (flagLoader){
                case 0:
                    view.showProgress();
                    break;
                case 1:

                    break;
            }
        }

        @Override
        protected void onPostExecute(Boolean aBoolean) {
            NewsAdapter newsAdapter = new NewsAdapter(mListNews);
            mRecyclerView.setAdapter(newsAdapter);

            switch (flagLoader){
                case 0:
                    view.hideProgress();
                    break;
                case 1:
                    view.hideProgressSwipContainer();
                    break;
            }


        }

        @Override
        protected Boolean doInBackground(Void... voids) {
            mListNews = interactor.getRecentNews();

            return true;
        }
    }

}
