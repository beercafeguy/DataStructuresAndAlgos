package com.beercageguy.ds.array;

import java.util.Arrays;
import java.util.Random;

public class RandomArrayTest {
    public static void main(String[] args) {
        int[] data=new int[10];
        Random random=new Random(System.currentTimeMillis());
        for(int i=0;i<data.length;i++){
            data[i]=random.nextInt(100);
        }

        int[] origData= Arrays.copyOf(data,data.length);
        System.out.println("Array before sort: "+Arrays.toString(data));
        System.out.println("Array equals check: "+Arrays.equals(origData,data));
        System.out.println("Array after sort: "+Arrays.toString(InsertionSortDemo.sort(data)));
    }
}
