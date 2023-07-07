package org.example.javafileIoprog;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class CopyContentfromOneToOnatherFile {
    public static void copyContent(File a, File b) throws Exception {
        FileInputStream in = new FileInputStream(a);
        FileOutputStream out = new FileOutputStream(b);

        try {
            int n;
            while ((n = in.read()) != -1) {
                out.write(n);
            }
            System.out.println("The data of file " + a + " is successffully copied in file " + b);
        } finally {
            // TODO: handle exception
            if (in != null)
                in.close();
            if (out != null)
                out.close();
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the source file name from where you have to read/copy: ");
        String a = sc.nextLine();
        File x = new File(a);

        System.out.println("Enter the destination file name where you have to write/paste: ");
        String b = sc.nextLine();
        File y = new File(b);

        copyContent(x, y);
    }

}
