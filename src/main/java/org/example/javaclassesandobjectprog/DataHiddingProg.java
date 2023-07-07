package org.example.javaclassesandobjectprog;

abstract class Creature {
    abstract void no_Of_Legs();
}

class Elephant extends Creature {
    void no_Of_Legs() {
        System.out.println("It has Four legs");
    }
}

class Human extends Creature {
    void no_Of_Legs() {
        System.out.println("It has two legs");
    }
}

public class DataHiddingProg {
    public static void main(String[] args) {
        Elephant elephant = new Elephant();
        elephant.no_Of_Legs();

        Human human = new Human();
        human.no_Of_Legs();

    }

}

