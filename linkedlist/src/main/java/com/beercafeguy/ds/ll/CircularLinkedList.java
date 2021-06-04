package com.beercafeguy.ds.ll;

public class CircularLinkedList<T>{

    SinglyLinkedListNode<T> head;
    SinglyLinkedListNode<T> tail;
    int size;

    public CircularLinkedList() {
        head=null;
        tail=null;
        this.size = 0;
    }

    public void print(){
        SinglyLinkedListNode<T> current=head;
        if(head!=null){ //if head is null then LL is empty so nothing to print
            do{
                System.out.print(current.data+" ");
                current=current.next;
            }while(current!=head); //do while is used because if head==tail (only one node LL) then at least that one should print
            System.out.println();
        }
    }

    public SinglyLinkedListNode<T> insert(T t){
        SinglyLinkedListNode<T> inputNode=new SinglyLinkedListNode<>(t);
        SinglyLinkedListNode<T> currentHead=head;
        if(head==null){
            head=inputNode;
            inputNode.next=inputNode; //makes same node circular
            tail=inputNode;
        }else{ //when linked list is not empty
            while(currentHead.next!=head){ //go just before head or in common language tail
                currentHead=currentHead.next;
            }
            //reached tail as currentHead variable started pointing to tail
            //1. make tail.next=new node
            currentHead.next=inputNode;
            //2. newNode.next=oldHead
            inputNode.next=head;
            //3. Make newNode as newHead
            head=inputNode;
            //finally head is updated to new Node
            //Here we are adding new Node after tail and making that new head
        }
        size++;
        return head;
    }

    public SinglyLinkedListNode<T> rotate(){
        if(size>2){
            SinglyLinkedListNode<T> tmp=head;
            while(tmp.next!=head){
                tmp=tmp.next;
            }
            head=tmp;
        }
        return head;
    }
    public boolean isEmpty(){
        return size==0;
    }

    public SinglyLinkedListNode<T> head(){
        return head;
    }
}
