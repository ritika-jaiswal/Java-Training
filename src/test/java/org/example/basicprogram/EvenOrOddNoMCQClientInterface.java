package org.example.basicprogram;

import org.junit.Test;
import static junit.framework.Assert.*;
public class EvenOrOddNoMCQClientInterface {
    @Test
    public void evenOrOddTest(){
        assertEquals("6 is prime number",EvenOrOddNo.evenOrOdd(6));
        assertEquals("5 is Odd number",EvenOrOddNo.evenOrOdd(5));
    }
}
