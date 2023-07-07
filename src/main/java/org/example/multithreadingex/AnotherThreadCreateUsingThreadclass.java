package org.example.multithreadingex;


public class AnotherThreadCreateUsingThreadclass extends Thread {
    public void run() {
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            System.out.println(Thread.currentThread().getName());
        }
    }

}