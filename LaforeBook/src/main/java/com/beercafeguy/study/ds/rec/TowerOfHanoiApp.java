package com.beercafeguy.study.ds.rec;

public class TowerOfHanoiApp {
    public static void main(String[] args) {

        moveTower(3,"A","B","C");
    }

    private static void moveTower(int numberOfDisks, String source, String intermediate, String target) {
        if(numberOfDisks==1){
            System.out.println("Move disk 1 from "+source+" to "+target);
        }else{
            moveTower(numberOfDisks-1,source,target,intermediate);
            System.out.println("Move disk "+numberOfDisks+" from "+source+" to "+target);
            moveTower(numberOfDisks-1,intermediate,source,target);
        }
    }

}
