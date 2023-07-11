package org.example.practice.program;

import org.junit.Test;
import static  junit.framework.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class AnagramStringTest {
    @Test
    public void isAnagramTest(){
        ByteArrayOutputStream outputStream  = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        PrintStream originalOutput = System.out;
        System.setOut(printStream);

        AnagramString.isAnagram("abcd", "bcda");
        System.out.flush();
        System.setOut(originalOutput);

        String output = outputStream.toString();
        String expected = "abcd and bcda are anagrams";
        System.out.println(output.length());
        System.out.println(expected.length());

        assertEquals(expected,output);
        assertNotSame(expected,output);
    }
}
