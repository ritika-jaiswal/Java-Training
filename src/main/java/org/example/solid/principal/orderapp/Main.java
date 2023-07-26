package org.example.solid.principal.orderapp;

public class Main {
    public static void main(String[] args) {
        Order order = new Order(101,"Ritika Jaiswal",2999.23);
        OrderProcessor orderProcessor = new OrderProcessor();
        orderProcessor.processOrder(order);
    }

}
