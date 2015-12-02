package com.example.saroshmadara.materialpractice4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecyclerAdapter adapter = new RecyclerAdapter(createItemList());
        recyclerView.setAdapter(adapter);

    }

    private List<String> createItemList() {
        List<String> itemList = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            itemList.add("Item " + i);
        }

        return itemList;
    }
}

