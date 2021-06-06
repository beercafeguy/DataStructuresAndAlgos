package com.beercafeguy.study.ds.ll;

public class NodeLinkedList {

    private Node head;
    private int size;

    public NodeLinkedList() {
        head=null;
        size=0;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public void insertAtHead(int id,double salary){
        Node newNode=new Node(id,salary);
        newNode.next=head;
        head=newNode;
        size++;
    }

    public void insertAtTail(int id,double salary){
        Node newNode=new Node(id,salary);
        if(head==null){
            head=newNode;
        }else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public Node deleteFromHead(){
        if(head!=null){
            Node temp=head;
            head=head.next;
            size--;
            return temp; // return deleted Node
        }
        return null;
    }

    public void displayList(){
        Node current=head;
        while(current!=null){
            System.out.print(current+" ");
            current=current.next;
        }
        System.out.println();
    }

    public int getSize(){
        return size;
    }
}
