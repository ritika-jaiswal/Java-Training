package org.example.javacoreapi.mathrandom;

import java.util.Random;

public class MathRandomExample {
    public static void main(String[] args) {
//        Math class example
        int absoluteValue = Math.abs(-5);
        double squareRoot = Math.sqrt(25);
        double power = Math.pow(3,2);
        int maximum = Math.max(23,56);
        int minimum = Math.min(32,12);
        double randomValue = Math.random();
        long roundedValue = Math.round(21.6);
        double floorValue = Math.floor(4.7);
        double ceilValue = Math.ceil(3.2);

//        Random class example
        Random random = new Random();
        int randomInt = random.nextInt(10);
        double randomDouble = random.nextDouble();
        boolean randomBoolean = random.nextBoolean();

        System.out.println("Math.abs(-5: )" + absoluteValue);
        System.out.println("Math.sqrt(25): " + squareRoot);
        System.out.println("Math.pow(3,2): " + power);
        System.out.println("Math.max(23, 56): " + maximum);
        System.out.println("Math.min(32, 12): " + minimum);
        System.out.println("Math.random(): " + randomValue);
        System.out.println("Math.round(21.6): " + roundedValue);
        System.out.println("Math.floor(4.7): " + floorValue);
        System.out.println("Math.ceil(3.2): " + ceilValue);
        System.out.println("Random.nextInt(10): " + randomInt);
        System.out.println("Random.nextDouble(): " + randomDouble);
        System.out.println("Random.nextBoolean(): " + randomBoolean);
    }
}
