package com.example.recycleview;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class DummyItemViewHolder extends RecyclerView.ViewHolder {
    final TextView idView;
    final TextView titleView;

    DummyItemViewHolder(View view) {
        super(view);
        idView = view.findViewById(R.id.listItemId);
        titleView = view.findViewById(R.id.listItemTitle);
    }
}
