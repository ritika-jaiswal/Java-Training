package org.example.basicprogram;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.Assert.assertEquals;

public class PrintAllPrimeNoUptoNTest {
    @Test
    public void primeNoTest(){
        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            PrintStream printStream = new PrintStream(outputStream);
            PrintStream originalOutput = System.out;
            System.setOut(printStream);

            PrintAllPrimeNoUptoN.primeNo(10);

            System.out.flush();
            System.setOut(originalOutput);
            String output = outputStream.toString();
            System.out.println(output);
            String expextedOutput = "2,3,5,7";
            assertEquals(expextedOutput, "" + output);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
