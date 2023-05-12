package com.multithreadingandconcurrency;

public class NumberPrinter implements Runnable{
    private int numberToPrint;

    public NumberPrinter(int numberToPrint){
        this.numberToPrint = numberToPrint;
    }
    @Override
    public void run() {
        System.out.println(this.numberToPrint+" printed by Thread"+Thread.currentThread().getName());
    }
}
