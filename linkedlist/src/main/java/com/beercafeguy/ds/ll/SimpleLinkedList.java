package com.beercafeguy.ds.ll;


public class SimpleLinkedList {

    private SingliNode head;

    public SimpleLinkedList() {
        head=null;
    }

    public void insert(int input){
        SingliNode node=new SingliNode(input);
        if(head==null){
            head=node;
        }else{
            //assume head is the last node
            SingliNode last=head;
            while(last.getNext()!=null){
                last=last.getNext();
            }
            last.setNext(node);
        }
    }

    public void drop(int number){
            SingliNode currentNode=head;
            SingliNode previousNode=null;

            // if head has the key
            if(currentNode!=null && currentNode.getData()==number){
                head=currentNode.getNext();
                System.out.println(number+" found and deleted.");
            }

            while(currentNode!=null && currentNode.getData()!=number){
                previousNode=currentNode;
                currentNode=currentNode.getNext();
            }
            if(currentNode!=null){
                previousNode=currentNode.getNext();
                System.out.println(number+" found and deleted.");
            }else{
                System.out.println(number+" not found");
            }
    }

    public void printList(){
        SingliNode currentNode=head;
        while(currentNode!=null){
            System.out.print(currentNode.getData()+" ");
            currentNode=currentNode.getNext();
        }
    }

    public SingliNode getHead(){
        return this.head;
    }

    public boolean isEmpty(){
        return head==null;
    }
}
