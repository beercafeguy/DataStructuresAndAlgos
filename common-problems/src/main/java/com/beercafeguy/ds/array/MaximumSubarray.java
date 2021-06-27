package com.beercafeguy.ds.array;

public class MaximumSubarray {

    public static void main(String[] args) {

        int[] input={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(input));
    }

    public static int maxSubArray(int[] nums) {

        int sizeOfArray=nums.length;
        int maxSoFar=Integer.MIN_VALUE;
        int maxEndingHere=0;

        for(int i=0;i<sizeOfArray;i++){
            maxEndingHere=maxEndingHere+nums[i];
            if(maxSoFar < maxEndingHere){
                maxSoFar=maxEndingHere;
            }

            if(maxEndingHere<0){
                maxEndingHere=0;
            }
        }
        return maxSoFar;
    }
}
