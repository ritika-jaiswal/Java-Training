package org.example.javamethodprogram;

class ThreadSet implements Runnable {
    public void run() {
        try {
            System.out.println("Thread " + Thread.currentThread().getId() + " is runnning");
        } catch (Exception e) {
            System.out.println("Exception is cought");
        }
    }

}

public class StartMethod {
    public static void main(String[] args) {
        int n = 8;
        for (int i = 0; i < n; i++) {
            ThreadSet threadSet = new ThreadSet();
            // threadSet.start(); // It returns Different id bcuz start() method start() is
            // to
            // create a separate call stack for the thread. A separate call stack is created
            // by it, and then run() is called by JVM.

            threadSet.run(); // It returns same id
        }

    }
}
