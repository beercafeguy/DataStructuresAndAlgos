package com.beercafeguy.study.ds.queue;

import com.beercafeguy.study.ds.ll.GenericSinglyLinkedList;
import com.beercafeguy.study.ds.ll.SimpleNode;

public class LinkedQueue<T> implements IQueue<T>{
    GenericSinglyLinkedList<T> data;

    public LinkedQueue() {
        data=new GenericSinglyLinkedList<>();
    }

    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }

    @Override
    public void insert(T t) {
        data.insertAtHead(t);
    }

    @Override
    public T delete() {
        SimpleNode<T> response=data.deleteFromTail();
        if(response!=null){
            return response.data;
        }
        return null;
    }

    public void display(){
        data.display();
    }
}
