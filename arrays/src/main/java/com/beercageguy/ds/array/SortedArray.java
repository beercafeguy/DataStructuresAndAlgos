package com.beercageguy.ds.array;

import java.util.Arrays;
import java.util.Objects;

public class SortedArray {

    private int[] data;
    private int nElements;

    public SortedArray() {
        data=new int[10];
        nElements=0;
    }

    public void insert(int num){
        int index=nElements-1;
        while(index >= 0 && data[index] > num){
            data[index+1]=data[index];
            index--;
        }
        data[index+1]=num;
        nElements++;
    }

    public void display(){
        System.out.println(Arrays.toString(Arrays.stream(data).filter(num -> num!=0).toArray()));
    }
}
