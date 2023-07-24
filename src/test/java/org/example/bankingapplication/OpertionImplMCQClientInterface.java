package org.example.bankingapplication;

import static junit.framework.Assert.*;
import static org.junit.Assert.assertNotEquals;
import org.junit.*;


public class OpertionImplMCQClientInterface {
    private static OpertionImpl operation;

    @BeforeClass
    public static void setup() {
        operation = new OpertionImpl("Ritvika Jaiswal", "839462713343");
    }


    @Test
    public void testDeposit() {
        operation.balance = 0;
        operation.deposit(200);
        assertEquals(200, operation.balance);
        assertEquals(200, operation.previousTransaction);
//        assertEquals(200,operation.balance);
//        assertEquals(200,operation.previousTransaction);
        assertNotEquals(100,operation.balance);

    }

    @Test
    public void testWithdrawalSufficientBalance() {
        operation.balance = 200;
        operation.withdrwal(50);
        assertEquals(150, operation.balance);
        assertEquals(-50, operation.previousTransaction);
//        assertEquals(3000, operation.balance);
//        assertEquals(0, operation.previousTransaction);
        assertNotEquals(0, operation.previousTransaction);
    }

    @Test
    public void testWithdrawalInsufficientBalance() {
        operation.balance = 100;
        operation.withdrwal(200);
        assertEquals(100, operation.balance);
        assertEquals(0, operation.previousTransaction);
//        assertEquals(1010, operation.balance);
//        assertEquals(10, operation.previousTransaction);
        assertNotEquals(1010, operation.balance);
        assertNotEquals(10, operation.previousTransaction);
    }

    @Test
    public void testGetPreviousTransactionNoTransaction() {
        assertEquals("No Transaction Occured",operation.getPriviousTransaction());
        assertNotEquals("NoTransactionOccured",operation.getPriviousTransaction());
    }

    @Test
    public void testGetPreviousTransactionDeposit() {
        operation.previousTransaction = 50;
        assertEquals("Deposited amount: 50",operation.getPriviousTransaction());
        assertNotEquals("Deposited amount: 100",operation.getPriviousTransaction());
    }

    @Test
    public void testGetPreviousTransactionWithdrawal() {
        operation.previousTransaction = -30;
        assertEquals("Withdrwal Amount: -30", operation.getPriviousTransaction());
        assertNotEquals("Withdrwal Amount: -0", operation.getPriviousTransaction());

    }

}
