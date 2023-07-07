package org.example.javafileIoprog;


import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class WriteAContentInFile {
    public static void main(String[] args) {
        try {
            // Create a new file
            File file = new File("FileName.txt");
            if (file.createNewFile()) {
                System.out.println("file name is: " + file.getName());
            } else {
                System.out.println("Filename is already exists");
            }
            // write a content in file
            FileWriter myWriter = new FileWriter("FileName.txt");
            myWriter.write("I created my first my file and write somthing!");
            myWriter.append("And also read the file data.");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");

            // Read a file data.
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println("The file data is: " + data);
            }
            myReader.close();

        } catch (Exception e) {
            // TODO: handle exception
        }
    }

}
