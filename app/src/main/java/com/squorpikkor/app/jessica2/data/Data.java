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
                "r' U2 R2 U R2’ U r"+_SPLIT_ +
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
                "R U' R' U y' R' U2 R U2' R' U R"+_SPLIT_+"мой: R U R' Г2 R U2 R' U'(мизинцем) y L' U' L", ""));

        list.add(new Algorithm(OLL, R.drawable.oll01, 1, "Глаза", ">> R2' D' R U2' R' D R U2' R"+_SPLIT_ +
                "y2 R2 D R' U2' R D' R' U2' R'", "!"));
        list.add(new Algorithm(OLL, R.drawable.oll02, 1, "Уши", "Rw U R' U' Rw' F R F'"+_SPLIT_ +
                "y2 R' F' Rw U R U' Rw' F"+_SPLIT_ +
                "y R U R D R' U' R D' R2'"+_SPLIT_ +
                "y R' F' R U R' U' R' F R U R"+_SPLIT_ +
                "y' R' U' R' D' R U R' D R2", "Напомним Rw это движение правых двух слоев кубика."));
        list.add(new Algorithm(OLL, R.drawable.oll03, 1, "Восьмерка", "F' Rw U R' U' Rw' F R"+_SPLIT_ +
                "R2 D R' U R D' R' U' R'"+_SPLIT_ +
                "y R2 D' R U' R' D R U R"+_SPLIT_ +
                "y' F R' F' Rw U R U' Rw'", "Быстрая формула, старайтесь использовать минимум перехватов"));
        list.add(new Algorithm(OLL, R.drawable.oll04, 1, "Рыбка", "R U R' U R U2' R'"+_SPLIT_ +
                "y L' U2 L U L' U L"+_SPLIT_ +
                "y' R' U2' R U R' U R"+_SPLIT_ +
                "y2 L U L' U L U2 L'", "Движение U2 выполняем двумя разными пальцами, можно так же доучить с других сторон."));
        list.add(new Algorithm(OLL, R.drawable.oll04_v2, 1, "Рыбка", "R U R' U R U2' R'"+_SPLIT_ +
                "R' U2 R U R' U R", "Предыдущее, только повернуто. В таком виде мне больше нравится"));
        list.add(new Algorithm(OLL, R.drawable.oll05, 1, "Рыбка", "R U2' R' U' R U' R'"+_SPLIT_ +
                "y L' U' L U' L' U2 L"+_SPLIT_ +
                "y' R' U' R U' R' U2' R", "Если вам удобно выполнять левой рукой, то можно зеркалить, формула вторая"));
        list.add(new Algorithm(OLL, R.drawable.oll06, 1, "Вертолет", "R U2' R2' U' R2 U' R2' U2 R"+_SPLIT_ +
                "y2 L' U2 L2 U L2' U L2 U2 L'", "Очень быстрая формула, старайтесь не делать лишних перехватов."));
        list.add(new Algorithm(OLL, R.drawable.oll07a, 1, "Двойные глаза", "R U2 R' U' R U R' U' R U' R'"+_SPLIT_ +
                "y/y' R U R' U R U' R' U R U2' R'"+_SPLIT_ +
                "F R U R' U' R U R' U' R U R' U' F'", "Третья формула для ленивых, фронт, три пиф-пафа (R U R' U'), фронт обратно. Но первые две быстрее "));
        list.add(new Algorithm(OLL, R.drawable.oll08, 1, "Летающий змей", "Rw U R' U' Rw' R U R U' R'"+_SPLIT_ +
                "y R' F' Rw U Rw' R U' L' U L"+_SPLIT_ +
                "y' Rw' U' R U M' U' R' U R", "Очень быстрая формула. Последние три движения в первой формуле просто загоняем пару на место (R U' R')"));
        list.add(new Algorithm(OLL, R.drawable.oll09, 1, "Буква Н", "R U R' U' M' U R U' Rw'"+_SPLIT_ +
                "y/y' R U R' U' M U R U' R' U' M'", "M' - движение среднего слоя кубика против часовой стрелки, выполняется мизинцем или безымянным пальцем"));

        list.add(new Algorithm(OLL, R.drawable.oll10, 1, "Снежинка", "Rw' R U R U R' U' Rw R' M' U R U' Rw'"+_SPLIT_ +
                "Rw U R' U' M2 U R U' R' U' M'", "Формулы достаточно похожи, попробуйте обе. Выбирайте ту которая удобнее и быстрее получается"));
        list.add(new Algorithm(OLL, R.drawable.oll11, 1, "Точка", "R U2' R2' F R F' U2' R' F R F'", "Не забывайте выполнять U2 разными пальцами, пригодится умение загонять пару через фронт"));
        list.add(new Algorithm(OLL, R.drawable.oll12, 1, "Точка", "Rw' U' Rw U2' R' U2' R U2' Rw' U Rw"+_SPLIT_ +
                "y2 Rw U Rw' U2' R U2' R' U2' Rw U' Rw'"+_SPLIT_ +
                "y F R U R' U' F' Fw R U R' U' Fw'", "Старайтесь не делать лишних перехватов."));
        list.add(new Algorithm(OLL, R.drawable.oll13, 1, "Запятая", "Rw' R2 U R' U Rw U2' Rw' U R' Rw"+_SPLIT_ +
                "Rw' R U R' F2 R U L' U L Rw R'"+_SPLIT_ +
                "y' Fw R U R' U' Fw' U' F R U R' U' F'"+_SPLIT_ +
                "y' Fw R U R' U' Fw' R' F' U' F U R"+_SPLIT_, ""));
        list.add(new Algorithm(OLL, R.drawable.oll14, 1, "Запятая", "Rw' R U' Rw U2 Rw' U' R U' R2 Rw"+_SPLIT_ +
                "y F U R U' R' F' R' F' U' F U R"+_SPLIT_ +
                "y' Fw R U R' U' Dw' x R' F R U R' U' F'"+_SPLIT_ +
                "y' R' U2 R' F R F' U' F' U' F U' R", ""));
        list.add(new Algorithm(OLL, R.drawable.oll15, 1, "Микки Маус", "Rw' R U R U R' U' Rw R2 F R F'"+_SPLIT_ +
                "R' U2 F R U R' U' F2 U2 F R"+_SPLIT_ +
                "y2 F R' F' R U R U' R' U' F R U R' U' F'", ""));
        list.add(new Algorithm(OLL, R.drawable.oll16, 1, "Микки Маус", "Rw U R' U R U2 Rw2 U' R U' R' U2 Rw"+_SPLIT_ +
                "y R U2 R2 F R F' U2 Rw R' U R U' Rw'"+_SPLIT_ +
                "y' F R U' R' U' R U R' F' U' F R U R' U'F'"+_SPLIT_, ""));
        list.add(new Algorithm(OLL, R.drawable.oll17, 1, "Диагональ", "R U R' U R' F R F' U2' R' F R F'"+_SPLIT_ +
                "y2 F R' F' R2 Rw' U R U' R' U' M'"+_SPLIT_ +
                "y2 Rw U' Rw' F U2 F U' R U' R' F'", ""));
        list.add(new Algorithm(OLL, R.drawable.oll18, 1, "Буква Т", "R U R' U' R' F R F'"+_SPLIT_ +
                "F R U' R' U R U R' F'", "Делаем пиф-паф (R U R' U')и загоняем пару через фронт"));
        list.add(new Algorithm(OLL, R.drawable.oll19, 1, "Буква Т", "F R U R' U' F'"+_SPLIT_ +
                "y R' F' U' F U R'"+_SPLIT_ +
                "y2 F' L' U' L U F"+_SPLIT_ +
                "y2 Fw U R U' R' Fw'", "Очень простая формула и запомнить легко, фронт, пиф-паф (R U R' U'), фронт обратно. Старайтесь последнее движение делать большим пальцем правой руки"));

        list.add(new Algorithm(OLL, R.drawable.oll20, 1, "Пропеллер", ">> R U R' F' U' F U R U2 R'", ""));
        list.add(new Algorithm(OLL, R.drawable.oll21, 1, "Пропеллер", "R' F R U R' U' F' U R", ""));
        list.add(new Algorithm(OLL, R.drawable.oll22, 1, "Скобка", "R U R2 U' R' F R U R U' F'", ""));
        list.add(new Algorithm(OLL, R.drawable.oll23, 1, "Скобка", "y R' U' R' F R F' U R", ""));
        list.add(new Algorithm(OLL, R.drawable.oll24, 1, "Палка", "F U R U' R' U R U' R' F'", ""));
        list.add(new Algorithm(OLL, R.drawable.oll25, 1, "Палка", "y' R' F' U' F U' R U R' U R"+_SPLIT_ +
                "F R U R' U y' R' U' R U' R'"+_SPLIT_ +
                "y R U R' U R U' B U' B' R'"+_SPLIT_ +
                "y R' U' R U' R' U F' U F R", ""));
        list.add(new Algorithm(OLL, R.drawable.oll26, 1, "Палка", "Rw' U' Rw U' R' U R U' R' U R Rw' U Rw"+_SPLIT_ +
                "Rw U Rw' U R U' R' U R U' R' Rw U' Rw'", ""));
        list.add(new Algorithm(OLL, R.drawable.oll27, 1, "Палка", "R' F R U R U' R2 F' R2 U' R' U R U R'"+_SPLIT_ +
                "y/y' R U2 R2 U' R U' R' U2 F R F'", ""));
        list.add(new Algorithm(OLL, R.drawable.oll28, 1, "Буква Г", "y2 F U R U' R2 F' R U R U' R'"+_SPLIT_ +
                "Lw U' R' F' R U R' U' F U x"+_SPLIT_ +
                "Fw R U R2 U' R' U R U' Fw'"+_SPLIT_ +
                "y2 Rw U' Rw' U' Rw U Rw' F' U F", ""));
        list.add(new Algorithm(OLL, R.drawable.oll29, 1, "Буква Г", "Rw U Rw' R U R' U' Rw U' Rw'"+_SPLIT_ +
                "y2 x' R U R' Rw U Rw' F' R U' Lw'"+_SPLIT_ +
                "y2 R' F R U R' U' F' R U' R' U2 R", ""));
        list.add(new Algorithm(OLL, R.drawable.oll30, 1, "Буква Г", "Rw' U Rw U Rw' U' Rw B U' B'"+_SPLIT_ +
                "y2 R' F R U R' F' R F U' F'"+_SPLIT_ +
                "y2 F' U' Rw' F Rw2 U Rw' U' L' U L", ""));
        list.add(new Algorithm(OLL, R.drawable.oll31, 1, "Буква Г", "y2 Rw' U' Rw R' U' R U Rw' U Rw"+_SPLIT_ +
                "Lw' U' Lw L' U' L U R' F R", ""));
        list.add(new Algorithm(OLL, R.drawable.oll32, 1, "Мягкие знаки", "F U R U' R' F'", ""));
        list.add(new Algorithm(OLL, R.drawable.oll33, 1, "Мягкие знаки", "y R' U' F' U F R"+_SPLIT_ +
                "B' U' R' U R B"+_SPLIT_ +
                "Fw' L' U' L U Fw"+_SPLIT_ +
                "y2 R' U' F R' F' R U R", ""));
        list.add(new Algorithm(OLL, R.drawable.oll34, 1, "Мягкие знаки", "R U B' U' R' U R B R'"+_SPLIT_ +
                "S R U R' U' R' F R Fw'"+_SPLIT_ +
                "y R U2 R2 U' F' U F R2 U' R'", ""));
        list.add(new Algorithm(OLL, R.drawable.oll35, 1, "Мягкие знаки", ">> R' U' F U R U' R' F' R", ""));
        list.add(new Algorithm(OLL, R.drawable.oll36, 1, "Буква М", "R U R' U R U' R' U' R' F R F'"+_SPLIT_ +
                "y2 R U R' U F' U F U2 R U' R'"+_SPLIT_ +
                "y2 R U2 R2 F2 Rw U L' U2 R U'", "Начало с рыбки, протолкнули ребро, вернули пару, загнали через фронт"));
        list.add(new Algorithm(OLL, R.drawable.oll37, 1, "Буква М", "L' U' L U' L' U L U Rw U' Rw' F"+_SPLIT_ +
                "y' R U R2' F' U' F U R2 U2' R'"+_SPLIT_ +
                "y2 R' U' R U' R' U R U x' R U' R' U x", "Тоже самое но левой рукой, но если вы предпочитаете правой, то второй алгоритм"));
        list.add(new Algorithm(OLL, R.drawable.oll38a, 1, "Стелс", "Rw U R' U R U' R' U R U2' Rw'"+_SPLIT_ +
                "y' Rw U2 R' U' R U R' U' R U' Rw'", "Два слоя от себя, формула, возвращаем"));
        list.add(new Algorithm(OLL, R.drawable.oll39, 1, "Стелс", "y Rw' U' R U' R' U R U' R' U2 Rw"+_SPLIT_ +
                "y2 Rw' U2 R U R' U' R U R' U Rw"+_SPLIT_ +
                "y' F R U R' U' R U' R' U R U R' F'", "Зеркальная предыдущей, похожее выполнение, только больше через заднюю грань"));
        list.add(new Algorithm(OLL, R.drawable.oll41, 1, "Стелс", "Rw U' Rw2 U Rw2 U Rw2 U' Rw"+_SPLIT_ +
                "y R' U2' R U R' U R F R U R' U' F'"+_SPLIT_ +
                "y' F R' F2 R U2 R U2 R' F", "Очень быстрая формула"));
        list.add(new Algorithm(OLL, R.drawable.oll40, 1, "Стелс", "y Rw' U Rw2 U' Rw2 U' Rw2 U Rw'"+_SPLIT_ +
                "R U2 R' U' R U' R' F R U R' U' F'", "Зеркальная ситуация, выполняется очень похоже"));
        list.add(new Algorithm(OLL, R.drawable.oll42, 1, "Стелс", "F R U R' U' R U R' U' F'"+_SPLIT_ +
                "y2 Fw U R U' R' U R U' R' Fw'", "Фронт, два пиф-пафа (R U R' U'), фронт обратно"));
        list.add(new Algorithm(OLL, R.drawable.oll43, 1, "Стелс", "F' L' U' L U L' U' L U F"+_SPLIT_ +
                "y' F U R U' R' F' R U R' U R U2 R'", "Если у вас быстро идут формулы левой рукой, тогда первый вариант. Если любите \"праворукие\" тогда второй"));
        list.add(new Algorithm(OLL, R.drawable.oll44, 1, "Квадрат", "Rw U2 R' U' R U' Rw'", ""));
        list.add(new Algorithm(OLL, R.drawable.oll45, 1, "Квадрат", ">> Rw' U2 R U R' U Rw", ""));
        list.add(new Algorithm(OLL, R.drawable.oll46, 1, "Молния", "Rw U R' U R U2 Rw'"+_SPLIT_ +
                "F R' F' R U2 R U2 R'"+_SPLIT_ +
                "y2 Lw U L' U L U2 Lw'", "Молниеносная формула"));
        list.add(new Algorithm(OLL, R.drawable.oll47, 1, "Молния", "R U2 R' U2 R' F R F'"+_SPLIT_ +
                "R' F' Rw U' Rw' F2 R"+_SPLIT_ +
                "y2 Rw' U' R U' R' U2 Rw", "Начало с рыбки,U2, загнали пару через фронт"));
        list.add(new Algorithm(OLL, R.drawable.oll48, 1, "Молния", "y Rw R2 U' R U' R' U2 R U' Rw' R"+_SPLIT_ +
                "y' Rw' R U2 R' U' R U' R' U2 R U M'"+_SPLIT_ +
                "y2 F R U R' U' F' U F R U R' U' F'", "Первая очень быстрая, четвертая легкая для запоминания"));
        list.add(new Algorithm(OLL, R.drawable.oll49, 1, "Молния", "Rw R' U R U R' U R U2 R' U Rw' R"+_SPLIT_ +
                "y Rw' R2 U R' U R U2 R' U M'"+_SPLIT_ +
                "y' Rw U R' U R' F R F' R U2 Rw'", ""));
        list.add(new Algorithm(OLL, R.drawable.oll50, 1, "Галстук", "F R U' R' U' R U R' F'"+_SPLIT_ +
                "F R' F' R U R U' R'"+_SPLIT_ +
                "y' R U R' F' U F R U' R'", "Если вы знаете формулу копье, то это как раз ее начало. Формула 2 так же  очень быстрая"));
        list.add(new Algorithm(OLL, R.drawable.oll51, 1, "Галстук", "y2 R U2' R2 F R F' R U2' R'"+_SPLIT_ +
                "y R' U2 Lw R U' R' U Lw' U2 R"+_SPLIT_ +
                "y R' U' F R' F' R2 U' R' U2 R", ""));
        list.add(new Algorithm(OLL, R.drawable.oll52, 1, "Рюмка", "y2 R U R' U R' F R F' R U2' R'"+_SPLIT_ +
                "Rw U R' U R U' R' U' Rw' R U R U' R'"+_SPLIT_ +
                "y R U R' U F' U F U' R U2 R'"+_SPLIT_ +
                "y' Rw R2 U2 R U R' U R U Rw' R", ""));
        list.add(new Algorithm(OLL, R.drawable.oll53, 1, "Рюмка", "R U R' U' R' F R2 U R' U' F'"+_SPLIT_ +
                "y R' U' R U' R' U R' F R F' U R"+_SPLIT_ +
                "y F' U' F Rw U' Rw' U Rw U Rw'", "Пиф-паф, загоняем через фронт, укорачиваем Тшку"));
        list.add(new Algorithm(OLL, R.drawable.oll54, 1, "Петух", "y2 R U R' U R U2 R' F R U R' U' F'"+_SPLIT_ +
                "R U' R' U2 R U B U' B' U' R'"+_SPLIT_ +
                "y' R U R' U R U' R' U R U' R' U' R' F R F'", "Для легкого запоминания, Рыбка (R U R' U R U2' R') +Тшка"));
        list.add(new Algorithm(OLL, R.drawable.oll55, 1, "Петух", "R' U' R U' R' U2 R F R U R' U' F'"+_SPLIT_ +
                "y2 R' U R U2 R' U' F' U F U R", "Для легкого запоминания, новая Рыбка (R' U' R U' R' U2' R) +Тшка"));
        list.add(new Algorithm(OLL, R.drawable.oll56, 1, "Петух", "y2 F R' F R2 U' R' U' R U R' F2"+_SPLIT_ +
                "Fw R U R2 U' R' U R2 U' R' Fw'"+_SPLIT_ +
                "R2' U R' B' R U' R2' U R B R'"+_SPLIT_ +
                "y' R' F' Rw U' Rw' F2 R2 U R' U R U2 R'", "Старайтесь выполнять все двойные движения двумя разными пальцами"));
        list.add(new Algorithm(OLL, R.drawable.oll57, 1, "Петух", "y R U R' U' R U' R' F' U' F R U R'"+_SPLIT_ +
                "Rw2 D' Rw U Rw' D Rw2 U' Rw' U' Rw"+_SPLIT_ +
                "y R' U2 R2 U R' U' R' U2 F R F'", "Начало пиф-паф... и продолжаем"));

        list.add(new Algorithm(PLL, R.drawable.pll01, 1, "Треугольники сторон (U-perms)", "R2' U R U R' U' R3 U' R' U R'"+_SPLIT_ +
                "R2 U R U R' U' R' U' R' U R'"+_SPLIT_ +
                "M2 U' M U2 M' U' M2"+_SPLIT_ +
                "y2 R' U R' U' R' U' R' U R U R2"+_SPLIT_ +
                "y2 M2 U' M' U2 M U' M2",
                "В первом варианте используется специальное движение R3 для скорости, выполняется следующим образом R2 вы делаете обычно, а остальное движение (R) докручиваете указательным, отпуская большой. Если не получится натренировать первую, то без проблем можете брать вторую формулу. "));
        list.add(new Algorithm(PLL, R.drawable.pll02, 1, "Треугольники сторон (U-perms)", "R U' R U R U R U' R' U' R2"+_SPLIT_ +
                "M2 U M U2 M' U M2"+_SPLIT_ +
                "U2 R U R' U R' U' R2 U' R' U R' U R"+_SPLIT_ +
                "y2 R2 U' R' U' R U R U R U' R",
                "Выполняется перестановка трех ребер против часовой стрелки, можно так же выполнять через M слой или доучить с других сторон"));
        list.add(new Algorithm(PLL, R.drawable.pll03, 1, "Саночки (Z-perm)", "y/y' M2 U' M2 U' M' U2' M2 U2' M' U2 "+_SPLIT_ +
                "M2 U M2 U M' U2 M2 U2 M'"+_SPLIT_ +
                "U' M' U M2 U M2 U M' U2 M2"+_SPLIT_ +
                "U2 M' U2 M2 U2 M' U' M2 U' M2"+_SPLIT_ +
                "M2' U2 M' U' M2' U' M2' U' M' U",
                "Не забывайте выполнять M2 двумя разными пальцами.  Если вам удобно делать M2 правой рукой, тогда первая формула, если левой, то вторая."));
        list.add(new Algorithm(PLL, R.drawable.pll04, 1, "Крест сторон (H-perm)", "M2 U' M2 U2' M2 U' M2"+_SPLIT_ +
                "M2 U M2 U2 M2 U M2",
                "Важно для скорости выполнять M2 двумя разными пальцами, сначала может будет чуть неудобно, но потом очень быстро будет идти алгоритм. Если вам удобно делать M2 правой рукой, тогда первая формула, если левой, то вторая."));
        list.add(new Algorithm(PLL, R.drawable.pll05, 1, "Треугольники углов (A-perms)", "Lw' U R' D2 R U' R' D2 R2"+_SPLIT_ +
                "y x' R2 D2 R' U' R D2 R' U R'"+_SPLIT_ +
                "y' Rw L D2 L' U' L D2 L' U L'"+_SPLIT_ +
                "y' x' U' R U' L2 U R' U' L2 U",
                "Для скорости движение D2 выполняется двумя разными пальцами последовательно. Например, безымянный, а потом мизинец"));
        list.add(new Algorithm(PLL, R.drawable.pll06, 1, "Треугольники углов (A-perms)", "x R2 D2 R U R' D2 R U' R"+_SPLIT_ +
                "y Lw U' R D2 R' U R D2 R2"+_SPLIT_ +
                "y' Rw U' L D2 L' U L D2 L2",
                "Формула очень напоминает предыдущую, только здесь углы переставляются против часовой стрелки. Так же рекомендуем движение D2 выполнять двумя разными пальцами последовательно"));
        list.add(new Algorithm(PLL, R.drawable.pll07, 1, "Параллельный перенос (F-perm)", "R' U' F' R U R' U' R' F R2 U' R' U' R U R' U R"+_SPLIT_ +
                "U' R' U R U' R2 F' U' F U R F R' F' R2"+_SPLIT_ +
                "y R' U2 R' U' y R' F' R2 U' R' U R' F R U' F"+_SPLIT_ +
                "y' R' U R U' R2' F' U' F U R U' Lw R U' R' U",
                "Старайтесь не делать лишних перехватов"));
        list.add(new Algorithm(PLL, R.drawable.pll08, 1, "Лямбды (J-perms)",
                "R U2 R' U' R U2 L' U R' U' L"+_SPLIT_ +
                "R U R' F' R U R' U' R' F R2 U' R' U'"+_SPLIT_ +
                "R U2 R' U' R U2 L' U R' U' L"+_SPLIT_ +
                "y R U' L U2 R' U R U2 R' L' U"+_SPLIT_ +
                "y2 R' z R U R' D R2 U' R U R2 U'",
                "Простая и быстрая формула"));
        list.add(new Algorithm(PLL, R.drawable.pll09, 1, "Лямбды (J-perms)", "R' U2' R U R' z R2 U R' D R U'"+_SPLIT_ +
                "R' U2' R U R' U2' L U' R U L'"+_SPLIT_ +
                "U' R' U L' U2 R U' R' U2 R L"+_SPLIT_ +
                "L U' R' U L' U2 R U' R' U2 R"+_SPLIT_ +
                "x U2 Rw' U' Rw U2 Lw' U R' U' R2",
                "Несмотря на то что есть перехват, формула очень быстрая "));
        list.add(new Algorithm(PLL, R.drawable.pll10, 1, "Буква T (T-perm)", "R U R' U' R' F R2 U' R' U' R U R' F'"+_SPLIT_ +
                "(Dw2) R U R' U' R' F R2 U' R' U F' L' U L",
                "Очень хорошая и быстрая формула, учите первый вариант и точно не ошибетесь)"));
        list.add(new Algorithm(PLL, R.drawable.pll11, 1, "Семерки (R-perms)", "3", ""));
        list.add(new Algorithm(PLL, R.drawable.pll11b, 1, "Семерки (R-perms)", "R' U2' R U2' R' F R U R' U' R' F' R2"+_SPLIT_ +
                "R' U2 R' D' R U' R' D R U R U' R' U' R"+_SPLIT_ +
                "y R2 F R U R U' R' F' R U2' R' U2' R",
                "Если у вас быстро идут формулы через D, то можете попробовать второй вариант. Не забывайте двойные движения выполнять разными пальцами."));
        list.add(new Algorithm(PLL, R.drawable.pll12, 1, "Семерки (R-perms)", "3", ""));
        list.add(new Algorithm(PLL, R.drawable.pll12b, 1, "Семерки (R-perms)", "y R U R' F' R U2 R' U2 R' F R U R U2 R'"+_SPLIT_ +
                "y R U' R' U' R U R D R' U' R D' R' U2 R'"+_SPLIT_ +
                "L U2 L' U2 L F' L' U' L U L F L2",
                "Если у вас быстро идут формулы через D, то можете попробовать второй вариант"));
        list.add(new Algorithm(PLL, R.drawable.pll13a, 1, "", "3", ""));
        list.add(new Algorithm(PLL, R.drawable.pll13b, 1, "Параллельный перенос (F-perm)", "R' U' F' R U R' U' R' F R2 U' R' U' R U R' U R"+_SPLIT_ +
                "U' R' U R U' R2 F' U' F U R F R' F' R2"+_SPLIT_ +
                "y R' U2 R' U' y R' F' R2 U' R' U R' F R U' F"+_SPLIT_ +
                "y' R' U R U' R2' F' U' F U R U' Lw R U' R' U",
                "Старайтесь не делать лишних перехватов"));
        list.add(new Algorithm(PLL, R.drawable.pll14, 1, "Восьмерки (G-perms)", "R2' F2 R U2 R U2' R' F R U R' U' R' F R2"+_SPLIT_ +
                "y2 R2' Uw' R U' R U R' Uw R2 B U' B'"+_SPLIT_ +
                "y2 R2 U' R U' R U R' U R2 D' U R U' R' D U'"+_SPLIT_ +
                "y2 D R2 U' R U' R U R' U R2 D' U R U' R' U'", ""));
        list.add(new Algorithm(PLL, R.drawable.pll15, 1, "Восьмерки (G-perms)", "R2 Uw R' U R' U' R Uw' R2 y' R' U R"+_SPLIT_ +
                "L2 F2 L' U2 L' U2 L F' L' U' L U L F' L2"+_SPLIT_ +
                "y' U D' R2 U R' U R' U' R U' R2 D U' R' U R",
                "Несмотря на перехват, формула достаточно быстрая и легкая"));
        list.add(new Algorithm(PLL, R.drawable.pll16, 1, "Восьмерки (G-perms)", "F' U' F R2 Uw R' U R U' R Uw' R2'"+_SPLIT_ +
                "U' D R' U' R U D' R2 U R' U R U' R U' R2"+_SPLIT_ +
                "y' R' Dw' F R2 Uw R' U R U' R Uw' R2'", ""));
        list.add(new Algorithm(PLL, R.drawable.pll17, 1, "Восьмерки (G-perms)", "R2' F' R U R U' R' F' R U2' R' U2' R' F2 R2"+_SPLIT_ +
                "y' R U R' y' R2 Uw' R U' R' U R' Uw R2"+_SPLIT_ +
                "y' R U R' U' D R2 U' R U' R' U R' U R2 U D'"+_SPLIT_ +
                "y2 Fw R Fw' R2 Uw' R U' R' U R' Uw R2", ""));
        list.add(new Algorithm(PLL, R.drawable.pll18, 1, "Летающая тарелка (V-perm)", "R' U R' U' y R' F' R2 U' R' U R' F R F"+_SPLIT_ +
                "R' U2 R U2 L U' R' U L' U L U' R U L'"+_SPLIT_ +
                "y F' U F' U' R' F' R2 U' R' U R' F R F"+_SPLIT_, ""));
        list.add(new Algorithm(PLL, R.drawable.pll19, 1, "Буквы X (N-perms)", "R U R' U R U R' F' R U R' U' R' F R2 U' R' U2 R U' R'"+_SPLIT_ +
                "z R U R' D R2 U' R D' U R' D R2 U' R D'"+_SPLIT_ +
                "R U' R' U Lw U F U' R' F' R U' R U Lw' U R'"+_SPLIT_ +
                "R U R' U' L U2 L' U' L U2 R' U L' U' R U R U' R'",
                "Формула длинная, но очень легко можно запомнить так: начало с рыбки (R U R' U) дальше Лямбда R U R' F' R U R' U' R' F R2 U' R' дальше мы делаем U2 и загоняем пару R U' R'"));
        list.add(new Algorithm(PLL, R.drawable.pll20, 1, "Буквы X (N-perms)", "R' U R U' R' F' U' F R U R' F R' F' R U' R"+_SPLIT_ +
                "R' U R' F R F' R U' R' F' U F R U R' U' R"+_SPLIT_ +
                "R' U L' U2 R U' R' L U L' U2 R U' L U"+_SPLIT_ +
                "L' U R' z R2 U R' U' D R D' R2 U R' z' R",
                "Сложная формула, но у вас все получится "));
        list.add(new Algorithm(PLL, R.drawable.pll21, 1, "Копьё (Лапка, Y-perm)", "F R U' R' U' R U R' F' R U R' U' R' F R F'"+_SPLIT_ +
                "F R' F R2 U' R' U' R U R' F' R U R' U' F'",
                "Старайтесь выполнять последнее движение в этой формуле (F') большим пальцем правой руки."));

        list.add(new Algorithm(BIG, R.drawable.big07, 1, "Внутренняя замена", "ρU2ρ'U'ρUρ'","ρ — это 3-й слой, r — 2-й (Rrρ)"));
        list.add(new Algorithm(BIG, R.drawable.big08, 1, "Внешняя замена", "ρUrU'ρ'Ur'","ρ — это 3-й слой, r — 2-й (Rrρ)"));
        list.add(new Algorithm(BIG, R.drawable.big05, 1, "Угловая замена", "Rr U Rr' U Rr U2 Rr","Rw — два правых слоя вместе"));
        list.add(new Algorithm(BIG, R.drawable.big06, 1, "Замена центров", "(Rr)' F (Ll)' (Rr) U (Rr) U' (Ll) (Rr)'", ""));
        list.add(new Algorithm(BIG, R.drawable.big04, 1, "Диагональ + замена", "(Dd) R F' U R' F (Dd)'",""));
        list.add(new Algorithm(BIG, R.drawable.big02, 1, "(Перекрест)", "R2B2U2 lU2r'U2rU2 x U2rU2l'U2wl2"+_SPLIT_ +
                "R2B2U2lU2r'U2RU2F2 rF2l'B2r2","Долгий, но легко запоминается. Часто попадается (50/50). 2-й алгоритм — это то же самое, только без перехвата. U2w — это самый нижний слой остается на месте, а все остальные верхние поворачиваются на 180"));
        list.add(new Algorithm(BIG, R.drawable.big01, 1, "Замена центров", "(Uu)2(Rr)2F2u2F2(Rr)2(Uu)2",""));
        list.add(new Algorithm(BIG, R.drawable.big03, 1, "Замена крайних", "(Ll)'U2(Ll)'U2F2(Ll)'F2 (Rr)U2(Rr)'U2{Ll}2","Замена крайних элементов между собой. Если не учить, то придется делать перекрест"));
        list.add(new Algorithm(BIG, R.drawable.big01, 1, "Двойной переворот центров", "cRF'UR'Fc'","Оба центральные элементы переворачиваются на 180 каждый на своём месте"));
        list.add(new Algorithm(BIG, R.drawable.big09, 1, "Паритет креста", "r2 B2 U2 l U2 r' U2 r U2 F2 r F2 l' B2 r2","Бывает тольк на четных кубиках"));
        list.add(new Algorithm(BIG, R.drawable.big10, 1, "Паритет углов", "r2 U2 r2 (Uu)2 r2 u2","Бывает тольк на четных кубиках"));
        list.add(new Algorithm(BIG, R.drawable.big11, 1, "Диагональ", "(Dd)RF'UR'F(Dd)'","Такой алгоритм уже был. Просто чтобы было понятнее для 4-х кубика. Так как здесь нет центрального элемента, то здесь просто меняется диагональ"));

//        list.add(new Algorithm(BIG, R.drawable.pll21, 1, "", "r2U2r2(Uu)2r2u2",""));это паритет углов

//        list.add(new Algorithm(BIG, R.drawable.pll21, 1, "", "FUF'U'L'U'L",""));хз что это
//        list.add(new Algorithm(BIG, R.drawable.pll21, 1, "", "UFRURU'F",""));хз что это

        return list;
    }


}
