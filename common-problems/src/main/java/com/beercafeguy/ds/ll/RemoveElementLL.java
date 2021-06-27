package com.beercafeguy.ds.ll;

public class RemoveElementLL {
    public static void main(String[] args) {
        MyList list=new MyList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.display();
    }

    public ListNode removeElements(ListNode head, int val) {

        if(head==null){
            return head;
        }

        ListNode current=head;
        ListNode previous=null;

        while(head!=null && head.val==val){
            head=head.next;
            current=head;
        }

        while (current!=null){
            while(current!=null && current.val!=val){
                previous=current;
                current=current.next;
            }
            if(current==null){
                return head;
            }
            previous.next=current.next;
            current=previous.next;
        }
        return head;
    }
}
