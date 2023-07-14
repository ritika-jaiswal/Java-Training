package org.example.generics;

public class GenericMethodEx1 {
    public static <E> void printArray(E[] elements){
        for(E element: elements){
            System.out.println(element);
        }
        System.out.println();
    }
    public static void main(String args[]){
        Integer[] intArray = {10,21,67,34,54,21};
        Character[] charArray = {'R','I','T','I','K','A'};

        System.out.println("Printing integer Array");
        printArray(intArray);

        System.out.println("Printing Character Array");
        printArray(charArray);
    }}
