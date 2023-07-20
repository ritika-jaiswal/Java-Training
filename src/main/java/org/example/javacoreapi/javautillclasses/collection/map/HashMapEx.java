package org.example.javacoreapi.javautillclasses.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(101,"Stranger Things");
        hashMap.put(201,"Wednesday Aadam");
        hashMap.put(301,"Squet Little");

//First way of iterating map
        Set set = hashMap.entrySet();
        Iterator itr = set.iterator();
        while (itr.hasNext()){
            Map.Entry entry = (Map.Entry)itr.next();
            System.out.println("Key : " + entry.getKey() + ", " +"Value: " + entry.getValue());
        }

//Second way of Iterating map
        for (Map.Entry m: hashMap.entrySet()) {
            System.out.println(m.getKey() + " = " + m.getValue());
        }
    }
}
