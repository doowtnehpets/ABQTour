package com.example.android.abqtour;


import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainActivityPagerAdapter extends FragmentPagerAdapter {

    Context context;

    public MainActivityPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
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
                return new DrinksFragment();
            case 3:
                return new ShopsFragment();
            default:
                return new AttractionsFragment();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Return the correct title for the current position
        switch (position) {
            case 0:
                return context.getString(R.string.page_attracts);
            case 1:
                return context.getString(R.string.page_eats);
            case 2:
                return context.getString(R.string.page_drinks);
            case 3:
                return context.getString(R.string.page_shops);
            default:
                return context.getString(R.string.page_attracts);
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}