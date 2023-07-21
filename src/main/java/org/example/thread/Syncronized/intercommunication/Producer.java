package org.example.thread.Syncronized.intercommunication;


public class Producer extends Thread {
    Company c;

    Producer(Company c) {
        this.c = c;
    }

    public void run() {
        int i = 1;
        while (i <= 20) {
            try {
                this.c.Produce_item(i);
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
            ;
            i++;
        }

    }

}
