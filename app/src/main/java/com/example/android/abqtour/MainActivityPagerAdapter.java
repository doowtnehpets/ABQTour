package com.example.android.abqtour;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainActivityPagerAdapter extends FragmentPagerAdapter {


    public MainActivityPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        // Return the correct fragment for the current position
        switch (position) {
            case 0:
                return new AttractionsFragment();
            case 1:
                return new EatsFragment();
            case 2:
                return new AttractionsFragment();
            case 3:
                return new AttractionsFragment();
            default:
                return new AttractionsFragment();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Return the correct title for the current position
        switch (position) {
            case 0:
                return "Attracts";
            case 1:
                return "Eats";
            case 2:
                return "Drinks";
            case 3:
                return "Shops";
            default:
                return "ABQ";
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}