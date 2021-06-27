package com.beercafeguy.ds.nums;

public class PerfectSquare {

    public static void main(String[] args) {

        System.out.println(isPerfectSquare(16));
    }

    public static boolean isPerfectSquare(int num) {

        for(int i=1;i<=num;i++){
            if(num % i ==0 && num/i==i){
                return true;
            }
        }
        return false;
    }
}
