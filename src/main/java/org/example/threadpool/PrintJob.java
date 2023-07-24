package org.example.threadpool;

public class PrintJob implements Runnable{
    String name;
    PrintJob(String name){
        this.name = name;
    }

    public void run(){
        System.out.println(name + "....Job started by thread:" + Thread.currentThread().getName());
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(name + "....Job completed by thread: " + Thread.currentThread().getName());
    }
}
