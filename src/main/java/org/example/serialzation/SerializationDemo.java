package org.example.serialzation;

import java.io.*;

public class SerializationDemo {
     public static  void main(String[] args) throws Exception {
         Demo demo = new Demo();

         FileOutputStream fos = new FileOutputStream("FileName.txt");
         ObjectOutputStream oos = new ObjectOutputStream(fos);
         oos.writeObject(demo);

         FileInputStream fis = new FileInputStream("FileName.txt");
         ObjectInputStream ois = new ObjectInputStream(fis);
         Demo demo2 = (Demo) ois.readObject();

         System.out.println("Befor serialiation " + demo.i + "........" + demo.j);
         System.out.println("After Serialization" + demo2.i + "............" + demo.j);
     }

    static class Demo implements Serializable {
        int i = 10;
        int j = 20;

    }
}
