package com.squorpikkor.app.jessica2.fragment;

import static com.squorpikkor.app.jessica2.Data.FTL;
import androidx.fragment.app.Fragment;

public class F2LFragment extends BaseFragment{

    public static Fragment newInstance() {
        return new F2LFragment();
    }

    @Override
    int getType() {
        return FTL;
    }
}
