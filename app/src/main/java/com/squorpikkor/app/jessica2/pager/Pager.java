package com.squorpikkor.app.jessica2.pager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.squorpikkor.app.jessica2.fragment.AlgoInfoFragment;

public class Pager extends FragmentStatePagerAdapter {

    private final int size;
    private final int type;

    public Pager(@NonNull FragmentManager fm, int behavior, int size, int type) {
        super(fm, behavior);
        this.size = size;
        this.type = type;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return AlgoInfoFragment.newInstance(position, type);
    }

    @Override
    public int getCount() {
        return size;
    }
}
