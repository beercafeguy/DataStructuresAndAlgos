package com.beercafeguy.study.ds.stask;

public class StackApp {
    public static void main(String[] args) {

        stackUsingArray();
    }

    private static void stackUsingArray(){
        StackUsingArray<Long> stackUsingArray
                =new StackUsingArray<>();
        stackUsingArray.push(10L);
        stackUsingArray.push(20L);
        stackUsingArray.push(30L);
        stackUsingArray.display();
        System.out.println();
        System.out.println("Popped "+stackUsingArray.pop());
        //stackUsingArray.push(40L);
        stackUsingArray.display();
    }
}
