package com.beercafeguy.study.ds.ll;

import java.util.Arrays;

public class SinglyLinkedListApp {
    public static void main(String[] args) {

        linkedListOps();
    }

    static void linkedListOps(){
        GenericSinglyLinkedList<Integer> ll=new GenericSinglyLinkedList<>();
        ll.insertAtHead(10);
        ll.insertAtTail(20);
        ll.insertAtHead(30);
        ll.deleteFromTail();
        ll.deleteFromHead();
        ll.display();
    }


}
