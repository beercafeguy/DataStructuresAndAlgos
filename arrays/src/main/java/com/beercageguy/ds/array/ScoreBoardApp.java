package com.beercageguy.ds.array;

public class ScoreBoardApp {
    public static void main(String[] args) {
        ScoreBoard scoreBoard=new ScoreBoard(5);
        GameEntry g1=new GameEntry("Hem",10);
        GameEntry g2=new GameEntry("Ajay",44);
        GameEntry g3=new GameEntry("Aman",36);
        GameEntry g4=new GameEntry("Foo",2);
        GameEntry g5=new GameEntry("Mohan",21);
        GameEntry g6=new GameEntry("Bheem",54);

        scoreBoard.add(g1);
        scoreBoard.add(g2);
        scoreBoard.add(g3);
        scoreBoard.add(g4);
        scoreBoard.add(g5);
        scoreBoard.add(g6);

        scoreBoard.show();

        System.out.println(scoreBoard.remove(1));
        scoreBoard.show();
    }
}
