package com.beercafeguy.ds.ll;

public class CircularLinkedList<T>{

    SinglyLinkedListNode<T> head;
    SinglyLinkedListNode<T> tail;
    int size;

    public CircularLinkedList() {
        head=null;
        tail=null;
        this.size = 0;
    }

    public void print(){
        SinglyLinkedListNode<T> current=head;
        if(head!=null){
            do{
                System.out.println(current.data+" ");
                current=current.next;
            }while(current!=head);
        }
    }

    public SinglyLinkedListNode<T> insert(T t){
        SinglyLinkedListNode<T> inputNode=new SinglyLinkedListNode<>(t);
        SinglyLinkedListNode<T> tmp=head;
        inputNode.next=head;

        if(head!=null){
            while(tmp.next!=head){
                tmp=tmp.next;
            }
            tmp.next=inputNode;
        }else{
            inputNode.next=inputNode;
        }
        head=inputNode;
        return head;
    }
}
