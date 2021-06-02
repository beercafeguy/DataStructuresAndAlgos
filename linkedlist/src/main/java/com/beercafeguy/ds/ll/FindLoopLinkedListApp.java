package com.beercafeguy.ds.ll;

import java.util.HashSet;
import java.util.Set;

public class FindLoopLinkedListApp {

    public static void main(String[] args) {
        FindLoopLinkedListApp app=new FindLoopLinkedListApp();
        Node loopedHead=app.createLoopedList();
        Node nonLoopedHead=app.createNonLoopedList();
        System.out.println("Is Looped: "+app.hasLoop(loopedHead));
        System.out.println("Is Looped: "+app.hasLoop(nonLoopedHead));
    }
    public boolean hasLoop(Node head){
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

    private Node createNonLoopedList(){
        Node first=new Node(1);
        Node second=new Node(2);
        Node third=new Node(3);
        Node fourth=new Node(4);
        Node fifth=new Node(5);
        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        return first;
    }

    private Node createLoopedList(){
        Node first=new Node(1);
        Node second=new Node(2);
        Node third=new Node(3);
        Node fourth=new Node(4);
        Node fifth=new Node(5);
        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        fifth.next=second;
        return first;
    }
    private class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next=null;
        }
    }
}
