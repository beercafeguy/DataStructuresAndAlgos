package com.beercageguy.ds.common;

public class FactApp {
    public static void main(String[] args) {
        System.out.println("Factorial of 3: "+FactorialCalculator.fact(3));
        System.out.println("Factorial of 5: "+FactorialCalculator.fact(5));
        System.out.println("Factorial of -100: "+FactorialCalculator.fact(-100));
        System.out.println("Factorial of 0: "+FactorialCalculator.fact(0));

        System.out.println("Factorial of 5: "+FactorialCalculator.factRec(5));
    }

}

class FactorialCalculator{
    public static int fact(int input){
        if(input==0){
            return 1;
        }else if (input < 0){
            return -1;
        }else{
            int fct=1;
            for(int i=1;i<=input;i++){
                fct=fct*i;
            }
            return fct;
        }
    }

    public static int factRec(int input){
        if(input<=1){
            return 1;
        }else{
            return input*factRec(input-1);
        }
    }
}
