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

    public void deleteDuplicates(){
        deleteDuplicates(head);
    }

    private ListNode deleteDuplicates(ListNode passedHead) {
        if(passedHead==null || passedHead.next==null){
            return passedHead;
        }else{
            ListNode current=head;

            while (current!=null){
                ListNode tmp=current.next;
                while(tmp!=null && tmp.val==current.val){
                    tmp =tmp.next; // removed nodes till the last working du-licate is available
                }
                current.next=tmp;
                current=current.next;
            }
            return passedHead;
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
