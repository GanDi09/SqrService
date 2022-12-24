package ru.netology.sqr.JavaqaMV.services;

public class sqrService {

    public int calcSqr(int min, int max) {
        int res = 0;
        for (int i = 10; i <= 99; i++) {
            int ii = i * i;
            if (ii >= min) {
                if (ii <= max) {
                    res++;
                }


            }
        }
        return res;
    }


}
