package org.example.javaclassesandobjectprog;

abstract class Person {

    abstract void profinfo();
}

class Employee extends Person {
    void profinfo() {
        int id = 236;
        String name = "Ritika";
        int age = 22;

        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Base {
    public static void main(String[] args) {
        Person person = new Employee();
        person.profinfo();

    }

}

