package org.example.basicprogram;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotSame;

public class SwapTwoNoTest {
    @Test
    public void swapNoTest(){
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream  = new PrintStream(outputStream);
        PrintStream originalOutput = System.out;
        System.setOut(printStream);

        SwapTwoNo.swapNo(12,23);

        System.out.flush();
        System.setOut(originalOutput);
        String output = outputStream.toString();
        System.out.println(output);
        String expected = "23, 12";
        assertNotSame(expected,output);
        assertEquals(expected, output);

    }
}
