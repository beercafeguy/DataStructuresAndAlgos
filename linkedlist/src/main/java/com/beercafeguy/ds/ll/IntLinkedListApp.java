package com.beercafeguy.ds.ll;

public class IntLinkedListApp {
    public static void main(String[] args) {
        IntLinkedList ill = new IntLinkedList();
        //System.out.println("Adding elements");
        //ill.addElements();
        //System.out.println("Elements added.");
        //ill.print();
        ill.insert(3);
        ill.insert(4);
        System.out.println("Print after insertion");
        ill.print();
        System.out.println("Delete operation");
        ill.delete(4);
        ill.print();
        ill.insert(5);
        ill.insert(6);
        ill.insert(7);
        ill.insert(7);
        ill.findMiddle();
        ill.print();
        System.out.println("Second last element: " + ill.findSecondLast());
        System.out.println("Size of LL: " + ill.size());
        System.out.println("Num Occurrences of 7: " + ill.numOccurrences(7));
        System.out.println("Num Occurrences of 7: " + ill.countRec(7));
        System.out.println("Num Occurrences of 6: " + ill.countRec(6));
        System.out.println("Num Occurrences of 10: " + ill.countRec(10));

        System.out.println("Has loop: "+ill.hasLoop());
    }
}
