package com.beercafeguy.study.ds.queue;

public interface IQueue<T> {
    boolean isEmpty();
    void insert(T t);
    T delete();
}
