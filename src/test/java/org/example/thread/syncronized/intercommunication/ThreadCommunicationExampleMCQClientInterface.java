package org.example.thread.syncronized.intercommunication;

import org.example.thread.Syncronized.intercommunication.SharedData;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ThreadCommunicationExampleMCQClientInterface {
    @Test
    public void threadCommunication() throws Exception{
        PrintStream originalOutPut = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        SharedData sharedData = new SharedData();

        Thread producerThread = new Thread(() -> {
            for(int i = 0; i<=5; i++){
                sharedData.produce(i);
            }
        });

        Thread consumerThread = new Thread(() -> {
            for(int i = 0; i<=5; i++){
                sharedData.consume(i);
            }
        });

        consumerThread.start();
         Thread.sleep(50);
        producerThread.start();

        producerThread.join();
        consumerThread.join();

        System.setOut(originalOutPut);

        String outPut = outputStream.toString();

        assertTrue(outPut.contains("Produced: 0"));
        assertTrue(outPut.contains("Consumed: 0"));
        assertTrue(outPut.contains("Produced: 1"));
        assertTrue(outPut.contains("Consumed: 1"));
        assertTrue(outPut.contains("Produced: 2"));
        assertTrue(outPut.contains("Consumed: 2"));
        assertTrue(outPut.contains("Produced: 3"));
        assertTrue(outPut.contains("Consumed: 3"));
        assertTrue(outPut.contains("Produced: 4"));
        assertTrue(outPut.contains("Consumed: 4"));
        assertTrue(outPut.contains("Produced: 5"));
        assertTrue(outPut.contains("Consumed: 5"));
    }
}
