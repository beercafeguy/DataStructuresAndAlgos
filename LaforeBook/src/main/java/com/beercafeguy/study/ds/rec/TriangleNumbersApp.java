package com.beercafeguy.study.ds.rec;

public class TriangleNumbersApp {
    public static void main(String[] args) {

        //findTriangleNumberUsingLoop(4);
        System.out.println(findTriangleNumberUsingRecursion(4));
    }

    private static int findTriangleNumberUsingRecursion(int i) {
        System.out.println("Entered: "+i);
        if(i==1){
            return 1;
        }else{
            int tmp= i+ findTriangleNumberUsingRecursion(i-1);
            System.out.println("Returned: "+i);
            return tmp;
        }
    }

    private static void findTriangleNumberUsingLoop(int n) {
        int total=0;
        while(n>0){
            total=total+n;
            n--;
        }
        System.out.println(total);
    }
}
