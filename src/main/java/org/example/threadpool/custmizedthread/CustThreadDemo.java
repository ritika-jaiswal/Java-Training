package org.example.threadpool.custmizedthread;

public class CustThreadDemo {
    public static void main(String[] args) {
        CustomerThread c1 = new CustomerThread("Customer thread -1");
        CustomerThread c2 = new CustomerThread("Customer thread -2");
        CustomerThread c3 = new CustomerThread("Customer thread -3");
        CustomerThread c4 = new CustomerThread("Customer thread -4");

        c1.start();
        c2.start();
        c3.start();
        c4.start();
    }
}
