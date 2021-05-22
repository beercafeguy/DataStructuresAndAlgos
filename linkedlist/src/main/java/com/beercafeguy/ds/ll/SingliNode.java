package com.beercafeguy.ds.ll;

public class SingliNode {

    private SingliNode next;
    private int data;

    public SingliNode() {
    }

    public void setNext(SingliNode next) {
        this.next = next;
    }

    public void setData(int data) {
        this.data = data;
    }

    public SingliNode getNext() {
        return next;
    }

    public int getData() {
        return data;
    }

    public SingliNode(int data) {
        this.next=null;
        this.data = data;
    }
}
