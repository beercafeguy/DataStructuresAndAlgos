package com.beercafeguy.ds.ll;

public class SimpleStack <T>{

    private Object[] data;
    private int index;

    public SimpleStack() {
        data=new Object[10];
        index=0;
    }

    public void push(T t){
        System.out.println("Pushed "+t);
        data[index]=t;
        index++;
    }

    public T pop(){
        if(index==0){
            throw new ArithmeticException("Stack is empty");
        }else{
            Object popped=data[index-1];
            index--;
            System.out.println("Popped "+popped);
            return (T)popped;
        }

    }
}
