package com.beercafeguy.study.ds.ll;

public class NodeLinkedList {

    private Node head;
    private int size;

    public NodeLinkedList() {
        head = null;
        size = 0;
    }

    public Node delete(int key) {
        Node result = null;
        if(head!=null && head.integerData==key){
            Node tmp=head;
            head=head.next;
            size--;
            result=tmp;
        }else{
            Node prev=head;
            Node current = head.next;
            while (current!= null) {
                if (current.integerData == key) {
                    prev.next=current.next;
                    result = current;
                    break;
                }
                prev=current;
                current = current.next;
            }
        }
        return result;
    }

    /*
    public Node find(int key) {
        Node result = null;
        Node current = head;
        while (current!= null) {
            if (current.integerData == key) {
                result = current;
                break;
            }
            current = current.next;
        }
        return result;
    }
     */

    public Node find(int key) {
        Node result = null;
        if(head!=null){
            Node current=head;
            while(current.integerData!=key){
                if(current.next==null){
                    break;
                }
                current=current.next;
            }
            if(current.next!=null) {
                result=current;
            }
        }
        return result;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void insertAtHead(int id, double salary) {
        Node newNode = new Node(id, salary);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void insertAtTail(int id, double salary) {
        Node newNode = new Node(id, salary);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public Node deleteFromHead() {
        if (head != null) {
            Node temp = head;
            head = head.next;
            size--;
            return temp; // return deleted Node
        }
        return null;
    }

    public void displayList() {
        Node current = head;
        while (current != null) {
            System.out.print(current + " ");
            current = current.next;
        }
        System.out.println();
    }

    public int getSize() {
        return size;
    }
}
