package org.example.inheritance;


class InheritanceEx {
    float sallery = 40000;

}

class Programmer extends InheritanceEx {
    int bonous = 10000;

    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        System.out.println("Programmer sallery is :" + programmer.sallery);
        System.out.println("Programmer bonous is :" + programmer.bonous);
    }
}

// Single Inheritance Example-
// class Animal {
// void eat() {
// System.out.println("eating");
// }
// }

// class Dog extends Animal {
// void bark() {
// System.out.println("Barking");
// }
// }

// class InheritanceEx {
// public static void main(String[] args) {
// Dog dog = new Dog();
// dog.bark();
// dog.eat();
// }
// }

// Multilevel inheritance example
// class Animal {
// void eat() {
// System.out.println("eating");
// }
// }

// class Dog extends Animal {
// void bark() {
// System.out.println("Barking");
// }
// }

// class BabyDog extends Dog {
// void weep() {
// System.out.println("Weeping..");
// }
// }

// class InheritanceEx {
// public static void main(String[] args) {
// BabyDog babyDog = new BabyDog();
// babyDog.bark();
// babyDog.eat();
// babyDog.weep();
// }
// }

// Hierarchical Inheritance Example

// class Animal {
// void eat() {
// System.out.println("eating");
// }
// }

// class Dog extends Animal {
// void bark() {
// System.out.println("Barking");
// }
// }

// class Cat extends Animal {
// void meow() {
// System.out.println("Meowing..");
// }
// }

// class InheritanceEx {
// public static void main(String[] args) {
// Cat cat = new Cat();
// cat.meow();
// cat.eat();

// }
// }

// Multiple inheritance Example
// class A {
// void name() {
// System.out.println("Ritika");
// }
// }

// class B {
// void name() {
// System.out.println("Jaiswal");
// }
// }

// class Check extends A,B
// {

// public static void main(String[] args) {
// Cheak cheak = new Check();
// cheak.name();
// }
// }