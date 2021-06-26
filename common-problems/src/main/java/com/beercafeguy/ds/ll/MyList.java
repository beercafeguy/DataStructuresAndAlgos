package com.beercafeguy.ds.ll;

public class MyList {

    ListNode head;

    public void insert(int i){
        ListNode newNode=new ListNode(i);
        if(head==null){
            head=newNode;
        }else{
            ListNode current=head;
            while(current.next!=null){
                current=current.next;
            }
            current.next=newNode;
        }
    }

    public void display(){
        ListNode current=head;
        while (current != null){
            System.out.print(current+" ");
            current=current.next;
        }
        System.out.println();
    }
}
