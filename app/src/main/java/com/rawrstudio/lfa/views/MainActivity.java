package com.rawrstudio.lfa.views;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
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
import com.rawrstudio.lfa.presenters.MainActivityPresenterImpl;
import com.rawrstudio.lfa.presenters.MenuPresenterImpl;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements MainActivityView {


    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.progressBar)
    ProgressBar progressBar;
    @BindView(R.id.recyclerview_news)
    RecyclerView recyclerviewNews;
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

        //RecyclerView
        recyclerviewNews.setHasFixedSize(true);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerviewNews.setLayoutManager(linearLayoutManager);


        menuPresenter = new MenuPresenterImpl(this);
        menuPresenter.onClickOptionMenu(lateralMenu, drawerLayoutMain);


        mainActivityPresenter = new MainActivityPresenterImpl(this, recyclerviewNews);
        mainActivityPresenter.loadNews();


    }

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
    public void showError() {
        Toast.makeText(this, "show error", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void hideError() {
        Toast.makeText(this, "hide error", Toast.LENGTH_SHORT).show();
    }
}
