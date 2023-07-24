package org.example.mcqprograms;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class BitShiftMCQClientInterface {

    @Test
    public void testBitShiftOp() {
//        String expectedOutput = "-2147483648 and  1";

        // Act
//        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
//        PrintStream printStream = new PrintStream(outputStream);
//        System.setOut(printStream);
//        BitShift.bitShiftOp();
//        String actualOutput = outputStream.toString().trim();

        // Assert
//        assertEquals(expectedOutput, actualOutput);
        int x = 0x80000000;
        System.out.print(x + " and  ");
        assertEquals("-2147483648 and  1",  (x + " and  " + BitShift.bitShiftOp(x)));
    }
}
