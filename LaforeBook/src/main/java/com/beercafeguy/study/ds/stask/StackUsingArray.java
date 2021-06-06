package com.beercafeguy.study.ds.stask;

import java.util.Arrays;
import java.util.Objects;

public class StackUsingArray<T> implements IStack<T>{

    private Object[] data;
    private int index;

    public StackUsingArray() {
        this.data = new Object[10];
        index = 0;
    }

    public void push(T t) {
        data[index++] = t;
    }

    public T pop() {
        return (T) data[--index];
    }

    public boolean isEmpty() {
        return index == 0;
    }

    public void display() {
        Arrays.stream(Arrays.copyOfRange(data, 0, index))
                .filter(Objects::nonNull)
                .forEach(element -> System.out.print(element + " "));
    }
}
