package org.example.javamethodprogram;

class Helpers {
    public static int sum(int a, int b) {
        return a + b;
    }
}

public class StaticMethodEx {

    public static void main(String[] args) {
        int ans = Helpers.sum(3, 8);
        System.out.println("sum: " + ans);
    }

}
