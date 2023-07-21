package org.example.thread.Syncronized.intercommunication;

public class Company {
    int n;
    boolean f = false;
    // f=false: chance producer
    // f=true: chance consumer

    synchronized public void Produce_item(int n) throws Exception {
        if (f) {
            wait();
        }
        this.n = n;
        System.out.println("Produced: " + this.n);
        f = true;
        notify();
    }

    synchronized public int Consume_item() throws Exception {
        if (!f) {
            wait();
        }
        System.out.println("Consumed: " + this.n);
        f = false;
        notify();
        return this.n;
    }
}
