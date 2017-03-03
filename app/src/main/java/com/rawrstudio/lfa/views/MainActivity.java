package com.rawrstudio.lfa.views;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.rawrstudio.lfa.R;
import com.rawrstudio.lfa.interfaces.MainActivity.MainActivityPresenter;
import com.rawrstudio.lfa.interfaces.MainActivity.MainActivityView;
import com.rawrstudio.lfa.interfaces.Menu.MenuPresenter;
import com.rawrstudio.lfa.interfaces.Menu.MenuView;
import com.rawrstudio.lfa.presenters.MainActivityPresenterImpl;
import com.rawrstudio.lfa.presenters.MenuPresenterImpl;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * MainActivity - Actividad inicial - Blog
 */
public class MainActivity extends AppCompatActivity implements MenuView, MainActivityView, SwipeRefreshLayout.OnRefreshListener {


    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.progressBar)
    ProgressBar progressBar;
    @BindView(R.id.recyclerview_news)
    RecyclerView recyclerviewNews;
    @BindView(R.id.swipeContainer)
    SwipeRefreshLayout swipeContainer;
    @BindView(R.id.main_toolbar)
    LinearLayout mainToolbar;
    @BindView(R.id.lateral_menu)
    NavigationView lateralMenu;
    @BindView(R.id.drawer_layout_main)
    DrawerLayout drawerLayoutMain;
    private MenuPresenter menuPresenter;

    private MainActivityPresenter mainActivityPresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        setToolbarValues();

        //RecyclerView Configuraciones
        recyclerviewNews.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerviewNews.setLayoutManager(linearLayoutManager);

        //Menu Configuraciones
        menuPresenter = new MenuPresenterImpl(this);
        menuPresenter.onClickOptionMenu(lateralMenu, drawerLayoutMain);

        //Presenter para metodos de logica en main View
        mainActivityPresenter = new MainActivityPresenterImpl(this, recyclerviewNews);
        mainActivityPresenter.loadNews(0);

        //Controlar Push and update de recyclerView
        swipeContainer.setOnRefreshListener(this);


    }

    @Override
    public void setToolbarValues() {
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_menu_white_24dp);
        getSupportActionBar().setIcon(R.drawable.ic_only_logo_lfa_42dp);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                drawerLayoutMain.openDrawer(GravityCompat.START);
                return true;
            //...
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void showProgress() {
        progressBar.setVisibility(View.VISIBLE);

    }

    @Override
    public void hideProgress() {
        progressBar.setVisibility(View.GONE);
    }

    @Override
    public void hideProgressSwipContainer() {
        swipeContainer.setRefreshing(false);
    }

    @Override
    public void showError() {
        Toast.makeText(this, "show error", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void hideError() {
        Toast.makeText(this, "hide error", Toast.LENGTH_SHORT).show();
    }

    /**
     * Called when a swipe gesture triggers a refresh.
     */
    @Override
    public void onRefresh() {
        Toast.makeText(this, "Cargando nuevas entradas", Toast.LENGTH_SHORT).show();
        mainActivityPresenter.loadNewsSwipeContainer(1);


    }
}
