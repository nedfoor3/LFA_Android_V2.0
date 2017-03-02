package com.rawrstudio.lfa.interfaces.MainActivity;


import com.rawrstudio.lfa.model.News;

import java.util.List;

/**
 * Main Activity Presenter Interface
 * Created by Ricardo on 25/02/2017.
 */
public interface MainActivityInteractor {
    /**
     * Gets recent news.
     *
     * @return the recent news
     */
    List<News> getRecentNews();
}
