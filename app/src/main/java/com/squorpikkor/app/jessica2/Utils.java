package com.squorpikkor.app.jessica2;

import java.util.ArrayList;

public class Utils {

    public static ArrayList<Algorithm> getListByType(ArrayList<Algorithm> list, int type) {
        ArrayList<Algorithm> newList = new ArrayList<>();
        for (Algorithm alg:list) {
            if (alg.getType() == type) {
                newList.add(alg);
            }
        }
        return newList;
    }

}
