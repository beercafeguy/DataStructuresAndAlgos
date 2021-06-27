package com.beercafeguy.ds.ll;

public class DeleteFromLinkedList {
    public static void main(String[] args) {
        MyList list=new MyList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.display();
    }

    public void deleteNode(ListNode node) {

        if(node!=null){
            ListNode nextNode=node.next;
            node.val=nextNode.val;
            node.next=nextNode.next;
        }
    }
}
