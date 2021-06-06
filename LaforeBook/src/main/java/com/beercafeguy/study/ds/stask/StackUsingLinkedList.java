package com.beercafeguy.study.ds.stask;

import com.beercafeguy.study.ds.ll.NodeLinkedList;

public class StackUsingLinkedList <Long> implements IStack<Long>{

    private NodeLinkedList data;

    public StackUsingLinkedList() {
        data=new NodeLinkedList();
    }

    @Override
    public void push(Long aLong) {

    }

    @Override
    public Long pop() {
        return null;
    }
}
