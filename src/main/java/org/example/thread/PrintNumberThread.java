package org.example.thread;

public class PrintNumberThread  extends Thread{
    private  int limit ;
    public PrintNumberThread(int limit){
        this.limit = limit;
    }

    @Override
    public void run(){
        for(int i = 1; i <= limit ; i++){
            System.out.println(i);
        }
    }

//    public static void main(String[] args) {
//        PrintNumberThread printNumberThread = new PrintNumberThread(5);
//        printNumberThread.start();
//    }

}
