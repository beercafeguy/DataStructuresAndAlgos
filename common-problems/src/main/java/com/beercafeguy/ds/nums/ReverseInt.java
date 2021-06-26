package com.beercafeguy.ds.nums;

import static java.lang.Math.abs;

public class ReverseInt {

    public static void main(String[] args) {
        System.out.println(reverse(-342834239));
    }

    static int reverse(int x) {
        boolean isNegative = false;
        if (x < 0) {
            isNegative = true;
            x = -x;
        }

        int previousRevNum = 0, revNum = 0;

        while (x != 0) {
            int currentDigit = x % 10;
            revNum = revNum * 10 + currentDigit;

            if ((revNum - currentDigit) / 10 != previousRevNum) {
                return 0; //overflow
            }
            previousRevNum = revNum;
            x = x / 10;
        }
        return  (isNegative) ? -revNum : revNum;
    }
}
