package org.example.javastringprogram;
public class SwapPairStringprog {
    public static String swapPairStr(String str) {
        char[] swapArr = str.toCharArray();
        for (int i = 0; i < swapArr.length - 1; i += 2) {
            char temp = swapArr[i];
            swapArr[i] = swapArr[i + 1];
            swapArr[i + 1] = temp;
        }
        return new String(swapArr);
    }

    public static void main(String[] args) {
        String str = "Jaiswa";
        System.out.println("Original String: " + str);
        System.out.println("Swap Pai String: " + SwapPairStringprog.swapPairStr(str));
    }
}

