package com.beercafeguy.ds.ll;

public class SimpleLinkedListApp {
    public static void main(String[] args) {
        SimpleLinkedList simpleLinkedList=new SimpleLinkedList();
        simpleLinkedList.insert(10);
        simpleLinkedList.insert(20);
        simpleLinkedList.insert(300);
        simpleLinkedList.insert(-40);
        simpleLinkedList.printList();
        System.out.println();
        simpleLinkedList.drop(300);
        simpleLinkedList.printList();
    }
}
