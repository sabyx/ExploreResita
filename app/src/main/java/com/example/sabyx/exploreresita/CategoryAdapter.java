package com.example.sabyx.exploreresita;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.sabyx.exploreresita.fragment.AttractionsFragment;
import com.example.sabyx.exploreresita.fragment.EventsFragment;
import com.example.sabyx.exploreresita.fragment.PlacesFragment;
import com.example.sabyx.exploreresita.fragment.RestaurantsFragment;

public class CategoryAdapter extends FragmentPagerAdapter{

    private String[] tabTitles;
    private Context context;

    public CategoryAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
        tabTitles = new String[4];
        tabTitles[0] = context.getResources().getString(R.string.tab_attractions);
        tabTitles[1] = context.getResources().getString(R.string.tab_restaurants);
        tabTitles[2] = context.getResources().getString(R.string.tab_events);
        tabTitles[3] = context.getResources().getString(R.string.tab_places);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new AttractionsFragment();
            case 1:
                return new RestaurantsFragment();
            case 2:
                return new EventsFragment();
            default:
                return new PlacesFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}
