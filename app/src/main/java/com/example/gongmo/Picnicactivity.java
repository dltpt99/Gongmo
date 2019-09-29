package com.example.gongmo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Picnicactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picnicactivity);    Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.dev_rv:
                Intent intent = new Intent(this, dev_rv.class);
                startActivity(intent);
                break;
            case R.id.cprt:
                Intent intent2 = new Intent(this, cprt.class);
                startActivity(intent2);
                break;
        }
        return true;
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
