package com.example.gongmo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Climb_Easy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_climb_easy);



    }

    public void engbong(View v) {
        Intent intent = new Intent(this, Mt_engbong.class);
        startActivity(intent);
    }
    public void ansan_s(View v) {
        Intent intent = new Intent(this, Mt_ansan_s.class);
        startActivity(intent);
    }
    public void baebong_f(View v) {
        Intent intent = new Intent(this, Mt_baebong_f.class);
        startActivity(intent);
    }
    public void gaeun(View v) {
        Intent intent = new Intent(this, Mt_gaeun.class);
        startActivity(intent);
    }
    public void inwang_s(View v) {
        Intent intent = new Intent(this, Mt_inwang_s.class);
        startActivity(intent);
    }
    public void namsan_s(View v) {
        Intent intent = new Intent(this, Mt_namsan_s.class);
        startActivity(intent);
    }
    public void yungwang(View v) {
        Intent intent = new Intent(this, Mt_yungwang.class);
        startActivity(intent);
    }
}