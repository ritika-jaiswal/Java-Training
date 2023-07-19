package org.example.javacoreapi.javautillclasses.collection.list;

import com.sun.source.tree.WhileLoopTree;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("Mayuri");
        list.add("Riitka");
        list.add("Muskan");
        list.add("Himanshu");

        Iterator itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
