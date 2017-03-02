package com.rawrstudio.lfa.interfaces.MainActivity;

/**
 * Main Activity Presenter Interface
 * Created by Ricardo on 25/02/2017.
 */
public interface MainActivityPresenter {

    /**
     * Load news.
     * @param i
     */
    void loadNews(int i);

    /**
     * Load news swipe container.
     * @param i
     */
    void loadNewsSwipeContainer(int i);
}
