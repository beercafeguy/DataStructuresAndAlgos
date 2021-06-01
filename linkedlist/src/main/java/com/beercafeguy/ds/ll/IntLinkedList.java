package com.beercafeguy.ds.ll;

public class IntLinkedList {

    Node head;

    public static void main(String[] args) {

        IntLinkedList ill = new IntLinkedList();
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
        ill.insert(5);
        ill.insert(6);
        ill.insert(7);
        ill.findMiddle();
        ill.print();
        System.out.println("Second last element: "+ill.findSecondLast());

    }

    public int findSecondLast(){
        Node current=head;
        if(head.next==null){
            return -1;
        }else if (head.next.next==null){
            return head.next.data;
        }else{
            Node plusTwo=head.next.next;
            while(plusTwo!=null){
                current=current.next;
                plusTwo=plusTwo.next;
            }
            return current.data;
        }
    }

    public int findMiddle(){
        Node singleStep=head;
        Node doubleStep=head;
        while(doubleStep!=null && doubleStep.next!=null){
            singleStep=singleStep.next;
            doubleStep=doubleStep.next.next;
        }
        System.out.println("Middle element is "+singleStep.data);
        return singleStep.data;
    }

    public void insert(int input) {
        Node inputNode = new Node(input);
        if (head == null) {
            head = inputNode;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = inputNode;
        }
    }

    public void delete(int key) {
        Node current = head;
        Node prev = null;
        if (head != null) {
            if (head.data == key) {
                head = head.next;
            } else {
                while (current != null && current.data != key) {
                    prev = current;
                    current = current.next;
                }
                if (current != null) {
                    prev.next = current.next;
                }
            }
        }
    }

    public void print() {
        Node last = head;
        while (last!= null) {
            System.out.println(last.data);
            last = last.next;
        }
    }

    public Node addElements() {
        this.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        head.next = second;
        head.next.next = third;
        return this.head;
    }

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
