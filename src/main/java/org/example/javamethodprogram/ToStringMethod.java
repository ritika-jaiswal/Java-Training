package org.example.javamethodprogram;


// public class ToStringMethod {
//     public static void main(String[] args) {
//         StringBuilder str = new StringBuilder("RitikaJaiswal");
//         System.out.println(str.toString());

//     }

// }

public class ToStringMethod {
    public static void main(String[] args) {
        String[] str = { "Hii", "I", "am", "Ritika", "Jaiswal" };

        StringBuilder stb = new StringBuilder();
        // stb.append(str[0]);
        // stb.append(" " + str[1]);
        // stb.append(" " + str[2]);
        // stb.append(" " + str[3]);
        // stb.append(" " + str[4]);
        for (String value : str) {
            stb.append(value + " ");
        }
        String string = stb.toString();
        System.out.println("The STring of array is converted in single string : " + string);

    }
}
