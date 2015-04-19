package edu.ncsu.csc454.huddleup.adapter;

/**
 * Created by nicole on 4/18/15.
 */
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import edu.ncsu.csc454.huddleup.HomeFragment;
import edu.ncsu.csc454.huddleup.MapFragment;
import edu.ncsu.csc454.huddleup.MessagesFragment;

public class TabsPagerAdapter extends FragmentPagerAdapter {

    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int index) {

        switch (index) {
            case 0:
                // Top Rated fragment activity
                return new HomeFragment();
            case 1:
                // Games fragment activity
                return new MapFragment();
            case 2:
                // Movies fragment activity
                return new MessagesFragment();
        }

        return null;
    }

    @Override
    public int getCount() {
        // get item count - equal to number of tabs
        return 3;
    }

}
