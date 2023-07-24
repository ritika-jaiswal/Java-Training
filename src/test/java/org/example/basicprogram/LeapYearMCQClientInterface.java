package org.example.basicprogram;

import org.junit.Test;
import static junit.framework.Assert.*;

public class LeapYearMCQClientInterface {
    @Test
    public void leapyearOrNotTest(){
        assertTrue(LeapYear.leapyearOrNot(2012));
        assertFalse(LeapYear.leapyearOrNot(2011));
    }
}
