package org.example.javaclassesandobjectprog;


class MyClass {
    int id = 23;
    String name = "ritika";
}

public class CreateClassAndItsObject {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        System.out.println(myClass.id);
        System.out.println(myClass.name);
    }

}