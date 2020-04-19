package com.beercageguy.ds.common;

import java.util.HashMap;

public class ColorPairApp {
    static int[] socks={1,2,1,2,1,3};
    static int sockMerchant(int n, int[] ar) {
        HashMap<Integer,Integer> tmpMap=new HashMap<>();
        int numPair=0;
        for(int i=0;i<n;i++){
            if(!tmpMap.containsKey(ar[i])){
                tmpMap.put(ar[i],1);
            }else{
                tmpMap.remove(ar[i]);
                numPair++;
            }
        }
        return numPair;
    }

    public static void main(String[] args) {
        System.out.println(sockMerchant(6,socks));
    }

}
