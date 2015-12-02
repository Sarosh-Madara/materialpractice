package com.example.saroshmadara.materialpractice5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends AppCompatActivity{
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TestDB testDB = new TestDB(this);


        Product p = new Product();
        p.setName("Product 1");
        p.setQuantity(15);
        p.setPrice(12.4);

        testDB.addProduct(p);


        p.setName("Product 2");
        p.setQuantity(1);
        p.setPrice(43.88);

        testDB.addProduct(p);


        p.setName("Product 1");
        p.setQuantity(15);
        p.setPrice(9.66);

        testDB.addProduct(p);


        p.setName("Product 2");
        p.setQuantity(1);
        p.setPrice(16.0);

        testDB.addProduct(p);


        p.setName("Product 1");
        p.setQuantity(15);
        p.setPrice(33.1);

        testDB.addProduct(p);


        p.setName("Product 2");
        p.setQuantity(1);
        p.setPrice(35.34);

        testDB.addProduct(p);


        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        final RecyclerAdapter adapter = new RecyclerAdapter(testDB.getProductList());
        Log.d("MainActivity", String.valueOf(testDB.getProductList()));
        recyclerView.setAdapter(adapter);

        ItemTouchHelper.SimpleCallback callback = new ItemTouchHelper.SimpleCallback(ItemTouchHelper.LEFT | ItemTouchHelper.RIGHT,ItemTouchHelper.LEFT | ItemTouchHelper.RIGHT) {
            @Override
            public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
                return false;
            }

            @Override
            public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction) {
                testDB.getProductList().remove(viewHolder.getAdapterPosition());
                adapter.notifyItemRemoved(viewHolder.getAdapterPosition());
            }
        };

        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(callback);

        itemTouchHelper.attachToRecyclerView(recyclerView);

    }




}
