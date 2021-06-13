package com.beercafeguy.study.ds.array;


import java.util.Arrays;

public class BinarySearchRotatedArrayApp {

    public static void main(String[] args) {
        int[] input={2,3,4,5,0,1};
        System.out.println(rotatedBinarySearch(input,4));
    }

    private static boolean rotatedBinarySearch(int[] input, int key) {
        int i; // after for loop, this will become pivot
        for(i=0;i<input.length;i++){
            if(input[i]>input[i+1]){
                break;
            }
        }
        System.out.println("Pivot Index: "+i);
        if(key==input[i]){
            return true;
        }else if (key>input[0]){
            System.out.println("Searching in first half");
            return BinarySearchApp.binarySearchRecursion(Arrays.copyOfRange(input,0,i+1),0,i, key);
        }else{
            System.out.println("Searching in second half");
            return BinarySearchApp.binarySearchRecursion(Arrays.copyOfRange(input,i+1,input.length),i+1,input.length, key);
        }
    }


}
