package org.example.thread.concurancy;

import org.junit.Test;
import static org.junit.Assert.*;

public class CounterMCQClientInterface {
    @Test
    public void testConcurrentIncrement() throws InterruptedException {
        Counter counter = new Counter();

        Thread thread1 = new Thread(() -> {

            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for(int i = 0 ; i<1000 ; i++){
                counter.increment();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        int expectedValue = 2000;
        int actualValue = counter.getValue();

        assertEquals(expectedValue,actualValue);
        assertNotEquals(3000,actualValue);
    }
}