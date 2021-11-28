package com.squorpikkor.app.jessica2;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;

public class BigCubeFragment extends BaseFragment{

    public static Fragment newInstance() {
        return new BigCubeFragment();
    }

    @Override
    MutableLiveData<ArrayList<Algorithm>> getList() {
        return mViewModel.getAllList();//todo выбрать лист для отображения
    }
}
