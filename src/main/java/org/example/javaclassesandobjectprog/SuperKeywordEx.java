package org.example.javaclassesandobjectprog;


class Vahicale {
    int maxSpeed = 130;
}

class Car extends Vahicale {
    int maxSpeed = 180;

    void diaplay() {
        System.out.println("Maxspeed: " + super.maxSpeed);
    }
}

public class SuperKeywordEx {
    public static void main(String[] args) {
        Car car = new Car();
        car.diaplay();
    }
}

// Java program to show use of super with methods
// superclass Person
// class Person {
//     void message() {
//         System.out.println("This is person class\n");
//     }
// }

// // Subclass Student
// class Student extends Person {
//     void message() {
//         System.out.println("This is student class");
//     }

//     // Note that display() is
//     // only in Student class
//     void display() {
//         // will invoke or call current
//         // class message() method
//         message();

//         // will invoke or call parent
//         // class message() method
//         super.message();
//     }
// }

// // Driver Program
// class SuperKeywordEx {
//     public static void main(String args[]) {
//         Student s = new Student();

//         // calling display() of Student
//         s.display();
//     }
// }

// Java Code to show use of
// super keyword with constructor

// superclass Person
// class Person {
//     Person() {
//         System.out.println("Person class Constructor");
//     }
// }

// // subclass Student extending the Person class
// class Student extends Person {
//     Student() {
//         // invoke or call parent class constructor
//         super();

//         System.out.println("Student class Constructor");
//     }
// }

// // Driver Program
// class SuperKeywordEx {
//     public static void main(String[] args) {
//         Student s = new Student();
//     }
// }

