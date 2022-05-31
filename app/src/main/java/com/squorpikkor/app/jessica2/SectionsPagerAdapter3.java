package com.squorpikkor.app.jessica2;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.squorpikkor.app.jessica2.fragment.BigCubeFragment;
import com.squorpikkor.app.jessica2.fragment.F2LFragment;
import com.squorpikkor.app.jessica2.fragment.OLLFragment;
import com.squorpikkor.app.jessica2.fragment.PLLFragment;

public class SectionsPagerAdapter3 extends FragmentStateAdapter {

    private final int[] TAB_TITLES;
    private final Context mContext;
    private final Fragment[] fragments;

    public SectionsPagerAdapter3(FragmentActivity fa) {
        super(fa);
        mContext = fa;
        fragments = new Fragment[]{
                F2LFragment.newInstance(),
                OLLFragment.newInstance(),
                PLLFragment.newInstance(),
                BigCubeFragment.newInstance()
        };
        TAB_TITLES = new int[]{R.string.f2l, R.string.oll, R.string.pll, R.string.big};
    }

    @Override
    public Fragment createFragment(int position) {
        return fragments[position];
    }

    @Override
    public int getItemCount() {
        return fragments.length;
    }
}