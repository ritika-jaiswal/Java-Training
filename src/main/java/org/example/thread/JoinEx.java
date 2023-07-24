package org.example.thread;

public class JoinEx {
    public static void main(String[] args) {
        Thread workerThread = new Thread(() -> {
            try{
                Thread.sleep(5000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Worker thread completed its task");
        });
        workerThread.start();

        try{
            System.out.println("Main thread is waitning for the worker thread to completed");
            workerThread.join();
            System.out.println("Main thread resume execution after worker thread completes");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
