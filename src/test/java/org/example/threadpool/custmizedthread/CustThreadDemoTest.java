package org.example.threadpool.custmizedthread;

import org.junit.Test;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class CustThreadDemoTest {
    @Test
    public void testCustomerThreadUniqueIDs(){
        Set<Integer> customerIds = new HashSet<>();
        CustomerThread c1 = new CustomerThread("Customer thread-1");
        CustomerThread c2 = new CustomerThread("Customer thread-2");
        CustomerThread c3 = new CustomerThread("Customer thread-3");
        CustomerThread c4 = new CustomerThread("Customer thread-4");

        c1.start();
        c2.start();
        c3.start();
        c4.start();

        try {
            // Wait for all threads to complete
            c1.join();
            c2.join();
            c3.join();
            c4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        customerIds.add((Integer) c1.tl.get());
        customerIds.add((Integer) c2.tl.get());
        customerIds.add((Integer) c3.tl.get());
        customerIds.add((Integer) c4.tl.get());
        System.out.println(customerIds.size());

        assertEquals(4, customerIds.size(), "Each thread should have a unique customer ID");
        for (int customerId : customerIds) {
            assertNotEquals(0, customerId, "Customer ID should not be 0");
        }
    }
}
