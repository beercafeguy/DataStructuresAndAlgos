package com.beercafeguy.ds.ll;

import java.util.HashSet;
import java.util.Set;

public class IntLinkedList {

    Node head;
    private int size;

    public IntLinkedList() {
        this.size = 0;
    }

    public void printReverse(){
        printReverse(head);
    }
    private void printReverse(Node node){
        if(node==null)
            return;
        printReverse(node.next);
        System.out.print(node.data+" ");
    }
    public void dedupe(){
        if(head!=null){
            Set<Integer> hashSet=new HashSet<>();
            Node prev=null;
            Node current=head;
            while(current!=null){
                if(hashSet.contains(current.data)){
                    prev.next=current.next;
                }else{
                    hashSet.add(current.data);
                    prev=current;
                }
                current=current.next;
            }
        }
    }

    public void reverse(){
        Node previous=null;
        Node current=head;
        Node next=null;
        while(current!=null){
            next=current.next; // temp holder for next node
            current.next=previous; // current node points to previous node
            previous=current; // current node becomes previous node for next node
            current=next; // next node becomes current node
        }
        head=previous;
    }
    public boolean isPalindrome(){
        SimpleStack<Integer> stack=new SimpleStack<>();
        Node last=head;
        while(last!=null){
            stack.push(last.data);
            last=last.next;
        }
        last=head;
        while(last!=null){
            int fromStack=stack.pop();
            int fromList=last.data;
            System.out.println("fromStack:"+fromStack+" | fromList:"+fromList);
            if(fromStack!=fromList){
                return false;
            }
            last=last.next;
        }
        return true;
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
            System.out.print(last.data+" ");
            last = last.next;
        }
        System.out.println();
    }

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    '}';
        }
    }
}
