package com.rawrstudio.lfa.presenters;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.view.MenuItem;

import com.rawrstudio.lfa.R;
import com.rawrstudio.lfa.interfaces.Menu.MenuPresenter;
import com.rawrstudio.lfa.views.MainActivity;
import com.rawrstudio.lfa.views.TeamsActivity;


/**
 * Implementacion de Menu Presenter
 * Created by Ricardo on 24/02/2017.
 */
public class MenuPresenterImpl implements MenuPresenter {

    private Activity view;

    /**
     * Instantiates a new Menu presenter.
     *
     * @param view the view
     */
    public MenuPresenterImpl(MainActivity view) {
        this.view = view;
    }

    @Override
    public void onClickOptionMenu(NavigationView navView, DrawerLayout drawerLayout) {
        navView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                boolean activityTransaction = false;

                //Switch para configurar acción de cada elemento de menu lateral
                switch (item.getItemId()) {
                    case R.id.menu_teams:
                        Intent intent = new Intent(view, TeamsActivity.class);
                        view.startActivity(intent);
                        activityTransaction = true;
                }

                return activityTransaction;
            }
        });
    }
}
