package com.geeks.salkynbek_uulu_almazbek_hw_3_3;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.geeks.salkynbek_uulu_almazbek_hw_3_3.databinding.ActivityDetailBinding;

public class DetailActivity extends AppCompatActivity {

    private ActivityDetailBinding binding;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        Integer icon = getIntent().getIntExtra("image", 0);
        String title = getIntent().getStringExtra("title");
        String desc = getIntent().getStringExtra("description");
        String color = getIntent().getStringExtra("color");
        String sum = getIntent().getStringExtra("sum");
        binding.imageViewCar.setImageResource(icon);
        binding.textViewDTitle.setText(title);
        binding.descriptionD.setText(desc);
        binding.textViewColor.setText(color);
        binding.textViewSum.setText(sum);




    }
}