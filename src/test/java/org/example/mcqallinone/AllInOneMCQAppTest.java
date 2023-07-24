package org.example.mcqallinone;

import org.example.mcqallinone.AllInOneMCQApp;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import static org.junit.Assert.*;

public class AllInOneMCQAppTest {
    @Test
    public void testMCQApp() {
        String input = "D\nC\nB\nD\nD\nD\nD\nB\nA\nA\n";
//        String input = "A\nC\nB\nD\nD\nD\nD\nB\nA\nA\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        int expectedTotalCorrectAnswers = 9;
        int totalCorrectAnswers = AllInOneMCQApp.runMCQApp();

//        assertEquals(expectedTotalCorrectAnswers, totalCorrectAnswers);
        assertNotEquals(expectedTotalCorrectAnswers, totalCorrectAnswers);
    }
}
