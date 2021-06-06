package com.beercafeguy.study.ds.stask;

import com.beercafeguy.study.ds.ll.GenericSinglyLinkedList;
import com.beercafeguy.study.ds.ll.NodeLinkedList;
import com.beercafeguy.study.ds.ll.SimpleNode;

public class StackUsingLinkedList <T> implements IStack<T>{

    private GenericSinglyLinkedList<T> data;

    public StackUsingLinkedList() {
        data=new GenericSinglyLinkedList();
    }

    @Override
    public void push(T aLong) {
        data.insertAtHead(aLong);
    }

    @Override
    public T pop() {
        SimpleNode<T> popped=data.deleteFromHead();
        if(popped!=null){
            return popped.data;
        }
        return null;
    }
}
