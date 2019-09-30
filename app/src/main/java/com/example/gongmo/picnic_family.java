package com.example.gongmo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class picnic_family extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picnic_picnic_family);


    }

    public void mt_umyun(View v){
        Intent intent = new Intent(this, picnic_mt_umyun.class);
        startActivity(intent);
    }

    public void mt_bukan(View v){
        Intent intent = new Intent(this, picnic_mt_bukan.class);
        startActivity(intent);
    }
    public void mt_ujang(View v){
        Intent intent = new Intent(this, picnic_mt_ujang.class);
        startActivity(intent);
    }
    public void mt_daemo(View v){
        Intent intent = new Intent(this, picnic_mt_daemo.class);
        startActivity(intent);
    }
    public void mt_baebong(View v){
        Intent intent = new Intent(this, picnic_mt_baebong.class);
        startActivity(intent);
    }
    public void mt_yungwang(View v){
        Intent intent = new Intent(this, picnic_mt_yungwang.class);
        startActivity(intent);
    }
    public void mt_ilja(View v){
        Intent intent = new Intent(this, picnic_mt_ilja.class);
        startActivity(intent);
    }
    public void mt_bong(View v){
        Intent intent = new Intent(this, picnic_mt_bong.class);
        startActivity(intent);
    }
    public void mt_goeun(View v){
        Intent intent = new Intent(this, picnic_mt_goeun.class);
        startActivity(intent);
    }
    public void mt_dongmang(View v){
        Intent intent = new Intent(this, picnic_mt_dongmang.class);
        startActivity(intent);
    }
    public void mt_dobong(View v){
        Intent intent = new Intent(this, picnic_mt_dobong.class);
        startActivity(intent);
    }
    public void mt_inwang(View v){
        Intent intent = new Intent(this, picnic_mt_inwang.class);
        startActivity(intent);
    }
    public void mt_surak(View v){
        Intent intent = new Intent(this, picnic_mt_surak.class);
        startActivity(intent);
    }


}

