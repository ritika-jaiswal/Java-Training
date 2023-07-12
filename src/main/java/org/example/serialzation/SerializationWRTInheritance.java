package org.example.serialzation;

import java.io.*;

class Employee implements Serializable{
    String name = "Ritika";
}
class Designation extends Employee{
    String designation = "Software Developer";
}
public class SerializationWRTInheritance {
    public static void main(String[] args) throws Exception{
        Designation designation = new Designation();

        FileOutputStream fos = new FileOutputStream("FileName.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(designation);

        FileInputStream fis = new FileInputStream("FileName.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Designation dsgn =(Designation) ois.readObject();

        System.out.println("Employee Name: " + dsgn.name + ", Employee Designation: " + dsgn.designation);
    }
}
