package org.example.thread.Syncronized.intercommunication;

public class ThreadCommunicationExample {
    public static void main(String[] args) {
        SharedData sharedData = new SharedData();

        Thread producerThread = new Thread(() -> {
            for(int i=0; i<=5; i++){
                sharedData.produce(i);
            }
        });

        Thread consumerThread = new Thread(() -> {
            for(int i=0 ; i<=5; i++){
                sharedData.consume(i);
            }
        });

        producerThread.start();
        consumerThread.start();
    }
}
