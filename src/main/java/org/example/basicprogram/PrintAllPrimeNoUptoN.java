package org.example.basicprogram;
// Java program to find all the
// prime numbers from 1 to N


public class PrintAllPrimeNoUptoN {
    static void primeNo(int n) {
        int x, y, flag;
        for (x = 1; x <= n; x++) {
            if (x == 1 || x == 0)
                continue;

            flag = 1;

            for (y = 2; y <= x / 2; ++y) {
                if (x % y == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1)
                System.out.println(x + " ");

        }
    }

    public static void main(String[] args) {
        int n = 10;
        primeNo(n);
    }

}
