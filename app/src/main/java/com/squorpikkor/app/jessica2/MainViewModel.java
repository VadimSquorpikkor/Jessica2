package com.squorpikkor.app.jessica2;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;

public class MainViewModel extends ViewModel {


    MutableLiveData<ArrayList<Algorithm>> allList;

    public MainViewModel() {
        allList = new MutableLiveData<>();
        allList.setValue(Data.getList());
    }

    public MutableLiveData<ArrayList<Algorithm>> getAllList() {
        return allList;
    }

    @Override
    protected void onCleared() {
        Log.e("TAG", "onDestroy");
        super.onCleared();
    }
}
