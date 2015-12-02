package com.example.saroshmadara.materialpractice2;

import android.graphics.Color;
import android.support.v4.app.FragmentManager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigationdrawer);

        final DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.navi_drawer);

        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().replace(R.id.container,new BlankFragment()).commit();

        Toolbar toolbar = (Toolbar) findViewById(R.id.appbar);
        setSupportActionBar(toolbar);

        ActionBarDrawerToggle drawerToggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open_drawer,R.string.close_drawer){
            @Override
            public void onDrawerSlide(View drawerView, float slideOffset) {
                super.onDrawerSlide(drawerView, slideOffset);
                 findViewById (R.id.container).setTranslationX(drawerLayout.getWidth() * slideOffset);
                 drawerLayout.setScrimColor(Color.TRANSPARENT);
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
            }

            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
            }
        };

        drawerToggle.syncState();
        drawerLayout.setDrawerListener(drawerToggle);




    }
}
