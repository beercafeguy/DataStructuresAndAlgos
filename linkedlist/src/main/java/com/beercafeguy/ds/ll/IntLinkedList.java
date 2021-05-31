package com.beercafeguy.ds.ll;

public class IntLinkedList {

    Node head;

    public static void main(String[] args) {

        IntLinkedList ill=new IntLinkedList();
        System.out.println("Adding elements");
        ill.addElements();
        System.out.println("Elements added.");
        ill.print();
        ill.insert(4);
        System.out.println("Print after insertion");
        ill.print();
        System.out.println("Delete operation");
        ill.delete(4);
        ill.print();

    }

    public void insert(int input){
        Node inputNode=new Node(input);
        if(head==null){
            head=inputNode;
        }else{
            Node last=head;
            while(last.next!=null){
                last=last.next;
            }
            last.next=inputNode;
        }
    }

    public void delete(int key){
        Node current=head;
        Node prev=null;
        if(head!=null){
            if (head.data==key){
                head=head.next;
            }else{
                while(current!=null && current.data!=key){
                    prev=current;
                    current=current.next;
                }
                if(current!=null){
                    prev.next=current.next;
                }
            }
        }
    }

    public void print(){
        Node last=head;
        if(head!=null){
            while(last.next!=null){
                System.out.println(last.data);
                last=last.next;
            }
            System.out.println(last.data);
        }
    }

    public Node addElements(){
        this.head=new Node(1);
        Node second=new Node(2);
        Node third=new Node(3);
        head.next=second;
        head.next.next=third;
        return this.head;
    }

    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
}
