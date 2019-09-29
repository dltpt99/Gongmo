package com.example.gongmo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>  {

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView ivPicture;
        TextView tvPrice;

        MyViewHolder(View view){
            super(view);
            ivPicture = view.findViewById(R.id.photo);
            tvPrice = view.findViewById(R.id.name);
        }
    }

    private ArrayList<mtinfo> foodInfoArrayList;
    MyAdapter(ArrayList<mtinfo> foodInfoArrayList){
        this.foodInfoArrayList = foodInfoArrayList;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);

        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        MyViewHolder myViewHolder = (MyViewHolder) holder;

        myViewHolder.ivPicture.setImageResource(foodInfoArrayList.get(position).drawableId);
        myViewHolder.tvPrice.setText(foodInfoArrayList.get(position).mt_name);
    }

    @Override
    public int getItemCount() {
        return foodInfoArrayList.size();
    }
}

class mtinfo {
    public int drawableId;
    public String mt_name;

    public mtinfo(int drawableId, String price){
        this.drawableId = drawableId;
        this.mt_name = price;
    }
}
