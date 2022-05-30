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
        list.add(new Algorithm(FTL, R.drawable.f2l03, 1, "1", "U R U' R'",
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

        list.add(new Algorithm(OLL, R.drawable.oll01, 1, "", ">> R2' D' R U2' R' D R U2' R\n" +
                "y2 R2 D R' U2' R D' R' U2' R'"));
        list.add(new Algorithm(OLL, R.drawable.oll02, 1, "Уши", "Rw U R' U' Rw' F R F'\n" +
                "y2 R' F' Rw U R U' Rw' F\n" +
                "y R U R D R' U' R D' R2'\n" +
                "y R' F' R U R' U' R' F R U R\n" +
                "y' R' U' R' D' R U R' D R2"));
        list.add(new Algorithm(OLL, R.drawable.oll03, 1, "Восьмерка", "F' Rw U R' U' Rw' F R\n" +
                "R2 D R' U R D' R' U' R'\n" +
                "y R2 D' R U' R' D R U R\n" +
                "y' F R' F' Rw U R U' Rw'"));
        list.add(new Algorithm(OLL, R.drawable.oll04, 1, "Рыбка", "R U R' U R U2' R'\n" +
                "y L' U2 L U L' U L\n" +
                "y' R' U2' R U R' U R\n" +
                "y2 L U L' U L U2 L'"));
        list.add(new Algorithm(OLL, R.drawable.oll05, 1, "Рыбка", "R U2' R' U' R U' R'\n" +
                "y L' U' L U' L' U2 L\n" +
                "y' R' U' R U' R' U2' R"));
        list.add(new Algorithm(OLL, R.drawable.oll06, 1, "Вертолет", "R U2' R2' U' R2 U' R2' U2 R\n" +
                "y2 L' U2 L2 U L2' U L2 U2 L'"));
        list.add(new Algorithm(OLL, R.drawable.oll07a, 1, "", "R U2 R' U' R U R' U' R U' R'\n" +
                "y/y' R U R' U R U' R' U R U2' R'\n" +
                "F R U R' U' R U R' U' R U R' U' F'"));
        list.add(new Algorithm(OLL, R.drawable.oll08, 1, "", "Rw U R' U' Rw' R U R U' R'\n" +
                "y R' F' Rw U Rw' R U' L' U L\n" +
                "y' Rw' U' R U M' U' R' U R"));
        list.add(new Algorithm(OLL, R.drawable.oll09, 1, "", "R U R' U' M' U R U' Rw'\n" +
                "y/y' R U R' U' M U R U' R' U' M'"));

        list.add(new Algorithm(OLL, R.drawable.oll10, 1, "Снежинка", "Rw' R U R U R' U' Rw R' M' U R U' Rw'\n" +
                "Rw U R' U' M2 U R U' R' U' M'"));
        list.add(new Algorithm(OLL, R.drawable.oll11, 1, "", "R U2' R2' F R F' U2' R' F R F'"));
        list.add(new Algorithm(OLL, R.drawable.oll12, 1, "", "Rw' U' Rw U2' R' U2' R U2' Rw' U Rw\n" +
                "y2 Rw U Rw' U2' R U2' R' U2' Rw U' Rw'\n" +
                "y F R U R' U' F' Fw R U R' U' Fw'"));
        list.add(new Algorithm(OLL, R.drawable.oll13, 1, "", "Rw' R2 U R' U Rw U2' Rw' U R' Rw\n" +
                "Rw' R U R' F2 R U L' U L Rw R'\n" +
                "y' Fw R U R' U' Fw' U' F R U R' U' F'\n" +
                "y' Fw R U R' U' Fw' R' F' U' F U R\n"));
        list.add(new Algorithm(OLL, R.drawable.oll14, 1, "", "Rw' R U' Rw U2 Rw' U' R U' R2 Rw\n" +
                "y F U R U' R' F' R' F' U' F U R\n" +
                "y' Fw R U R' U' Dw' x R' F R U R' U' F'\n" +
                "y' R' U2 R' F R F' U' F' U' F U' R"));
        list.add(new Algorithm(OLL, R.drawable.oll15, 1, "", "Rw' R U R U R' U' Rw R2 F R F'\n" +
                "R' U2 F R U R' U' F2 U2 F R\n" +
                "y2 F R' F' R U R U' R' U' F R U R' U' F'"));
        list.add(new Algorithm(OLL, R.drawable.oll16, 1, "", "Rw U R' U R U2 Rw2 U' R U' R' U2 Rw\n" +
                "y R U2 R2 F R F' U2 Rw R' U R U' Rw'\n" +
                "y' F R U' R' U' R U R' F' U' F R U R' U'F'\n"));
        list.add(new Algorithm(OLL, R.drawable.oll17, 1, "", "R U R' U R' F R F' U2' R' F R F'\n" +
                "y2 F R' F' R2 Rw' U R U' R' U' M'\n" +
                "y2 Rw U' Rw' F U2 F U' R U' R' F'"));
        list.add(new Algorithm(OLL, R.drawable.oll18, 1, "", "R U R' U' R' F R F'\n" +
                "F R U' R' U R U R' F'"));
        list.add(new Algorithm(OLL, R.drawable.oll19, 1, "", "F R U R' U' F'"));

        list.add(new Algorithm(OLL, R.drawable.oll20, 1, "", ">> R U R' F' U' F U R U2 R'"));
        list.add(new Algorithm(OLL, R.drawable.oll21, 1, "", "R' F R U R' U' F' U R"));
        list.add(new Algorithm(OLL, R.drawable.oll22, 1, "", "R U R2 U' R' F R U R U' F'"));
        list.add(new Algorithm(OLL, R.drawable.oll23, 1, "", "y R' U' R' F R F' U R"));
        list.add(new Algorithm(OLL, R.drawable.oll24, 1, "", "F U R U' R' U R U' R' F'"));
        list.add(new Algorithm(OLL, R.drawable.oll25, 1, "", "y' R' F' U' F U' R U R' U R\n" +
                "F R U R' U y' R' U' R U' R'\n" +
                "y R U R' U R U' B U' B' R'\n" +
                "y R' U' R U' R' U F' U F R"));
        list.add(new Algorithm(OLL, R.drawable.oll26, 1, "", "Rw' U' Rw U' R' U R U' R' U R Rw' U Rw\n" +
                "Rw U Rw' U R U' R' U R U' R' Rw U' Rw'"));
        list.add(new Algorithm(OLL, R.drawable.oll27, 1, "", "R' F R U R U' R2 F' R2 U' R' U R U R'\n" +
                "y/y' R U2 R2 U' R U' R' U2 F R F'"));
        list.add(new Algorithm(OLL, R.drawable.oll28, 1, "", "y2 F U R U' R2 F' R U R U' R'\n" +
                "Lw U' R' F' R U R' U' F U x\n" +
                "Fw R U R2 U' R' U R U' Fw'\n" +
                "y2 Rw U' Rw' U' Rw U Rw' F' U F"));
        list.add(new Algorithm(OLL, R.drawable.oll29, 1, "", "Rw U Rw' R U R' U' Rw U' Rw'\n" +
                "y2 x' R U R' Rw U Rw' F' R U' Lw'\n" +
                "y2 R' F R U R' U' F' R U' R' U2 R"));
        list.add(new Algorithm(OLL, R.drawable.oll30, 1, "", "Rw' U Rw U Rw' U' Rw B U' B'\n" +
                "y2 R' F R U R' F' R F U' F'\n" +
                "y2 F' U' Rw' F Rw2 U Rw' U' L' U L"));
        list.add(new Algorithm(OLL, R.drawable.oll31, 1, "", "y2 Rw' U' Rw R' U' R U Rw' U Rw\n" +
                "Lw' U' Lw L' U' L U R' F R"));
        list.add(new Algorithm(OLL, R.drawable.oll32, 1, "", "F U R U' R' F'"));
        list.add(new Algorithm(OLL, R.drawable.oll33, 1, "", "y R' U' F' U F R\n" +
                "B' U' R' U R B\n" +
                "Fw' L' U' L U Fw\n" +
                "y2 R' U' F R' F' R U R"));
        list.add(new Algorithm(OLL, R.drawable.oll34, 1, "", "R U B' U' R' U R B R'\n" +
                "S R U R' U' R' F R Fw'\n" +
                "y R U2 R2 U' F' U F R2 U' R'"));
        list.add(new Algorithm(OLL, R.drawable.oll35, 1, "", ">> R' U' F U R U' R' F' R"));
        list.add(new Algorithm(OLL, R.drawable.oll36, 1, "", "R U R' U R U' R' U' R' F R F'\n" +
                "y2 R U R' U F' U F U2 R U' R'\n" +
                "y2 R U2 R2 F2 Rw U L' U2 R U'"));
        list.add(new Algorithm(OLL, R.drawable.oll37, 1, "", "L' U' L U' L' U L U Rw U' Rw' F\n" +
                "y' R U R2' F' U' F U R2 U2' R'\n" +
                "y2 R' U' R U' R' U R U x' R U' R' U x"));
        list.add(new Algorithm(OLL, R.drawable.oll38a, 1, "", "Rw U R' U R U' R' U R U2' Rw'\n" +
                "y' Rw U2 R' U' R U R' U' R U' Rw'"));
        list.add(new Algorithm(OLL, R.drawable.oll39, 1, "", "y Rw' U' R U' R' U R U' R' U2 Rw\n" +
                "y2 Rw' U2 R U R' U' R U R' U Rw\n" +
                "y' F R U R' U' R U' R' U R U R' F'"));
        list.add(new Algorithm(OLL, R.drawable.oll40, 1, "", "y Rw' U Rw2 U' Rw2 U' Rw2 U Rw'\n" +
                "R U2 R' U' R U' R' F R U R' U' F'"));
        list.add(new Algorithm(OLL, R.drawable.oll41, 1, "", "Rw U' Rw2 U Rw2 U Rw2 U' Rw\n" +
                "y R' U2' R U R' U R F R U R' U' F'\n" +
                "y' F R' F2 R U2 R U2 R' F"));
        list.add(new Algorithm(OLL, R.drawable.oll42, 1, "", "F R U R' U' R U R' U' F'\n" +
                "y2 Fw U R U' R' U R U' R' Fw'"));
        list.add(new Algorithm(OLL, R.drawable.oll43, 1, "", "F' L' U' L U L' U' L U F\n" +
                "y' F U R U' R' F' R U R' U R U2 R'"));
        list.add(new Algorithm(OLL, R.drawable.oll44, 1, "", "Rw U2 R' U' R U' Rw'"));
        list.add(new Algorithm(OLL, R.drawable.oll45, 1, "", ">> Rw' U2 R U R' U Rw"));
        list.add(new Algorithm(OLL, R.drawable.oll46, 1, "", "Rw U R' U R U2 Rw'\n" +
                "F R' F' R U2 R U2 R'\n" +
                "y2 Lw U L' U L U2 Lw'"));
        list.add(new Algorithm(OLL, R.drawable.oll47, 1, "", "R U2 R' U2 R' F R F'\n" +
                "R' F' Rw U' Rw' F2 R\n" +
                "y2 Rw' U' R U' R' U2 Rw"));
        list.add(new Algorithm(OLL, R.drawable.oll48, 1, "", "y Rw R2 U' R U' R' U2 R U' Rw' R\n" +
                "y' Rw' R U2 R' U' R U' R' U2 R U M'\n" +
                "y2 F R U R' U' F' U F R U R' U' F'"));
        list.add(new Algorithm(OLL, R.drawable.oll49, 1, "", "Rw R' U R U R' U R U2 R' U Rw' R\n" +
                "y Rw' R2 U R' U R U2 R' U M'\n" +
                "y' Rw U R' U R' F R F' R U2 Rw'"));
        list.add(new Algorithm(OLL, R.drawable.oll50, 1, "", "F R U' R' U' R U R' F'\n" +
                "F R' F' R U R U' R'\n" +
                "y' R U R' F' U F R U' R'"));
        list.add(new Algorithm(OLL, R.drawable.oll51, 1, "", "y2 R U2' R2 F R F' R U2' R'\n" +
                "y R' U2 Lw R U' R' U Lw' U2 R\n" +
                "y R' U' F R' F' R2 U' R' U2 R"));
        list.add(new Algorithm(OLL, R.drawable.oll52, 1, "", "y2 R U R' U R' F R F' R U2' R'\n" +
                "Rw U R' U R U' R' U' Rw' R U R U' R'\n" +
                "y R U R' U F' U F U' R U2 R'\n" +
                "y' Rw R2 U2 R U R' U R U Rw' R"));
        list.add(new Algorithm(OLL, R.drawable.oll53, 1, "", "R U R' U' R' F R2 U R' U' F'\n" +
                "y R' U' R U' R' U R' F R F' U R\n" +
                "y F' U' F Rw U' Rw' U Rw U Rw'"));
        list.add(new Algorithm(OLL, R.drawable.oll54, 1, "", "y2 R U R' U R U2 R' F R U R' U' F'\n" +
                "R U' R' U2 R U B U' B' U' R'\n" +
                "y' R U R' U R U' R' U R U' R' U' R' F R F'"));
        list.add(new Algorithm(OLL, R.drawable.oll55, 1, "", "R' U' R U' R' U2 R F R U R' U' F'\n" +
                "y2 R' U R U2 R' U' F' U F U R"));
        list.add(new Algorithm(OLL, R.drawable.oll56, 1, "", "y2 F R' F R2 U' R' U' R U R' F2\n" +
                "Fw R U R2 U' R' U R2 U' R' Fw'\n" +
                "R2' U R' B' R U' R2' U R B R'\n" +
                "y' R' F' Rw U' Rw' F2 R2 U R' U R U2 R'"));
        list.add(new Algorithm(OLL, R.drawable.oll57, 1, "", "y R U R' U' R U' R' F' U' F R U R'\n" +
                "Rw2 D' Rw U Rw' D Rw2 U' Rw' U' Rw\n" +
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
