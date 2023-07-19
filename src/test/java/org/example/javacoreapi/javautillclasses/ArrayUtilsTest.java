package org.example.javacoreapi.javautillclasses;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class ArrayUtilsTest {
    @Test
    public void testFindMax(){
        int [] numbers = {2,34,32,43,23,4,29};
        assertEquals(43,ArrayUtils.findMax(numbers));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindMaxEmptyArray(){
        int[] num = {};
        ArrayUtils.findMax(num);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindMaxNullArray() {
        int[] numbers = null;
        ArrayUtils.findMax(numbers);
    }

    @Test
    public void testFindMin(){
        int[] number = {21,32,12,3,2,22,34};
        assertEquals(2,ArrayUtils.findMin(number));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindMinEmptyArray(){
        int[] num = {};
        ArrayUtils.findMax(num);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindMinNullArray() {
        int[] numbers = null;
        ArrayUtils.findMin(numbers);
    }

}
