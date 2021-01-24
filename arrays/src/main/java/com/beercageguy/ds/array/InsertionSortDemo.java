package com.beercageguy.ds.array;

import java.util.Arrays;

public class InsertionSortDemo {
    public static void main(String[] args) {
        int[] randomArray={1,52,3,22,0,6,45,4};
        System.out.println(Arrays.toString(randomArray));
        System.out.println(Arrays.toString(sort(randomArray)));
    }

    public static int[] sort(int[] arr){
        int size=arr.length-1;
        for(int i=size;i>0;i--){
            for(int j =0;j<i;j++){
                if(arr[j] > arr[j+1]){
                    int tmp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=tmp;
                }
            }
        }
        return arr;
    }
}
