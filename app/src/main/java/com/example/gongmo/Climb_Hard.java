package com.example.gongmo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Climb_Hard extends AppCompatActivity {
    RecyclerView mRecyclerView;
    RecyclerView.LayoutManager mLayoutManager;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_climb_hard);

        mRecyclerView = findViewById(R.id.recycler_view_Climb_Hard);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new GridLayoutManager(this,3);
        mRecyclerView.setLayoutManager(mLayoutManager);

        ArrayList<mtinfo> mtinfoArrayList = new ArrayList<>();

        mtinfoArrayList.add(new mtinfo(R.drawable.mt_dobong1, "도봉산"));
        mtinfoArrayList.add(new mtinfo(R.drawable.mt_surak, "수락산" ));
        mtinfoArrayList.add(new mtinfo(R.drawable.mt_youngma, "용마산" ));


        MyAdapter myAdapter = new MyAdapter(mtinfoArrayList);

        mRecyclerView.setAdapter(myAdapter);

    }
}