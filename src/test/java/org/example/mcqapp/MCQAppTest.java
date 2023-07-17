package org.example.mcqapp;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import static org.junit.Assert.*;

public class MCQAppTest {
    @Test
    public void testMCQApp() {
        String input = "D\nC\nB\nD\nD\nD\nD\nB\nA\nA\n";
//        String input = "A\nC\nB\nD\nD\nD\nD\nB\nA\nA\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        int expectedTotalCorrectAnswers = 9;
        int totalCorrectAnswers = MCQApp.runMCQApp();

//        assertEquals(expectedTotalCorrectAnswers, totalCorrectAnswers);
        assertNotEquals(expectedTotalCorrectAnswers, totalCorrectAnswers);
    }
}
