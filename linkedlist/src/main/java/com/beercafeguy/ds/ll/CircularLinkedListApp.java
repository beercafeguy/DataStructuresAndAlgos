package com.beercafeguy.ds.ll;

public class CircularLinkedListApp {
    public static void main(String[] args) {
        CircularLinkedList<Integer> circularLinkedList=new CircularLinkedList<>();
        circularLinkedList.insert(10);
        circularLinkedList.insert(20);
        circularLinkedList.insert(30);
        circularLinkedList.print();
        circularLinkedList.rotate();
        circularLinkedList.print();
    }
}
