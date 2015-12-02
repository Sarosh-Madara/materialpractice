package com.example.saroshmadara.materialpractice3;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        initViewPagerAndTabs();


    }

    private void initViewPagerAndTabs() {
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.addTab(tabLayout.newTab().setText("Blank Fragment"));
        tabLayout.addTab(tabLayout.newTab().setText("Second Blank"));
        tabLayout.addTab(tabLayout.newTab().setText("ItemList Fragment"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        PagerAdapter pagerAdapter = new PagerAdapter(getSupportFragmentManager());
        tabLayout.setupWithViewPager(viewPager);
    }
}

class PagerAdapter extends FragmentStatePagerAdapter{

    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    public void addFragment(Fragment fragment,String fragment_title){

    }

    @Override
    public Fragment getItem(int position) {
        return null;
    }

    @Override
    public int getCount() {
        return 0;
    }
}