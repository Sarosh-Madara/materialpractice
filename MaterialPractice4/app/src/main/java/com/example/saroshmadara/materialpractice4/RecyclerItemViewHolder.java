package com.example.saroshmadara.materialpractice4;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Sarosh Madara on 21-11-2015.
 */
public class RecyclerItemViewHolder extends RecyclerView.ViewHolder {


    private TextView mItemTextView;

    public RecyclerItemViewHolder(View itemView, TextView textView) {
        super(itemView);
        mItemTextView = textView;
    }

    public static RecyclerItemViewHolder newInstance(View parent) {
        TextView itemTextView = (TextView) parent.findViewById(R.id.textViewCard);
        return new RecyclerItemViewHolder(parent, itemTextView);
    }

    public void setItemText(CharSequence text) {
        mItemTextView.setText(text);
    }
}
