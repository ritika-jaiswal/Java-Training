package org.example.javacoreapi.javautillclasses.collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Shivani");
        hashSet.add("Aman");
        hashSet.add("Ritzz");
        hashSet.add("Aman");

        Iterator itr = hashSet.iterator();
                while(itr.hasNext()){
                    System.out.println(itr.next());
                }
    }
}
