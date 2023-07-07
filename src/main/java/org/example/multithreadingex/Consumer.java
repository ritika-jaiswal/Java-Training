package org.example.multithreadingex;

public class Consumer extends Thread {
    Company c;

    Consumer(Company c) {
        this.c = c;
    }

    public void run() {
        int j = 1;
        while (j <= 20) {
            try {
                this.c.Consume_item();
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
            j++;
        }

    }

}

