package org.example.javaclassesandobjectprog;


interface In1 {
    final int a = 10;

    void msg();
}

class TestClass implements In1 {
    public void msg() {
        System.out.println("THis is implemention of interface!");
    }
}

public class CreateAInterface {
    public static void main(String[] args) {
        TestClass testClass = new TestClass();
        testClass.msg();
        System.out.println(testClass.a);
    }
}
