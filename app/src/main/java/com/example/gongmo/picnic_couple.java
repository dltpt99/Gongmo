package com.example.gongmo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class picnic_couple extends AppCompatActivity {

    RecyclerView mRecyclerView;
    RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picnic_couple);

        mRecyclerView = findViewById(R.id.recycler_view_couple);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new GridLayoutManager(this,3);
        mRecyclerView.setLayoutManager(mLayoutManager);

        ArrayList<mtinfo> mtinfoArrayList = new ArrayList<>();

        mtinfoArrayList.add(new mtinfo(R.drawable.mt_namsan, "남산"));
        mtinfoArrayList.add(new mtinfo(R.drawable.mt_ujang, "우장산"));
        mtinfoArrayList.add(new mtinfo(R.drawable.mt_yungwang, "용왕산"));
        mtinfoArrayList.add(new mtinfo(R.drawable.mt_ansan, "안산"));
        mtinfoArrayList.add(new mtinfo(R.drawable.mt_inwang, "인왕산"));

        MyAdapter myAdapter = new MyAdapter(mtinfoArrayList);

        mRecyclerView.setAdapter(myAdapter);

    }
}

