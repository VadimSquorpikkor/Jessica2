package com.squorpikkor.app.jessica2;

import java.util.ArrayList;

class Data {

    public static final int FTL = 1;
    public static final int OLL = 2;
    public static final int PLL = 3;
    public static final int BIG = 4;

    static ArrayList<Algorithm> getList() {
        ArrayList<Algorithm> list = new ArrayList<>();
        list.add(new Algorithm(FTL, "RURUR", "1", 1, 1));
        list.add(new Algorithm(FTL, "LURLUR", "2", 1, 1));
        list.add(new Algorithm(FTL, "RULUR", "3", 1, 1));
        return list;
    }
}
