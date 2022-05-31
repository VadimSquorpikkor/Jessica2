package com.squorpikkor.app.jessica2;

import static com.squorpikkor.app.jessica2.data.Data.BIG;
import static com.squorpikkor.app.jessica2.data.Data.FTL;
import static com.squorpikkor.app.jessica2.data.Data.OLL;
import static com.squorpikkor.app.jessica2.data.Data.PLL;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.squorpikkor.app.jessica2.fragment.GridFragment;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter4 extends FragmentPagerAdapter {

    private final int[] TAB_TITLES;
    private final Context mContext;
    private final Fragment[] fragments;

    public SectionsPagerAdapter4(Context context, FragmentManager fm) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        mContext = context;
        fragments = new Fragment[]{
                GridFragment.newInstance(5, FTL),
                GridFragment.newInstance(5, OLL),
                GridFragment.newInstance(5, PLL),
                GridFragment.newInstance(3, BIG)
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