package org.example.thread.Syncronized.intercommunication;

public class SyncronizationEx {
    public static void main(String[] args) {
        Table table = new Table();
        Thread1 thread1 = new Thread1(table);
        Thread thread2 = new Thread2(table);

        thread1.start();
        thread2.start();
    }
}
