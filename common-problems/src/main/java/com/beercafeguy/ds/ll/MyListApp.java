package com.beercafeguy.ds.ll;

public class MyListApp {
    public static void main(String[] args) {
        MyList list1=new MyList();
        list1.insert(10);
        list1.insert(20);
        list1.insert(30);

        list1.display();

        MyList list2=new MyList();
        list2.insert(5);
        list2.insert(15);
        list2.insert(17);
        list2.insert(23);

        list2.display();

        ListNode merged= mergeTwoLists(list1.head,list2.head);
        ListNode current=merged;
        while(current!=null){
            System.out.print(current+" ");
            current=current.next;
        }
        System.out.println();

    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode dummyNode=new ListNode(0);

        ListNode tail = dummyNode;


        while(true){
            if(l1==null){ //l1 ended
                tail.next=l2;
                break;
            }else if (l2==null){ //l2 ended
                tail.next=l1;
                break;
            }else if (l1.val<=l2.val) {
                tail.next=l1;
                l1=l1.next;
            }else {
                tail.next=l2;
                l2=l2.next;
            }
            tail=tail.next;
        }


        return dummyNode.next;
    }
}
