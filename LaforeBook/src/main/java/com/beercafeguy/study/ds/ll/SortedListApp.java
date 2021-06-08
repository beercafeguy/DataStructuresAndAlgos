package com.beercafeguy.study.ds.ll;

import java.util.Arrays;

public class SortedListApp {
    public static void main(String[] args) {
        sortedListInsertionSort();
        //performOps();
    }

    private static void performOps(){
        SortedList sortedList=new SortedList();
        sortedList.insert(20.3d);
        sortedList.insert(19.2d);
        sortedList.insert(22.5d);
        sortedList.printList();
        System.out.println("Size of list:"+sortedList.size());
    }

    static void sortedListInsertionSort(){
        SortedList sortedList=new SortedList();
        Double[] inputArray={20.2d,26.3d,11.23d,11.44d,11.23d};
        System.out.println("Unsorted Array:"+Arrays.toString(inputArray));
        Arrays.stream(inputArray)
                .forEach(x -> sortedList.insert(x));
        Double[] outputArray= sortedList.toArray();
        System.out.println("Sorted Array:"+Arrays.toString(outputArray));

    }
}
