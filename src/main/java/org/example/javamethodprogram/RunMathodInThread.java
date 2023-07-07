package org.example.javamethodprogram;


class ThreadTest extends Thread {
    public void run() {
        System.out.println(" Curreant Thread name is: " + Thread.currentThread().getName());
        System.out.println("ruin method is called");
    }

}

public class RunMathodInThread {
    public static void main(String[] args) {
        ThreadTest threadTest = new ThreadTest();
        threadTest.start();
        // threadTest.start();
        // threadTest.start(); we can't call twice of start() otherwise it will gave
        // error (llegalStateException)
    }

}
