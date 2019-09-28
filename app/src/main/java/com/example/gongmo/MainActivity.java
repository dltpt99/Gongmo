package com.example.gongmo;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {
    ViewFlipper v_fllipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int[] images = {
                R.drawable.mt_bukhan,
                R.drawable.mt_chunggye,
                R.drawable.mt_dobong
        };
        v_fllipper = findViewById(R.id.image_slide);

        for(int image : images) {
            fllipperImages(image);
        }

    }

    public void fllipperImages(int image) {
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);

        v_fllipper.addView(imageView);      // 이미지 추가
        v_fllipper.setFlipInterval(4000);       // 자동 이미지 슬라이드 딜레이시간(1000 당 1초)
        v_fllipper.setAutoStart(true);          // 자동 시작 유무 설정

        // animation
        v_fllipper.setInAnimation(this,android.R.anim.slide_in_left);
        v_fllipper.setOutAnimation(this,android.R.anim.slide_out_right);
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
