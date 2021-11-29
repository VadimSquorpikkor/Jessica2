package com.squorpikkor.app.jessica2;

import java.util.ArrayList;

public class Data {

    public static final int FTL = 1;
    public static final int OLL = 2;
    public static final int PLL = 3;
    public static final int BIG = 4;

    public static ArrayList<Algorithm> getList() {
        ArrayList<Algorithm> list = new ArrayList<>();
        list.add(new Algorithm(FTL, R.drawable.f2l01, 1, "1", "U R U' R' U' y L' U L"));
        list.add(new Algorithm(FTL, R.drawable.f2l02, 1, "2", "y U' L' U L U y' R U' R'"));
        list.add(new Algorithm(FTL, R.drawable.f2l03, 1, "1", "U R U' R'\n" +
                "R' F R F'"));
        list.add(new Algorithm(FTL, R.drawable.f2l04, 1, "1", "y U' L' U L\n" +
                "F R' F' R"));
        list.add(new Algorithm(FTL, R.drawable.f2l05, 1, "1", "R U R'"));
        list.add(new Algorithm(FTL, R.drawable.f2l06, 1, "1", "y L' U' L"));
        list.add(new Algorithm(FTL, R.drawable.f2l07, 1, "1", "d R' U' R U2 R' U R\n" +
                "y U L' U' L U2 L' U L\n" +
                "U' r U' R' U R U r'"));
        list.add(new Algorithm(FTL, R.drawable.f2l08, 1, "1", "d R' U2 R U2 R' U R\n" +
                "r' U2 R2 U R2’ U r\n" +
                "y U L' U2 L U2 L' U L"));
        list.add(new Algorithm(FTL, R.drawable.f2l09, 1, "", "U' R U2 R' U2 R U' R'\n" +
                "U' R U2 R' U' R U2 R'\n" +
                "U' R U2 R' U R' F R F'"));
        list.add(new Algorithm(FTL, R.drawable.f2l10, 1, "", "U' R U R' U2 R U' R'\n" +
                "U' R U R' U' R U2 R'\n" +
                "U' R U R' U R' F R F'"));
        list.add(new Algorithm(FTL, R.drawable.f2l11, 1, "", "U' R U R' U R U R'\n" +
                "U y' R' U R U' y R U R'\n" +
                "U2 R U' R' U' R U R'"));
        list.add(new Algorithm(FTL, R.drawable.f2l12, 1, "", "U' R U' R' U F' U' F\n" +
                "U' R U' R' d R' U' R\n" +
                "F R U R' U' F' R U' R'"));
        list.add(new Algorithm(FTL, R.drawable.f2l13, 1, "", "U' R U' R' U R U R'\n" +
                "y L' U2 L U2 F U2 F' U F U' F'\n" +
                "R U' R' U R U2 R' U2 R U' R'"));
        list.add(new Algorithm(FTL, R.drawable.f2l14, 1, "", "y' U R' U R U' R' U' R\n" +
                "d R' U R U' R' U' R\n" +
                "M' U' R U R' U' R U2 r'"));
        list.add(new Algorithm(FTL, R.drawable.f2l15, 1, "", "R U' R' U R U' R' U2 R U' R'\n" +
                "R' U2 R2 U R2 U R\n" +
                "U F' U2 F U' R U R'"));
        list.add(new Algorithm(FTL, R.drawable.f2l16, 1, "", "U' R U2 R' U F' U' F\n" +
                "U' R U2 R' d R' U' R\n" +
                "y' R U2 R2 U' R2 U' R'"));
        list.add(new Algorithm(FTL, R.drawable.f2l17, 1, "", "R U' R' U2 F' U' F\n" +
                "R U' R' U2 y L' U' L\n" +
                "R U' R' U d R' U' R"));
        list.add(new Algorithm(FTL, R.drawable.f2l18, 1, "", "R U R' U2 R U' R' U R U' R'\n" +
                "y L' U L U2 y' R U R'\n" +
                "R U2 R' U R U R' U R U' R'"));
        list.add(new Algorithm(FTL, R.drawable.f2l19, 1, "", "U2 R' F R F' U2 R U R'\n" +
                "U F' U' F U' R U R'\n" +
                "R2 u R U R' U' u' R' U R'"));
        list.add(new Algorithm(FTL, R.drawable.f2l20, 1, "", "U' R U' R' U2 R U' R'\n" +
                "U' R U' R' U R' F R F'\n" +
                "R U R' U' R U' R' U R U' R'"));
        list.add(new Algorithm(FTL, R.drawable.f2l21, 1, "", "U R U R' U2 R U R'\n" +
                "U' R U2 R' U R U R'\n" +
                "y U L' U L U2 L' U L"));
        list.add(new Algorithm(FTL, R.drawable.f2l22, 1, "", "U' R U' R' U2 R U' R'\n" +
                "U' R U' R' U R' F R F'\n" +
                "R U R' U' R U' R' U R U' R'"));
        list.add(new Algorithm(FTL, R.drawable.f2l23, 1, "", "U' R' F R F' R U' R'\n" +
                "R U' R' y L' U2 L\n" +
                "l F' R U' R' U l'"));
        list.add(new Algorithm(FTL, R.drawable.f2l24, 1, "", "R U R' U' R U R' U' R U R'\n" +
                "U R U' R' U R U' R' U R U' R'\n" +
                "R2 U R2 U R2 U2 R2"));
        list.add(new Algorithm(FTL, R.drawable.f2l25, 1, "", "y' U' R' U2 R U' R' U R\n" +
                "y U' L' U2 L U' L' U L\n" +
                "U' R U' R2 F R F' R U' R'"));
        list.add(new Algorithm(FTL, R.drawable.f2l26, 1, "", "F' L' U2 L F\n" +
                "y' U2 R' U' R U' R' U R\n" +
                "r U' r' U2 r U r'"));
        list.add(new Algorithm(FTL, R.drawable.f2l27, 1, "", "U2 R U R' U R U' R'\n" +
                "R U' R' U2 R U R'\n" +
                "y F R U2 R' F'"));
        list.add(new Algorithm(FTL, R.drawable.f2l28, 1, "", "U R U2 R' U R U' R'\n" +
                "U R U2 R2 F R F'\n" +
                "R U' R' U R U' R' U R U R'"));
        list.add(new Algorithm(FTL, R.drawable.f2l29, 1, "", "R U2 R' U' R U R'\n" +
                "y L F' L' F L' U L U' L' U L\n" +
                "U' R U' R' U2 R U2 R2 F R F'"));
        list.add(new Algorithm(FTL, R.drawable.f2l30, 1, "", "y' R' U2 R U R' U' R\n" +
                "y L' U2 L U L' U' L\n" +
                "R' F R F' R U' R' U R U' R'"));
        list.add(new Algorithm(FTL, R.drawable.f2l31, 1, "", "R U R' U2 R U R' U' R U R'\n" +
                "U R U' R' U' R U' R' U R U' R'\n" +
                "U2 R2 U2 R' U' R U' R2"));
        list.add(new Algorithm(FTL, R.drawable.f2l32, 1, "", "F U R U' R' F' R U' R'\n" +
                "U' R U R2 F R F' R U' R'\n" +
                "y U' L' U L U L' U L U' L' U L"));
        list.add(new Algorithm(FTL, R.drawable.f2l33, 1, "", "R U R' U' F R' F' R\n" +
                "y L' U L U' L' U L\n" +
                "y' R' U R U' R' U R"));
        list.add(new Algorithm(FTL, R.drawable.f2l34, 1, "", ""));
        list.add(new Algorithm(FTL, R.drawable.f2l35, 1, "", "R U' R' U R U' R'\n" +
                "R U' R2 F R F'\n" +
                "y L' U' L U2 F U' F'"));
        list.add(new Algorithm(FTL, R.drawable.f2l36, 1, "", "R U R' U' F R' F' R\n" +
                "y L' U L U' L' U L\n" +
                "y' R' U R U' R' U R"));
        list.add(new Algorithm(FTL, R.drawable.f2l37, 1, "", "R U R' U' R U2 R' U' R U R'\n" +
                "R U' R' U' R U R' U2 R U' R'\n" +
                "R2 U2 R' U' R U' R' U2 R'"));
        list.add(new Algorithm(FTL, R.drawable.f2l38, 1, "", "R U R' U2 R U' R' U R U R'\n" +
                "R U' R' U R U2 R' U R U' R'\n" +
                "R U2 R U R' U R U2 R2"));
        list.add(new Algorithm(FTL, R.drawable.f2l39, 1, "", "R U' R' F R U R' U' F' R U' R'\n" +
                "r U' r' U2 r U r' R U R'\n" +
                "R F U R U' R' F' U' R'"));
        list.add(new Algorithm(FTL, R.drawable.f2l40, 1, "", "R U R' U' R U' R' U2 y' R' U' R\n" +
                "R U F R U R' U' F' R'\n" +
                "R U' R' F' L' U2 L F"));
        list.add(new Algorithm(FTL, R.drawable.f2l41, 1, "", "R' F R F' R U' R' U R U' R' U2 R U' R'\n" +
                "R U' R' U y' R' U2 R U2' R' U R\n"+"мой: R U R' Г2 R U2 R' U'(мизинцем) y L' U' L"));

        list.add(new Algorithm(OLL, R.drawable.oll01, 1, "", ""));
        list.add(new Algorithm(OLL, R.drawable.oll02, 1, "", ""));
        list.add(new Algorithm(OLL, R.drawable.oll03, 1, "", ""));
        list.add(new Algorithm(OLL, R.drawable.oll04, 1, "", ""));
        list.add(new Algorithm(OLL, R.drawable.oll05, 1, "", ""));
        list.add(new Algorithm(OLL, R.drawable.oll06, 1, "", ""));
        list.add(new Algorithm(OLL, R.drawable.oll08, 1, "", ""));
        list.add(new Algorithm(OLL, R.drawable.oll09, 1, "", ""));
        list.add(new Algorithm(OLL, R.drawable.oll20, 1, "", ""));
        list.add(new Algorithm(OLL, R.drawable.oll21, 1, "", ""));
        list.add(new Algorithm(OLL, R.drawable.oll22, 1, "", ""));
        list.add(new Algorithm(OLL, R.drawable.oll23, 1, "", ""));
        list.add(new Algorithm(OLL, R.drawable.oll24, 1, "", ""));
        list.add(new Algorithm(OLL, R.drawable.oll25, 1, "", ""));
        list.add(new Algorithm(OLL, R.drawable.oll26, 1, "", ""));
        list.add(new Algorithm(OLL, R.drawable.oll27, 1, "", ""));
        list.add(new Algorithm(OLL, R.drawable.oll28, 1, "", ""));
        list.add(new Algorithm(OLL, R.drawable.oll29, 1, "", ""));
        list.add(new Algorithm(OLL, R.drawable.oll30, 1, "", ""));
        list.add(new Algorithm(OLL, R.drawable.oll31, 1, "", ""));
        list.add(new Algorithm(OLL, R.drawable.oll32, 1, "", ""));
        list.add(new Algorithm(OLL, R.drawable.oll33, 1, "", ""));
        list.add(new Algorithm(OLL, R.drawable.oll34, 1, "", ""));
        list.add(new Algorithm(OLL, R.drawable.oll35, 1, "", ""));
        list.add(new Algorithm(OLL, R.drawable.oll36, 1, "", ""));
        list.add(new Algorithm(OLL, R.drawable.oll37, 1, "", ""));
        list.add(new Algorithm(OLL, R.drawable.oll39, 1, "", ""));
        list.add(new Algorithm(OLL, R.drawable.oll40, 1, "", ""));
        list.add(new Algorithm(OLL, R.drawable.oll41, 1, "", ""));
        list.add(new Algorithm(OLL, R.drawable.oll42, 1, "", ""));
        list.add(new Algorithm(OLL, R.drawable.oll43, 1, "", ""));
        list.add(new Algorithm(OLL, R.drawable.oll44, 1, "", ""));
        list.add(new Algorithm(OLL, R.drawable.oll45, 1, "", ""));
        list.add(new Algorithm(OLL, R.drawable.oll46, 1, "", ""));
        list.add(new Algorithm(OLL, R.drawable.oll47, 1, "", ""));
        list.add(new Algorithm(OLL, R.drawable.oll48, 1, "", ""));
        list.add(new Algorithm(OLL, R.drawable.oll49, 1, "", ""));
        list.add(new Algorithm(OLL, R.drawable.oll50, 1, "", ""));
        list.add(new Algorithm(OLL, R.drawable.oll51, 1, "", ""));
        list.add(new Algorithm(OLL, R.drawable.oll52, 1, "", ""));
        list.add(new Algorithm(OLL, R.drawable.oll53, 1, "", ""));
        list.add(new Algorithm(OLL, R.drawable.oll54, 1, "", ""));
        list.add(new Algorithm(OLL, R.drawable.oll55, 1, "", ""));
        list.add(new Algorithm(OLL, R.drawable.oll56, 1, "", ""));
        list.add(new Algorithm(OLL, R.drawable.oll57, 1, "", ""));

        list.add(new Algorithm(OLL, R.drawable.pll01, 1, "", "3"));
        list.add(new Algorithm(OLL, R.drawable.pll02, 1, "", "3"));
        list.add(new Algorithm(OLL, R.drawable.pll03, 1, "", "3"));
        list.add(new Algorithm(OLL, R.drawable.pll04, 1, "", "3"));
        list.add(new Algorithm(OLL, R.drawable.pll05, 1, "", "3"));
        list.add(new Algorithm(OLL, R.drawable.pll06, 1, "", "3"));
        list.add(new Algorithm(OLL, R.drawable.pll07, 1, "", "3"));
        list.add(new Algorithm(OLL, R.drawable.pll08, 1, "", "3"));
        list.add(new Algorithm(OLL, R.drawable.pll09, 1, "", "3"));
        list.add(new Algorithm(OLL, R.drawable.pll20, 1, "", "3"));
        list.add(new Algorithm(OLL, R.drawable.pll21, 1, "", "3"));

        return list;
    }
}
