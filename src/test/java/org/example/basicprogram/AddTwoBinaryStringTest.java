package org.example.basicprogram;

import org.junit.Test;
import static junit.framework.Assert.*;
public class AddTwoBinaryStringTest {
    @Test
    public void add_binaryTest(){
        assertEquals("1111",AddTwoBinaryString.add_binary("1011","0100"));
        assertEquals("1000000",AddTwoBinaryString.add_binary("101101","010011"));
    }
}
