package com.hafeesfalana.foodorderapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.hafeesfalana.foodorderapp.databinding.ActivityDetailBinding;

public class DetailActivity extends AppCompatActivity {

    ActivityDetailBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        int image = getIntent().getIntExtra( "image", 0);
        int price = Integer.parseInt(getIntent().getStringExtra( "price"));
        String name = getIntent().getStringExtra( "name");
        String description = getIntent().getStringExtra( "desc");

        binding.detailImage.setImageResource(image);
        binding.priceLbl.setText(String.format( "%d", price));
        binding.nameBox.setText(name);
        binding.detailDescription.setText(description);



        binding.insertBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



            }
        });

    }
}