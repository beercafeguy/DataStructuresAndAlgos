package com.beercafeguy.study.ds.array;

import java.util.Arrays;

public class BinarySearchApp {

    public static void main(String[] args) {
        //System.out.println(binarySearchLoop(22));
        //System.out.println(binarySearchLoop(155));
        System.out.println(binarySearchRecursion(0,6,155));
        // System.out.println(binarySearchLoop(155));


    }

    public static boolean binarySearchRecursion(int[] input,int lower,int upper,int key) {
        int currentIndex=(lower+upper)/2;
        if(input[currentIndex]==key){
            return true;
        }else if (lower>upper){
            return false;
        }else if(input[currentIndex]> key){
            return binarySearchRecursion(Arrays.copyOfRange(input,lower,currentIndex),lower,currentIndex-1,key);
        }else if(input[currentIndex]<key){
            return binarySearchRecursion(Arrays.copyOfRange(input,currentIndex+1,upper),currentIndex+1,upper,key);
        }
        return false;
    }

    public static boolean binarySearchRecursion(int lower,int upper,int key) {
        int[] input={1,10,20,44,55,123,155};
        int currentIndex=(lower+upper)/2;
        if(input[currentIndex]==key){
            return true;
        }else if (lower>upper){
            return false;
        }else if(input[currentIndex]> key){
            return binarySearchRecursion(lower,currentIndex-1,key);
        }else if(input[currentIndex]<key){
            return binarySearchRecursion(currentIndex+1,upper,key);
        }
        return false;
    }

    public static boolean binarySearchLoop(int key) {

        int[] input={1,10,20,44,55,123,155};
        int lower=0;
        int higher=input.length-1;
        int currentIndex;
        while(lower <= higher){
            currentIndex=(lower+higher)/2;
            int mid=input[currentIndex];
            if(mid==key){
                return true;
            }else if(mid > key){
                higher=currentIndex-1;
            }else if (mid < key){
                lower=currentIndex+1;
            }
        }
        return false;
    }
}
