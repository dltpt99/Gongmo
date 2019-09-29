package com.example.gongmo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class picnic_family extends AppCompatActivity {

    RecyclerView mRecyclerView;
    RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picnic_family);

        mRecyclerView = findViewById(R.id.recycler_view_family);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new GridLayoutManager(this,3);
        mRecyclerView.setLayoutManager(mLayoutManager);

        ArrayList<mtinfo> mtinfoArrayList = new ArrayList<>();
        mtinfoArrayList.add(new mtinfo(R.drawable.mt_umyun, "우면산"));
        mtinfoArrayList.add(new mtinfo(R.drawable.mt_bukan, "북안산"));
        mtinfoArrayList.add(new mtinfo(R.drawable.mt_ujang, "우장산"));
        mtinfoArrayList.add(new mtinfo(R.drawable.mt_daemo, "대모산"));
        mtinfoArrayList.add(new mtinfo(R.drawable.mt_baebong, "배봉산"));
        mtinfoArrayList.add(new mtinfo(R.drawable.mt_yungwang, "용왕산"));
        mtinfoArrayList.add(new mtinfo(R.drawable.mt_ilja, "일자산"));
        mtinfoArrayList.add(new mtinfo(R.drawable.mt_bong, "봉산"));
        mtinfoArrayList.add(new mtinfo(R.drawable.mt_goeun, "고은산"));
        mtinfoArrayList.add(new mtinfo(R.drawable.mt_dongmangbong, "동망산"));
        mtinfoArrayList.add(new mtinfo(R.drawable.mt_dobong1, "도봉산"));
        mtinfoArrayList.add(new mtinfo(R.drawable.mt_inwang, "인왕산"));
        mtinfoArrayList.add(new mtinfo(R.drawable.mt_surak, "수락산"));
        MyAdapter myAdapter = new MyAdapter(mtinfoArrayList);

        mRecyclerView.setAdapter(myAdapter);

    }
}

