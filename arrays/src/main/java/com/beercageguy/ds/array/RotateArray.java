package com.beercageguy.ds.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateArray {

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(Arrays.toString(list.toArray()));
        System.out.println(Arrays.toString(rotateLeft(2,list).toArray()));
    }

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        // Write your code here
        long length=arr.size();
        long rot=d % length;

        for(int i=0;i<rot;i++){
            int j;
            int first=arr.get(0);
            for(j=0;j<length-1;j++){
                arr.set(j,arr.get(j+1));
            }
            arr.set(j,first);
        }
        return arr;
    }
}
