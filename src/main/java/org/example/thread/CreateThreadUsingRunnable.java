package org.example.thread;

import org.example.multithreadingex.AnotherThreadCreateUsingThreadclass;

public class CreateThreadUsingRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            System.out.println(Thread.currentThread().getName());
            Thread.currentThread().setName("Ritika Jaiswal");
            System.out.println(Thread.currentThread().getId());
            System.out.println("getPriority: " + Thread.currentThread().getPriority());
            Thread.currentThread().setPriority(10);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println("Catch exception");
            }
        }
    }

    public static void main(String[] args) {
        CreateThreadUsingRunnable t1 = new CreateThreadUsingRunnable();
        AnotherThreadCreateUsingThreadclass t2 = new AnotherThreadCreateUsingThreadclass();
        Thread thr = new Thread(t1);
        thr.start();
        t2.start();

    }

}

