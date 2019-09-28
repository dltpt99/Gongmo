package com.example.gongmo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager =  findViewById(R.id.viewPager);
        viewPager.setAdapter(new pagerAdapter(getSupportFragmentManager()));
        }

    private class pagerAdapter extends FragmentStatePagerAdapter
    {
        private pagerAdapter(FragmentManager fm)
        {
            super(fm);
        }
        @Override
        public Fragment getItem(int position)
        {
            switch(position)
            {
                case 0:
                    return new fragment_first();
                case 1:
                    return new fragment_second();
                case 2:
                    return new fragment_third();
            }
            return null;
        }
        @Override
        public int getCount()
        {
            return 3;
        }
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
