package org.example.threadpool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyCallableTest {
    @Test
    public void testSumCalculation(){
        MyCallable callable = new MyCallable(10);
        int expectedOutPut = 55;
        int result = (int)callable.call();
        assertEquals(expectedOutPut,result);
    }
}
