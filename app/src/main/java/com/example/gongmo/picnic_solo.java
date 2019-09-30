package com.example.gongmo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class picnic_solo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picnic_solo);

    }

    public void mt_umyun(View v){
        Intent intent = new Intent(this, picnic_mt_umyun.class);
        startActivity(intent);
    }

    public void mt_guryung(View v){
        Intent intent = new Intent(this, picnic_mt_guryung.class);
        startActivity(intent);
    }

    public void mt_ilja(View v){
        Intent intent = new Intent(this, picnic_mt_ilja.class);
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

    public void mt_surak(View v){
        Intent intent = new Intent(this, picnic_mt_surak.class);
        startActivity(intent);
    }

    public void mt_youngma(View v){
        Intent intent = new Intent(this, picnic_mt_youngma.class);
        startActivity(intent);
    }

    public void mt_dongmang(View v){
        Intent intent = new Intent(this, picnic_mt_dongmang.class);
        startActivity(intent);
    }

    public void mt_bulam(View v){
        Intent intent = new Intent(this, picnic_mt_bulam.class);
        startActivity(intent);
    }


}

