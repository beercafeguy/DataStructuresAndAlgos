package com.beercageguy.ds.common;

public class FibnachiSeriesApp {
    public static void main(String[] args) {
        System.out.println("Fib of 5: "+fib(5));
        for(int i=0;i<=5;i++){
            System.out.print(fib(i)+" ");
        }

        for(int i=0;i<=5;i++){
            System.out.print(fibSimple(i)+" ");
        }
    }

    public static int fibSimple(int input){
        if(input==0) {
            return 0;
        }else{
            int a=0,b=1,c;
            for(int i=1;i<input;i++){
                c=a+b;
                a=b;
                b=c;
            }
            return b;
        }
    }

    public static int fib(int input){
        if(input<=1){
            return input;
        }else {
            return fib(input-1)+fib(input-2);
        }
    }
}
