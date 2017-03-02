package com.rawrstudio.lfa.interfaces.MainActivity;

/**
 * Main Activity View Implement
 * Created by Ricardo on 25/02/2017.
 */
public interface MainActivityView {


    /**
     * Show progress.
     */
    void showProgress();

    /**
     * Hide progress.
     */
    void hideProgress();

    /**
     * Hide progress swip container.
     */
    void hideProgressSwipContainer();

    /**
     * Show error.
     */
    void showError();

    /**
     * Hide error.
     */
    void hideError();
}
