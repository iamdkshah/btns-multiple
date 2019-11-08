package com.example.btns_multiple;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.btns_multiple.model.Food;

import java.util.ArrayList;
import java.util.List;

public class myRvAdapter  extends RecyclerView.Adapter<myRvAdapter.MyHolder> {

    private List<Food> foodList = new ArrayList<>();

    public myRvAdapter(List<Food> foodList) {
        this.foodList = foodList;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_rvfoods,parent,false);

        MyHolder myHolder = new MyHolder(view);
        return myHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        Food food = foodList.get(position);
        holder.tvName.setText(food.getName());
        holder.tvCat.setText(food.getCategory());
        holder.tvRate.setText(food.getRate());
        holder.imageView.setImageResource(food.getImg());
    }

    @Override
    public int getItemCount() {
        return foodList.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder{


        ImageView imageView;
        TextView tvName, tvCat, tvRate;

        public MyHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.img1);
            tvName = itemView.findViewById(R.id.foodname);
            tvCat = itemView.findViewById(R.id.foodcat);
            tvRate = itemView.findViewById(R.id.foodrate);
        }
    }
}
