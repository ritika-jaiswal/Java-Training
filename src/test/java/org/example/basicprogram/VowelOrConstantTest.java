package org.example.basicprogram;

import org.junit.Test;
import static junit.framework.Assert.*;

public class VowelOrConstantTest {
    @Test
    public void isVowelTest(){
        assertEquals( "a is a vowel", VowelOrConstant.isVowel('a'));
        assertEquals("h is a vowel", VowelOrConstant.isVowel('h'));
        assertEquals("h is a vowel", VowelOrConstant.isVowel('h'));
    }

}
