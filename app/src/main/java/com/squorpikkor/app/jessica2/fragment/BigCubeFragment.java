package com.squorpikkor.app.jessica2.fragment;

import static com.squorpikkor.app.jessica2.data.Data.BIG;

import androidx.fragment.app.Fragment;

public class BigCubeFragment extends BaseFragment{

    public static Fragment newInstance() {
        return new BigCubeFragment();
    }

    @Override
    int getType() {
        return BIG;
    }

    @Override
    public int getColumn(){
        return 3;
    }
}
