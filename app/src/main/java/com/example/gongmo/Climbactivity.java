package com.example.gongmo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Climbactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_climbactivity);
        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
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

    public void climb_easy(View v) {
        Intent intent = new Intent(this, Climb_Easy.class);
        startActivity(intent);
    }

    public void climb_normal(View v) {
        Intent intent = new Intent(this, Climb_Normal.class);
        startActivity(intent);
    }

    public void climb_hard(View v) {
        Intent intent = new Intent(this, Climb_Hard.class);
        startActivity(intent);
    }
}