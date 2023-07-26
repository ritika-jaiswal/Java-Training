package org.example.solid.principal.orderapp;


//the OrderProcessor class is responsible for processing orders and generating receipts.
// If you want to add new functionalities related to order processing,
// you can extend the OrderProcessor class without modifying the existing code.
// This demonstrates the Open/Closed Principle in action.
public class OrderProcessor {
    public  void processOrder(Order order){
        String receipt = generateReceipt(order);
        System.out.println(receipt);
    }

    private  String generateReceipt(Order order){
        StringBuilder receiptBuilder = new StringBuilder();
        receiptBuilder.append("Order Id: ").append(order.getOrderId()).append("\n");
        receiptBuilder.append("Customer Name: ").append(order.getCustomerName()).append("\n");
        receiptBuilder.append("Total Amount: ").append(order.getTotalAmount()).append("\n");
        receiptBuilder.append("Thank you for your order");

        return receiptBuilder.toString();
    }
}
