package com.beercafeguy.ds.java;

import java.util.HashMap;
import java.util.Map;


public class ImmutableClass{
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("A",2);
        ImmutableClassDefinition im=new ImmutableClassDefinition("Hem",map);
        System.out.println(im.getMetadata().get("A"));
        map.put("A",5);
        System.out.println(im.getMetadata().get("A"));
    }
}
final class ImmutableClassDefinition {

    private final String immutableMember;
    private final HashMap<String,Integer> metadata;

    public ImmutableClassDefinition(String immutableMember,HashMap<String,Integer> meta) {
        this.immutableMember = immutableMember;

        //Deep Copy of Non Primitive data members
        HashMap<String,Integer> newMap=new HashMap<>();
        for(Map.Entry<String,Integer> entry:meta.entrySet()){
            newMap.put(entry.getKey(),entry.getValue());
        }
        this.metadata=newMap;


        //shallow copy
        // this.metadata=meta;
    }


    public String getImmutableMember() {
        return immutableMember;
    }

    public HashMap<String, Integer> getMetadata() {
        HashMap<String,Integer> newMap=new HashMap<>();
        for(Map.Entry<String,Integer> entry:metadata.entrySet()){
            newMap.put(entry.getKey(),entry.getValue());
        }
        return newMap;

        //return metadata;
    }
}
