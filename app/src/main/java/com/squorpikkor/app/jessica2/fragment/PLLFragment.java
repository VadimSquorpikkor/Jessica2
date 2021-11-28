package com.squorpikkor.app.jessica2.fragment;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;

import com.squorpikkor.app.jessica2.Algorithm;

import java.util.ArrayList;

public class PLLFragment extends BaseFragment{

    public static Fragment newInstance() {
        return new PLLFragment();
    }

    @Override
    MutableLiveData<ArrayList<Algorithm>> getList() {
        return mViewModel.getPllList();
    }
}
