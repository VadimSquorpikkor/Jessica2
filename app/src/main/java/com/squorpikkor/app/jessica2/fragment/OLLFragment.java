package com.squorpikkor.app.jessica2.fragment;

import static com.squorpikkor.app.jessica2.Data.OLL;

import androidx.fragment.app.Fragment;

public class OLLFragment extends BaseFragment{

    public static Fragment newInstance() {
        return new OLLFragment();
    }

    @Override
    int getType() {
        return OLL;
    }
}
