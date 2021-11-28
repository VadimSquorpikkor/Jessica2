package com.squorpikkor.app.jessica2.fragment;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;

import com.squorpikkor.app.jessica2.Algorithm;

import java.util.ArrayList;

public class F2LFragment extends BaseFragment{

    public static Fragment newInstance() {
        return new F2LFragment();
    }

    @Override
    public MutableLiveData<ArrayList<Algorithm>> getList() {
        return mViewModel.getF2lList();
    }
}
