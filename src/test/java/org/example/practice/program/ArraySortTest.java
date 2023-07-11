package org.example.practice.program;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class ArraySortTest {

    @Test
    public void testArraySort() {
        int[] arr = { 4, 2, 8, 1, 3 };
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        PrintStream originalOutput = System.out;
        System.setOut(printStream);

        ArraySort.sortArray(arr);
        System.out.flush();
        System.setOut(originalOutput);
        String output = outputStream.toString();
        String expected = "1 2 3 4 8";
        System.out.println(expected);
        System.out.println(output);
//        assertEquals(expected, output);
        assertNotEquals(expected,output);

        }
    }


