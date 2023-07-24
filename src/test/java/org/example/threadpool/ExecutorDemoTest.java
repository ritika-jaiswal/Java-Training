package org.example.threadpool;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static org.junit.Assert.assertEquals;

public class ExecutorDemoTest {

    @Test
    public void testPrintJobExecution(){
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        PrintJob[] jobs = {new PrintJob("Ritika"),
                new PrintJob("Mayuri"),
                new PrintJob("Muskan"),
                new PrintJob("Himanshu"),
                new PrintJob("Vidhya"),
                new PrintJob("Rahul")
        };
        ExecutorService service = Executors.newFixedThreadPool(1);
        for (PrintJob job : jobs) {
            service.submit(job);
        }

        // Shutdown the service and wait for completion
        service.shutdown();
        while (!service.isTerminated()) {
            // Wait for all tasks to complete
        }

        // Get the captured output
        String consoleOutput = outputStream.toString();
        System.setOut(System.out); // Reset System.out

        // Verify the expected output
        String[] lines = consoleOutput.split(System.lineSeparator());
        assertEquals(12, lines.length); // Expecting 2 lines for each job (start and completion)
        assertEquals("Ritika....Job started by thread:pool-1-thread-1", lines[0].trim());
        assertEquals("Ritika....Job completed by thread: pool-1-thread-1", lines[1].trim());
        assertEquals("Mayuri....Job started by thread:pool-1-thread-1",lines[2].trim());
        assertEquals("Mayuri....Job completed by thread: pool-1-thread-1",lines[3].trim());
//        assertEquals("Muskan....Job started by thread:pool-1-thread-1",lines[4].trim());
//        assertEquals("Muskan....Job completed by thread: pool-1-thread-1",lines[5].trim());
//        assertEquals("Himanshu....Job started by thread:pool-1-thread-1",lines[6].trim());
//        assertEquals("Himanshu....Job completed by thread: pool-1-thread-1",lines[7].trim());
//        assertEquals("Vidhya....Job started by thread:pool-1-thread-1",lines[8].trim());
//        assertEquals("Vidhya....Job completed by thread: pool-1-thread-1",lines[9].trim());
//        assertEquals("Rahul....Job started by thread:pool-1-thread-1",lines[10].trim());
//        assertEquals("Rahul....Job completed by thread: pool-1-thread-1",lines[11].trim());
    }
}
