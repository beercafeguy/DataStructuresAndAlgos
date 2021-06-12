package com.beercafeguy.study.ds.sorting;

public class MergeSortApp {
    public static void main(String[] args) {
        DArray dArray=new DArray(10);
        dArray.insert(10);
        dArray.insert(2);
        dArray.insert(76);
        dArray.print();
        dArray.mergeSort();
        dArray.print();
    }
}
