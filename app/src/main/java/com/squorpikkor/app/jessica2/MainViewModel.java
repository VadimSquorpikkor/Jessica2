package com.squorpikkor.app.jessica2;

import static com.squorpikkor.app.jessica2.Data.BIG;
import static com.squorpikkor.app.jessica2.Data.FTL;
import static com.squorpikkor.app.jessica2.Data.OLL;
import static com.squorpikkor.app.jessica2.Data.PLL;

import android.util.Log;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;

public class MainViewModel extends ViewModel {

    public static final String TAG = "TAG";

    ArrayList<Algorithm> allList;
    ArrayList<Algorithm> f2lList;
    ArrayList<Algorithm> ollList;
    ArrayList<Algorithm> pllList;
    ArrayList<Algorithm> bigList;

    public MainViewModel() {
        ArrayList<Algorithm> list = Data.getList();
        allList = list;
        f2lList = Utils.getListByType(list, FTL);
        ollList = Utils.getListByType(list, OLL);
        pllList = Utils.getListByType(list, PLL);
        bigList = Utils.getListByType(list, BIG);
    }

    @Override
    protected void onCleared() {
        Log.e("TAG", "onDestroy");
        super.onCleared();
    }

    public ArrayList<Algorithm> getList(int type) {
        switch (type) {
            case FTL:return f2lList;
            case OLL:return ollList;
            case PLL:return pllList;
            case BIG:return bigList;
        }
        return allList;
    }
}
