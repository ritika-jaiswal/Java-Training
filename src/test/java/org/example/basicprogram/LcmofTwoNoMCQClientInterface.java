package org.example.basicprogram;

import org.junit.Test;
import static junit.framework.Assert.*;

public class LcmofTwoNoMCQClientInterface {
    @Test
    public void lcmOfTwoNoTest(){
        assertEquals(36,LcmofTwoNo.lcmOfTwoNo(12,9,1));
        assertNotSame(30,LcmofTwoNo.lcmOfTwoNo(12,9,1));
    }

}
