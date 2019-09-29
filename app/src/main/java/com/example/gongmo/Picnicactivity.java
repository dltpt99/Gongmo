package com.example.gongmo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Picnicactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picnicactivity);
    }

    public void picnic_family(View v){
        Intent intent = new Intent(this, picnic_family.class);
        startActivity(intent);
    }

    public void picnic_couple(View v){
        Intent intent = new Intent(this, picnic_couple.class);
        startActivity(intent);
    }

    public void picnic_solo(View v){
        Intent intent = new Intent(this, picnic_solo.class);
        startActivity(intent);
    }

    public void picnic_pet(View v){
        Intent intent = new Intent(this, picnic_pet.class);
        startActivity(intent);
    }
}
