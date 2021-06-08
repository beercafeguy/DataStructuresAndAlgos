package com.beercafeguy.study.ds.sorting;

import java.util.Arrays;

public class SelectionSortApp {

    public static void main(String[] args) {
        performSelectionSortUsingArray();
    }

    private static void performSelectionSortUsingArray() {
        Integer[] inputArray={10,2,-1,0,55,22,110};
        System.out.println("Unsorted Array: "+ Arrays.toString(inputArray));

        for(int i=0;i<=inputArray.length-1;i++){
            int selectedIndex=i;
            for(int j=i+1;j<inputArray.length-1;j++){
                if(inputArray[selectedIndex]>inputArray[j]){
                    selectedIndex=j;
                }
            }

            //swap the minimum from remaining and put here
            int tmp=inputArray[selectedIndex];
            inputArray[selectedIndex]=inputArray[i];
            inputArray[i]=tmp;
        }

        System.out.println("Sorted Array: "+ Arrays.toString(inputArray));
    }
}
