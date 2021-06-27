package com.beercafeguy.ds.nums;

public class SquareRoot {

    public static void main(String[] args) {
        System.out.println(floorSqrt(2147395600));
    }

    public static int floorSqrt(int x) {
         // Base Cases
        if (x == 0 || x == 1)
            return x;


        // Do Binary Search for floor(sqrt(x))
        long start = 1, end = x, ans=0;
        while (start <= end)
        {
            long mid = (start + end) / 2;

            // If x is a perfect square
            if (mid*mid == x)
                return (int)mid;

            // Since we need floor, we update answer when mid*mid is
            // smaller than x, and move closer to sqrt(x)
            if (mid*mid < x)
            {
                start = mid + 1;
                ans = mid;
            }
            else   // If mid*mid is greater than x
                end = mid-1;
        }
        return (int)ans;
    }

    public static int mySqrt(int x) {
        // Base cases
        if (x == 0 || x == 1)
            return x;

        // Staring from 1, try all numbers until
        // i*i is greater than or equal to x.
        int i = 1, result = 1;

        while (result <= x) {
            i++;
            result = i * i;
        }
        return i - 1;
    }
}
