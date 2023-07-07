package org.example.javafileIoprog;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PrintStringOfGivenPattern {
    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new FileReader("CopyFile.txt"));
        Pattern pattern = Pattern.compile("[A-Za-z][a-z]+");
        // Pattern pattern = Pattern.compile("23");
        System.out.println("Matched Pattern: ");
        String line;
        while ((line = read.readLine()) != null) {
            Matcher match = pattern.matcher(line);
            while (match.find()) {
                int start = match.start(0);
                int end = match.end(0);

                System.out.print(line.substring(start, end));
            }
        }

    }

}
