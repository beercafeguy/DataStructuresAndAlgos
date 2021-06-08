package com.beercafeguy.study.ds.ll;

public class SortedList {
    private SimpleNode<Double> head;
    private int size;

    public SortedList() {
        head=null;
        size=0;
    }

    /**
     * Inserts data in increasing order
     * @param data
     */
    public void insert(Double data){
        SimpleNode<Double> newNode=new SimpleNode<>(data);
        SimpleNode<Double> prev=null;
        SimpleNode<Double> current=head;

        while(current!=null && data>current.data){
            prev=current;
            current=current.next;
        }
        if(prev==null){
            head=newNode;
        }else{
            prev.next=newNode;
        }
        newNode.next=current;
        size++;
    }

    /**
     * Remove from head
     */
    public void remove(){
        if(head!=null){
            head=head.next;
            size--;
        }
    }

    public void printList(){
        SimpleNode<Double> current=head;
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println();
    }

    public int size(){
        return size;
    }
}
