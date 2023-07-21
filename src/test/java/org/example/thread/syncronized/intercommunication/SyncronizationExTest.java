package org.example.thread.syncronized.intercommunication;

import org.example.thread.Syncronized.intercommunication.Table;
import org.example.thread.Syncronized.intercommunication.Thread1;
import org.example.thread.Syncronized.intercommunication.Thread2;
import org.junit.Test;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class SyncronizationExTest {

    @Test
    public void testSynchronizedPrintTable() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Table table = new Table();

        Thread1 thread1 = new Thread1(table);
        Thread2 thread2 = new Thread2(table);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
   System.setOut(System.out);
        String consoleOutPut = outputStream.toString().trim();
        String expectedOutput = "5\r\n10\r\n15\r\n20\r\n25\r\n10\r\n20\r\n30\r\n40\r\n50";
        assertEquals(expectedOutput, consoleOutPut);
    }
}
