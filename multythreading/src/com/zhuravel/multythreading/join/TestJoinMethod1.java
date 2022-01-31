package com.zhuravel.multythreading.join;

public class TestJoinMethod1 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            System.out.println(Thread.currentThread().getName() + "-" + i);
        }
    }

    public static void main(String[] args) {
        TestJoinMethod1 t0 = new TestJoinMethod1();
        TestJoinMethod1 t1 = new TestJoinMethod1();
        TestJoinMethod1 t2 = new TestJoinMethod1();

        t0.start();
        try {
            t0.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        t1.start();
        t2.start();
    }
}
