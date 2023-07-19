package org.example.javacoreapi.javautillclasses.collection.list;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.LinkedList;

public class LinkedListUtilsTest {
    private LinkedList<Integer> numbers;

    @Before
    public void setUp() {
        numbers = new LinkedList<>();
        numbers.add(2);
        numbers.add(8);
        numbers.add(5);
        numbers.add(3);
        numbers.add(10);
    }

    @Test
    public void testFindSum() {
        assertEquals(28, LinkedListUtils.findSum(numbers));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindSumEmptyList() {
        LinkedList<Integer> emptyList = new LinkedList<>();
        LinkedListUtils.findSum(emptyList);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindSumNullList() {
        LinkedList<Integer> nullList = null;
        LinkedListUtils.findSum(nullList);
    }

    @Test
    public void testFindAverage() {
        assertEquals(5.6, LinkedListUtils.findAverage(numbers), 0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindAverageEmptyList() {
        LinkedList<Integer> emptyList = new LinkedList<>();
        LinkedListUtils.findAverage(emptyList);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindAverageNullList() {
        LinkedList<Integer> nullList = null;
        LinkedListUtils.findAverage(nullList);
    }
}
