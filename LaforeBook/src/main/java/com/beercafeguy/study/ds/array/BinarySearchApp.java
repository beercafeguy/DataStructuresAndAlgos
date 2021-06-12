package com.beercafeguy.study.ds.array;

public class BinarySearchApp {

    public static void main(String[] args) {
        //System.out.println(binarySearchLoop(22));
        System.out.println(binarySearchLoop(155));
    }

    private static boolean binarySearchLoop(int key) {

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
