package com.example.adamoates.tours;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by adamoates on 7/7/17.
 */

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    public SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new HotelFragment();
        } else if (position == 1) {
            return new ResturantsFragment();
        } else if (position == 2) {
            return new CoffeeShopFragment();
        } else if (position == 3) {
            return new MallFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }

}
