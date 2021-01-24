package com.beercageguy.ds.array;

public class ScoreBoard {

    private final int capacity;

    private int numEntries=0;

    private GameEntry[] entries;

    public ScoreBoard(int capacity) {
        this.capacity=capacity;
        entries=new GameEntry[capacity];
    }

    public void add(GameEntry entry){
        int newScore=entry.getScore();
        if(numEntries<capacity || newScore>entries[numEntries-1].getScore()){ // case when new score will be entertained
            if(numEntries < capacity){
                numEntries++;
            }

            int i=numEntries -1;
            while(i > 0 && entries[i].getScore() < newScore){
                entries[i]=entries[i-1];
                i--;
            }
            entries[i]=entry;
        }
    }
}
