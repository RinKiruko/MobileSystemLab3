package com.example.recycleview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DummyItemAdapter extends RecyclerView.Adapter<DummyItemViewHolder> {
    List<DummyContent.DummyItem> items;

    DummyItemAdapter(List<DummyContent.DummyItem> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public DummyItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(
                parent.getContext()
        ).inflate(
                R.layout.list_item, parent, false
        );

        return new DummyItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DummyItemViewHolder holder, int position) {
        holder.idView.setText(items.get(position).id);
        holder.titleView.setText(items.get(position).title);

        holder.itemView.setTag(items.get(position));
        holder.itemView.setOnClickListener(onClickListener);

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    private final View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            DummyContent.DummyItem item = (DummyContent.DummyItem) view.getTag();
            Context context = view.getContext();
            Intent intent = new Intent(context, DetailActivity.class);
            intent.putExtra("ITEM", item);
            context.startActivity(intent);
        }
    };
}
