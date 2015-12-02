package com.example.saroshmadara.materialdesign5;

import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        CollapsingToolbarLayout collapsingToolbar =
                (CollapsingToolbarLayout) findViewById(R.id.collapsingToolbarLayout);
        collapsingToolbar.setTitle("My Toolbar Tittle");
        collapsingToolbar.setCollapsedTitleTextColor(getResources().getColor(R.color.abc_primary_text_disable_only_material_light));
        collapsingToolbar.setExpandedTitleColor(getResources().getColor(R.color.background_material_light));

//        collapsingToolbar.setContentScrimColor(getResources().getColor(R.color.bright_foreground_material_dark));

//        collapsingToolbar.setExpandedTitleTextAppearance(R.style.expandedappbar);
        collapsingToolbar.setCollapsedTitleTextAppearance(R.style.collapsedappbar);
    }
}
