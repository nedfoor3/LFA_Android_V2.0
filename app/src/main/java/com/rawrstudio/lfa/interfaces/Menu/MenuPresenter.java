package com.rawrstudio.lfa.interfaces.Menu;

import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;

/** Menu Presenter Interface
 * Created by Ricardo on 24/02/2017.
 */
public interface MenuPresenter {

    /**
     * On click option menu.
     *
     * @param navigationView the navigation view
     * @param drawerLayout   the drawer layout
     */
    void onClickOptionMenu(NavigationView navigationView, DrawerLayout drawerLayout);
}
