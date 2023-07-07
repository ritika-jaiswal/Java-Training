package org.example.multithreadingex;


public class SusspendMethpodEx extends Thread {
    public void run() {
        for (int i = 1; i < 5; i++) {
            try {
                sleep(5000);
                System.out.println("Currently running: " + Thread.currentThread().getName());

            } catch (InterruptedException e) {
                // TODO: handle exception
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        SusspendMethpodEx t1 = new SusspendMethpodEx();
        SusspendMethpodEx t2 = new SusspendMethpodEx();
        SusspendMethpodEx t3 = new SusspendMethpodEx();

        t1.start();
        t2.start();

        t2.setName("RIitka");

        t3.start();

    }

}
