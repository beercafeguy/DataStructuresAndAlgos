package com.beercageguy.ds.ll;

public class SinglyLinkedList<T> {

    private Node<T> head = null;
    private Node<T> tail = null;
    private int size = 0;

    public SinglyLinkedList() {
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public T first() {
        if (isEmpty())
            return null;
        else
            return head.getT();
    }

    public T last() {
        if (isEmpty())
            return null;
        else
            return tail.getT();
    }

    public void addFirst(T t) {
        Node<T> node = new Node<>(t, head);
        head = node;
        if (size == 0) {
            tail = node;

        }
        size++;
    }

    public void addLast(T t){
        Node<T> node=new Node<>(t,null);
        if(isEmpty()){
            head=node;
            tail=node;
            size++;
        }else{
            tail.next=node;
            tail=node;
            size++;
        }
    }

    public T removeFirst() {
        if(isEmpty())
            return null;
        Node<T> tmp = head;
        head = head.next;
        size--;
        if (size == 0)
            tail = null;
        return tmp.getT();
    }



    private static class Node<T> {

        private T t;
        private Node<T> next;

        public Node(T t, Node<T> next) {
            this.t = t;
            this.next = next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }

        public T getT() {
            return t;
        }

        public Node<T> getNext() {
            return next;
        }
    }
}
