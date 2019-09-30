package com.example.gongmo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class picnic_pet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picnic_pet);

    }

    public void mt_bukhan(View v){
        Intent intent = new Intent(this, mt_bukhan.class);
        startActivity(intent);
    }

    public void mt_youngma(View v){
        Intent intent = new Intent(this, mt_youngma.class);
        startActivity(intent);
    }

    public void mt_bulam(View v){
        Intent intent = new Intent(this, mt_bulam.class);
        startActivity(intent);
    }
    public void mt_gaeun(View v){
        Intent intent = new Intent(this, mt_gaeun.class);
        startActivity(intent);
    }

    public void mt_ujang(View v){
        Intent intent = new Intent(this, mt_ujang.class);
        startActivity(intent);
    }

    public void mt_bong(View v){
        Intent intent = new Intent(this, mt_bong.class);
        startActivity(intent);
    }

    public void mt_engbong(View v){
        Intent intent = new Intent(this, mt_engbong.class);
        startActivity(intent);
    }

    public void mt_dongmang(View v){
        Intent intent = new Intent(this, mt_dongmang.class);
        startActivity(intent);
    }

    public void mt_gaewha(View v){
        Intent intent = new Intent(this, mt_gaewha.class);
        startActivity(intent);
    }

    public void mt_yungwang(View v){
        Intent intent = new Intent(this, mt_yungwang.class);
        startActivity(intent);
    }

    public void mt_ilja(View v){
        Intent intent = new Intent(this, mt_ilja.class);
        startActivity(intent);
    }
}

