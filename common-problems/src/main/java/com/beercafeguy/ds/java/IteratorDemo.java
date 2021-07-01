package com.beercafeguy.ds.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(10);
        list.add(20);
        list.add(15);

        System.out.println("Forward Traversal Iterator");
        Iterator<Integer> it=list.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();

        ListIterator<Integer> li=list.listIterator();
        //forward

        System.out.println("Forward Traversal");
        while(li.hasNext()){
            System.out.print(li.next()+" ");
        }
        System.out.println();

        System.out.println("Backward Traversal");

        while(li.hasPrevious()){
            System.out.print(li.previous()+" ");
        }
        System.out.println();
    }
}
