package org.example.multithreadingex;


public class TwiceThreadIsOrNot extends Thread {
    public void run() {
        try {
            System.out.println("thread is executing now........");
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {
        TwiceThreadIsOrNot m1 = new TwiceThreadIsOrNot();
        m1.start();
        m1.start();
    }
}