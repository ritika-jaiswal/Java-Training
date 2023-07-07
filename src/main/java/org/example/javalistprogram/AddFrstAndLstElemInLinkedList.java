package org.example.javalistprogram;


import java.util.LinkedList;

public class AddFrstAndLstElemInLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(23);
        linkedList.add(45);
        linkedList.add(67);
        linkedList.add(80);
        System.out.println("Original List: " + linkedList);
        linkedList.addFirst(20);
        linkedList.addLast(100);
        System.out.println("list after adding first and last element: " + linkedList);

    }

}
