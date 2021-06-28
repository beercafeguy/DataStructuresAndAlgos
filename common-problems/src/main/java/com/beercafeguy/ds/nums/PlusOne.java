package com.beercafeguy.ds.nums;

import java.util.Arrays;

public class PlusOne {

    public static void main(String[] args) {


        int[] input = {9, 9, 9};
        System.out.println("Increased: "+ Arrays.toString(plusOne(input)));
    }

    public static int[] plusOne(int[] digits) {

        int nElements = digits.length;

        digits[nElements - 1] = digits[nElements - 1] + 1;
        int carry = digits[nElements - 1] / 10;
        digits[nElements - 1] = digits[nElements - 1] % 10;

        for (int i = nElements - 2; i >= 0; i--) {
            digits[i] = digits[i] + carry;
            carry = digits[i] / 10;
            digits[i] = digits[i] % 10;
        }
        if (carry == 1) {
            int[] newArr = new int[digits.length + 1];
            newArr[0] = 1;
            for (int i = 1; i < newArr.length; i++) {
                newArr[i] = digits[i - 1];
            }
            return newArr;
        } else {
            return digits;
        }
    }
}
