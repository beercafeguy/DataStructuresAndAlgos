package com.beercafeguy.ds.array;

import java.util.Arrays;

public class RemoveDuplicateSortedArray {
    public static void main(String[] args) {

        int[] input={3,2,2,3};
        //System.out.println("Removed Index: "+ Arrays.toString(removeIndex(input,5)));
        //System.out.println("Removed Dups: "+removeDuplicates(input));
        System.out.println("Remove items: "+removeElement(input,3));
    }

    public static int removeElement(int[] nums, int val) {
        System.out.println("Array Pre removal: "+Arrays.toString(nums));
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[index++]=nums[i];
            }
        }
        System.out.println("Array post removal: "+Arrays.toString(nums));
        return index;
    }

    public static int removeDuplicates(int[] nums) {
        int n=nums.length;
        if(n==0 || n==1){
            return n;
        }

        int uniqIndex=0;
        for(int i=0;i<n-1;i++){
            if(nums[i]!=nums[i+1]){
                nums[uniqIndex++]=nums[i];
            }
        }
        nums[uniqIndex++]=nums[n-1];
        System.out.println(Arrays.toString(nums));
        return uniqIndex;
    }

    public static int[] removeIndex(int[] arr,int index){
        for(int i=index;i<arr.length-1;i++){
                arr[i]=arr[i+1];
        }
        return Arrays.copyOfRange(arr,0,arr.length-1);
    }
}
