package com.example.gongmo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class picnic_solo extends AppCompatActivity {

    RecyclerView mRecyclerView;
    RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picnic_solo);

        mRecyclerView = findViewById(R.id.recycler_view_solo);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new GridLayoutManager(this,3);
        mRecyclerView.setLayoutManager(mLayoutManager);

        ArrayList<mtinfo> mtinfoArrayList = new ArrayList<>();

        mtinfoArrayList.add(new mtinfo(R.drawable.mt_umyun, "우면산"));
        mtinfoArrayList.add(new mtinfo(R.drawable.mt_daemo, "대모산"));
        mtinfoArrayList.add(new mtinfo(R.drawable.mt_baebong, "배봉산"));
        mtinfoArrayList.add(new mtinfo(R.drawable.mt_ilja, "일자산"));
        mtinfoArrayList.add(new mtinfo(R.drawable.mt_guryung, "구룡산"));
        mtinfoArrayList.add(new mtinfo(R.drawable.mt_dongmangbong, "동망봉"));
        mtinfoArrayList.add(new mtinfo(R.drawable.mt_youngma, "용마산"));
        mtinfoArrayList.add(new mtinfo(R.drawable.mt_bulam, "불암산"));
        mtinfoArrayList.add(new mtinfo(R.drawable.mt_surak, "수락산"));

        MyAdapter myAdapter = new MyAdapter(mtinfoArrayList);

        mRecyclerView.setAdapter(myAdapter);

    }
}

