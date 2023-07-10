package org.example.calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static junit.framework.Assert.*;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThat;


public class AllAssertTypeExTest {
    @Before
    public void setUp() {
        System.out.println("Practice all the types of asserts");
    }
//assertEqulas
    @Test
    public void whenAssertingEquality_thenEqual(){
        String expected = "Ritika";
        String actual = "Ritika";
        assertEquals(expected,actual);
        assertEquals("failure - strings are not equal", expected, actual);
    }
//assertArrayEqulas
    @Test
    public void whenAssertingArraysEquality_thenEqual(){
        char[] expected = {'R','i','t','i','k','a'};
        char[] actual = "Ritika".toCharArray();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void givenNullArrays_whenAssertingArraysEquality_thenEqual() {
        int[] expected = null;
        int[] actual = null;
        assertArrayEquals(expected, actual);
    }
//assertNotNull and assertNull
    @Test
    public void whenAssertingNull_thenTrue(){
        Object car = null;
        assertNull(car);
    }

    @Test
    public void whenAssertingNotNull_thenTrue(){
        Object car = "debfejbj";
        assertNotNull(car);
    }

//    assertNotSame and assertSame
    @Test
    public void whenAssertingNotSameObject_thenDifferent(){
        Object cat = new Object();
        Object dog = new Object();
        assertNotSame(cat, dog);
        assertSame(cat,cat);
    }
    @Test
    public void whenAssertingSameObject_thenSame(){
        Object cat = new Object();
        assertSame(cat,cat);
    }

//    assertTrue and assertFalse
    @Test
    public void whenAssertingConditions_thenVerified() {
    assertTrue("5 is greater then 4", 5 > 4);
    assertFalse("5 is not greater then 6", 5 > 6);
    }

//    @Test
//    public void whenCheckingExceptionMessage_thenEqual() {
//        try {
//            methodThatShouldThrowException();
//            fail("Exception not thrown");
//        } catch (UnsupportedOperationException e) {
//            assertEquals("Operation Not Supported", e.getMessage());
//        }
//    }
//    private void methodThatShouldThrowException() {
////       String s = null;
//       System.out.println("kndw");
//    }

//    assertThat
    @Test
    public void testAssertThatHasItems(){
        assertThat(
                Arrays.asList("C","Java","C++","C#"),
                hasItems("Java","C")
        );
    }
}
