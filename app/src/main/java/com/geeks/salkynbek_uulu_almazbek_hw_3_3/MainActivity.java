package com.geeks.salkynbek_uulu_almazbek_hw_3_3;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.geeks.salkynbek_uulu_almazbek_hw_3_3.adapter.ContactAdapter;
import com.geeks.salkynbek_uulu_almazbek_hw_3_3.adapter.OnItemClick;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements OnItemClick {

    ArrayList<Product> arrayListNames = new ArrayList<>();

    ContactAdapter adapter;

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        newElements();

        addName();

        recyclerView.setAdapter(adapter);

    }
    public void addName(){
        arrayListNames.add(new Product("Модификации и комплектации Toyota Camry VIII седан",
                "Toyota Camry", "white","sfsafsafkjashflk","32000" ,R.drawable.images_camry));
        arrayListNames.add(new Product("Модификации и комплектации Toyota Corolla XII седан",
                "Toyota Corolla", "black","fdskjghdsilghidsu","250000" ,R.drawable.car_carolla));
        arrayListNames.add(new Product("Модификации и комплектации Toyota Camry VIII седан",
                "Toyota Camry", "black", "dgldsjhgds" ,"32000",R.drawable.images_camry));
        arrayListNames.add(new Product("Модификации и комплектации Toyota Camry VIII седан",
                "Toyota Camry", "black","fkdsjghds;g", "320000",R.drawable.images_camry));



    }

    public void newElements(){
        adapter = new ContactAdapter(arrayListNames, this);
        recyclerView = findViewById(R.id.recyclerView);
    }

    @Override
    public void OnItemClick(Product product) {
        Intent intent = new Intent(MainActivity.this, DetailActivity.class);
        intent.putExtra("image", product.getImage());
        intent.putExtra("title", product.getTitle());
        intent.putExtra("name", product.getName());
        intent.putExtra("color",product.getColor());
        intent.putExtra("sum", product.getSum());
        intent.putExtra("description", product.getDescription());
        startActivity(intent);

    }
}