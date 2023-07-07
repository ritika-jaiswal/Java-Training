package org.example.javafileIoprog;


import java.io.File;
import java.io.IOException;

public class CreateATempFile {
    public static void main(String[] args) throws IOException {

        String prefix = "exampleFile";
        String suffix = ".txt";

        File directoryPath = new File("C:/Users/DELL/Desktop/DSA-Practice/JavaFileIOProg");
        File tempFile = File.createTempFile(prefix, suffix, directoryPath);
        System.out.println("Print file name: " + tempFile);
        tempFile.delete();
        System.out.println("Tempfile is deleted succesfully");
    }

}
