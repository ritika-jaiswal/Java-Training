package org.example.threadpool.callablethread;

import java.util.concurrent.Callable;

public class MyCallable implements Callable {
    int num;
    public MyCallable(int num){
        this.num = num;
    }

    public Object call(){
        System.out.println(Thread.currentThread().getName()+ " is....responsible to find sum of first " + num + " numbers");
        int sum = 0;
        for(int i =1 ; i<=num; i++){
            sum += i;
        }
        return sum;
    };
}
