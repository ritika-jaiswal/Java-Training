package org.example.thread;

public class ThreadEx implements Runnable {
    private boolean isRunning = false;
    @Override
    public void run() {
        isRunning = true;
        System.out.println("Thread is running..");
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        isRunning = false;
    }

    public boolean isRunning(){
        return isRunning;
    }
}
