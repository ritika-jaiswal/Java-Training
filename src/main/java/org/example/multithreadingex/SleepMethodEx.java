package org.example.multithreadingex;


class SleepMethodEx extends Thread {
    public void run() {
        for (int i = 1; i < 5; i++) {
            // the thread will sleep for the 500 milli seconds
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String args[]) {
        SleepMethodEx t1 = new SleepMethodEx();
        SleepMethodEx t2 = new SleepMethodEx();

        t1.start();
        t2.start();
    }
}
