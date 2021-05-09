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

        Character usingMap=getFirstNonRepeat(input);
        int usingArrIndex=getFirstNonRepeatUsingArray(input);
        System.out.println((usingMap==null)? "-1" : usingMap);
        System.out.println("Index :"+usingArrIndex);
    }

    private static Character getFirstNonRepeat(String string){
        char[] chars= string.toLowerCase().toCharArray();
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
                return c;
            }
        }
        return null;
    }

    private static int getFirstNonRepeatUsingArray(String str){
        int[] holder=new int[256];
       String string= str.toLowerCase();

        for (int i = 0; i < string.length(); i++){
            if(string.charAt(i)!=' '){
                holder[string.charAt(i)]++;
            }
        }


        int j, index = -1;
        for (j = 0; j < string.length(); j++) {
            if (holder[string.charAt(j)] == 1) {
                index = j;
                break;
            }
        }
        return index;
    }
}
