package org.example.basicprogram;

// Java Program to Find LCM of 2 numbers
// Smallest no that divides both
// 15 = 3*5
// 25 = 5*5
// LCM = 5*5*3 = 75
public class LcmofTwoNo {
    static int lcmOfTwoNo(int x, int y, int gcd) {
        for (int i = 1; i <= x && i <= y; i++) {
            if (x % i == 0 && y % i == 0)
                gcd = i;
        }
        int lcm = (x * y) / gcd;
        return lcm;
    }

    public static void main(String[] args) {
        int n1 = 12, n2 = 9, gcd = 1;
        System.out.println("The LCM of " + n1 + " & " + n2 + " is " + lcmOfTwoNo(n1, n2, gcd));
    }

}

