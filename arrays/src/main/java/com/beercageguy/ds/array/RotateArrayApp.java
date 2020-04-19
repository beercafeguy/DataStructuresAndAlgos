package com.beercageguy.ds.array;

import java.util.Arrays;

public class RotateArrayApp {

    public static int[] input={1,2,3,4,5};

    public static void main(String[] args) {
        rotateLeft(15);
        Arrays.stream(input)
                .mapToObj(x -> String.valueOf(x)+" ")
                .forEach(System.out::print);
        System.out.println();
        rotateRight(2);
        Arrays.stream(input)
                .mapToObj(x -> String.valueOf(x)+" ")
                .forEach(System.out::print);
    }

    private static void rotateLeft(int rotation){
        int length=input.length;
        int realRotation=rotation % length;
        int[] tmp= Arrays.copyOfRange(input,0,realRotation);
        //Arrays.stream(tmp).forEach(System.out::println);
        for(int i=realRotation;i<length;i++){
            input[i-realRotation]=input[i];
        }
        for(int i=length-realRotation;i<length;i++){
            input[i]=tmp[i-(length-realRotation)];
        }
    }

    private static void rotateRight(int rotation){
        int length=input.length;
        int realRotation=rotation % length;
        int[] tmp= Arrays.copyOfRange(input,length-realRotation,length);
        //Arrays.stream(tmp).mapToObj(String::valueOf).map(x->x+" ").forEach(System.out::print);
        for(int i=(length-realRotation-1);i>=0;i--){
            input[i+realRotation]=input[i];
        }
        for(int i=0;i<realRotation;i++){
            input[i]=tmp[i];
        }
    }
}
