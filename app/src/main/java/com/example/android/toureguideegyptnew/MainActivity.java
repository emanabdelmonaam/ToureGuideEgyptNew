package com.example.android.toureguideegyptnew;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private TabLayout mtabLayout;
    private  AppCompatActivity appCompatActivity;
    private ViewPager mviewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the view pager that will allow the user to swipe between fragments
        ViewPager mviewPager = (ViewPager) findViewById(R.id.view_pager);

        // Create an adapter that knows which fragment should be shown on each page
        ViewPagerAdapter adapter = new ViewPagerAdapter(this, getSupportFragmentManager());

        // Set the adapter onto the view pager
        mviewPager.setAdapter(adapter);

        // Find the tab layout that shows the tabs
        TabLayout mtabLayout = (TabLayout) findViewById(R.id.tab_layout);

        // Connect the tab layout with the view pager. This will
        //   1. Update the tab layout when the view pager is swiped
        //   2. Update the view pager when a tab is selected
        //   3. Set the tab layout's tab names with the view pager's adapter's titles
        //      by calling onPageTitle()
        mtabLayout.setupWithViewPager(mviewPager);
    }
}
