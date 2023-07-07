package org.example.javalistprogram;

import java.util.ArrayList;
import java.util.List;

public class ConvertStrToComma {
    public static void main(String[] args) {
        List<String> str = new ArrayList<>();
        str.add("I");
        str.add("am");
        str.add("Employee");
        String string = String.join(",", str);
        System.out.println("Original List: " + str);
        System.out.println("Comma seperatate List: " + string);
    }

}