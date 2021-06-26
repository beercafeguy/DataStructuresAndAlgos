package com.beercafeguy.ds.nums;

public class IsPalindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome(1212));
    }

    public static boolean isPalindrome(int x) {

        String xStr=Integer.toString(x);
        for (int i=0;i<xStr.length()/2;i++){
            if(xStr.charAt(i)!=xStr.charAt(xStr.length()-i-1)){
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindromeRec(int x) {

        String xStr=Integer.toString(x);
        for (int i=0;i<xStr.length()/2;i++){
            if(xStr.charAt(i)!=xStr.charAt(xStr.length()-i-1)){
                return false;
            }
        }
        return true;
    }

}
