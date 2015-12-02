package com.example.saroshmadara.materialpractice5;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Sarosh Madara on 21-11-2015.
 */
public class RecyclerItemViewHolder extends RecyclerView.ViewHolder {
    LinearLayout linearLayout;
    TextView product$name,product$quantity,product$price;

    public static RecyclerItemViewHolder newInstance(View parent){
        LinearLayout linearLayout = (LinearLayout) parent.findViewById(R.id.linear);
//         product$name = (TextView) linearLayout.findViewById(R.id.product$name);
//         product$quantity = (TextView) linearLayout.findViewById(R.id.product$quantity);
//         product$price = (TextView) linearLayout.findViewById(R.id.product$price);
//        linearLayout.addView(product$name);
//        linearLayout.addView(product$quantity);
//        linearLayout.addView(product$price);
        return new RecyclerItemViewHolder(parent,linearLayout);
    }



    public RecyclerItemViewHolder(View itemView,View view) {
        super(itemView);
        linearLayout = (LinearLayout) view;
        product$name = (TextView) linearLayout.findViewById(R.id.product$name);
        product$quantity = (TextView) linearLayout.findViewById(R.id.product$quantity);
        product$price = (TextView) linearLayout.findViewById(R.id.product$price);
    }

    public void setValues(String name,String quantity,String price){
        product$name.setText(name);
        product$quantity.setText(quantity);
        product$price.setText("$"+price);
    }

}

