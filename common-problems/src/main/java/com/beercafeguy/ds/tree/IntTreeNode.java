package com.beercafeguy.ds.tree;

public class IntTreeNode{
    int data;
    IntTreeNode left,right;

    public IntTreeNode(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "{" +
                "data=" + data +
                '}';
    }
}
