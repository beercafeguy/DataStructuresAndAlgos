package com.beercafeguy.ds;

public class KnightTour {

    static final int size = 8;

    public static void main(String[] args) {

        solveKnightTour();
    }

    //check if x,y move is valid
    // 1. its in the board
    // 2. It not visited in past
    static boolean isSafe(int x, int y, int[][] solutionMaze) {
        return x < size && x >= 0 && y < size && y >= 0 && // x,y in board
                solutionMaze[x][y] == -1; // x,y not yet visited
    }

    static void print(int[][] matrix) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static boolean solveKnightTour() {
        int sol[][] = new int[8][8];

        //initilize sol matrix with -1
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                sol[i][j] = -1;
            }
        }

        int[] xMoves = {1, 2, 2, 1, -1, -2, -2, -1};
        int[] yMoves = {-2, -1, 1, 2, 2, 1, -1, -1};

        //starts at 0,0
        sol[0][0] = 0;
        if (!solveKnightTourRec(0, 0, 1, sol, xMoves, yMoves)) {
            System.out.println(
                    "Solution not possible"
            );
            return false;
        } else {
            print(sol);
            return true;
        }
    }

    static boolean solveKnightTourRec(int x, int y, int moveNumber, int[][] solution, int[] movesInX, int[] movesInY) {
        //if whole board is visited
        if (moveNumber == size * size) {
            return true;
        }

        for (int k = 0; k < size; k++) {
            int nextX = x + movesInX[k];
            int nextY = y + movesInY[k];
            if (isSafe(nextX, nextY, solution)) {
                solution[nextX][nextY] = moveNumber;
                if (solveKnightTourRec(nextX, nextY, moveNumber + 1, solution, movesInX, movesInY)) {
                    return true;
                } else {
                    solution[nextX][nextY] = -1;
                }
            }
        }
        return false;
    }
}
