package com.beercafeguy.study.ds.ll;

public class SortedListApp {
    public static void main(String[] args) {
        performOps();
    }

    private static void performOps(){
        SortedList sortedList=new SortedList();
        sortedList.insert(20.3d);
        sortedList.insert(19.2d);
        sortedList.insert(22.5d);
        sortedList.printList();
        System.out.println("Size of list:"+sortedList.size());
    }
}
