package com.beercafeguy.study.ds.stask;

public class ReverseWordApp {
    public static void main(String[] args) {

printReverse("Hem");

    }

    private static void printReverse(String input){
        System.out.println("Input"+input);
        StackUsingArray stack=new StackUsingArray();
        for (char ch:
             input.toCharArray()) {
            stack.push(ch);
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop());
        }
        System.out.println();

    }
}
