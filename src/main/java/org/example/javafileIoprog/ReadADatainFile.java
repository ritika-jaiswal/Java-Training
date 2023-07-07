package org.example.javafileIoprog;


import java.io.File;
import java.util.Scanner;

public class ReadADatainFile {
    public static void main(String[] args) {
        try {
            File file = new File("FileName.txt");
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                // this line is optional you can direct pass it in sysout
                String data = myReader.nextLine();
                System.out.println("The content of the file is : " + data);
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("The file is name is invalid");
        }

    }

}
