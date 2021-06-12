package com.beercafeguy.study.ds.sorting;

import java.util.Arrays;

public class MergeSortedArraysApp {

    public static void main(String[] args) {
        int[] arrA={10,15,25,55};
        int[] arrB={7,11,19,58,60};

        int lengthA=arrA.length;
        int lengthB=arrB.length;
        int[] target=new int[lengthA+lengthB];
        int[] result=mergeSortedArrays(arrA,lengthA,arrB,lengthB,target);
        printArr(result);
    }

    private static int[] mergeSortedArrays(int[] arrA,int lengthA,
                                          int[] arrB,int lengthB,
                                          int[] target
                                          ){
        int aIndex=0,bIndex=0,cIndex=0;
        while(aIndex<lengthA && bIndex <lengthB){
            if(arrA[aIndex]<arrB[bIndex]){
                target[cIndex++]=arrA[aIndex++];
            }else{
                target[cIndex++]=arrB[bIndex++];
            }
        }
        while(aIndex<lengthA){
            target[cIndex++]=arrA[aIndex++];
        }
        while(bIndex<lengthB){
            target[cIndex++]=arrB[bIndex++];
        }
        return target;
    }

    private static void printArr(int[] arr){
        System.out.println(Arrays.toString(arr));
    }
}
