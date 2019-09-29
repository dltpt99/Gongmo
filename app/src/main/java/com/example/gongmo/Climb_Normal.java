package com.example.gongmo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Climb_Normal extends AppCompatActivity {
    RecyclerView mRecyclerView;
    RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_climb_normal);

        mRecyclerView = findViewById(R.id.recycler_view_Climb_Normal);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new GridLayoutManager(this,3);
        mRecyclerView.setLayoutManager(mLayoutManager);

        ArrayList<mtinfo> mtinfoArrayList = new ArrayList<>();

        mtinfoArrayList.add(new mtinfo(R.drawable.mt_umyun, "우면산1"));
        mtinfoArrayList.add(new mtinfo(R.drawable.mt_umyun, "우면산2"));
        mtinfoArrayList.add(new mtinfo(R.drawable.mt_daemo, "대모산"));
        mtinfoArrayList.add(new mtinfo(R.drawable.mt_baebong, "배봉산2"));
        mtinfoArrayList.add(new mtinfo(R.drawable.mt_gaewha, "개화산"));
        mtinfoArrayList.add(new mtinfo(R.drawable.mt_guryung, "구룡산"));
        mtinfoArrayList.add(new mtinfo(R.drawable.mt_ilja, "일자산"));
        mtinfoArrayList.add(new mtinfo(R.drawable.mt_ansan, "안산1"));
        mtinfoArrayList.add(new mtinfo(R.drawable.mt_inwang, "인왕산1"));
        mtinfoArrayList.add(new mtinfo(R.drawable.mt_inwang, "인왕산3"));
        mtinfoArrayList.add(new mtinfo(R.drawable.mt_bulam, "불암산"));
        mtinfoArrayList.add(new mtinfo(R.drawable.mt_namsan, "남산1"));
        mtinfoArrayList.add(new mtinfo(R.drawable.mt_namsan, "남산3"));
        mtinfoArrayList.add(new mtinfo(R.drawable.mt_namsan, "남산4"));
        MyAdapter myAdapter = new MyAdapter(mtinfoArrayList);

        mRecyclerView.setAdapter(myAdapter);

    }
}