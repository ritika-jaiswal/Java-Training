package org.example.thread;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PrintNumberThreadMCQClientInterface {
    @Test
    public void testPrintNumberThread(){
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        int limit = 5;

        PrintNumberThread printNumberThread = new PrintNumberThread(limit);

        printNumberThread.start();

        try{
            printNumberThread.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.setOut(System.out);

        String consoleOutput = outputStream.toString().trim();

        String expectedOutput = "1\r\n" +
                "2\r\n"+"3\r\n" + "4\r\n" + "5";
        System.out.println(expectedOutput);
        System.out.println(consoleOutput);

        assertEquals(expectedOutput,consoleOutput);
    }
}
