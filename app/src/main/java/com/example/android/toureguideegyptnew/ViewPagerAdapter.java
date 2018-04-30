package com.example.android.toureguideegyptnew;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class ViewPagerAdapter extends FragmentPagerAdapter {

    private final List<Fragment>fragmentList = new ArrayList<>();
    private final List<String> fragmentListTitles = new ArrayList<>();

    private Context mcontext;

    public ViewPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mcontext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new TourismFragment();
        } else if (position == 1) {
            return new RestaurantsFragment();
        } else if (position == 2) {
            return new HospitalsFragment();
        } else if (position == 3){
            return new ActivityFragment();
        } else {
        return new ShoppingFragment();

        }
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {
       // return fragmentListTitles.get(position);
        if (position == 0) {
            return mcontext.getString(R.string.category_tourism);
        } else if (position == 1) {
            return mcontext.getString(R.string.category_restaurant);
        } else if (position == 2) {
            return mcontext.getString(R.string.category_hospital);
        } else if (position ==3){
            return mcontext.getString(R.string.category_activity);
        }else {
            return mcontext.getString(R.string.category_shopping);
        }
    }
}