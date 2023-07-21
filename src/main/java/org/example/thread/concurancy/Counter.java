package org.example.thread.concurancy;

public class Counter {
    private int value = 0;
    public synchronized void increment(){
        value++;
    }

    public int getValue(){
        return value;
    }
}
