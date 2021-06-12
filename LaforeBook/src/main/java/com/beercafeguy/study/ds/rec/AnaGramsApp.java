package com.beercafeguy.study.ds.rec;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AnaGramsApp {

    static int size;
    static int count;
    static char[] chars=new char[100];

    public static void main(String[] args) throws IOException {

        System.out.println("Enter String: ");
        String input=geString();
        size=input.length();
        count=0;
        for(int i=0;i<size;i++){
            chars[i]=input.charAt(i);
        }
        doAnagram(size);
    }

    private static void doAnagram(int newSize) {
        if(newSize==1){
            return;
        }
        for(int i=0;i<newSize;i++){
            doAnagram(newSize-1);
            if(newSize==2){
                displayWord();
            }
            rotateWord(newSize);
        }
    }

    private static void rotateWord(int newSize) {
        int startPosition=size-newSize;
        char tmp=chars[startPosition];
        int i;
        for(i=startPosition+1;i<size;i++){
            chars[i-1]=chars[i];
        }
        chars[i-1]=tmp;
    }

    private static void displayWord() {
        if(count<99)
            System.out.print("     ");
        if(count<9)
            System.out.print(" ");
        System.out.println(++count+"          ");
        for(int j=0;j<size;j++){
            System.out.print(chars[j]);
        }
        System.out.print(" ");
        System.out.flush();
        if(count%6==0){
            System.out.println(" ");
        }
    }


    private static String geString() throws IOException {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        return br.readLine();
    }
}
