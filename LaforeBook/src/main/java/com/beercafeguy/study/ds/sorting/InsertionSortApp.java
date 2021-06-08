package com.beercafeguy.study.ds.sorting;

import java.util.Arrays;

public class InsertionSortApp {

    public static void main(String[] args) {
        performInsertionSortUsingArray();
    }

    private static void performInsertionSortUsingArray() {

        Integer[] inputArray={10,2,-1,0,55,22,110};
        System.out.println("Unsorted Array: "+ Arrays.toString(inputArray));

        // loop starting from 0 because we are assuming the at the start
        // we have an array of size 1 and because its size = 1 so it will always be
        // sorted
        for(int i=1;i<inputArray.length;i++){
            int marker=inputArray[i]; //pick the marker element
            int j=i-1;
            while(j>=0 && inputArray[j]>marker){
                inputArray[j+1]=inputArray[j];
                j=j-1;
            }
            inputArray[j+1]=marker;
        }

        System.out.println("Sorted Array: "+ Arrays.toString(inputArray));
    }
}
