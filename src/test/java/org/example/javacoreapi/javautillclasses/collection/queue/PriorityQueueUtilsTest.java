package org.example.javacoreapi.javautillclasses.collection.queue;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.PriorityQueue;

public class PriorityQueueUtilsTest {
    private PriorityQueue<Integer> numbers;

    @Before
    public void setUp() {
        numbers = new PriorityQueue<>();
        numbers.add(2);
        numbers.add(8);
        numbers.add(5);
        numbers.add(3);
        numbers.add(10);
    }

    @Test
    public void testFindMax() {
        assertEquals(10, PriorityQueueUtils.findMax(numbers));
    }

    @Test
    public void testFindMin() {
        assertEquals(2, PriorityQueueUtils.findMin(numbers));
    }
}
