package org.example.javastringprogram;


// Java program to insert a string into another string
// without using any pre-defined method
public class InsertStringIntoOnatherString {
    public static String insertString(String originalString,
                                      String insertedstring,
                                      int index) {
        String newString = new String();
        for (int i = 0; i < originalString.length(); i++) {
            newString += originalString.charAt(i);
            if (i == index) {
                newString += insertedstring;
            }
        }
        return newString;
    }

    public static void main(String[] args) {
        String originalString = "RitikaJaiswal";
        String insertedstring = "Radheshyam";
        int index = 5;

        System.out.println("Original String: "
                + originalString);
        System.out.println("String to be inserted: "
                + insertedstring);
        System.out.println("String to be inserted at index: "
                + index);

        // Insert the String
        System.out.println("Modified String: "
                + insertString(originalString,
                insertedstring,
                index));

    }
}

