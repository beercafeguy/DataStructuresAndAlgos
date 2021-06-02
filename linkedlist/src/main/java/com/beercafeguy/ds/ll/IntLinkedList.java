package com.beercafeguy.ds.ll;

import java.util.HashSet;
import java.util.Set;

public class IntLinkedList {

    Node head;
    private int size;

    public IntLinkedList() {
        this.size = 0;
    }

    public boolean hasLoop(){
        Set<Node> nodes=new HashSet<>();
        Node last=head;
        while(last!=null){
            if(nodes.contains(last)){
                return true;
            }
            nodes.add(last);
            last=last.next;
        }
        return false;
    }
    public int countRec(int key){
        return count(head,key,0);
    }
    private int count(Node head,int key,int frequency){
        if(head==null){
            return frequency;
        }else{
            if(head.data==key){
                return count(head.next,key,frequency+1);
            }else{
                return count(head.next,key,frequency);
            }
        }
    }
    public int numOccurrences(int key) {
        int num = 0;
        Node last = head;
        while (last != null) {
            if (last.data == key) {
                num++;
            }
            last = last.next;
        }
        return num;
    }

    public int size() {
        return size;
    }

    public int findSecondLast() {
        Node current = head;
        if (head.next == null) {
            return -1;
        } else if (head.next.next == null) {
            return head.next.data;
        } else {
            Node plusTwo = head.next.next;
            while (plusTwo != null) {
                current = current.next;
                plusTwo = plusTwo.next;
            }
            return current.data;
        }
    }

    public int findMiddle() {
        Node singleStep = head;
        Node doubleStep = head;
        while (doubleStep != null && doubleStep.next != null) {
            singleStep = singleStep.next;
            doubleStep = doubleStep.next.next;
        }
        System.out.println("Middle element is " + singleStep.data);
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
        size++;
    }

    public void delete(int key) {
        Node current = head;
        Node prev = null;
        if (head != null) {
            if (head.data == key) {
                head = head.next;
                size--;
            } else {
                while (current != null && current.data != key) {
                    prev = current;
                    current = current.next;
                }
                if (current != null) {
                    prev.next = current.next;
                    size--;
                }
            }
        }
    }

    public void print() {
        Node last = head;
        while (last != null) {
            System.out.println(last.data);
            last = last.next;
        }
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
