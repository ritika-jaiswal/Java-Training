package org.example.serialzation;

import java.io.*;

class Dog implements Serializable{
    Cat cat = new Cat();
}
class Cat implements Serializable{
    Rat rat = new Rat();
}
class Rat implements Serializable{
    String name = "Ritika";
}
public class GraphSerializationEx {
    public static void main(String[] args) throws  Exception{
//Whenever we are serilaizing Dog Object automatically Cat and Rat Objects will
// be Serialized becuz this are part of Object Graph of Dog Object.
//Among, Dog, Cat and Rat if at least One Object is not serializable then we will get Runtime Excepetion Saying NotSerializableException.
        Dog dog = new Dog();

        FileOutputStream fos  = new FileOutputStream("FileName.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(dog);

        FileInputStream fis = new FileInputStream("FileName.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Dog d2 = (Dog)ois.readObject();

        System.out.println(d2.cat.rat.name);
    }
}
