package org.example.thread.Syncronized.intercommunication;

public class MainThread {
    public static void main(String[] args) {
        Company cmp = new Company();
        Consumer c = new Consumer(cmp);
        Producer p = new Producer(cmp);

        p.start();
        c.start();
    }

}
