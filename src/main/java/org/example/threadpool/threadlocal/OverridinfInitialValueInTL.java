package org.example.threadpool.threadlocal;

public class OverridinfInitialValueInTL {
    public static void main(String[] args) {
        ThreadLocal tl = new ThreadLocal()
        {
            public Object initialValue()
        {
            return " Ritzz";
        }
        };
        System.out.println(tl.get());
        tl.set("Ritika");
        System.out.println(tl.get());
        tl.remove();
        System.out.println(tl.get());
    }
}

