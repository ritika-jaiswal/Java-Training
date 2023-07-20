package org.example.javacoreapi.javautillclasses.collection.queue;

import java.util.Arrays;
import java.util.PriorityQueue;

public class PriorityQueueUtils {
    public static int findMax(PriorityQueue<Integer> priorityQueue) {
        int i = 0;
            while(!priorityQueue.isEmpty()){
              i = priorityQueue.poll();
              System.out.println(i);
            }
        return i;
    }

    public static int findMin(PriorityQueue<Integer> priorityQueue){
        return priorityQueue.peek();
    }

}
