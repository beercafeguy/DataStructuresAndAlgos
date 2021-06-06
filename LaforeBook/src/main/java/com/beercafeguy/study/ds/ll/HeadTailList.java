package com.beercafeguy.study.ds.ll;

public class HeadTailList {
    private SimpleNode<Long> head;
    private SimpleNode<Long> tail;
    private long size;

    public HeadTailList() {
        head=null;
        tail=null;
        size=0;
    }

    public void insertAtHead(long data){
        SimpleNode<Long> newNode=new SimpleNode<>(data);
        if(isEmpty()){
            tail=newNode;
        }
        newNode.next=head;
        head=newNode;
        size++;
    }

    public void insertAtTail(long data){
        SimpleNode<Long> newNode=new SimpleNode<>(data);
        if(head==null){
            head=newNode;
        }
        tail.next=newNode;
        tail=newNode;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public void display(){
        SimpleNode<Long> current=head;
        while(current!=null){
            System.out.print(current+" ");
            current=current.next;
        }
        System.out.println();
    }
}
