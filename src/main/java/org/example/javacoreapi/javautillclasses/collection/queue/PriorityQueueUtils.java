package org.example.javacoreapi.javautillclasses.collection.queue;

import java.util.PriorityQueue;

public class PriorityQueueUtils {
//    public static int findMax(PriorityQueue<Integer> priorityQueue) {
//        return priorityQueue.peek();
//    }

    public static int findMin(PriorityQueue<Integer> priorityQueue){
//        PriorityQueue<Integer> sortedQueue = new PriorityQueue<>(priorityQueue);
        return priorityQueue.peek();
    }
}
