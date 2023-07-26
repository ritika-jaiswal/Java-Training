package org.example.threadpool.inheritablelthreadlocal;

public class ChildThread extends Thread{
    public void run(){
        System.out.println("Child thrad value: " + ParentThread.tl.get());
    }

    }
