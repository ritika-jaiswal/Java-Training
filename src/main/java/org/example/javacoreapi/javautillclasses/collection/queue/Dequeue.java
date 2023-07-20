package org.example.javacoreapi.javautillclasses.collection.queue;
import java.util.LinkedList;

public class Dequeue<E> {
    private LinkedList<E> dequeue;

    public Dequeue() {
        dequeue = new LinkedList<>();
    }

    public void addFirst(E element) {
        dequeue.addFirst(element);
    }

    public void addLast(E element) {
        dequeue.addLast(element);
    }

    public E removeFirst() {
        return dequeue.pollFirst();
    }

    public E removeLast() {
        return dequeue.pollLast();
    }

    public E peekFirst() {
        return dequeue.peekFirst();
    }

    public E peekLast() {
        return dequeue.peekLast();
    }

    public int size() {
        return dequeue.size();
    }

    public boolean isEmpty() {
        return dequeue.isEmpty();
    }
}
