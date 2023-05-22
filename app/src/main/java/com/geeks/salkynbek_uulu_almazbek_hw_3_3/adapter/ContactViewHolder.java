package com.geeks.salkynbek_uulu_almazbek_hw_3_3.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.geeks.salkynbek_uulu_almazbek_hw_3_3.Product;
import com.geeks.salkynbek_uulu_almazbek_hw_3_3.R;

public class ContactViewHolder extends RecyclerView.ViewHolder {

    TextView nameTextView,descriptionTextView;
    TextView titleTextView;
    TextView colorTextView;
    TextView sumTextView;
    ImageView icon;


    public ContactViewHolder(@NonNull View itemView) {
        super(itemView);
    }

    public void onBind(Product product){

        findViewById();
        descriptionTextView.setText(product.getDescription());
        nameTextView.setText(product.getName());
        titleTextView.setText(product.getTitle());
        colorTextView.setText(product.getColor());
        sumTextView.setText(product.getSum());
        icon.setImageResource(product.getImage());

    }
    private void findViewById(){
        nameTextView = itemView.findViewById(R.id.textViewName);
        titleTextView = itemView.findViewById(R.id.titleTextView);
        colorTextView = itemView.findViewById(R.id.colorTextView);
        sumTextView = itemView.findViewById(R.id.sumTextView);
        icon = itemView.findViewById(R.id.imageViewIcon);
        descriptionTextView = itemView.findViewById(R.id.description);
    }
}
