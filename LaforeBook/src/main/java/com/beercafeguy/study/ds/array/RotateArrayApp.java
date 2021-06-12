package com.beercafeguy.study.ds.array;

import java.util.Arrays;

public class RotateArrayApp {

    public static void main(String[] args) {
        //rotateLeft();
        rotateLeft(2);
    }



    private static void rotateLeft(int numRotations) {
        int[] input={1,2,3,4,5};
        System.out.println("Before Rotation: "+ Arrays.toString(input));
        int counter=numRotations;
        while(counter>0) {
            int tmp = input[0];
            for (int i = 1; i < input.length; i++) {
                input[i - 1] = input[i];
            }
            input[input.length - 1] = tmp;
            System.out.println("After Rotation number : "+(numRotations+1-counter)+" " + Arrays.toString(input));
            counter--;
        }
    }

    /**
     * Rotate left once
     */
    private static void rotateLeft() {
        int[] input={1,2,3,4,5};
        System.out.println("Before Rotation: "+ Arrays.toString(input));
        int tmp=input[0];
        for(int i=1;i<input.length;i++){
            input[i-1]=input[i];
        }
        input[input.length-1]=tmp;
        System.out.println("After Rotation: "+ Arrays.toString(input));
    }
}
