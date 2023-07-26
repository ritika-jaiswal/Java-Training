package org.example.threadpool.custmizedthread;

public class CustomerThread extends Thread{
    static Integer custId = 0;
    static ThreadLocal tl = new ThreadLocal()
    {
        public Integer initialValue()
        {
            return ++custId;
        }
    };
    CustomerThread(String name){
        super(name);
    }
    public void run(){
        System.out.println(Thread.currentThread().getName() + " creating with customer id : " + tl.get());
    }
}
