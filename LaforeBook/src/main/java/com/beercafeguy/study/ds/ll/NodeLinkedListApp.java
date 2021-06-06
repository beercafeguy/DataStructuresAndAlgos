package com.beercafeguy.study.ds.ll;

public class NodeLinkedListApp {
    public static void main(String[] args) {

        //insertAndPrint();
        insertAndFind();
    }

    private static void insertAndFind() {
        NodeLinkedList nodeLinkedList=new NodeLinkedList();
        nodeLinkedList.insertAtHead(10,340.0d);
        nodeLinkedList.insertAtHead(11,342.5d);
        nodeLinkedList.insertAtTail(30,234.7d);
        nodeLinkedList.displayList();
        System.out.println("Found 10:"+nodeLinkedList.find(10)!=null);
        System.out.println("Found 11:"+nodeLinkedList.find(11)!=null);
        System.out.println("Found 30:"+nodeLinkedList.find(30)!=null);
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
