package org.example.junitpractice;


import org.junit.*;

import static junit.framework.Assert.*;

public class JUnitPracticeExTest {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("before class");
    }
    @Before
    public void setUp() throws Exception {
        System.out.println("before");
    }

    @Test
    public void testFindMax(){
        System.out.println("test case find max");
        assertEquals(1, JUnitPracticeEx.findMin(new int[]{1,3,4,2}));
        assertEquals(-12, JUnitPracticeEx.findMin(new int[]{-12,-3,-4,-2}));
    }
    @Test
    public void testCube(){
        System.out.println("test case cube");
        assertEquals(27, JUnitPracticeEx.cube(3));
    }
    @Test
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
