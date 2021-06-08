package com.beercafeguy.study.ds.queue;

public class ArrayQueue<T> implements IQueue<T>{
    private Object[] data;
    private int front;
    private int back;

    public int getSize(){
        return Math.abs(front-back);
    }
    @Override
    public boolean isEmpty() {
        return getSize()==0;
    }

    @Override
    public void insert(T t) {

    }

    @Override
    public T delete() {
        return null;
    }
}
