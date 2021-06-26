package com.beercafeguy.ds.array;

import java.util.HashMap;

public class TwoSumProblem {

    public static void main(String[] args) {

        int[] source={1,2,3,4,5};
        int target=5;
        int[] result= twoSum(source,target);
        if(result[0]==result[1]){
            System.out.println("Not found");
        }else{
            System.out.println("Index 1 -> "+result[0]+" | Index 2 -> "+result[1]);
        }
    }


    public static int[] twoSum(int[] nums, int target) {

        int[] result=new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                result[0]=map.get(target-nums[i]);
                result[1]=i;
                return result;
            }else{
                map.put(nums[i],i);
            }
        }
        return result;
    }

}
