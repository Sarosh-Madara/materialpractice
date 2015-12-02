package com.example.saroshmadara.materialpractice5;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sarosh Madara on 21-11-2015.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    public RecyclerAdapter(List<Product> productList) {
        this.productList = productList;
    }

    List<Product> productList = new ArrayList<>();


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.product_item,parent,false);

        return RecyclerItemViewHolder.newInstance(view);
    }


    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        RecyclerItemViewHolder viewHolder = (RecyclerItemViewHolder) holder;
        viewHolder.setValues(productList.get(position).getName(),String.valueOf(productList.get(position).getQuantity()),String.valueOf(productList.get(position).getPrice()));
    }

    @Override
    public int getItemCount() {

        return productList.size();
    }


}
