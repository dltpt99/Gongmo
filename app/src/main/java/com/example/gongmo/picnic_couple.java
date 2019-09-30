package com.example.gongmo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class picnic_couple extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picnic_picnic_couple);

    }

    public void mt_namsan(View v){
        Intent intent = new Intent(this, picnic_mt_namsan.class);
        startActivity(intent);
    }
    public void mt_yungwang(View v){
        Intent intent = new Intent(this, picnic_mt_yungwang.class);
        startActivity(intent);
    }

    public void mt_ujang(View v){
        Intent intent = new Intent(this, picnic_mt_ujang.class);
        startActivity(intent);
    }

    public void mt_ansan(View v){
        Intent intent = new Intent(this, picnic_mt_ansan.class);
        startActivity(intent);
    }

    public void mt_inwang(View v){
        Intent intent = new Intent(this, picnic_mt_inwang.class);
        startActivity(intent);
    }
}

