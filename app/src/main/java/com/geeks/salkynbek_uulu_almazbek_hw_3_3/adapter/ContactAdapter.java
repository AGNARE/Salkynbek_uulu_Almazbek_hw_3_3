package com.geeks.salkynbek_uulu_almazbek_hw_3_3.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.geeks.salkynbek_uulu_almazbek_hw_3_3.Product;
import com.geeks.salkynbek_uulu_almazbek_hw_3_3.R;

import java.util.ArrayList;

public class ContactAdapter extends RecyclerView.Adapter<ContactViewHolder> {

    ArrayList<Product> newArrayList;
    OnItemClick adapterClick;

    public ContactAdapter(ArrayList<Product> arrayList,
                          OnItemClick onItemClick) {
        newArrayList = arrayList;
        adapterClick = onItemClick;
    }

    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ContactViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_contact, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ContactViewHolder holder, int position) {

        holder.onBind(newArrayList.get(position));
        holder.itemView.setOnClickListener(view -> {
            adapterClick.OnItemClick(newArrayList.get(position));
        });

    }

    @Override
    public int getItemCount() {
        return newArrayList.size();
    }
}
