package org.example.calculator;

import org.junit.Test;

import static junit.framework.Assert.*;

//public class CalculatorTest {
//    @Test
//    public void evaluatesExpression() {
//        assertEquals(32,Calculator.findMax(new int[]{12,2,32,8,7}));
//        assertEquals(-1,Calculator.findMax(new int[]{-12,-1,-3,-4,-2}));
//        assertNotSame(3,Calculator.findMax(new int[]{2,1,3,5,8}));
//        assertNotNull(Calculator.findMax(new int[]{2,3,4,5}));

//        assertEquals(5,Calculator.findMin(new int[]{8,9,5,23,12}));
//        assertEquals(-12,Calculator.findMin(new int[]{-12,-1,-3,-4,-2}));
//        assertNotSame(12,Calculator.findMin(new int[]{8,9,5,23,12}));
//        assertNotNull(Calculator.findMin(new int[]{2,3,4,5}));

//    }

//}


import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorMCQClientInterface {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(5, 3);
        assertEquals(2, result);
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(4, 3);
        assertEquals(12, result);
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        int result = calculator.divide(10, 2);
        assertEquals(5, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        Calculator calculator = new Calculator();
        calculator.divide(10, 0);
    }
}
