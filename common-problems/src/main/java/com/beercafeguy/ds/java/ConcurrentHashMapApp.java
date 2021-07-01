package com.beercafeguy.ds.java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentHashMapApp {

    public static void main(String[] args) {

        // Hash map issue
        HashMap<Integer,String> hashMap=new HashMap<>();
        hashMap.put(1,"Hem chandra");
        hashMap.put(2,"Aman Chauhan");
        hashMap.put(3,"Ajay Batra");
        hashMap.put(4,"Ankur Das");

        Iterator<Integer> hashMapIterator=hashMap.keySet().iterator();

        while(hashMapIterator.hasNext()){
            Integer key=hashMapIterator.next();
            System.out.println(key+" : "+ hashMap.get(key));
            /* if(key==3){
                hashMap.put(5,"Nidhi Namita"); // This throws java.util.ConcurrentModificationException
            }*/
        }

        // Concurrent Hash Map
        ConcurrentMap<Integer,String> concurrentMap=new ConcurrentHashMap<>();
        concurrentMap.put(1,"Hem chandra");
        concurrentMap.put(2,"Aman Chauhan");
        concurrentMap.put(3,"Ajay Batra");
        concurrentMap.put(4,"Ankur Das");

        Iterator<Integer> concMapIterator=hashMap.keySet().iterator();

        while(concMapIterator.hasNext()){
            Integer key=concMapIterator.next();
            System.out.println(key+" : "+ concurrentMap.get(key));
            if(key==3){
                concurrentMap.put(5,"Nidhi Namita"); // This won't throw java.util.ConcurrentModificationException
            }
        }

        for(Map.Entry<Integer,String> entry:concurrentMap.entrySet()){
            System.out.println(entry.getKey()+" : "+ entry.getValue());
        }
    }
}
