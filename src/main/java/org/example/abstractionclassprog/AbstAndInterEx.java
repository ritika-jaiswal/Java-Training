package org.example.abstractionclassprog;


interface A {
    void a();

    void b();

    void c();

    void d();
}

abstract class B implements A {
    public void a() {
        System.out.println("I'm a");
    }
}

class C extends B {
    public void b() {
        System.out.println("I'm b");
    }

    public void c() {
        System.out.println("I'm c");
    }

    public void d() {
        System.out.println("I'm d");
    }
}

public class AbstAndInterEx {
    public static void main(String[] args) {
        C obj = new C();
        obj.a();
        obj.b();
        obj.c();
        obj.d();
    }
}
