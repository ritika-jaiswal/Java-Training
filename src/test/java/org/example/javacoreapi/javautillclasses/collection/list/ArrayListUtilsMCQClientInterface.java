package org.example.javacoreapi.javautillclasses.collection.list;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListUtilsMCQClientInterface {
    private ArrayList<Integer> numbers;

    @Before
    public void setUp(){
        numbers = new ArrayList<>(Arrays.asList(2, 8, 5, 3, 10));
    }
    @Test
    public void testFindSum(){
        assertEquals(28,ArrayListUtils.findSum(numbers));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindSumEmptyArrayList(){
        ArrayList<Integer> emptyList = new ArrayList<>();
        ArrayListUtils.findSum(emptyList);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindSumNullArrayList(){
        ArrayList<Integer> nullList = null;
        ArrayListUtils.findSum(nullList);
    }

    @Test
    public void testFindAverage() {
        assertEquals(5.6, ArrayListUtils.average(numbers), 0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindAverageEmptyList() {
        ArrayList<Integer> emptyList = new ArrayList<>();
        ArrayListUtils.average(emptyList);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindAverageNullList() {
        ArrayList<Integer> nullList = null;
        ArrayListUtils.average(nullList);
    }
}

