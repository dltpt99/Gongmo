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
    public void beginner(View v){
        Intent intent = new Intent(this, beginner.class);
        startActivity(intent);
    }
    public void ama(View v){
        Intent intent = new Intent(this, ama.class);
        startActivity(intent);
    }
    public void pro(View v){
        Intent intent = new Intent(this, pro.class);
        startActivity(intent);
    }
}
