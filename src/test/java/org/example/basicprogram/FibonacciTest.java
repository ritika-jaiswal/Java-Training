package org.example.basicprogram;

import org.junit.Test;
import static junit.framework.Assert.*;
//public class FibonacciTest {
//    @Test
//    public void fibonacci_seriesTest(){
//        assertEquals("0 1 1  2  3 ", Fibonacci.fibonacci_series(5));
//        assertEquals("0 1 1  2  3  5  8  13 ", Fibonacci.fibonacci_series(8));
//
//    }
//}


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class FibonacciTest {

    @Test
    public void testFibonacciSeries() {
        // Redirect System.out to capture the output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        PrintStream originalOut = System.out;
        System.setOut(printStream);

        // Call the method
        Fibonacci.fibonacci_series(10);

        // Reset System.out
        System.out.flush();
        System.setOut(originalOut);

        // Get the captured output
        String output = outputStream.toString();

        // Verify the output matches the expected result
        String expectedOutput = "0 1 1 2 3 5 8 13 21 34";
        assertEquals(expectedOutput, output.trim());
    }
}

