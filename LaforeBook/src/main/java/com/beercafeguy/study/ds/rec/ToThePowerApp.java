package com.beercafeguy.study.ds.rec;

public class ToThePowerApp {

    public static void main(String[] args) {
        System.out.println(toThePower(2,3));
    }
    public static int toThePower(int base,int power){
        if(power==0){
            return 1;
        }else{
            return base * toThePower(base,power-1);
        }
    }
}
