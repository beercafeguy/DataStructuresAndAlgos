package com.beercafeguy.ds.array;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        //[4,0,0,0,0,0]
        //1
        //[1,2,3,5,6]
        //5

        int[] input1={4,0,0,0,0,0};
        int[] input2={1,2,3,5,6};
        merge(input1,1,input2,5);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m==0){
            int index=0;
            while(index<n){
                nums1[index]=nums2[index];
                index++;
            }
        }else if(n!=0){
            int[] result = new int[nums1.length];
            int index1 = 0, index2 = 0, indexResult = 0;
            while (index1 < m && index2 < n) {
                if (nums1[index1] > nums2[index2]) {
                    result[indexResult++] = nums2[index2++];
                } else {
                    result[indexResult++] = nums1[index1++];
                }
            }

            while (index1 < m) {
                result[indexResult++] = nums1[index1++];
            }

            while (index2 < n) {
                result[indexResult++] = nums2[index2++];
            }
            int index = 0;
            while (index < nums1.length) {
                nums1[index] = result[index];
                index++;
            }
        }
        System.out.println(Arrays.toString(nums1));
    }
}
