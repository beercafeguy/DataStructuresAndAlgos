package com.beercafeguy.study.ds.sorting;

import java.util.Arrays;

public class SelectionSortApp {

    public static void main(String[] args) {
        performSelectionSortUsingArray();
    }

    private static void performSelectionSortUsingArray() {
        Integer[] inputArray={10,2,-1,0,55,22,110};
        System.out.println("Unsorted Array: "+ Arrays.toString(inputArray));


        System.out.println("Sorted Array: "+ Arrays.toString(inputArray));
    }
}
