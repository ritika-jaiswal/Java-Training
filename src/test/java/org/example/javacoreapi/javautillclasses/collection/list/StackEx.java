package org.example.javacoreapi.javautillclasses.collection.list;

import java.util.Iterator;
import java.util.Queue;
import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(23);
        stack.push(11);
        stack.push(90);
        stack.push(67);
        stack.pop();

        Iterator<Integer> itr = stack.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
