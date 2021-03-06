package com.squorpikkor.app.jessica2.data;

import com.squorpikkor.app.jessica2.R;

import java.util.ArrayList;

public class Data {

    public static final int FTL = 1;
    public static final int OLL = 2;
    public static final int PLL = 3;
    public static final int BIG = 4;
    public static final String _SPLIT_ = "&";

    private ArrayList<Algorithm> getListByType(ArrayList<Algorithm> list, int type) {
        ArrayList<Algorithm> newList = new ArrayList<>();
        for (Algorithm alg:list) {
            if (alg.getType() == type) {
                newList.add(alg);
            }
        }
        return newList;
    }

    public void setLearned(int id, boolean isLearned) {

    }

    public ArrayList<Algorithm> getList(int type) {
        switch (type) {
            case OLL:return getListByType(getList(), OLL);
            case PLL:return getListByType(getList(), PLL);
            case BIG:return getListByType(getList(), BIG);
            case FTL:
            default :return getListByType(getList(), FTL);
        }
    }

    public static ArrayList<Algorithm> getList() {
        ArrayList<Algorithm> list = new ArrayList<>();
        list.add(new Algorithm(FTL, R.drawable.f2l01, 1, "1", "U R U' R' U' y L' U L", ""));
        list.add(new Algorithm(FTL, R.drawable.f2l02, 1, "2", "y U' L' U L U y' R U' R'", ""));
        list.add(new Algorithm(FTL, R.drawable.f2l03, 1, "1", 
                "U R U' R'"+_SPLIT_ +
                        "R' F R F'",
                ""));
        list.add(new Algorithm(FTL, R.drawable.f2l04, 1, "1", "y U' L' U L"+_SPLIT_ +
                "F R' F' R", ""));
        list.add(new Algorithm(FTL, R.drawable.f2l05, 1, "1", "R U R'", ""));
        list.add(new Algorithm(FTL, R.drawable.f2l06, 1, "1", "y L' U' L", ""));
        list.add(new Algorithm(FTL, R.drawable.f2l07, 1, "1", "d R' U' R U2 R' U R"+_SPLIT_ +
                "y U L' U' L U2 L' U L"+_SPLIT_ +
                "U' r U' R' U R U r'", ""));
        list.add(new Algorithm(FTL, R.drawable.f2l08, 1, "1", "d R' U2 R U2 R' U R"+_SPLIT_ +
                "r' U2 R2 U R2??? U r"+_SPLIT_ +
                "y U L' U2 L U2 L' U L", ""));
        list.add(new Algorithm(FTL, R.drawable.f2l09, 1, "", "U' R U2 R' U2 R U' R'"+_SPLIT_ +
                "U' R U2 R' U' R U2 R'"+_SPLIT_ +
                "U' R U2 R' U R' F R F'", ""));
        list.add(new Algorithm(FTL, R.drawable.f2l10, 1, "", "U' R U R' U2 R U' R'"+_SPLIT_ +
                "U' R U R' U' R U2 R'"+_SPLIT_ +
                "U' R U R' U R' F R F'", ""));
        list.add(new Algorithm(FTL, R.drawable.f2l11, 1, "", "U' R U R' U R U R'"+_SPLIT_ +
                "U y' R' U R U' y R U R'"+_SPLIT_ +
                "U2 R U' R' U' R U R'", ""));
        list.add(new Algorithm(FTL, R.drawable.f2l12, 1, "", "U' R U' R' U F' U' F"+_SPLIT_ +
                "U' R U' R' d R' U' R"+_SPLIT_ +
                "F R U R' U' F' R U' R'", ""));
        list.add(new Algorithm(FTL, R.drawable.f2l13, 1, "", "U' R U' R' U R U R'"+_SPLIT_ +
                "y L' U2 L U2 F U2 F' U F U' F'"+_SPLIT_ +
                "R U' R' U R U2 R' U2 R U' R'", ""));
        list.add(new Algorithm(FTL, R.drawable.f2l14, 1, "", "y' U R' U R U' R' U' R"+_SPLIT_ +
                "d R' U R U' R' U' R"+_SPLIT_ +
                "M' U' R U R' U' R U2 r'", ""));
        list.add(new Algorithm(FTL, R.drawable.f2l15, 1, "", "R U' R' U R U' R' U2 R U' R'"+_SPLIT_ +
                "R' U2 R2 U R2 U R"+_SPLIT_ +
                "U F' U2 F U' R U R'", ""));
        list.add(new Algorithm(FTL, R.drawable.f2l16, 1, "", "U' R U2 R' U F' U' F"+_SPLIT_ +
                "U' R U2 R' d R' U' R"+_SPLIT_ +
                "y' R U2 R2 U' R2 U' R'", ""));
        list.add(new Algorithm(FTL, R.drawable.f2l17, 1, "", "R U' R' U2 F' U' F"+_SPLIT_ +
                "R U' R' U2 y L' U' L"+_SPLIT_ +
                "R U' R' U d R' U' R", ""));
        list.add(new Algorithm(FTL, R.drawable.f2l18, 1, "", "R U R' U2 R U' R' U R U' R'"+_SPLIT_ +
                "y L' U L U2 y' R U R'"+_SPLIT_ +
                "R U2 R' U R U R' U R U' R'", ""));
        list.add(new Algorithm(FTL, R.drawable.f2l19, 1, "", "U2 R' F R F' U2 R U R'"+_SPLIT_ +
                "U F' U' F U' R U R'"+_SPLIT_ +
                "R2 u R U R' U' u' R' U R'", ""));
        list.add(new Algorithm(FTL, R.drawable.f2l20, 1, "", "U' R U' R' U2 R U' R'"+_SPLIT_ +
                "U' R U' R' U R' F R F'"+_SPLIT_ +
                "R U R' U' R U' R' U R U' R'", ""));
        list.add(new Algorithm(FTL, R.drawable.f2l21, 1, "", "U R U R' U2 R U R'"+_SPLIT_ +
                "U' R U2 R' U R U R'"+_SPLIT_ +
                "y U L' U L U2 L' U L", ""));
        list.add(new Algorithm(FTL, R.drawable.f2l22, 1, "", "U' R U' R' U2 R U' R'"+_SPLIT_ +
                "U' R U' R' U R' F R F'"+_SPLIT_ +
                "R U R' U' R U' R' U R U' R'", ""));
        list.add(new Algorithm(FTL, R.drawable.f2l23, 1, "", "U' R' F R F' R U' R'"+_SPLIT_ +
                "R U' R' y L' U2 L"+_SPLIT_ +
                "l F' R U' R' U l'", ""));
        list.add(new Algorithm(FTL, R.drawable.f2l24, 1, "", "R U R' U' R U R' U' R U R'"+_SPLIT_ +
                "U R U' R' U R U' R' U R U' R'"+_SPLIT_ +
                "R2 U R2 U R2 U2 R2", ""));
        list.add(new Algorithm(FTL, R.drawable.f2l25, 1, "", "y' U' R' U2 R U' R' U R"+_SPLIT_ +
                "y U' L' U2 L U' L' U L"+_SPLIT_ +
                "U' R U' R2 F R F' R U' R'", ""));
        list.add(new Algorithm(FTL, R.drawable.f2l26, 1, "", "F' L' U2 L F"+_SPLIT_ +
                "y' U2 R' U' R U' R' U R"+_SPLIT_ +
                "r U' r' U2 r U r'", ""));
        list.add(new Algorithm(FTL, R.drawable.f2l27, 1, "", "U2 R U R' U R U' R'"+_SPLIT_ +
                "R U' R' U2 R U R'"+_SPLIT_ +
                "y F R U2 R' F'", ""));
        list.add(new Algorithm(FTL, R.drawable.f2l28, 1, "", "U R U2 R' U R U' R'"+_SPLIT_ +
                "U R U2 R2 F R F'"+_SPLIT_ +
                "R U' R' U R U' R' U R U R'", ""));
        list.add(new Algorithm(FTL, R.drawable.f2l29, 1, "", "R U2 R' U' R U R'"+_SPLIT_ +
                "y L F' L' F L' U L U' L' U L"+_SPLIT_ +
                "U' R U' R' U2 R U2 R2 F R F'", ""));
        list.add(new Algorithm(FTL, R.drawable.f2l30, 1, "", "y' R' U2 R U R' U' R"+_SPLIT_ +
                "y L' U2 L U L' U' L"+_SPLIT_ +
                "R' F R F' R U' R' U R U' R'", ""));
        list.add(new Algorithm(FTL, R.drawable.f2l31, 1, "", "R U R' U2 R U R' U' R U R'"+_SPLIT_ +
                "U R U' R' U' R U' R' U R U' R'"+_SPLIT_ +
                "U2 R2 U2 R' U' R U' R2", ""));
        list.add(new Algorithm(FTL, R.drawable.f2l32, 1, "", "F U R U' R' F' R U' R'"+_SPLIT_ +
                "U' R U R2 F R F' R U' R'"+_SPLIT_ +
                "y U' L' U L U L' U L U' L' U L", ""));
        list.add(new Algorithm(FTL, R.drawable.f2l33, 1, "", "R U R' U' F R' F' R"+_SPLIT_ +
                "y L' U L U' L' U L"+_SPLIT_ +
                "y' R' U R U' R' U R", ""));
        list.add(new Algorithm(FTL, R.drawable.f2l34, 1, "", "", ""));
        list.add(new Algorithm(FTL, R.drawable.f2l35, 1, "", "R U' R' U R U' R'"+_SPLIT_ +
                "R U' R2 F R F'"+_SPLIT_ +
                "y L' U' L U2 F U' F'", ""));
        list.add(new Algorithm(FTL, R.drawable.f2l36, 1, "", "R U R' U' F R' F' R"+_SPLIT_ +
                "y L' U L U' L' U L"+_SPLIT_ +
                "y' R' U R U' R' U R", ""));
        list.add(new Algorithm(FTL, R.drawable.f2l37, 1, "", "R U R' U' R U2 R' U' R U R'"+_SPLIT_ +
                "R U' R' U' R U R' U2 R U' R'"+_SPLIT_ +
                "R2 U2 R' U' R U' R' U2 R'", ""));
        list.add(new Algorithm(FTL, R.drawable.f2l38, 1, "", "R U R' U2 R U' R' U R U R'"+_SPLIT_ +
                "R U' R' U R U2 R' U R U' R'"+_SPLIT_ +
                "R U2 R U R' U R U2 R2", ""));
        list.add(new Algorithm(FTL, R.drawable.f2l39, 1, "", "R U' R' F R U R' U' F' R U' R'"+_SPLIT_ +
                "r U' r' U2 r U r' R U R'"+_SPLIT_ +
                "R F U R U' R' F' U' R'", ""));
        list.add(new Algorithm(FTL, R.drawable.f2l40, 1, "", "R U R' U' R U' R' U2 y' R' U' R"+_SPLIT_ +
                "R U F R U R' U' F' R'"+_SPLIT_ +
                "R U' R' F' L' U2 L F", ""));
        list.add(new Algorithm(FTL, R.drawable.f2l41, 1, "", "R' F R F' R U' R' U R U' R' U2 R U' R'"+_SPLIT_ +
                "R U' R' U y' R' U2 R U2' R' U R"+_SPLIT_+"??????: R U R' ??2 R U2 R' U'(????????????????) y L' U' L", ""));

        list.add(new Algorithm(OLL, R.drawable.oll01, 1, "??????????", ">> R2' D' R U2' R' D R U2' R"+_SPLIT_ +
                "y2 R2 D R' U2' R D' R' U2' R'", "!"));
        list.add(new Algorithm(OLL, R.drawable.oll02, 1, "??????", "Rw U R' U' Rw' F R F'"+_SPLIT_ +
                "y2 R' F' Rw U R U' Rw' F"+_SPLIT_ +
                "y R U R D R' U' R D' R2'"+_SPLIT_ +
                "y R' F' R U R' U' R' F R U R"+_SPLIT_ +
                "y' R' U' R' D' R U R' D R2", "???????????????? Rw ?????? ???????????????? ???????????? ???????? ?????????? ????????????."));
        list.add(new Algorithm(OLL, R.drawable.oll03, 1, "??????????????????", "F' Rw U R' U' Rw' F R"+_SPLIT_ +
                "R2 D R' U R D' R' U' R'"+_SPLIT_ +
                "y R2 D' R U' R' D R U R"+_SPLIT_ +
                "y' F R' F' Rw U R U' Rw'", "?????????????? ??????????????, ???????????????????? ???????????????????????? ?????????????? ????????????????????"));
        list.add(new Algorithm(OLL, R.drawable.oll04, 1, "??????????", "R U R' U R U2' R'"+_SPLIT_ +
                "y L' U2 L U L' U L"+_SPLIT_ +
                "y' R' U2' R U R' U R"+_SPLIT_ +
                "y2 L U L' U L U2 L'", "???????????????? U2 ?????????????????? ?????????? ?????????????? ????????????????, ?????????? ?????? ???? ?????????????? ?? ???????????? ????????????."));
        list.add(new Algorithm(OLL, R.drawable.oll05, 1, "??????????", "R U2' R' U' R U' R'"+_SPLIT_ +
                "y L' U' L U' L' U2 L"+_SPLIT_ +
                "y' R' U' R U' R' U2' R", "???????? ?????? ???????????? ?????????????????? ?????????? ??????????, ???? ?????????? ??????????????????, ?????????????? ????????????"));
        list.add(new Algorithm(OLL, R.drawable.oll06, 1, "????????????????", "R U2' R2' U' R2 U' R2' U2 R"+_SPLIT_ +
                "y2 L' U2 L2 U L2' U L2 U2 L'", "?????????? ?????????????? ??????????????, ???????????????????? ???? ???????????? ???????????? ????????????????????."));
        list.add(new Algorithm(OLL, R.drawable.oll07a, 1, "?????????????? ??????????", "R U2 R' U' R U R' U' R U' R'"+_SPLIT_ +
                "y/y' R U R' U R U' R' U R U2' R'"+_SPLIT_ +
                "F R U R' U' R U R' U' R U R' U' F'", "???????????? ?????????????? ?????? ??????????????, ??????????, ?????? ??????-???????? (R U R' U'), ?????????? ??????????????. ???? ???????????? ?????? ?????????????? "));
        list.add(new Algorithm(OLL, R.drawable.oll08, 1, "???????????????? ????????", "Rw U R' U' Rw' R U R U' R'"+_SPLIT_ +
                "y R' F' Rw U Rw' R U' L' U L"+_SPLIT_ +
                "y' Rw' U' R U M' U' R' U R", "?????????? ?????????????? ??????????????. ?????????????????? ?????? ???????????????? ?? ???????????? ?????????????? ???????????? ???????????????? ???????? ???? ?????????? (R U' R')"));
        list.add(new Algorithm(OLL, R.drawable.oll09, 1, "?????????? ??", "R U R' U' M' U R U' Rw'"+_SPLIT_ +
                "y/y' R U R' U' M U R U' R' U' M'", "M' - ???????????????? ???????????????? ???????? ???????????? ???????????? ?????????????? ??????????????, ?????????????????????? ???????????????? ?????? ???????????????????? ??????????????"));

        list.add(new Algorithm(OLL, R.drawable.oll10, 1, "????????????????", "Rw' R U R U R' U' Rw R' M' U R U' Rw'"+_SPLIT_ +
                "Rw U R' U' M2 U R U' R' U' M'", "?????????????? ???????????????????? ????????????, ???????????????????? ??????. ?????????????????? ???? ?????????????? ?????????????? ?? ?????????????? ????????????????????"));
        list.add(new Algorithm(OLL, R.drawable.oll11, 1, "??????????", "R U2' R2' F R F' U2' R' F R F'", "???? ?????????????????? ?????????????????? U2 ?????????????? ????????????????, ???????????????????? ???????????? ???????????????? ???????? ?????????? ??????????"));
        list.add(new Algorithm(OLL, R.drawable.oll12, 1, "??????????", "Rw' U' Rw U2' R' U2' R U2' Rw' U Rw"+_SPLIT_ +
                "y2 Rw U Rw' U2' R U2' R' U2' Rw U' Rw'"+_SPLIT_ +
                "y F R U R' U' F' Fw R U R' U' Fw'", "???????????????????? ???? ???????????? ???????????? ????????????????????."));
        list.add(new Algorithm(OLL, R.drawable.oll13, 1, "??????????????", "Rw' R2 U R' U Rw U2' Rw' U R' Rw"+_SPLIT_ +
                "Rw' R U R' F2 R U L' U L Rw R'"+_SPLIT_ +
                "y' Fw R U R' U' Fw' U' F R U R' U' F'"+_SPLIT_ +
                "y' Fw R U R' U' Fw' R' F' U' F U R"+_SPLIT_, ""));
        list.add(new Algorithm(OLL, R.drawable.oll14, 1, "??????????????", "Rw' R U' Rw U2 Rw' U' R U' R2 Rw"+_SPLIT_ +
                "y F U R U' R' F' R' F' U' F U R"+_SPLIT_ +
                "y' Fw R U R' U' Dw' x R' F R U R' U' F'"+_SPLIT_ +
                "y' R' U2 R' F R F' U' F' U' F U' R", ""));
        list.add(new Algorithm(OLL, R.drawable.oll15, 1, "?????????? ????????", "Rw' R U R U R' U' Rw R2 F R F'"+_SPLIT_ +
                "R' U2 F R U R' U' F2 U2 F R"+_SPLIT_ +
                "y2 F R' F' R U R U' R' U' F R U R' U' F'", ""));
        list.add(new Algorithm(OLL, R.drawable.oll16, 1, "?????????? ????????", "Rw U R' U R U2 Rw2 U' R U' R' U2 Rw"+_SPLIT_ +
                "y R U2 R2 F R F' U2 Rw R' U R U' Rw'"+_SPLIT_ +
                "y' F R U' R' U' R U R' F' U' F R U R' U'F'"+_SPLIT_, ""));
        list.add(new Algorithm(OLL, R.drawable.oll17, 1, "??????????????????", "R U R' U R' F R F' U2' R' F R F'"+_SPLIT_ +
                "y2 F R' F' R2 Rw' U R U' R' U' M'"+_SPLIT_ +
                "y2 Rw U' Rw' F U2 F U' R U' R' F'", ""));
        list.add(new Algorithm(OLL, R.drawable.oll18, 1, "?????????? ??", "R U R' U' R' F R F'"+_SPLIT_ +
                "F R U' R' U R U R' F'", "???????????? ??????-?????? (R U R' U')?? ???????????????? ???????? ?????????? ??????????"));
        list.add(new Algorithm(OLL, R.drawable.oll19, 1, "?????????? ??", "F R U R' U' F'"+_SPLIT_ +
                "y R' F' U' F U R'"+_SPLIT_ +
                "y2 F' L' U' L U F"+_SPLIT_ +
                "y2 Fw U R U' R' Fw'", "?????????? ?????????????? ?????????????? ?? ?????????????????? ??????????, ??????????, ??????-?????? (R U R' U'), ?????????? ??????????????. ???????????????????? ?????????????????? ???????????????? ???????????? ?????????????? ?????????????? ???????????? ????????"));

        list.add(new Algorithm(OLL, R.drawable.oll20, 1, "??????????????????", ">> R U R' F' U' F U R U2 R'", ""));
        list.add(new Algorithm(OLL, R.drawable.oll21, 1, "??????????????????", "R' F R U R' U' F' U R", ""));
        list.add(new Algorithm(OLL, R.drawable.oll22, 1, "????????????", "R U R2 U' R' F R U R U' F'", ""));
        list.add(new Algorithm(OLL, R.drawable.oll23, 1, "????????????", "y R' U' R' F R F' U R", ""));
        list.add(new Algorithm(OLL, R.drawable.oll24, 1, "??????????", "F U R U' R' U R U' R' F'", ""));
        list.add(new Algorithm(OLL, R.drawable.oll25, 1, "??????????", "y' R' F' U' F U' R U R' U R"+_SPLIT_ +
                "F R U R' U y' R' U' R U' R'"+_SPLIT_ +
                "y R U R' U R U' B U' B' R'"+_SPLIT_ +
                "y R' U' R U' R' U F' U F R", ""));
        list.add(new Algorithm(OLL, R.drawable.oll26, 1, "??????????", "Rw' U' Rw U' R' U R U' R' U R Rw' U Rw"+_SPLIT_ +
                "Rw U Rw' U R U' R' U R U' R' Rw U' Rw'", ""));
        list.add(new Algorithm(OLL, R.drawable.oll27, 1, "??????????", "R' F R U R U' R2 F' R2 U' R' U R U R'"+_SPLIT_ +
                "y/y' R U2 R2 U' R U' R' U2 F R F'", ""));
        list.add(new Algorithm(OLL, R.drawable.oll28, 1, "?????????? ??", "y2 F U R U' R2 F' R U R U' R'"+_SPLIT_ +
                "Lw U' R' F' R U R' U' F U x"+_SPLIT_ +
                "Fw R U R2 U' R' U R U' Fw'"+_SPLIT_ +
                "y2 Rw U' Rw' U' Rw U Rw' F' U F", ""));
        list.add(new Algorithm(OLL, R.drawable.oll29, 1, "?????????? ??", "Rw U Rw' R U R' U' Rw U' Rw'"+_SPLIT_ +
                "y2 x' R U R' Rw U Rw' F' R U' Lw'"+_SPLIT_ +
                "y2 R' F R U R' U' F' R U' R' U2 R", ""));
        list.add(new Algorithm(OLL, R.drawable.oll30, 1, "?????????? ??", "Rw' U Rw U Rw' U' Rw B U' B'"+_SPLIT_ +
                "y2 R' F R U R' F' R F U' F'"+_SPLIT_ +
                "y2 F' U' Rw' F Rw2 U Rw' U' L' U L", ""));
        list.add(new Algorithm(OLL, R.drawable.oll31, 1, "?????????? ??", "y2 Rw' U' Rw R' U' R U Rw' U Rw"+_SPLIT_ +
                "Lw' U' Lw L' U' L U R' F R", ""));
        list.add(new Algorithm(OLL, R.drawable.oll32, 1, "???????????? ??????????", "F U R U' R' F'", ""));
        list.add(new Algorithm(OLL, R.drawable.oll33, 1, "???????????? ??????????", "y R' U' F' U F R"+_SPLIT_ +
                "B' U' R' U R B"+_SPLIT_ +
                "Fw' L' U' L U Fw"+_SPLIT_ +
                "y2 R' U' F R' F' R U R", ""));
        list.add(new Algorithm(OLL, R.drawable.oll34, 1, "???????????? ??????????", "R U B' U' R' U R B R'"+_SPLIT_ +
                "S R U R' U' R' F R Fw'"+_SPLIT_ +
                "y R U2 R2 U' F' U F R2 U' R'", ""));
        list.add(new Algorithm(OLL, R.drawable.oll35, 1, "???????????? ??????????", ">> R' U' F U R U' R' F' R", ""));
        list.add(new Algorithm(OLL, R.drawable.oll36, 1, "?????????? ??", "R U R' U R U' R' U' R' F R F'"+_SPLIT_ +
                "y2 R U R' U F' U F U2 R U' R'"+_SPLIT_ +
                "y2 R U2 R2 F2 Rw U L' U2 R U'", "???????????? ?? ??????????, ?????????????????????? ??????????, ?????????????? ????????, ?????????????? ?????????? ??????????"));
        list.add(new Algorithm(OLL, R.drawable.oll37, 1, "?????????? ??", "L' U' L U' L' U L U Rw U' Rw' F"+_SPLIT_ +
                "y' R U R2' F' U' F U R2 U2' R'"+_SPLIT_ +
                "y2 R' U' R U' R' U R U x' R U' R' U x", "???????? ?????????? ???? ?????????? ??????????, ???? ???????? ???? ?????????????????????????? ????????????, ???? ???????????? ????????????????"));
        list.add(new Algorithm(OLL, R.drawable.oll38a, 1, "??????????", "Rw U R' U R U' R' U R U2' Rw'"+_SPLIT_ +
                "y' Rw U2 R' U' R U R' U' R U' Rw'", "?????? ???????? ???? ????????, ??????????????, ????????????????????"));
        list.add(new Algorithm(OLL, R.drawable.oll39, 1, "??????????", "y Rw' U' R U' R' U R U' R' U2 Rw"+_SPLIT_ +
                "y2 Rw' U2 R U R' U' R U R' U Rw"+_SPLIT_ +
                "y' F R U R' U' R U' R' U R U R' F'", "???????????????????? ????????????????????, ?????????????? ????????????????????, ???????????? ???????????? ?????????? ???????????? ??????????"));
        list.add(new Algorithm(OLL, R.drawable.oll41, 1, "??????????", "Rw U' Rw2 U Rw2 U Rw2 U' Rw"+_SPLIT_ +
                "y R' U2' R U R' U R F R U R' U' F'"+_SPLIT_ +
                "y' F R' F2 R U2 R U2 R' F", "?????????? ?????????????? ??????????????"));
        list.add(new Algorithm(OLL, R.drawable.oll40, 1, "??????????", "y Rw' U Rw2 U' Rw2 U' Rw2 U Rw'"+_SPLIT_ +
                "R U2 R' U' R U' R' F R U R' U' F'", "???????????????????? ????????????????, ?????????????????????? ?????????? ????????????"));
        list.add(new Algorithm(OLL, R.drawable.oll42, 1, "??????????", "F R U R' U' R U R' U' F'"+_SPLIT_ +
                "y2 Fw U R U' R' U R U' R' Fw'", "??????????, ?????? ??????-???????? (R U R' U'), ?????????? ??????????????"));
        list.add(new Algorithm(OLL, R.drawable.oll43, 1, "??????????", "F' L' U' L U L' U' L U F"+_SPLIT_ +
                "y' F U R U' R' F' R U R' U R U2 R'", "???????? ?? ?????? ???????????? ???????? ?????????????? ?????????? ??????????, ?????????? ???????????? ??????????????. ???????? ???????????? \"????????????????????\" ?????????? ????????????"));
        list.add(new Algorithm(OLL, R.drawable.oll44, 1, "??????????????", "Rw U2 R' U' R U' Rw'", ""));
        list.add(new Algorithm(OLL, R.drawable.oll45, 1, "??????????????", ">> Rw' U2 R U R' U Rw", ""));
        list.add(new Algorithm(OLL, R.drawable.oll46, 1, "????????????", "Rw U R' U R U2 Rw'"+_SPLIT_ +
                "F R' F' R U2 R U2 R'"+_SPLIT_ +
                "y2 Lw U L' U L U2 Lw'", "???????????????????????? ??????????????"));
        list.add(new Algorithm(OLL, R.drawable.oll47, 1, "????????????", "R U2 R' U2 R' F R F'"+_SPLIT_ +
                "R' F' Rw U' Rw' F2 R"+_SPLIT_ +
                "y2 Rw' U' R U' R' U2 Rw", "???????????? ?? ??????????,U2, ?????????????? ???????? ?????????? ??????????"));
        list.add(new Algorithm(OLL, R.drawable.oll48, 1, "????????????", "y Rw R2 U' R U' R' U2 R U' Rw' R"+_SPLIT_ +
                "y' Rw' R U2 R' U' R U' R' U2 R U M'"+_SPLIT_ +
                "y2 F R U R' U' F' U F R U R' U' F'", "???????????? ?????????? ??????????????, ?????????????????? ???????????? ?????? ??????????????????????"));
        list.add(new Algorithm(OLL, R.drawable.oll49, 1, "????????????", "Rw R' U R U R' U R U2 R' U Rw' R"+_SPLIT_ +
                "y Rw' R2 U R' U R U2 R' U M'"+_SPLIT_ +
                "y' Rw U R' U R' F R F' R U2 Rw'", ""));
        list.add(new Algorithm(OLL, R.drawable.oll50, 1, "??????????????", "F R U' R' U' R U R' F'"+_SPLIT_ +
                "F R' F' R U R U' R'"+_SPLIT_ +
                "y' R U R' F' U F R U' R'", "???????? ???? ???????????? ?????????????? ??????????, ???? ?????? ?????? ?????? ???? ????????????. ?????????????? 2 ?????? ????  ?????????? ??????????????"));
        list.add(new Algorithm(OLL, R.drawable.oll51, 1, "??????????????", "y2 R U2' R2 F R F' R U2' R'"+_SPLIT_ +
                "y R' U2 Lw R U' R' U Lw' U2 R"+_SPLIT_ +
                "y R' U' F R' F' R2 U' R' U2 R", ""));
        list.add(new Algorithm(OLL, R.drawable.oll52, 1, "??????????", "y2 R U R' U R' F R F' R U2' R'"+_SPLIT_ +
                "Rw U R' U R U' R' U' Rw' R U R U' R'"+_SPLIT_ +
                "y R U R' U F' U F U' R U2 R'"+_SPLIT_ +
                "y' Rw R2 U2 R U R' U R U Rw' R", ""));
        list.add(new Algorithm(OLL, R.drawable.oll53, 1, "??????????", "R U R' U' R' F R2 U R' U' F'"+_SPLIT_ +
                "y R' U' R U' R' U R' F R F' U R"+_SPLIT_ +
                "y F' U' F Rw U' Rw' U Rw U Rw'", "??????-??????, ???????????????? ?????????? ??????????, ?????????????????????? ????????"));
        list.add(new Algorithm(OLL, R.drawable.oll54, 1, "??????????", "y2 R U R' U R U2 R' F R U R' U' F'"+_SPLIT_ +
                "R U' R' U2 R U B U' B' U' R'"+_SPLIT_ +
                "y' R U R' U R U' R' U R U' R' U' R' F R F'", "?????? ?????????????? ??????????????????????, ?????????? (R U R' U R U2' R') +????????"));
        list.add(new Algorithm(OLL, R.drawable.oll55, 1, "??????????", "R' U' R U' R' U2 R F R U R' U' F'"+_SPLIT_ +
                "y2 R' U R U2 R' U' F' U F U R", "?????? ?????????????? ??????????????????????, ?????????? ?????????? (R' U' R U' R' U2' R) +????????"));
        list.add(new Algorithm(OLL, R.drawable.oll56, 1, "??????????", "y2 F R' F R2 U' R' U' R U R' F2"+_SPLIT_ +
                "Fw R U R2 U' R' U R2 U' R' Fw'"+_SPLIT_ +
                "R2' U R' B' R U' R2' U R B R'"+_SPLIT_ +
                "y' R' F' Rw U' Rw' F2 R2 U R' U R U2 R'", "???????????????????? ?????????????????? ?????? ?????????????? ???????????????? ?????????? ?????????????? ????????????????"));
        list.add(new Algorithm(OLL, R.drawable.oll57, 1, "??????????", "y R U R' U' R U' R' F' U' F R U R'"+_SPLIT_ +
                "Rw2 D' Rw U Rw' D Rw2 U' Rw' U' Rw"+_SPLIT_ +
                "y R' U2 R2 U R' U' R' U2 F R F'", "???????????? ??????-??????... ?? ????????????????????"));

        list.add(new Algorithm(PLL, R.drawable.pll01, 1, "???????????????????????? ???????????? (U-perms)", "R2' U R U R' U' R3 U' R' U R'"+_SPLIT_ +
                "R2 U R U R' U' R' U' R' U R'"+_SPLIT_ +
                "M2 U' M U2 M' U' M2"+_SPLIT_ +
                "y2 R' U R' U' R' U' R' U R U R2"+_SPLIT_ +
                "y2 M2 U' M' U2 M U' M2",
                "?? ???????????? ???????????????? ???????????????????????? ?????????????????????? ???????????????? R3 ?????? ????????????????, ?????????????????????? ?????????????????? ?????????????? R2 ???? ?????????????? ????????????, ?? ?????????????????? ???????????????? (R) ???????????????????????? ????????????????????????, ???????????????? ??????????????. ???????? ???? ?????????????????? ?????????????????????????? ????????????, ???? ?????? ?????????????? ???????????? ?????????? ???????????? ??????????????. "));
        list.add(new Algorithm(PLL, R.drawable.pll02, 1, "???????????????????????? ???????????? (U-perms)", "R U' R U R U R U' R' U' R2"+_SPLIT_ +
                "M2 U M U2 M' U M2"+_SPLIT_ +
                "U2 R U R' U R' U' R2 U' R' U R' U R"+_SPLIT_ +
                "y2 R2 U' R' U' R U R U R U' R",
                "?????????????????????? ???????????????????????? ???????? ?????????? ???????????? ?????????????? ??????????????, ?????????? ?????? ???? ?????????????????? ?????????? M ???????? ?????? ?????????????? ?? ???????????? ????????????"));
        list.add(new Algorithm(PLL, R.drawable.pll03, 1, "?????????????? (Z-perm)", "y/y' M2 U' M2 U' M' U2' M2 U2' M' U2 "+_SPLIT_ +
                "M2 U M2 U M' U2 M2 U2 M'"+_SPLIT_ +
                "U' M' U M2 U M2 U M' U2 M2"+_SPLIT_ +
                "U2 M' U2 M2 U2 M' U' M2 U' M2"+_SPLIT_ +
                "M2' U2 M' U' M2' U' M2' U' M' U",
                "???? ?????????????????? ?????????????????? M2 ?????????? ?????????????? ????????????????.  ???????? ?????? ???????????? ???????????? M2 ???????????? ??????????, ?????????? ???????????? ??????????????, ???????? ??????????, ???? ????????????."));
        list.add(new Algorithm(PLL, R.drawable.pll04, 1, "?????????? ???????????? (H-perm)", "M2 U' M2 U2' M2 U' M2"+_SPLIT_ +
                "M2 U M2 U2 M2 U M2",
                "?????????? ?????? ???????????????? ?????????????????? M2 ?????????? ?????????????? ????????????????, ?????????????? ?????????? ?????????? ???????? ????????????????, ???? ?????????? ?????????? ???????????? ?????????? ???????? ????????????????. ???????? ?????? ???????????? ???????????? M2 ???????????? ??????????, ?????????? ???????????? ??????????????, ???????? ??????????, ???? ????????????."));
        list.add(new Algorithm(PLL, R.drawable.pll05, 1, "???????????????????????? ?????????? (A-perms)", "Lw' U R' D2 R U' R' D2 R2"+_SPLIT_ +
                "y x' R2 D2 R' U' R D2 R' U R'"+_SPLIT_ +
                "y' Rw L D2 L' U' L D2 L' U L'"+_SPLIT_ +
                "y' x' U' R U' L2 U R' U' L2 U",
                "?????? ???????????????? ???????????????? D2 ?????????????????????? ?????????? ?????????????? ???????????????? ??????????????????????????????. ????????????????, ????????????????????, ?? ?????????? ??????????????"));
        list.add(new Algorithm(PLL, R.drawable.pll06, 1, "???????????????????????? ?????????? (A-perms)", "x R2 D2 R U R' D2 R U' R"+_SPLIT_ +
                "y Lw U' R D2 R' U R D2 R2"+_SPLIT_ +
                "y' Rw U' L D2 L' U L D2 L2",
                "?????????????? ?????????? ???????????????????? ????????????????????, ???????????? ?????????? ???????? ???????????????????????????? ???????????? ?????????????? ??????????????. ?????? ???? ?????????????????????? ???????????????? D2 ?????????????????? ?????????? ?????????????? ???????????????? ??????????????????????????????"));
        list.add(new Algorithm(PLL, R.drawable.pll07, 1, "???????????????????????? ?????????????? (F-perm)", "R' U' F' R U R' U' R' F R2 U' R' U' R U R' U R"+_SPLIT_ +
                "U' R' U R U' R2 F' U' F U R F R' F' R2"+_SPLIT_ +
                "y R' U2 R' U' y R' F' R2 U' R' U R' F R U' F"+_SPLIT_ +
                "y' R' U R U' R2' F' U' F U R U' Lw R U' R' U",
                "???????????????????? ???? ???????????? ???????????? ????????????????????"));
        list.add(new Algorithm(PLL, R.drawable.pll08, 1, "???????????? (J-perms)", "R U R' F' R U R' U' R' F R2 U' R' U'"+_SPLIT_ +
                "R U2 R' U' R U2 L' U R' U' L"+_SPLIT_ +
                "y R U' L U2 R' U R U2 R' L' U"+_SPLIT_ +
                "y2 R' z R U R' D R2 U' R U R2 U'",
                "?????????????? ?? ?????????????? ??????????????"));
        list.add(new Algorithm(PLL, R.drawable.pll09, 1, "???????????? (J-perms)", "R' U2' R U R' z R2 U R' D R U'"+_SPLIT_ +
                "U' R' U L' U2 R U' R' U2 R L"+_SPLIT_ +
                "L U' R' U L' U2 R U' R' U2 R"+_SPLIT_ +
                "x U2 Rw' U' Rw U2 Lw' U R' U' R2",
                "???????????????? ???? ???? ?????? ???????? ????????????????, ?????????????? ?????????? ?????????????? "));
        list.add(new Algorithm(PLL, R.drawable.pll10, 1, "?????????? T (T-perm)", "R U R' U' R' F R2 U' R' U' R U R' F'"+_SPLIT_ +
                "(Dw2) R U R' U' R' F R2 U' R' U F' L' U L",
                "?????????? ?????????????? ?? ?????????????? ??????????????, ?????????? ???????????? ?????????????? ?? ?????????? ???? ??????????????????)"));
        list.add(new Algorithm(PLL, R.drawable.pll11, 1, "?????????????? (R-perms)", "3", ""));
        list.add(new Algorithm(PLL, R.drawable.pll11b, 1, "?????????????? (R-perms)", "R' U2' R U2' R' F R U R' U' R' F' R2"+_SPLIT_ +
                "R' U2 R' D' R U' R' D R U R U' R' U' R"+_SPLIT_ +
                "y R2 F R U R U' R' F' R U2' R' U2' R",
                "???????? ?? ?????? ???????????? ???????? ?????????????? ?????????? D, ???? ???????????? ?????????????????????? ???????????? ??????????????. ???? ?????????????????? ?????????????? ???????????????? ?????????????????? ?????????????? ????????????????."));
        list.add(new Algorithm(PLL, R.drawable.pll12, 1, "?????????????? (R-perms)", "3", ""));
        list.add(new Algorithm(PLL, R.drawable.pll12b, 1, "?????????????? (R-perms)", "y R U R' F' R U2 R' U2 R' F R U R U2 R'"+_SPLIT_ +
                "y R U' R' U' R U R D R' U' R D' R' U2 R'"+_SPLIT_ +
                "L U2 L' U2 L F' L' U' L U L F L2",
                "???????? ?? ?????? ???????????? ???????? ?????????????? ?????????? D, ???? ???????????? ?????????????????????? ???????????? ??????????????"));
        list.add(new Algorithm(PLL, R.drawable.pll13a, 1, "", "3", ""));
        list.add(new Algorithm(PLL, R.drawable.pll13b, 1, "???????????????????????? ?????????????? (F-perm)", "R' U' F' R U R' U' R' F R2 U' R' U' R U R' U R"+_SPLIT_ +
                "U' R' U R U' R2 F' U' F U R F R' F' R2"+_SPLIT_ +
                "y R' U2 R' U' y R' F' R2 U' R' U R' F R U' F"+_SPLIT_ +
                "y' R' U R U' R2' F' U' F U R U' Lw R U' R' U",
                "???????????????????? ???? ???????????? ???????????? ????????????????????"));
        list.add(new Algorithm(PLL, R.drawable.pll14, 1, "?????????????????? (G-perms)", "R2' F2 R U2 R U2' R' F R U R' U' R' F R2"+_SPLIT_ +
                "y2 R2' Uw' R U' R U R' Uw R2 B U' B'"+_SPLIT_ +
                "y2 R2 U' R U' R U R' U R2 D' U R U' R' D U'"+_SPLIT_ +
                "y2 D R2 U' R U' R U R' U R2 D' U R U' R' U'", ""));
        list.add(new Algorithm(PLL, R.drawable.pll15, 1, "?????????????????? (G-perms)", "R2 Uw R' U R' U' R Uw' R2 y' R' U R"+_SPLIT_ +
                "L2 F2 L' U2 L' U2 L F' L' U' L U L F' L2"+_SPLIT_ +
                "y' U D' R2 U R' U R' U' R U' R2 D U' R' U R",
                "???????????????? ???? ????????????????, ?????????????? ???????????????????? ?????????????? ?? ????????????"));
        list.add(new Algorithm(PLL, R.drawable.pll16, 1, "?????????????????? (G-perms)", "F' U' F R2 Uw R' U R U' R Uw' R2'"+_SPLIT_ +
                "U' D R' U' R U D' R2 U R' U R U' R U' R2"+_SPLIT_ +
                "y' R' Dw' F R2 Uw R' U R U' R Uw' R2'", ""));
        list.add(new Algorithm(PLL, R.drawable.pll17, 1, "?????????????????? (G-perms)", "R2' F' R U R U' R' F' R U2' R' U2' R' F2 R2"+_SPLIT_ +
                "y' R U R' y' R2 Uw' R U' R' U R' Uw R2"+_SPLIT_ +
                "y' R U R' U' D R2 U' R U' R' U R' U R2 U D'"+_SPLIT_ +
                "y2 Fw R Fw' R2 Uw' R U' R' U R' Uw R2", ""));
        list.add(new Algorithm(PLL, R.drawable.pll18, 1, "???????????????? ?????????????? (V-perm)", "R' U R' U' y R' F' R2 U' R' U R' F R F"+_SPLIT_ +
                "R' U2 R U2 L U' R' U L' U L U' R U L'"+_SPLIT_ +
                "y F' U F' U' R' F' R2 U' R' U R' F R F"+_SPLIT_, ""));
        list.add(new Algorithm(PLL, R.drawable.pll19, 1, "?????????? X (N-perms)", "R U R' U R U R' F' R U R' U' R' F R2 U' R' U2 R U' R'"+_SPLIT_ +
                "z R U R' D R2 U' R D' U R' D R2 U' R D'"+_SPLIT_ +
                "R U' R' U Lw U F U' R' F' R U' R U Lw' U R'"+_SPLIT_ +
                "R U R' U' L U2 L' U' L U2 R' U L' U' R U R U' R'",
                "?????????????? ??????????????, ???? ?????????? ?????????? ?????????? ?????????????????? ??????: ???????????? ?? ?????????? (R U R' U) ???????????? ???????????? R U R' F' R U R' U' R' F R2 U' R' ???????????? ???? ???????????? U2 ?? ???????????????? ???????? R U' R'"));
        list.add(new Algorithm(PLL, R.drawable.pll20, 1, "?????????? X (N-perms)", "R' U R U' R' F' U' F R U R' F R' F' R U' R"+_SPLIT_ +
                "R' U R' F R F' R U' R' F' U F R U R' U' R"+_SPLIT_ +
                "R' U L' U2 R U' R' L U L' U2 R U' L U"+_SPLIT_ +
                "L' U R' z R2 U R' U' D R D' R2 U R' z' R",
                "?????????????? ??????????????, ???? ?? ?????? ?????? ?????????????????? "));
        list.add(new Algorithm(PLL, R.drawable.pll21, 1, "?????????? (??????????, Y-perm)", "F R U' R' U' R U R' F' R U R' U' R' F R F'"+_SPLIT_ +
                "F R' F R2 U' R' U' R U R' F' R U R' U' F'",
                "???????????????????? ?????????????????? ?????????????????? ???????????????? ?? ???????? ?????????????? (F') ?????????????? ?????????????? ???????????? ????????."));

        list.add(new Algorithm(BIG, R.drawable.big07, 1, "???????????????????? ????????????", "??U2??'U'??U??'","?? ??? ?????? 3-?? ????????, r ??? 2-?? (Rr??)"));
        list.add(new Algorithm(BIG, R.drawable.big08, 1, "?????????????? ????????????", "??UrU'??'Ur'","?? ??? ?????? 3-?? ????????, r ??? 2-?? (Rr??)"));
        list.add(new Algorithm(BIG, R.drawable.big05, 1, "?????????????? ????????????", "Rr U Rr' U Rr U2 Rr","Rw ??? ?????? ???????????? ???????? ????????????"));
        list.add(new Algorithm(BIG, R.drawable.big06, 1, "???????????? ??????????????", "(Rr)' F (Ll)' (Rr) U (Rr) U' (Ll) (Rr)'", ""));
        list.add(new Algorithm(BIG, R.drawable.big04, 1, "?????????????????? + ????????????", "(Dd) R F' U R' F (Dd)'",""));
        list.add(new Algorithm(BIG, R.drawable.big02, 1, "(??????????????????)", "R2B2U2 lU2r'U2rU2 x U2rU2l'U2wl2"+_SPLIT_ +
                "R2B2U2lU2r'U2RU2F2 rF2l'B2r2","????????????, ???? ?????????? ????????????????????????. ?????????? ???????????????????? (50/50). 2-?? ???????????????? ??? ?????? ???? ???? ??????????, ???????????? ?????? ??????????????????. U2w ??? ?????? ?????????? ???????????? ???????? ???????????????? ???? ??????????, ?? ?????? ?????????????????? ?????????????? ???????????????????????????? ???? 180"));
        list.add(new Algorithm(BIG, R.drawable.big01, 1, "???????????? ??????????????", "(Uu)2(Rr)2F2u2F2(Rr)2(Uu)2",""));
        list.add(new Algorithm(BIG, R.drawable.big03, 1, "???????????? ??????????????", "(Ll)'U2(Ll)'U2F2(Ll)'F2 (Rr)U2(Rr)'U2{Ll}2","???????????? ?????????????? ?????????????????? ?????????? ??????????. ???????? ???? ??????????, ???? ???????????????? ???????????? ??????????????????"));
        list.add(new Algorithm(BIG, R.drawable.big01, 1, "?????????????? ?????????????????? ??????????????", "cRF'UR'Fc'","?????? ?????????????????????? ???????????????? ???????????????????????????????? ???? 180 ???????????? ???? ?????????? ??????????"));
        list.add(new Algorithm(BIG, R.drawable.big09, 1, "?????????????? ????????????", "r2 B2 U2 l U2 r' U2 r U2 F2 r F2 l' B2 r2","???????????? ?????????? ???? ???????????? ??????????????"));
        list.add(new Algorithm(BIG, R.drawable.big10, 1, "?????????????? ??????????", "r2 U2 r2 (Uu)2 r2 u2","???????????? ?????????? ???? ???????????? ??????????????"));
        list.add(new Algorithm(BIG, R.drawable.big11, 1, "??????????????????", "(Dd)RF'UR'F(Dd)'","?????????? ???????????????? ?????? ??????. ???????????? ?????????? ???????? ???????????????? ?????? 4-?? ????????????. ?????? ?????? ?????????? ?????? ???????????????????????? ????????????????, ???? ?????????? ???????????? ???????????????? ??????????????????"));

//        list.add(new Algorithm(BIG, R.drawable.pll21, 1, "", "r2U2r2(Uu)2r2u2",""));?????? ?????????????? ??????????

//        list.add(new Algorithm(BIG, R.drawable.pll21, 1, "", "FUF'U'L'U'L",""));???? ?????? ??????
//        list.add(new Algorithm(BIG, R.drawable.pll21, 1, "", "UFRURU'F",""));???? ?????? ??????

        return list;
    }


}
