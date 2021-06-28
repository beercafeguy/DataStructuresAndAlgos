package com.beercafeguy.ds.array;

import java.util.Arrays;

public class SquaresOfSortedArray {
    public static void main(String[] args) {

        SquaresOfSortedArray squaresOfSortedArray=
                new SquaresOfSortedArray();
        int[] source={-4,1,2,3};
        System.out.println("Source: "+ Arrays.toString(source));
        System.out.println("Target: "+Arrays.toString(squaresOfSortedArray.sortedSquares(source)));
    }

    public int[] sortedSquares(int[] nums) {
        return nums;
    }

}
