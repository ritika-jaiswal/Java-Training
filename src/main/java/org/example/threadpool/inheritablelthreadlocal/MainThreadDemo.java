package org.example.threadpool.inheritablelthreadlocal;

public class MainThreadDemo{
    public static void main(String[] args) {
        ParentThread pt = new ParentThread();
        pt.start();
    }
}
