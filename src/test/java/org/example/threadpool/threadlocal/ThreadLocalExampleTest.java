package org.example.threadpool.threadlocal;

import org.junit.Test;

public class ThreadLocalExampleTest {
    @Test
    public void testThreadLocalBehaviour() {
        ThreadLocalExample tle = new ThreadLocalExample();
        Thread thread1 = new Thread(() -> {
            tle.setThreadLocalValue(10);
            System.out.println("Thread-1 - ThreadLocal value " + tle.getThreadLocalValue());
        });

        Thread thread2 = new Thread(() -> {
            tle.setThreadLocalValue(10);
            System.out.println("Thread-1 - ThreadLocal value" + tle.getThreadLocalValue());
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        System.out.println("Main thread: ThreadLocal value: " + tle.getThreadLocalValue());
    }
}
