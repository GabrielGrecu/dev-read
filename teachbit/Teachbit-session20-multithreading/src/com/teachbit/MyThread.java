package com.teachbit;

public class MyThread extends Thread{
    private int counter = 0;

    public int getCounter() {
        return counter;
    }

    public void setCounter(int count) {
        this.counter = count;
    }

    public void increment(){
        this.counter++;
    }

    @Override
    public void run(){
        final String threadName = Thread.currentThread().getName();
        System.out.printf("%s is running and is in running state!%n", threadName);
        while (this.counter < 5){
            this.increment();
            System.out.printf("Counter from %s is %s%n", threadName, this.getCounter());
        }

        System.out.printf("%s finished%n", threadName);
    }


}
