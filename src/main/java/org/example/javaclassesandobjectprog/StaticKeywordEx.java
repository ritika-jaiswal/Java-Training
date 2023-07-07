package org.example.javaclassesandobjectprog;


// Java program to demonstrate that a static member
// can be accessed before instantiating a class

// class Test {
//     static void mi() {
//         System.out.println("Static method");
//     }

//     public static void main(String[] args) {
//         mi();
//     }

// }


// Java program to demonstrate use of static blocks
// class StaticKeywordEx {
//     static int a = 10;
//     static int b;

//     static {
//         System.out.println("Static void initilized");
//     }

//     public static void main(String[] args) {
//         System.out.println("from main");
//         System.out.println("Value of a:" + a);
//         System.out.println("Vlaue of b: " + b);
//     }
// }



// Java program to demonstrate execution
// of static blocks and variables

class StaticKeywordEx {
    static int a = m1();

    static {
        System.out.println("Inside static block");
    }

    static int m1() {
        System.out.println("from m1");
        return 20;
    }

    public static void main(String[] args) {
        System.out.println("Value of a: " + a);
        System.out.println("From main");
    }
}
