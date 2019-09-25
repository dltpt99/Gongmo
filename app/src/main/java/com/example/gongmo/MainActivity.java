package com.example.gongmo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void GPSbutton(View v){
        Intent intent = new Intent(this, GPSactivity.class);
        startActivity(intent);
    }

    public void Climbbutton(View v){
        Intent intent = new Intent(this, Climbactivity.class);
        startActivity(intent);
    }

    public void Picnicbutton(View v){
        Intent intent = new Intent(this, Picnicactivity.class);
        startActivity(intent);
    }

    public void Restaurantbutton(View v){
        Intent intent = new Intent(this, Restaurantactivity.class);
        startActivity(intent);
    }
}
