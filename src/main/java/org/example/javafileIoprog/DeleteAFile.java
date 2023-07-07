package org.example.javafileIoprog;


import java.io.File;

public class DeleteAFile extends Thread {
    public static void main(String[] args) {
        try {
            // create a new file
            File file = new File("Sample.txt");
            file.createNewFile();
            System.out.println("Congrats you created a file succesfully! and the file name is : " + file.getName());
            // After creating a file wait for 5 sec after completed the 5 sec the file
            // deleted
            Thread.sleep(5000);
            if (file.delete()) {
                System.out.println("You r successfully deleted the file: " + file.getName());
            } else {
                System.out.println("Fialed to delete the file");
            }

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Something went wrong!");
        }
    }

}
