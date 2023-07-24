package org.example.junitpractice;


import org.junit.*;
import org.junit.jupiter.api.Order;

import static junit.framework.Assert.*;

public class JUnitPracticeExMCQClientInterface {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("before class");
    }
    @Before
    public void setUp() throws Exception {
        System.out.println("before");
    }

    @Test
    @Order(2)
    public void testFindMax(){
        System.out.println("test case find max");
        assertEquals(1, JUnitPracticeEx.findMin(new int[]{1,3,4,2}));
        assertEquals(-12, JUnitPracticeEx.findMin(new int[]{-12,-3,-4,-2}));
    }
    @Test
    @Order(1)
    public void testCube(){
        System.out.println("test case cube");
        assertEquals(27, JUnitPracticeEx.cube(3));
    }
    @Test
    @Order(3)
    public void testReverseWord(){
        System.out.println("test case reverse word");
        assertEquals("akitiR", JUnitPracticeEx.reverseString("Ritika"));
    }
    @After
    public void tearDown() throws Exception {
        System.out.println("after");
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println("after class");
    }
}
