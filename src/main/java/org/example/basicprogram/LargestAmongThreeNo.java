package org.example.basicprogram;

// Java Program to Find Largest Among 3 Numbers
public class LargestAmongThreeNo {
    static int largestAmongThreeNo(int num1, int num2, int num3) {
        return num3 > (num1 > num2 ? num1 : num2) ? num3 : ((num1 > num2) ? num1 : num2);

        // Smallest no.
        // return num3 < (num1 < num2 ? num1 : num2) ? num3 : ((num1 < num2) ? num1 :
        // num2);
    }

    public static void main(String[] args) {
        int n1, n2, n3;
        int largest;
        n1 = 121;
        n2 = 132;
        n3 = 16;
        largest = (largestAmongThreeNo(n1, n2, n3));
        System.out.println("The lagest number this three numbaers is: " + largest);
    }
}

