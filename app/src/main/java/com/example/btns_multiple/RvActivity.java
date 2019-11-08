package com.example.btns_multiple;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.btns_multiple.model.Food;

import java.util.ArrayList;
import java.util.List;

public class RvActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Food> foods = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rv);

        recyclerView = findViewById(R.id.rvFoods);
        getData();

        myRvAdapter adapter = new myRvAdapter(foods);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void getData(){
        foods.add(new Food("Momos", "Chicken","Rs. 180", R.drawable.momos));
        foods.add(new Food("Burger", "Mixed","Rs. 280", R.drawable.burger));
        foods.add(new Food("Pizza", "Chicken","Rs. 220", R.drawable.pizza));

    }
}
