package com.beercafeguy.ds;

public class MovieRooms {
    public static void main(String[] args) {

        int[] movie1={0,50};
        int[] movie2={60,120};
        int[] movie3={70,100};

        int[][] input={movie1,movie2,movie3};
        System.out.println(movieRooms(input));
    }

    public static int movieRooms(int[][] input){
        return input.length;
    }
}
