package com.beercafeguy.ds.strings;

public class LengthOfLastWord {

    public static void main(String[] args) {

        System.out.println(lengthOfLastWord("Hem Chandra"));
    }

    public static int lengthOfLastWord(String s) {
        String[] strs=s.split(" ");
        if(strs.length==0){
            return 0;
        }else{
            return strs[strs.length-1].length();
        }
    }
}
