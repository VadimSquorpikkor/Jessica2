package com.squorpikkor.app.jessica2;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;

public class MainViewModel extends ViewModel {

    MutableLiveData<ArrayList<Algorithm>> allList;
    MutableLiveData<ArrayList<Algorithm>> f2lList;
    MutableLiveData<ArrayList<Algorithm>> ollList;
    MutableLiveData<ArrayList<Algorithm>> pllList;
    MutableLiveData<ArrayList<Algorithm>> bigList;

    public MainViewModel() {
        ArrayList<Algorithm> list = Data.getList();
        allList = new MutableLiveData<>(list);
        f2lList = new MutableLiveData<>(Utils.getListByType(list, Data.FTL));
        ollList = new MutableLiveData<>(Utils.getListByType(list, Data.OLL));
        pllList = new MutableLiveData<>(Utils.getListByType(list, Data.PLL));
        bigList = new MutableLiveData<>(Utils.getListByType(list, Data.BIG));
    }

    public MutableLiveData<ArrayList<Algorithm>> getAllList() {
        return allList;
    }
    public MutableLiveData<ArrayList<Algorithm>> getF2lList() {
        return f2lList;
    }
    public MutableLiveData<ArrayList<Algorithm>> getOllList() {
        return ollList;
    }
    public MutableLiveData<ArrayList<Algorithm>> getPllList() {
        return pllList;
    }
    public MutableLiveData<ArrayList<Algorithm>> getBigList() {
        return bigList;
    }

    @Override
    protected void onCleared() {
        Log.e("TAG", "onDestroy");
        super.onCleared();
    }
}
