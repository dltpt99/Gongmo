package com.example.gongmo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.tabs.TabLayout;


public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewPager);

        viewPager.setAdapter(new pagerAdapter(getSupportFragmentManager()));
        viewPager.setCurrentItem(0);


        TabLayout tabLayout = findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager, true);

    }



    public void GPSbutton(View v) {
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


