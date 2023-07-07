package org.example.basicprogram;


public class EvenOrOddNo {
    static String evenOrOdd(int n) {
        if (n % 2 == 0) {
            return (n + " is prime number");
        } else {
            return (n + " is Odd number");
        }
    }

    public static void main(String[] args) {
        int num = 9;
        System.out.println(evenOrOdd(num));
    }

}
