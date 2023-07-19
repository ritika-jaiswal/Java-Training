package org.example.javacoreapi.javautillclasses.collection.list;

import java.util.Iterator;
import java.util.Vector;

public class VectorEx {
    public static void main(String[] args) {
        Vector<String> vl = new Vector<>();
        vl.add("Devin");
        vl.add("Alvin");
        vl.add("Elvish");

        Iterator itr = vl.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }

}
