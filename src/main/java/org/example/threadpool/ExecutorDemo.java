package org.example.threadpool;

import java.util.concurrent.*;
import java.util.concurrent.ExecutorService;

public class ExecutorDemo {
    public static void main(String[] args) {
        PrintJob[] jobs = {
                new PrintJob("Ritika"),
                new PrintJob("Mayuri"),
                new PrintJob("Muskan"),
                new PrintJob("Himanshu"),
                new PrintJob("Vidhya"),
                new PrintJob("Rahul")
        };
        ExecutorService service = Executors.newFixedThreadPool(3);
        for (PrintJob job : jobs) {
            service.submit(job);
        }
        service.shutdown();
    }
}
