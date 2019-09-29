package com.example.gongmo;


import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

class pagerAdapter extends FragmentStatePagerAdapter
{
    protected pagerAdapter(FragmentManager fm)
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