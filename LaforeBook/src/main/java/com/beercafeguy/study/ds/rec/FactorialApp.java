package com.beercafeguy.study.ds.rec;

public class FactorialApp {
    public static void main(String[] args) {
        System.out.println(factorialUsingLoop(5));
        System.out.println(factorialUsingRecursion(5));
    }

    private static int factorialUsingLoop(int i) {
        if(i==0){
            return 1;
        }else{
            int fact=1;
            while(i>0){
                fact=fact*i;
                i--;
            }
            return fact;
        }
    }

    private static int factorialUsingRecursion(int i) {
        if(i==0){
            return 1;
        }else{
            return i * factorialUsingRecursion(i-1);
        }
    }

}
