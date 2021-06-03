package com.beercafeguy.ds.ll;

public class SortedLinkedListApp {
    public static void main(String[] args) {
        SortedLinkedList sortedLinkedList=new SortedLinkedList();
        sortedLinkedList.insert(11);
        sortedLinkedList.insert(11);
        sortedLinkedList.insert(21);
        sortedLinkedList.insert(60);
        sortedLinkedList.insert(43);
        sortedLinkedList.insert(43);
        sortedLinkedList.print();
        sortedLinkedList.dropDuplicates();
        sortedLinkedList.print();
    }
}
