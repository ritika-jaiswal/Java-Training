package org.example.basicprogram;

import org.junit.Test;
import static junit.framework.Assert.*;

public class FactorialMCQClientInterface {
    @Test
    public void testFactorial(){
        assertEquals(6,Factorial.findFactorial(3));
        assertEquals(24,Factorial.findFactorial(4));
    }
}
