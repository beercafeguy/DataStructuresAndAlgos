package com.beercafeguy.study.ds.queue;

import java.util.Arrays;
import java.util.Objects;

public class ArrayQueue<T> implements IQueue<T>{
    private Object[] data;
    private int front;
    private int back;

    public ArrayQueue() {
        data=new Object[10];
        front=0;
        back=0;
    }

    public int getSize(){
        return Math.abs(front-back);
    }
    @Override
    public boolean isEmpty() {
        return getSize()==0;
    }

    @Override
    public void insert(T t) {
        data[front++]=t;
    }

    @Override
    public T delete() {
        T valueAtBack=(T)data[back];
        for(int i=0;i<front-1;i++){
            data[i]=data[i+1];
        }
        data[--front]=null;
        return valueAtBack;
    }

    public void printBackToFront(){
        System.out.println(Arrays.toString(Arrays.stream(data)
        .filter(Objects::nonNull)
                .toArray()
        ));
    }
}
