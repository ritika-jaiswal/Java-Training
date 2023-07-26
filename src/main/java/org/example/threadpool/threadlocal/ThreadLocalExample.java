package org.example.threadpool.threadlocal;

public class ThreadLocalExample {
    public static ThreadLocal<Integer> threadLocal = new ThreadLocal<>();

    public void setThreadLocalValue(int value){
        threadLocal.set(value);
    }

    public int getThreadLocalValue(){
        return threadLocal.get();
    }

    public void clearThreadLocal(){
        threadLocal.remove();
    }
}
