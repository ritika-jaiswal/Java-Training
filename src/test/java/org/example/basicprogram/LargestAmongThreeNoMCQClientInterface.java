package org.example.basicprogram;

import org.junit.Test;
import static junit.framework.Assert.*;
public class LargestAmongThreeNoMCQClientInterface {
    @Test
    public void largestAmongThreeNoTest(){
        assertEquals(56,LargestAmongThreeNo.largestAmongThreeNo(32,56,20));
        assertNotSame(20,LargestAmongThreeNo.largestAmongThreeNo(12,23,20));
    }
}
