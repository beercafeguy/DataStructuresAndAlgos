package com.beercafeguy.ds.strings;

public class RepeatedSubstring {

    public static void main(String[] args) {

        RepeatedSubstring app=new RepeatedSubstring();
        System.out.println(app.repeatedSubstringPattern("abab"));
    }

    public boolean repeatedSubstringPattern(String string) {
        return ((string + string).indexOf(string, 1) != string.length());
    }
}
