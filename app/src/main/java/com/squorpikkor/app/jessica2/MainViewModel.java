package com.squorpikkor.app.jessica2;

import android.util.Log;
import androidx.lifecycle.ViewModel;

import com.squorpikkor.app.jessica2.data.Algorithm;
import com.squorpikkor.app.jessica2.data.Data;

import java.util.ArrayList;

public class MainViewModel extends ViewModel {

    public static final String TAG = "TAG";
    public final Data data;

    public MainViewModel() {
        data = new Data();
    }

    public ArrayList<Algorithm> getList(int type) {
        return data.getList(type);
    }

    @Override
    protected void onCleared() {
        Log.e(TAG, "onDestroy");
        super.onCleared();
    }
}
