package com.squorpikkor.app.jessica2.fragment;

import static com.squorpikkor.app.jessica2.Data.BIG;
import static com.squorpikkor.app.jessica2.Data.FTL;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;

import com.squorpikkor.app.jessica2.Algorithm;

import java.util.ArrayList;

public class BigCubeFragment extends BaseFragment{

    public static Fragment newInstance() {
        return new BigCubeFragment();
    }

    @Override
    int getType() {
        return BIG;
    }
}
