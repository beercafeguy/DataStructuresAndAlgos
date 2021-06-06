package com.beercafeguy.study.ds.ll;

public class SimpleNode <T>{
    public T data;
    public SimpleNode<T> next;

    public SimpleNode(T data) {
        this.data = data;
        next=null;
    }

    @Override
    public String toString() {
        return "SimpleNode{" +
                "data=" + data +
                '}';
    }
}
