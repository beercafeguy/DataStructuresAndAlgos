package com.beercageguy.ds;

public class TicTacToe {
    private static final int X = 1, O = -1;
    private static final int EMPTY = 0;

    private int[][] board = new int[3][3];
    private int player;

    public TicTacToe() {
        clearBoard();
    }


    public void putMark(int i, int j) {
        if (i < 0 || i > 2 || j < 0 || j > 2) {
            throw new IllegalMonitorStateException("index out of range");
        } else if (board[i][j] != EMPTY) {
            throw new IllegalArgumentException("Board position taken");
        } else {
            board[i][j] = player;
            player = -player;
        }
    }

    public boolean isWin(int mark) {
        return ((board[0][0] + board[0][1] + board[0][2]) == mark * 3
                || (board[1][0] + board[1][1] + board[1][2]) == mark * 3
                || (board[2][0] + board[2][1] + board[2][2]) == mark * 3

                || (board[0][0] + board[1][0] + board[2][0]) == mark * 3
                || (board[0][1] + board[1][1] + board[2][1]) == mark * 3
                || (board[0][2] + board[1][2] + board[2][2]) == mark * 3

                || (board[0][0] + board[1][1] + board[2][2]) == mark * 3
                || (board[2][0] + board[1][1] + board[0][2]) == mark * 3
        );
    }

    public int winner() {
        if (isWin(X)) {
            return X;
        } else if (isWin(O)) {
            return O;
        } else {
            return EMPTY;
        }
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                switch (board[i][j]) {
                    case X:
                        builder.append("X");
                        break;
                    case O:
                        builder.append("O");
                        break;
                    case EMPTY:
                        builder.append(" ");
                        break;
                }
                if (j < 2) {
                    builder.append("|");
                }
            }
            if (i < 2) {
                builder.append("\n-------\n");
            }
        }
        return builder.toString();
    }

    private void clearBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = EMPTY;
            }
        }
        player = X;
    }

    public static void main(String[] args) {

        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.putMark(1, 1); // X
        ticTacToe.putMark(0, 2); // O
        ticTacToe.putMark(2, 2); // X
        ticTacToe.putMark(0, 0); // O
        ticTacToe.putMark(0, 1); // X
        ticTacToe.putMark(2, 1); // O
        ticTacToe.putMark(1, 2); // X
        ticTacToe.putMark(1, 0); // O
        ticTacToe.putMark(2, 0); // X
        System.out.println(ticTacToe);

        int winner=ticTacToe.winner();
        String[] ar={"O Winner" ,"Tie","X Winner"};
        System.out.println("Winner: "+ar[winner+1]);
    }
}
