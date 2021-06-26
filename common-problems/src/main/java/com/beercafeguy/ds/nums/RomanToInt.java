package com.beercafeguy.ds.nums;

import java.util.HashMap;

public class RomanToInt {
    public static void main(String[] args) {

        System.out.println(romanToInt("IV"));
    }

    public static int romanToInt(String s) {

        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;
        for (int i = 0; i < s.length(); i++) {

            int currentCharVal = map.get(s.charAt(i));
            if (i < s.length() - 1) { //if we still have char ahead of us

                int nextCharValue = map.get(s.charAt(i + 1));
                if (currentCharVal >= nextCharValue) {
                    result += currentCharVal;
                } else {
                    result = result + nextCharValue - currentCharVal;
                    i++;
                }
            } else {
                result += currentCharVal;
            }
        }
        return result;
    }

}
