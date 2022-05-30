package com.squorpikkor.app.jessica2;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.squorpikkor.app.jessica2.fragment.BigCubeFragment;
import com.squorpikkor.app.jessica2.fragment.F2LFragment;
import com.squorpikkor.app.jessica2.fragment.OLLFragment;
import com.squorpikkor.app.jessica2.fragment.PLLFragment;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    private final int[] TAB_TITLES;
    private final Context mContext;
    private final Fragment[] fragments;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        mContext = context;
        fragments = new Fragment[]{
                F2LFragment.newInstance(),
                OLLFragment.newInstance(),
                PLLFragment.newInstance(),
                BigCubeFragment.newInstance()
        };
        TAB_TITLES = new int[]{R.string.f2l, R.string.oll, R.string.pll, R.string.big};
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragments[position];
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        return fragments.length;
    }
}