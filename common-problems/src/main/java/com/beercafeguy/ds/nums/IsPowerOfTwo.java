package com.beercafeguy.ds.nums;

public class IsPowerOfTwo {

    public static void main(String[] args) {

        IsPowerOfTwo app=new IsPowerOfTwo();
        System.out.println(app.isPowerOfTwoRec(12));
        System.out.println(app.isPowerOfTwo(16));
    }

    public boolean isPowerOfTwoRec(int n) {
        if (n == 1){
            return true;
        }else if(n%2!=0 || n==0){
            return false;
        }else{
            return isPowerOfTwoRec(n/2);
        }
    }
    public boolean isPowerOfTwo(int n) {
        if (n == 0){
            return false;
        }else {
            while(n!=1){
                if(n%2!=0)
                    return false;
                n=n/2;
            }
            return true;
        }
    }

}
