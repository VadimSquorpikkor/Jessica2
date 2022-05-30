package com.squorpikkor.app.jessica2.fragment;

import static com.squorpikkor.app.jessica2.data.Data.PLL;

import androidx.fragment.app.Fragment;

public class PLLFragment extends BaseFragment{

    public static Fragment newInstance() {
        return new PLLFragment();
    }

    @Override
    int getType() {
        return PLL;
    }
}
