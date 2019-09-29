package com.example.gongmo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Climbactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_climbactivity);

    }

    public void climb_easy(View v) {
        Intent intent = new Intent(this, Climb_Easy.class);
        startActivity(intent);
    }

    public void climb_normal(View v) {
        Intent intent = new Intent(this, Climb_Normal.class);
        startActivity(intent);
    }

    public void climb_hard(View v) {
        Intent intent = new Intent(this, Climb_Hard.class);
        startActivity(intent);
    }
}