package com.beercafeguy.ds.ll;

public class SinglyLinkedListNode<T>{
    T data;
    SinglyLinkedListNode<T> next;

    public SinglyLinkedListNode(T data) {
        this.data = data;
        next=null;
    }

    public SinglyLinkedListNode() {
    }

    @Override
    public String toString() {
        return "SinglyLinkedListNode{" +
                "data=" + data +
                '}';
    }
}
