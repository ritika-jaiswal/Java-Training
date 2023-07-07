package org.example.interfaceprog;

 interface employee {
     void sallary();
 }

 public class InterfaceEx implements employee {
     public void sallary() {
         System.out.println("The sallary of each employee is : 40000 rupees per month.");
     }

     public static void main(String[] args) {
         InterfaceEx interfaceEx = new InterfaceEx();
         interfaceEx.sallary();
     }
 }

 interface Drawable {
 void draw();
 }

 class Ractangle implements Drawable {
 public void draw() {
 System.out.println("Drawing Ractangle");
 }
 }

 class Squre implements Drawable {
 public void draw() {
 System.out.println("Drawing Squre");
 }
 }

 class interfaceEx {
 public static void main(String[] args) {
 Drawable d = new Squre();
 Drawable d1 = new Ractangle();
 d.draw();
 d1.draw();
 }
 }