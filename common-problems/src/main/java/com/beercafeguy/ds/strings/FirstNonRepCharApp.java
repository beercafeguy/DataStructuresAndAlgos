package com.beercafeguy.ds.strings;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FirstNonRepCharApp {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input = bufferedReader.readLine();
        System.out.println(input);
        
        char[] chars= input.toLowerCase().toCharArray();
        HashMap<Character,Integer> map=new HashMap<>();
        for (char c:chars) {
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        Character output=null;
        for (char c:chars) {
            if(map.get(c)==1){
                output=c;
                break;
            }
        }
        System.out.println((output==null)? "-1" : output);
    }
}
