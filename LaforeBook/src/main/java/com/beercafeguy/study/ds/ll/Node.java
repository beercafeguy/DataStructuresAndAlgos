package com.beercafeguy.study.ds.ll;

import java.util.Objects;

public class Node {
    public Integer integerData;
    public Double doubleData;
    public Node next;

    public Node(Integer integerData, Double doubleData) {
        this.integerData = integerData;
        this.doubleData = doubleData;
        this.next=null;
    }

    public void display(){
        System.out.println(this);
    }
    @Override
    public String toString() {
        return "Node{" +
                "integerData=" + integerData +
                ", doubleData=" + doubleData +
                '}';
    }

}
