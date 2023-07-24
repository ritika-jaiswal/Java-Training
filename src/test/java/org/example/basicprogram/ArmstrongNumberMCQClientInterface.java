package org.example.basicprogram;

import org.junit.Test;
import static junit.framework.Assert.*;

public class ArmstrongNumberMCQClientInterface {
    @Test
    public void isArmstrongNumberTest(){
        assertTrue(ArmstrongNumber.isArmstrongNumber(153));
        assertTrue(ArmstrongNumber.isArmstrongNumber(370));
        assertFalse(ArmstrongNumber.isArmstrongNumber(123));
        assertFalse(ArmstrongNumber.isArmstrongNumber(9474));
    }
}
