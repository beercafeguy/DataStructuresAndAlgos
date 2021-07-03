package com.beercafeguy.ds.strings;

import java.util.Arrays;

public class NeedleInAhaystack {

    public static void main(String[] args) {

        NeedleInAhaystack app = new NeedleInAhaystack();
        System.out.println(app.naiveAlgo("abab", "ab"));
    }

    public int strStr(String haystack, String needle) {
        int hayStacklen=haystack.length();
        int needleLength=needle.length();

        if (haystack == null || needle == null) {
            return -1;
        } else if (needle.equals("")) {
            return 0;
        } else if(hayStacklen < needleLength){
            return -1;
        } else {
            for(int i=0;i<=hayStacklen-1;i++){
                if(i+needleLength>hayStacklen){
                    return -1;
                }
                if(haystack.substring(i,i+needleLength).equals(needle)){
                    return i;
                }
            }
            return -1;
        }
    }

    public int naiveAlgo(String source, String pattern){

        int sourceLen=source.length();
        int patLength=pattern.length();
        for(int i=0;i<=sourceLen-1;i++){
            boolean matched=true;
            for(int j=0;j<patLength;i++){
                if(pattern.charAt(j)!=source.charAt(i+j)){
                    matched=false;
                    break;
                }
            }
            if(matched){
                return i;
            }
        }
        return -1;
    }
}
