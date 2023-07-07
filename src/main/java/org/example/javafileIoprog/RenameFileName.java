package org.example.javafileIoprog;


import java.io.File;

public class RenameFileName {
    public static void main(String[] args) {
        File file = new File("C:/Users/DELL/Desktop/DSA-Practice/JavaFileIOProg/COmapareToFile.java/");
        File rename = new File("C:/Users/DELL/Desktop/DSA-Practice/JavaFileIOProg/Compare.java/");
        boolean flag = file.renameTo(rename);
        if (flag == true) {
            System.out.println("File successfully renamed!");
        } else {
            System.out.println("Opreation failed");
        }
    }

}
