package com.beercageguy.ds.array;

import java.util.Arrays;

public class ArrayReverseApp {
    public static void main(String[] args) {
        int[] inputArrayEven={1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(inputArrayEven));
        System.out.println(Arrays.toString(reverse(inputArrayEven)));

        int[] inputArrayOddn={1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(inputArrayOddn));
        System.out.println(Arrays.toString(reverse(inputArrayOddn)));
    }

    public static int[] reverse(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start < end){
            int tmp=arr[start];
            arr[start++]=arr[end];
            arr[end--]=tmp;
        }
        return arr;
    }
}
