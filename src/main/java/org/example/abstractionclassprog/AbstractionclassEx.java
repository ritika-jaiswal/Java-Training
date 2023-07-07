package org.example.abstractionclassprog;

// abstract class Person {
//     abstract void work();
// }

// public class AbstractionclassEx extends Person {
//     void work() {
//         System.out.println("A person can do it many works at same time.");
//     }

//     public static void main(String[] args) {
//         Person obj = new AbstractionclassEx();
//         obj.work();
//     }
// }

abstract class Drawable {
    abstract void draw();
}

class Ractangle extends Drawable {
    public void draw() {
        System.out.println("Drawing Ractangle");
    }
}

class Squre extends Drawable {
    public void draw() {
        System.out.println("Drawing Squre");
    }
}

class AbstractionclassEx {
    public static void main(String[] args) {
        Drawable d = new Squre();
        Drawable d1 = new Ractangle();
        d.draw();
        d1.draw();
    }
}