package com.beercageguy.ds.array;

public class GameEntry {
    private String name;
    private int score;

    public GameEntry() {
    }

    public GameEntry(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "GameEntry{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}
