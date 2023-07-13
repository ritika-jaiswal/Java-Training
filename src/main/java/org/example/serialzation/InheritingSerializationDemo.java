package org.example.serialzation;

import java.io.*;

class Animal {
    int i = 10;

    Animal() {
        System.out.println("Animal Construtor is called");
    }
}
class Cow extends Animal implements Serializable{
    int j = 20;
    Cow(){System.out.println("Cow Counstrutor is called");}
        }
public class InheritingSerializationDemo {
    public static void main(String[] args) throws Exception{
        Cow cow = new Cow();
        cow.i = 888;
        cow.j = 999;
   System.out.println(cow.i + "...." + cow.j);

        FileOutputStream fos = new FileOutputStream("FileName.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(cow);

        FileInputStream fis = new FileInputStream("FileName.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Cow cw = (Cow)ois.readObject();

        System.out.println(cw.i + "...." + cw.j);
    }
}
