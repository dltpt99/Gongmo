package com.example.gongmo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Climb_Hard extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_climb_hard);


    }
    public void dobong(View v) {
        Intent intent = new Intent(this, Mt_dobong_f.class);
        startActivity(intent);
    }
    public void surack(View v) {
        Intent intent = new Intent(this, Mt_surack_f.class);
        startActivity(intent);
    }
    public void youngma(View v) {
        Intent intent = new Intent(this, Mt_youngma_f.class);
        startActivity(intent);
    }

    }


