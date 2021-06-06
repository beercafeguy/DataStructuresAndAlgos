package com.beercafeguy.study.ds.ll;

public class NodeLinkedListApp {
    public static void main(String[] args) {

        insertAndPrint();
    }

    private static void insertAndPrint(){
        NodeLinkedList nodeLinkedList=new NodeLinkedList();
        nodeLinkedList.insertAtHead(10,340.0d);
        nodeLinkedList.insertAtHead(11,342.5d);
        nodeLinkedList.displayList();
        nodeLinkedList.deleteFromHead();
        nodeLinkedList.insertAtTail(30,234.7d);
        nodeLinkedList.displayList();
    }
}
