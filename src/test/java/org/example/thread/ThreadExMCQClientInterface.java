package org.example.thread;

import org.junit.Test;
import static org.junit.Assert.*;

public class ThreadExMCQClientInterface {
    @Test
    public void testThread(){
        ThreadEx threadEx = new ThreadEx();
        Thread thread = new Thread(threadEx);

        thread.start();

        int maxWaitTime = 3000;

        try{
            thread.join(maxWaitTime);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        assertFalse(thread.isAlive());
        assertFalse(threadEx.isRunning());
    }
}
