package com.beercafeguy.ds.ll;

public class CircularLinkedListApp {
    public static void main(String[] args) {
        //performBasicOps();
        performDelete();
    }

    private static void performDelete(){
        CircularLinkedList<Integer> circularLinkedList=new CircularLinkedList<>();
        circularLinkedList.insert(10);
        circularLinkedList.insert(20);
        circularLinkedList.insert(30);
        circularLinkedList.print();
        circularLinkedList.delete(30);
        circularLinkedList.print();

    }
    private static void performBasicOps(){
        CircularLinkedList<Integer> circularLinkedList=new CircularLinkedList<>();
        circularLinkedList.insert(10);
        circularLinkedList.insert(20);
        circularLinkedList.insert(30);
        circularLinkedList.print();
        circularLinkedList.rotate();
        circularLinkedList.print();
    }
}
