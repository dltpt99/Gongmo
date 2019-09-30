package com.example.gongmo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class Climb_Hard extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_climb_hard);


    }
    public void dobong(View v) {
        Intent intent = new Intent(this, Mt_dobong.class);
        startActivity(intent);
    }
    public void surack(View v) {
        Intent intent = new Intent(this, Mt_surack.class);
        startActivity(intent);
    }
    public void youngma(View v) {
        Intent intent = new Intent(this, Mt_youngma.class);
        startActivity(intent);
    }

    }


