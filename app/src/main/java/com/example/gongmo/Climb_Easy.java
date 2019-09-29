package com.example.gongmo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Climb_Easy extends AppCompatActivity {

    RecyclerView mRecyclerView;
    RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_climb_easy);

        mRecyclerView = findViewById(R.id.recycler_view_Climb_Easy);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new GridLayoutManager(this,3);
        mRecyclerView.setLayoutManager(mLayoutManager);

        ArrayList<mtinfo> mtinfoArrayList = new ArrayList<>();
        mtinfoArrayList.add(new mtinfo(R.drawable.mt_gaeunsan, "인왕산2" ));
        mtinfoArrayList.add(new mtinfo(R.drawable.mt_engbong, "응봉산" ));
        mtinfoArrayList.add(new mtinfo(R.drawable.mt_namsan, "남산2" ));
        mtinfoArrayList.add(new mtinfo(R.drawable.mt_gaeunsan, "개운산" ));
        mtinfoArrayList.add(new mtinfo(R.drawable.mt_ansan, "안산2"));
        mtinfoArrayList.add(new mtinfo(R.drawable.mt_yungwang, "용왕산"));
        mtinfoArrayList.add(new mtinfo(R.drawable.mt_ansan, "배봉산1"));
        mtinfoArrayList.add(new mtinfo(R.drawable.mt_ujang, "우장산"));

        MyAdapter myAdapter = new MyAdapter(mtinfoArrayList);

        mRecyclerView.setAdapter(myAdapter);

    }
}