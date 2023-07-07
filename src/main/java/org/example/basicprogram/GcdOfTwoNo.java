package org.example.basicprogram;


// Java Program to Find GCD or HCF of 2 numbers
// 36 = 2*2*3*3
// 60 = 2*2*3*5
// GCM = Multiplication of common factor
//  GCM = 2*2*3 = 12
public class GcdOfTwoNo {
    static int gcd(int x, int y) {
        if (y == 0)
            return x;
        return gcd(y, x % y);
    }

    public static void main(String[] args) {
        int n1 = 36, n2 = 60;
        System.out.println("The GCD of " + n1 + " & " + n2 + " is " + gcd(n1, n2));
    }

}
