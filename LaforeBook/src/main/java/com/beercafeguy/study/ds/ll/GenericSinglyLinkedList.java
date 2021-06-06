package com.beercafeguy.study.ds.ll;

public class GenericSinglyLinkedList <T>{

    private SimpleNode<T> head;
    private SimpleNode<T> tail;
    private long size;

    public GenericSinglyLinkedList() {
        head=null;
        tail=null;
        size=0;
    }

    public SimpleNode<T> deleteFromTail(){
        if(head==null){
            return null;
        }else if(head==tail){
            SimpleNode<T> tmp=head;
            head=null;
            tail=null;
            size--;
            return tmp;
        }else{
            SimpleNode<T> prev=head;
            SimpleNode<T> current=head;
            while(current!=tail){
                prev=current;
                current=current.next;
            }
            prev.next=null;
            tail=prev;
            size--;
            return current;
        }
    }

    public SimpleNode<T> deleteFromHead(){
        SimpleNode<T> result=head;
        if(head!=null){
            head=head.next;
            size--;
        }
        return result;
    }

    public void insertAtHead(T data){
        SimpleNode<T> newNode=new SimpleNode<>(data);
        if(isEmpty()){
            tail=newNode;
        }
        newNode.next=head;
        head=newNode;
        size++;
    }

    public void insertAtTail(T data){
        SimpleNode<T> newNode=new SimpleNode<>(data);
        if(head==null){
            head=newNode;
        }
        tail.next=newNode;
        tail=newNode;
        size++;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public void display(){
        SimpleNode<T> current=head;
        while(current!=null){
            System.out.print(current+" ");
            current=current.next;
        }
        System.out.println();
    }
}
