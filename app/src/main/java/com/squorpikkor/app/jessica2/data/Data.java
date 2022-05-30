package com.squorpikkor.app.jessica2.data;

import com.squorpikkor.app.jessica2.R;
import com.squorpikkor.app.jessica2.Utils;

import java.util.ArrayList;

public class Data {

    public static final int FTL = 1;
    public static final int OLL = 2;
    public static final int PLL = 3;
    public static final int BIG = 4;

    public ArrayList<Algorithm> getList(int type) {
        switch (type) {
            case OLL:return Utils.getListByType(getList(), OLL);
            case PLL:return Utils.getListByType(getList(), PLL);
            case BIG:return Utils.getListByType(getList(), BIG);
            case FTL:
            default :return Utils.getListByType(getList(), FTL);
        }
    }

    private ArrayList<Algorithm> getList() {
        ArrayList<Algorithm> list = new ArrayList<>();
        list.add(new Algorithm(FTL, R.drawable.f2l01, 1, "1", "U R U' R' U' y L' U L"));
        list.add(new Algorithm(FTL, R.drawable.f2l02, 1, "2", "y U' L' U L U y' R U' R'"));
        list.add(new Algorithm(FTL, R.drawable.f2l03, 1, "1", "U R U' R'",
                "R' F R F'"));
        list.add(new Algorithm(FTL, R.drawable.f2l04, 1, "1", "y U' L' U L",
                "F R' F' R"));
        list.add(new Algorithm(FTL, R.drawable.f2l05, 1, "1", "R U R'"));
        list.add(new Algorithm(FTL, R.drawable.f2l06, 1, "1", "y L' U' L"));
        list.add(new Algorithm(FTL, R.drawable.f2l07, 1, "1", "d R' U' R U2 R' U R", 
                "y U L' U' L U2 L' U L", 
                "U' r U' R' U R U r'"));
        list.add(new Algorithm(FTL, R.drawable.f2l08, 1, "1", "d R' U2 R U2 R' U R", 
                "r' U2 R2 U R2’ U r", 
                "y U L' U2 L U2 L' U L"));
        list.add(new Algorithm(FTL, R.drawable.f2l09, 1, "", "U' R U2 R' U2 R U' R'", 
                "U' R U2 R' U' R U2 R'", 
                "U' R U2 R' U R' F R F'"));
        list.add(new Algorithm(FTL, R.drawable.f2l10, 1, "", "U' R U R' U2 R U' R'", 
                "U' R U R' U' R U2 R'", 
                "U' R U R' U R' F R F'"));
        list.add(new Algorithm(FTL, R.drawable.f2l11, 1, "", "U' R U R' U R U R'", 
                "U y' R' U R U' y R U R'", 
                "U2 R U' R' U' R U R'"));
        list.add(new Algorithm(FTL, R.drawable.f2l12, 1, "", "U' R U' R' U F' U' F", 
                "U' R U' R' d R' U' R", 
                "F R U R' U' F' R U' R'"));
        list.add(new Algorithm(FTL, R.drawable.f2l13, 1, "", "U' R U' R' U R U R'", 
                "y L' U2 L U2 F U2 F' U F U' F'", 
                "R U' R' U R U2 R' U2 R U' R'"));
        list.add(new Algorithm(FTL, R.drawable.f2l14, 1, "", "y' U R' U R U' R' U' R", 
                "d R' U R U' R' U' R", 
                "M' U' R U R' U' R U2 r'"));
        list.add(new Algorithm(FTL, R.drawable.f2l15, 1, "", "R U' R' U R U' R' U2 R U' R'", 
                "R' U2 R2 U R2 U R", 
                "U F' U2 F U' R U R'"));
        list.add(new Algorithm(FTL, R.drawable.f2l16, 1, "", "U' R U2 R' U F' U' F", 
                "U' R U2 R' d R' U' R", 
                "y' R U2 R2 U' R2 U' R'"));
        list.add(new Algorithm(FTL, R.drawable.f2l17, 1, "", "R U' R' U2 F' U' F", 
                "R U' R' U2 y L' U' L", 
                "R U' R' U d R' U' R"));
        list.add(new Algorithm(FTL, R.drawable.f2l18, 1, "", "R U R' U2 R U' R' U R U' R'", 
                "y L' U L U2 y' R U R'", 
                "R U2 R' U R U R' U R U' R'"));
        list.add(new Algorithm(FTL, R.drawable.f2l19, 1, "", "U2 R' F R F' U2 R U R'", 
                "U F' U' F U' R U R'", 
                "R2 u R U R' U' u' R' U R'"));
        list.add(new Algorithm(FTL, R.drawable.f2l20, 1, "", "U' R U' R' U2 R U' R'", 
                "U' R U' R' U R' F R F'", 
                "R U R' U' R U' R' U R U' R'"));
        list.add(new Algorithm(FTL, R.drawable.f2l21, 1, "", "U R U R' U2 R U R'", 
                "U' R U2 R' U R U R'", 
                "y U L' U L U2 L' U L"));
        list.add(new Algorithm(FTL, R.drawable.f2l22, 1, "", "U' R U' R' U2 R U' R'", 
                "U' R U' R' U R' F R F'", 
                "R U R' U' R U' R' U R U' R'"));
        list.add(new Algorithm(FTL, R.drawable.f2l23, 1, "", "U' R' F R F' R U' R'", 
                "R U' R' y L' U2 L", 
                "l F' R U' R' U l'"));
        list.add(new Algorithm(FTL, R.drawable.f2l24, 1, "", "R U R' U' R U R' U' R U R'", 
                "U R U' R' U R U' R' U R U' R'", 
                "R2 U R2 U R2 U2 R2"));
        list.add(new Algorithm(FTL, R.drawable.f2l25, 1, "", "y' U' R' U2 R U' R' U R", 
                "y U' L' U2 L U' L' U L", 
                "U' R U' R2 F R F' R U' R'"));
        list.add(new Algorithm(FTL, R.drawable.f2l26, 1, "", "F' L' U2 L F", 
                "y' U2 R' U' R U' R' U R", 
                "r U' r' U2 r U r'"));
        list.add(new Algorithm(FTL, R.drawable.f2l27, 1, "", "U2 R U R' U R U' R'", 
                "R U' R' U2 R U R'", 
                "y F R U2 R' F'"));
        list.add(new Algorithm(FTL, R.drawable.f2l28, 1, "", "U R U2 R' U R U' R'", 
                "U R U2 R2 F R F'", 
                "R U' R' U R U' R' U R U R'"));
        list.add(new Algorithm(FTL, R.drawable.f2l29, 1, "", "R U2 R' U' R U R'", 
                "y L F' L' F L' U L U' L' U L", 
                "U' R U' R' U2 R U2 R2 F R F'"));
        list.add(new Algorithm(FTL, R.drawable.f2l30, 1, "", "y' R' U2 R U R' U' R", 
                "y L' U2 L U L' U' L", 
                "R' F R F' R U' R' U R U' R'"));
        list.add(new Algorithm(FTL, R.drawable.f2l31, 1, "", "R U R' U2 R U R' U' R U R'", 
                "U R U' R' U' R U' R' U R U' R'", 
                "U2 R2 U2 R' U' R U' R2"));
        list.add(new Algorithm(FTL, R.drawable.f2l32, 1, "", "F U R U' R' F' R U' R'", 
                "U' R U R2 F R F' R U' R'", 
                "y U' L' U L U L' U L U' L' U L"));
        list.add(new Algorithm(FTL, R.drawable.f2l33, 1, "", "R U R' U' F R' F' R", 
                "y L' U L U' L' U L", 
                "y' R' U R U' R' U R"));
        list.add(new Algorithm(FTL, R.drawable.f2l34, 1, "", ""));
        list.add(new Algorithm(FTL, R.drawable.f2l35, 1, "", "R U' R' U R U' R'", 
                "R U' R2 F R F'", 
                "y L' U' L U2 F U' F'"));
        list.add(new Algorithm(FTL, R.drawable.f2l36, 1, "", "R U R' U' F R' F' R", 
                "y L' U L U' L' U L", 
                "y' R' U R U' R' U R"));
        list.add(new Algorithm(FTL, R.drawable.f2l37, 1, "", "R U R' U' R U2 R' U' R U R'", 
                "R U' R' U' R U R' U2 R U' R'", 
                "R2 U2 R' U' R U' R' U2 R'"));
        list.add(new Algorithm(FTL, R.drawable.f2l38, 1, "", "R U R' U2 R U' R' U R U R'", 
                "R U' R' U R U2 R' U R U' R'", 
                "R U2 R U R' U R U2 R2"));
        list.add(new Algorithm(FTL, R.drawable.f2l39, 1, "", "R U' R' F R U R' U' F' R U' R'", 
                "r U' r' U2 r U r' R U R'", 
                "R F U R U' R' F' U' R'"));
        list.add(new Algorithm(FTL, R.drawable.f2l40, 1, "", "R U R' U' R U' R' U2 y' R' U' R", 
                "R U F R U R' U' F' R'", 
                "R U' R' F' L' U2 L F"));
        list.add(new Algorithm(FTL, R.drawable.f2l41, 1, "", "R' F R F' R U' R' U R U' R' U2 R U' R'", 
                "R U' R' U y' R' U2 R U2' R' U R\n"+"мой: R U R' Г2 R U2 R' U'(мизинцем) y L' U' L"));

        list.add(new Algorithm(OLL, R.drawable.oll01, 1, "", ">> R2' D' R U2' R' D R U2' R", 
                "y2 R2 D R' U2' R D' R' U2' R'"));
        list.add(new Algorithm(OLL, R.drawable.oll02, 1, "Уши", "Rw U R' U' Rw' F R F'", 
                "y2 R' F' Rw U R U' Rw' F", 
                "y R U R D R' U' R D' R2'", 
                "y R' F' R U R' U' R' F R U R", 
                "y' R' U' R' D' R U R' D R2"));
        list.add(new Algorithm(OLL, R.drawable.oll03, 1, "Восьмерка", "F' Rw U R' U' Rw' F R", 
                "R2 D R' U R D' R' U' R'", 
                "y R2 D' R U' R' D R U R", 
                "y' F R' F' Rw U R U' Rw'"));
        list.add(new Algorithm(OLL, R.drawable.oll04, 1, "Рыбка", "R U R' U R U2' R'", 
                "y L' U2 L U L' U L", 
                "y' R' U2' R U R' U R", 
                "y2 L U L' U L U2 L'"));
        list.add(new Algorithm(OLL, R.drawable.oll05, 1, "Рыбка", "R U2' R' U' R U' R'", 
                "y L' U' L U' L' U2 L", 
                "y' R' U' R U' R' U2' R"));
        list.add(new Algorithm(OLL, R.drawable.oll06, 1, "Вертолет", "R U2' R2' U' R2 U' R2' U2 R", 
                "y2 L' U2 L2 U L2' U L2 U2 L'"));
        list.add(new Algorithm(OLL, R.drawable.oll07a, 1, "", "R U2 R' U' R U R' U' R U' R'", 
                "y/y' R U R' U R U' R' U R U2' R'", 
                "F R U R' U' R U R' U' R U R' U' F'"));
        list.add(new Algorithm(OLL, R.drawable.oll08, 1, "", "Rw U R' U' Rw' R U R U' R'", 
                "y R' F' Rw U Rw' R U' L' U L", 
                "y' Rw' U' R U M' U' R' U R"));
        list.add(new Algorithm(OLL, R.drawable.oll09, 1, "", "R U R' U' M' U R U' Rw'", 
                "y/y' R U R' U' M U R U' R' U' M'"));

        list.add(new Algorithm(OLL, R.drawable.oll10, 1, "Снежинка", "Rw' R U R U R' U' Rw R' M' U R U' Rw'", 
                "Rw U R' U' M2 U R U' R' U' M'"));
        list.add(new Algorithm(OLL, R.drawable.oll11, 1, "", "R U2' R2' F R F' U2' R' F R F'"));
        list.add(new Algorithm(OLL, R.drawable.oll12, 1, "", "Rw' U' Rw U2' R' U2' R U2' Rw' U Rw", 
                "y2 Rw U Rw' U2' R U2' R' U2' Rw U' Rw'", 
                "y F R U R' U' F' Fw R U R' U' Fw'"));
        list.add(new Algorithm(OLL, R.drawable.oll13, 1, "", "Rw' R2 U R' U Rw U2' Rw' U R' Rw", 
                "Rw' R U R' F2 R U L' U L Rw R'", 
                "y' Fw R U R' U' Fw' U' F R U R' U' F'", 
                "y' Fw R U R' U' Fw' R' F' U' F U R\n"));
        list.add(new Algorithm(OLL, R.drawable.oll14, 1, "", "Rw' R U' Rw U2 Rw' U' R U' R2 Rw", 
                "y F U R U' R' F' R' F' U' F U R", 
                "y' Fw R U R' U' Dw' x R' F R U R' U' F'", 
                "y' R' U2 R' F R F' U' F' U' F U' R"));
        list.add(new Algorithm(OLL, R.drawable.oll15, 1, "", "Rw' R U R U R' U' Rw R2 F R F'", 
                "R' U2 F R U R' U' F2 U2 F R", 
                "y2 F R' F' R U R U' R' U' F R U R' U' F'"));
        list.add(new Algorithm(OLL, R.drawable.oll16, 1, "", "Rw U R' U R U2 Rw2 U' R U' R' U2 Rw", 
                "y R U2 R2 F R F' U2 Rw R' U R U' Rw'", 
                "y' F R U' R' U' R U R' F' U' F R U R' U'F'\n"));
        list.add(new Algorithm(OLL, R.drawable.oll17, 1, "", "R U R' U R' F R F' U2' R' F R F'", 
                "y2 F R' F' R2 Rw' U R U' R' U' M'", 
                "y2 Rw U' Rw' F U2 F U' R U' R' F'"));
        list.add(new Algorithm(OLL, R.drawable.oll18, 1, "", "R U R' U' R' F R F'", 
                "F R U' R' U R U R' F'"));
        list.add(new Algorithm(OLL, R.drawable.oll19, 1, "", "F R U R' U' F'"));

        list.add(new Algorithm(OLL, R.drawable.oll20, 1, "", ">> R U R' F' U' F U R U2 R'"));
        list.add(new Algorithm(OLL, R.drawable.oll21, 1, "", "R' F R U R' U' F' U R"));
        list.add(new Algorithm(OLL, R.drawable.oll22, 1, "", "R U R2 U' R' F R U R U' F'"));
        list.add(new Algorithm(OLL, R.drawable.oll23, 1, "", "y R' U' R' F R F' U R"));
        list.add(new Algorithm(OLL, R.drawable.oll24, 1, "", "F U R U' R' U R U' R' F'"));
        list.add(new Algorithm(OLL, R.drawable.oll25, 1, "", "y' R' F' U' F U' R U R' U R", 
                "F R U R' U y' R' U' R U' R'", 
                "y R U R' U R U' B U' B' R'", 
                "y R' U' R U' R' U F' U F R"));
        list.add(new Algorithm(OLL, R.drawable.oll26, 1, "", "Rw' U' Rw U' R' U R U' R' U R Rw' U Rw", 
                "Rw U Rw' U R U' R' U R U' R' Rw U' Rw'"));
        list.add(new Algorithm(OLL, R.drawable.oll27, 1, "", "R' F R U R U' R2 F' R2 U' R' U R U R'", 
                "y/y' R U2 R2 U' R U' R' U2 F R F'"));
        list.add(new Algorithm(OLL, R.drawable.oll28, 1, "", "y2 F U R U' R2 F' R U R U' R'", 
                "Lw U' R' F' R U R' U' F U x", 
                "Fw R U R2 U' R' U R U' Fw'", 
                "y2 Rw U' Rw' U' Rw U Rw' F' U F"));
        list.add(new Algorithm(OLL, R.drawable.oll29, 1, "", "Rw U Rw' R U R' U' Rw U' Rw'", 
                "y2 x' R U R' Rw U Rw' F' R U' Lw'", 
                "y2 R' F R U R' U' F' R U' R' U2 R"));
        list.add(new Algorithm(OLL, R.drawable.oll30, 1, "", "Rw' U Rw U Rw' U' Rw B U' B'", 
                "y2 R' F R U R' F' R F U' F'", 
                "y2 F' U' Rw' F Rw2 U Rw' U' L' U L"));
        list.add(new Algorithm(OLL, R.drawable.oll31, 1, "", "y2 Rw' U' Rw R' U' R U Rw' U Rw", 
                "Lw' U' Lw L' U' L U R' F R"));
        list.add(new Algorithm(OLL, R.drawable.oll32, 1, "", "F U R U' R' F'"));
        list.add(new Algorithm(OLL, R.drawable.oll33, 1, "", "y R' U' F' U F R", 
                "B' U' R' U R B", 
                "Fw' L' U' L U Fw", 
                "y2 R' U' F R' F' R U R"));
        list.add(new Algorithm(OLL, R.drawable.oll34, 1, "", "R U B' U' R' U R B R'", 
                "S R U R' U' R' F R Fw'", 
                "y R U2 R2 U' F' U F R2 U' R'"));
        list.add(new Algorithm(OLL, R.drawable.oll35, 1, "", ">> R' U' F U R U' R' F' R"));
        list.add(new Algorithm(OLL, R.drawable.oll36, 1, "", "R U R' U R U' R' U' R' F R F'", 
                "y2 R U R' U F' U F U2 R U' R'", 
                "y2 R U2 R2 F2 Rw U L' U2 R U'"));
        list.add(new Algorithm(OLL, R.drawable.oll37, 1, "", "L' U' L U' L' U L U Rw U' Rw' F", 
                "y' R U R2' F' U' F U R2 U2' R'", 
                "y2 R' U' R U' R' U R U x' R U' R' U x"));
        list.add(new Algorithm(OLL, R.drawable.oll38a, 1, "", "Rw U R' U R U' R' U R U2' Rw'", 
                "y' Rw U2 R' U' R U R' U' R U' Rw'"));
        list.add(new Algorithm(OLL, R.drawable.oll39, 1, "", "y Rw' U' R U' R' U R U' R' U2 Rw", 
                "y2 Rw' U2 R U R' U' R U R' U Rw", 
                "y' F R U R' U' R U' R' U R U R' F'"));
        list.add(new Algorithm(OLL, R.drawable.oll40, 1, "", "y Rw' U Rw2 U' Rw2 U' Rw2 U Rw'", 
                "R U2 R' U' R U' R' F R U R' U' F'"));
        list.add(new Algorithm(OLL, R.drawable.oll41, 1, "", "Rw U' Rw2 U Rw2 U Rw2 U' Rw", 
                "y R' U2' R U R' U R F R U R' U' F'", 
                "y' F R' F2 R U2 R U2 R' F"));
        list.add(new Algorithm(OLL, R.drawable.oll42, 1, "", "F R U R' U' R U R' U' F'", 
                "y2 Fw U R U' R' U R U' R' Fw'"));
        list.add(new Algorithm(OLL, R.drawable.oll43, 1, "", "F' L' U' L U L' U' L U F", 
                "y' F U R U' R' F' R U R' U R U2 R'"));
        list.add(new Algorithm(OLL, R.drawable.oll44, 1, "", "Rw U2 R' U' R U' Rw'"));
        list.add(new Algorithm(OLL, R.drawable.oll45, 1, "", ">> Rw' U2 R U R' U Rw"));
        list.add(new Algorithm(OLL, R.drawable.oll46, 1, "", "Rw U R' U R U2 Rw'", 
                "F R' F' R U2 R U2 R'", 
                "y2 Lw U L' U L U2 Lw'"));
        list.add(new Algorithm(OLL, R.drawable.oll47, 1, "", "R U2 R' U2 R' F R F'", 
                "R' F' Rw U' Rw' F2 R", 
                "y2 Rw' U' R U' R' U2 Rw"));
        list.add(new Algorithm(OLL, R.drawable.oll48, 1, "", "y Rw R2 U' R U' R' U2 R U' Rw' R", 
                "y' Rw' R U2 R' U' R U' R' U2 R U M'", 
                "y2 F R U R' U' F' U F R U R' U' F'"));
        list.add(new Algorithm(OLL, R.drawable.oll49, 1, "", "Rw R' U R U R' U R U2 R' U Rw' R", 
                "y Rw' R2 U R' U R U2 R' U M'", 
                "y' Rw U R' U R' F R F' R U2 Rw'"));
        list.add(new Algorithm(OLL, R.drawable.oll50, 1, "", "F R U' R' U' R U R' F'", 
                "F R' F' R U R U' R'", 
                "y' R U R' F' U F R U' R'"));
        list.add(new Algorithm(OLL, R.drawable.oll51, 1, "", "y2 R U2' R2 F R F' R U2' R'", 
                "y R' U2 Lw R U' R' U Lw' U2 R", 
                "y R' U' F R' F' R2 U' R' U2 R"));
        list.add(new Algorithm(OLL, R.drawable.oll52, 1, "", "y2 R U R' U R' F R F' R U2' R'", 
                "Rw U R' U R U' R' U' Rw' R U R U' R'", 
                "y R U R' U F' U F U' R U2 R'", 
                "y' Rw R2 U2 R U R' U R U Rw' R"));
        list.add(new Algorithm(OLL, R.drawable.oll53, 1, "", "R U R' U' R' F R2 U R' U' F'", 
                "y R' U' R U' R' U R' F R F' U R", 
                "y F' U' F Rw U' Rw' U Rw U Rw'"));
        list.add(new Algorithm(OLL, R.drawable.oll54, 1, "", "y2 R U R' U R U2 R' F R U R' U' F'", 
                "R U' R' U2 R U B U' B' U' R'", 
                "y' R U R' U R U' R' U R U' R' U' R' F R F'"));
        list.add(new Algorithm(OLL, R.drawable.oll55, 1, "", "R' U' R U' R' U2 R F R U R' U' F'", 
                "y2 R' U R U2 R' U' F' U F U R"));
        list.add(new Algorithm(OLL, R.drawable.oll56, 1, "", "y2 F R' F R2 U' R' U' R U R' F2", 
                "Fw R U R2 U' R' U R2 U' R' Fw'", 
                "R2' U R' B' R U' R2' U R B R'", 
                "y' R' F' Rw U' Rw' F2 R2 U R' U R U2 R'"));
        list.add(new Algorithm(OLL, R.drawable.oll57, 1, "", "y R U R' U' R U' R' F' U' F R U R'", 
                "Rw2 D' Rw U Rw' D Rw2 U' Rw' U' Rw", 
                "y R' U2 R2 U R' U' R' U2 F R F'"));

        list.add(new Algorithm(PLL, R.drawable.pll01, 1, "", "3"));
        list.add(new Algorithm(PLL, R.drawable.pll02, 1, "", "3"));
        list.add(new Algorithm(PLL, R.drawable.pll03, 1, "", "3"));
        list.add(new Algorithm(PLL, R.drawable.pll04, 1, "", "3"));
        list.add(new Algorithm(PLL, R.drawable.pll05, 1, "", "3"));
        list.add(new Algorithm(PLL, R.drawable.pll06, 1, "", "3"));
        list.add(new Algorithm(PLL, R.drawable.pll07, 1, "", "3"));
        list.add(new Algorithm(PLL, R.drawable.pll08, 1, "", "3"));
        list.add(new Algorithm(PLL, R.drawable.pll09, 1, "", "3"));
        list.add(new Algorithm(PLL, R.drawable.pll10, 1, "", "3"));
        list.add(new Algorithm(PLL, R.drawable.pll11, 1, "", "3"));
        list.add(new Algorithm(PLL, R.drawable.pll12, 1, "", "3"));
        list.add(new Algorithm(PLL, R.drawable.pll13, 1, "", "3"));
        list.add(new Algorithm(PLL, R.drawable.pll14, 1, "", "3"));
        list.add(new Algorithm(PLL, R.drawable.pll15, 1, "", "3"));
        list.add(new Algorithm(PLL, R.drawable.pll16, 1, "", "3"));
        list.add(new Algorithm(PLL, R.drawable.pll17, 1, "", "3"));
        list.add(new Algorithm(PLL, R.drawable.pll18, 1, "", "3"));
        list.add(new Algorithm(PLL, R.drawable.pll19, 1, "", "3"));
        list.add(new Algorithm(PLL, R.drawable.pll20, 1, "", "3"));
        list.add(new Algorithm(PLL, R.drawable.pll21, 1, "", "3"));

        return list;
    }
}
