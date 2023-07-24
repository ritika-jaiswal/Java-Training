package org.example.thread;

import org.example.thread.JoinEx;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class JoinExMCQClientInterface {
    @Test
   public void testJoin() {

        PrintStream originalOutPut = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        JoinEx.main(new String[0]);

        System.setOut(originalOutPut);

        String outPut = outputStream.toString();

        assertTrue(outPut.contains("Main thread is waitning for the worker thread to completed"));
        assertTrue(outPut.contains("Worker thread completed its task"));
        assertTrue(outPut.contains("Main thread resume execution after worker thread completes"));
    }

}