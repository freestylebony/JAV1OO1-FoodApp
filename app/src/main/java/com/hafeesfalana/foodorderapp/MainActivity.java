package com.hafeesfalana.foodorderapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.hafeesfalana.foodorderapp.Adapters.MainAdapter;
import com.hafeesfalana.foodorderapp.Models.MainModel;
import com.hafeesfalana.foodorderapp.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        ArrayList<MainModel> list = new ArrayList<>();

        list.add(new MainModel(R.drawable.walnut, " Walnut Sprout", "12.00", "Walnuts are an excellent source of omega-3 fatty acids."));
        list.add(new MainModel(R.drawable.mushroom, "Garlic Mushrooms", "15.00", "Mushrooms are full of nutritional benefits and can make a great stand-in for meat in vegetarian dishes."));
        list.add(new MainModel(R.drawable.barley, "Barley Soup", "10.00", "Barley is a grain full of fiber, so it's digested more slowly by body."));
        list.add(new MainModel(R.drawable.qunoa, "Quinoa Salad", "16.00", "Quinoa is technically a seed, but it cooks and tastes like a grain."));
        list.add(new MainModel(R.drawable.baked_pineapple_salmom, "Pineapple Salmon", "16.00", "Quinoa is technically a seed, but it cooks and tastes like a grain."));
        list.add(new MainModel(R.drawable.bell_pepper_egg, "Pepper Egg", "16.00", "Quinoa is technically a seed, but it cooks and tastes like a grain."));

        MainAdapter adapter = new MainAdapter(list, this);
        binding.recycleView.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager( this);
        binding.recycleView.setLayoutManager(layoutManager);
    }
}