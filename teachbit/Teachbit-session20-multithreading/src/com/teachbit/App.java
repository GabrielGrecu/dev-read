package com.teachbit;

public class App {
    private static int count = 0;

    public static void setCount(int count) {
        App.count = count;
    }

    public static int getCount() {
        return count;
    }

    public static void main(String[] args) {
        final String threadName = Thread.currentThread().getName();
        System.out.printf("%s started and is in running state!%n", threadName);

        MyThread threadOne = new MyThread();
        MyThread threadTwo = new MyThread();

        threadOne.setName("THREAD ONE");
        threadTwo.setName("THREAD TWO");

        threadOne.start();
        threadTwo.start();

        try{
            threadOne.join();
        } catch (InterruptedException e){
            System.out.printf("%s has been interrupted!%n ", threadOne.getName());
            throw new RuntimeException(e);
        }
        while (App.count < 5){
            App.count++;
            System.out.printf("Counter from %s is %s%n", threadName, App.getCount());
        }

        System.out.printf("%s finished%n", threadName);

        try{
            threadTwo.join();
        } catch (InterruptedException e){
            System.out.printf("%s has been interrupted!%n ", threadTwo.getName());
            throw new RuntimeException(e);
        }
        while (App.count < 5){
            App.count++;
            System.out.printf("Counter from %s is %s%n", threadName, App.getCount());
        }

        System.out.printf("%s finished%n", threadName);

    }
}
