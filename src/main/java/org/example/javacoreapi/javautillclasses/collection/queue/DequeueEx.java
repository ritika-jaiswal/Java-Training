package org.example.javacoreapi.javautillclasses.collection.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class DequeueEx {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>() ;
            deque.add(20);
            deque.add(39);
            deque.add(45);
            deque.add(78);

        Iterator itr = deque.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
