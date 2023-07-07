package org.example.javaclassesandobjectprog;


class ThisClass {
    int num = 10;

    public ThisClass() {
        System.out.println("Inside Construtor");
    }

    public ThisClass(int num) {
        this();
        this.num = num;
    }

    void display() {
        show();
        System.out.println("num" + num);

    }

    void show() {
        System.out.println("Inside show method");
    }
}

public class ThisKeywordEX {
    public static void main(String[] args) {
        ThisClass thisClass = new ThisClass(100);
        thisClass.display();
    }

}
