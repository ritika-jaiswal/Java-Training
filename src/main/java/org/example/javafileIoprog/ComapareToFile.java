package org.example.javafileIoprog;

import java.io.File;
public class ComapareToFile {
    public static void main(String[] args) throws Exception {
        File file1 = new File("FileName.txt");
        File file2 = new File("ThreadDemo.java");
        File file3 = new File("FileName.txt");
        File file4 = new File("CopyFile.txt");
        file3.createNewFile();
        file4.createNewFile();
        if (file1.compareTo(file2) == 0) {
            System.out.println("paths of file1 and file2 is same. ");
        } else {
            System.out.println("paths of file1 and file2 is not same.");
        }
        if (file1.compareTo(file3) == 0) {
            System.out.println("paths of file1 and file3 is same.");
        } else {
            System.out.println("Paths of file1 and file3 is not same.");
        }
    }

}
