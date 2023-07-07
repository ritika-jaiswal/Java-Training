package org.example.multithreadingex;

public class IsLiveMethodEx extends Thread {
    public void run() {
        System.out.println("Ritika");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO: handle exception

        }
        System.out.println("Internal Exception : ");
    }

    public static void main(String[] args) {
        IsLiveMethodEx t1 = new IsLiveMethodEx();
        IsLiveMethodEx t2 = new IsLiveMethodEx();

        t1.start();
        System.out.println("Start thread");
        t2.start();
        System.out.println(t1.isAlive());
        System.out.println(t2.isAlive());

    }

}
