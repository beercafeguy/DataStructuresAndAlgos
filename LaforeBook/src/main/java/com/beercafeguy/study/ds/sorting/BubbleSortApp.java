package com.beercafeguy.study.ds.sorting;

import java.util.Arrays;

public class BubbleSortApp {
    public static void main(String[] args) {
        performBubbleSortUsingArray();
    }

    private static void performBubbleSortUsingArray() {

        Integer[] inputArray={10,2,-1,0,55,22,110};
        System.out.println("Unsorted Array: "+ Arrays.toString(inputArray));

        // loop starting from 0 because we are assuming the at the start
        // we have an array of size 1 and because its size = 1 so it will always be
        // sorted
        for(int i=inputArray.length;i>=0;i--){
            for(int j=0;j<i-1;j++){
                if(inputArray[j]>inputArray[j+1]){
                    int tmp=inputArray[j+1];
                    inputArray[j+1]=inputArray[j];
                    inputArray[j]=tmp;
                }
            }
        }

        System.out.println("Sorted Array: "+ Arrays.toString(inputArray));
    }
}
