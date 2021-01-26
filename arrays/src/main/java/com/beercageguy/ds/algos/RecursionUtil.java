package com.beercageguy.ds.algos;

public class RecursionUtil {

    public static int fact(int input){
        return factLoop(input);
    }

    private static int factInternal(int input){
        if (input <= 1){
            return input;
        }else{
            return factInternal(input-1);
        }
    }

    private static int factLoop(int input){
        int result=1;
        for(int i=input;i>1;i--){
            result*=i;
        }
        return result;
    }


}
