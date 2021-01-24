package com.beercageguy.ds.array;

public class ScoreBoard {

    private final int capacity;

    private int numEntries=0;

    private GameEntry[] entries;

    public ScoreBoard(int capacity) {
        this.capacity=capacity;
        entries=new GameEntry[capacity];
    }

    public boolean remove(int i){

        if(i>=numEntries || i <0 ){
            return false;
        }else{
            for(int j=i;j<numEntries-1;j++){
                entries[j]=entries[j+1];
            }
            numEntries--;
            return true;
        }
    }
    public void add(GameEntry entry){
        int newScore=entry.getScore();
        if(numEntries<capacity || newScore>entries[numEntries-1].getScore()){ // case when new score will be entertained
            if(numEntries < capacity){
                numEntries++;
            }

            int i=numEntries -1;
            while(i > 0 && entries[i-1].getScore() < newScore){
                entries[i]=entries[i-1];
                i--;
            }
            entries[i]=entry;
        }
    }

    public void show(){
        for(int i=0;i<numEntries;i++){
            System.out.println(entries[i]);
        }
    }
}
