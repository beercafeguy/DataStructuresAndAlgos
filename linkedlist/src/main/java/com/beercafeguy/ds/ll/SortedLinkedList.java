package com.beercafeguy.ds.ll;

public class SortedLinkedList {

    Node head;
    private int size;

    public Node dropDuplicates(){
            Node current=head;
            while(current!=null){
                Node nextTmp=current;
                while(nextTmp!=null && current.data==nextTmp.data){
                    nextTmp=nextTmp.next;
                }
                current.next=nextTmp;
                current=current.next;
            }
        return head;
    }

    public Node insert(int input){
        Node inputNode=new Node(input);
        if(head==null){
            head=inputNode;
        }else{
            Node prev=null;
            Node current=head;
            while(current!=null && current.data<=input){
                prev=current;
                current=current.next;
            }
            if(current==null){
                prev.next=inputNode;
            }else if(prev==null){
                inputNode.next=current;
                head=inputNode;
            }else{
                prev.next=inputNode;
                inputNode.next=current;
            }
        }
        size++;
        return head;
    }

    public void print(){
        Node last=head;
        while(last!=null){
            System.out.print(last.data+" ");
            last=last.next;
        }
        System.out.println();
    }
    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next=null;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    '}';
        }
    }
}
