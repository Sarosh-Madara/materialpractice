package com.example.saroshmadara.materialpractice4;

import android.content.Context;
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

    List<String> items = new ArrayList<>();

    public RecyclerAdapter(List<String> items) {
        this.items = items;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        View view = LayoutInflater.from(context).inflate(R.layout.custom_item,parent,false);
        return RecyclerItemViewHolder.newInstance(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        RecyclerItemViewHolder itemViewHolder = (RecyclerItemViewHolder) holder;
        itemViewHolder.setItemText(items.get(position));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
