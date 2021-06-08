package com.beercafeguy.study.ds.queue;

public class QueueApp {
    public static void main(String[] args) {
        ArrayQueue<Integer> arr=new ArrayQueue<>();
        arr.insert(10);
        arr.insert(20);
        arr.insert(30);
        arr.printBackToFront();
        System.out.println(arr.delete());
        arr.insert(40);
        arr.insert(50);
        arr.delete();
        arr.printBackToFront();

    }
}
