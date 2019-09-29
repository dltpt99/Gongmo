package com.example.gongmo;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class picnic_family extends Activity {

    private RecyclerView rv;
    private LinearLayoutManager llm;
    private List<Integer> count;
    private int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv =  (RecyclerView) findViewById(R.id.main_rv);
        llm = new LinearLayoutManager(this);

        count = new ArrayList<>();

        rv.setHasFixedSize(true);
        rv.setLayoutManager(llm);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.main_btn_add : {
                i ++;
                count.add(i);
                RvAdapter adapter = new RvAdapter(getApplication(), count, i);
                rv.setAdapter(adapter);
                Log.d("Count", count + "");
                break;
            }
        }
    }
}