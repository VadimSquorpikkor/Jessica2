package com.squorpikkor.app.jessica2;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.squorpikkor.app.jessica2.fragment.BigCubeFragment;
import com.squorpikkor.app.jessica2.fragment.F2LFragment;
import com.squorpikkor.app.jessica2.fragment.OLLFragment;
import com.squorpikkor.app.jessica2.fragment.PLLFragment;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter2 extends FragmentPagerAdapter {

    public SectionsPagerAdapter2(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0 : return F2LFragment.newInstance();
            case 1 : return OLLFragment.newInstance();
            case 2 : return PLLFragment.newInstance();
            case 3 : return BigCubeFragment.newInstance();
        }
        return null;
    }
    @Override
    public int getCount() {
        // Show 3 total pages.
        return 4;
    }

    private static final int[] TAB_TITLES = new int[]{R.string.f2l, R.string.oll, R.string.pll, R.string.big};

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0: return "1";
            case 1: return "2";
            case 2: return "3";
            case 3: return "4";
        }
        return null;
    }
}