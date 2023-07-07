package org.example.javafileIoprog;


import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

public class CreateANewFile {
    public static void main(String[] args) {
        CreateANewFile createANewFile = new CreateANewFile();
        createANewFile.newFile();
    }

    public void newFile() {
        String strPath = "", strName = "";
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter file name: ");
            strName = br.readLine();
            System.out.println("Enter file path: ");
            strPath = br.readLine();

            File file1 = new File(strPath + "" + strName + "");
            file1.createNewFile();
            System.out.println("Your file is created!");
        } catch (Exception ex1) {

        }

    }

}
