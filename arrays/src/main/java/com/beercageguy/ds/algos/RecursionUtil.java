package com.beercageguy.ds.algos;

public class RecursionUtil {

    public static int fact(int input){
        return factLoop(input);
    }

    public static int factRecursive(int input){
        if (input <= 1){
            return 1;
        }else{
            return input * factRecursive(input-1);
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
