package com.beercafeguy.study.ds.ll;

public class HeadTailListApp {
    public static void main(String[] args) {
        HeadTailList headTailList=new HeadTailList();
        headTailList.insertAtHead(20L);
        headTailList.insertAtTail(30L);
        headTailList.insertAtHead(40L);
        headTailList.insertAtTail(50L);
        headTailList.display();
    }
}
