package org.example.module2.lesson10;

public class Example3 {
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();

        myThread1.start();
        myThread2.start();

        System.out.println("Thread name: " + Thread.currentThread().getName());
    }
}
