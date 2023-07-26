package org.example.threadpool.inheritablelthreadlocal;

public class ParentThread extends Thread{
    public static InheritableThreadLocal tl = new InheritableThreadLocal();
//    Override the childValue method to rename the child thread value
//    {
//        public Object childValue(Object p)
//        {
//            return "CC";
//        }
//    };
    public void run(){
        tl.set("PP");
        System.out.println("Parent thread value: "+ tl.get());
        ChildThread ct = new ChildThread();
        ct.start();
    }


}
