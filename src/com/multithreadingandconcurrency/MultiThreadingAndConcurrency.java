package com.multithreadingandconcurrency;

import java.sql.SQLOutput;

public class MultiThreadingAndConcurrency{
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName());
        HelloThread helloThread = new HelloThread("Hello Thread");
        Thread thread1 = new Thread(helloThread);
        thread1.start();
        MathThread mathThread = new MathThread();
        Thread thread2 = new Thread(mathThread);
        thread2.start();


    }

}


class HelloThread extends Thread{
    private String threadName;

    public HelloThread(String threadName){
        this.threadName = threadName;
    }

    @Override
    public void run(){
        System.out.println("Hello Thread...");
        System.out.println(Thread.currentThread().getName());
    }
}

class MathThread implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}