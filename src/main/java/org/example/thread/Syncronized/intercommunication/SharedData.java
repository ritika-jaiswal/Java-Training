package org.example.thread.Syncronized.intercommunication;

public class SharedData {
    private int data;
    private boolean produced;

    public synchronized void produce(int value){
        while (produced){
            try{
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        data = value;
        System.out.println("Produced: " + data );
        produced = true;
        notify();
    }

    public synchronized void consume(int value){
        while (!produced){
            try {
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Consumed: " + data);
        produced = false;
        notify();
    }
}
