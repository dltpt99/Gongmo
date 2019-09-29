package com.example.gongmo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class picnic_pet extends AppCompatActivity {

    RecyclerView mRecyclerView;
    RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picnic_pet);

        mRecyclerView = findViewById(R.id.recycler_view_pet);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new GridLayoutManager(this,3);
        mRecyclerView.setLayoutManager(mLayoutManager);

        ArrayList<mtinfo> mtinfoArrayList = new ArrayList<>();

        mtinfoArrayList.add(new mtinfo(R.drawable.mt_bukan, "북악산"));
        mtinfoArrayList.add(new mtinfo(R.drawable.mt_youngma, "용마산"));
        mtinfoArrayList.add(new mtinfo(R.drawable.mt_bulam, "불암산"));
        mtinfoArrayList.add(new mtinfo(R.drawable.mt_ujang, "우장산"));
        mtinfoArrayList.add(new mtinfo(R.drawable.mt_engbong, "응봉산"));
        mtinfoArrayList.add(new mtinfo(R.drawable.mt_dongmangbong, "동망봉"));
        mtinfoArrayList.add(new mtinfo(R.drawable.mt_yungwang, "용왕산"));
        mtinfoArrayList.add(new mtinfo(R.drawable.mt_gaewha, "개화산"));
        mtinfoArrayList.add(new mtinfo(R.drawable.mt_ilja, "일자산"));
        mtinfoArrayList.add(new mtinfo(R.drawable.mt_bong, "봉산"));
        mtinfoArrayList.add(new mtinfo(R.drawable.mt_gaeunsan, "개운산"));

        MyAdapter myAdapter = new MyAdapter(mtinfoArrayList);

        mRecyclerView.setAdapter(myAdapter);

    }
}

