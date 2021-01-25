package com.beercageguy.ds.ll;

public class SimpleLinkedList {
    static Node head;

    public void printList(Node node){
        while(node!=null){
            System.out.print(node.data+" ");
            node=node.next;
        }
        System.out.println();
    }
    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        SimpleLinkedList ll=new SimpleLinkedList();
        ll.head=new Node(100);
        ll.head.next=new Node(200);
        ll.head.next.next=new Node(300);
        ll.head.next.next.next=new Node(400);

        System.out.println("Given Simple Linked List");
        ll.printList(head);
        head=ll.reverse(head);
        System.out.println("Reversed List");
        ll.printList(head);
    }

    Node reverse(Node head) {
        Node prev=null;
        Node current=head;
        Node next=null;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        return prev;
    }
}
