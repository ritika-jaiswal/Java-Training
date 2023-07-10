package org.example.basicprogram;

import org.junit.Test;
import static junit.framework.Assert.*;
public class GcdOfTwoNoTest {
    @Test
    public void gcdTest(){
        assertEquals(12,GcdOfTwoNo.gcd(36,60));
        assertEquals(30,GcdOfTwoNo.gcd(30,60));
        assertNotSame(12,GcdOfTwoNo.gcd(23,12));
    }
}
