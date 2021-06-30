package com.beercafeguy.ds.wm;

public class Node {

    int start;
    int end;


    public Node(int start,int end){
        this.start=start;
        this.end=end;
    }

    @Override
    public String toString() {
        return "Node{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}
