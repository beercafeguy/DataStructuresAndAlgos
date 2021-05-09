package com.beercafeguy.ds.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class NonRepeatingElementApp {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> input = Arrays.stream(bufferedReader.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        System.out.println(Arrays.toString(input.toArray()));

        HashMap<Integer,Integer> map=new HashMap<>();
        for (Integer element:input) {
            if(map.containsKey(element)){
                map.put(element,map.get(element)+1);
            }else{
                map.put(element,1);
            }
        }
        Integer output=null;
        for (Integer element:input) {
            if(map.get(element)==1){
                output=element;
                break;
            }
        }
        System.out.println((output==null)? "-1" : output);
    }
}
