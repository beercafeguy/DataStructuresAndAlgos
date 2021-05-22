package com.beercafeguy.ds;

public class SimpleLinkedList {

    public static void main(String[] args) {

    }

    private static class Node{
        private Node next;
        private int data;

        public void setNext(Node next) {
            this.next = next;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public int getData() {
            return data;
        }

        public Node(Node next, int data) {
            this.next = next;
            this.data = data;
        }
    }
}
