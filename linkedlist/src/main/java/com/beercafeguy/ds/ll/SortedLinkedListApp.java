package com.beercafeguy.ds.ll;

public class SortedLinkedListApp {
    public static void main(String[] args) {
        SortedLinkedList sortedLinkedList=new SortedLinkedList();
        sortedLinkedList.insert(10);
        sortedLinkedList.insert(9);
        sortedLinkedList.insert(20);
        sortedLinkedList.insert(18);
        sortedLinkedList.insert(18);
        sortedLinkedList.print();
        sortedLinkedList.dropDuplicates();
        sortedLinkedList.print();
    }
}
