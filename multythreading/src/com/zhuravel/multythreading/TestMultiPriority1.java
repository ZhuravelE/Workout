package com.zhuravel.multythreading;

public class TestMultiPriority1 extends Thread {

    @Override
    public void run() {
        System.out.println("running thread name is: " + Thread.currentThread().getName());
        System.out.println("running thread priority is: " + Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        TestMultiPriority1 m0 = new TestMultiPriority1();
        TestMultiPriority1 m1 = new TestMultiPriority1();

        m0.setPriority(Thread.MIN_PRIORITY);
        m1.setPriority(Thread.MAX_PRIORITY);

        m0.start();
        m1.start();
    }
}
