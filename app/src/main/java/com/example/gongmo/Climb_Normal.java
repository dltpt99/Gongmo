package com.example.gongmo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class Climb_Normal extends AppCompatActivity {
    RecyclerView mRecyclerView;
    RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_climb_normal);
    }

    public void umyun_f(View v) {
        Intent intent = new Intent(this, Mt_umyun_f.class);
        startActivity(intent);
    }
    public void umyun_s(View v) {
        Intent intent = new Intent(this, Mt_umyun_s.class);
        startActivity(intent);
    }
    public void daemo(View v) {
        Intent intent = new Intent(this, Mt_daemo.class);
        startActivity(intent);
    }
    public void baebong_s(View v) {
        Intent intent = new Intent(this, Mt_baebong_s.class);
        startActivity(intent);
    }
    public void gaehwa(View v) {
        Intent intent = new Intent(this, Mt_gaehwa.class);
        startActivity(intent);
    }
    public void guryong(View v) {
        Intent intent = new Intent(this, Mt_guryong.class);
        startActivity(intent);
    }
    public void ilja(View v) {
        Intent intent = new Intent(this, Mt_ilja.class);
        startActivity(intent);
    }
    public void ansan_f(View v) {
        Intent intent = new Intent(this, Mt_ansan_f.class);
        startActivity(intent);
    }
    public void inwang_f(View v) {
        Intent intent = new Intent(this, Mt_inwang_f.class);
        startActivity(intent);
    }
    public void inwang_t(View v) {
        Intent intent = new Intent(this, Mt_inwang_t.class);
        startActivity(intent);
    }
    public void bulam(View v) {
        Intent intent = new Intent(this, Mt_bulam.class);
        startActivity(intent);
    }
    public void namsan_f(View v) {
        Intent intent = new Intent(this, Mt_namsan_f.class);
        startActivity(intent);
    }
    public void namsan_t(View v) {
        Intent intent = new Intent(this, Mt_namsan_t.class);
        startActivity(intent);
    }
    public void namsan_four(View v) {
        Intent intent = new Intent(this, Mt_namsan_four.class);
        startActivity(intent);
    }
}