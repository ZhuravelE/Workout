package com.zhuravel.multythreading.setname;

public class SetNameExample extends Thread {

    @Override
    public void run() {
        System.out.println("running...");
    }

    public static void main(String[] args) {
        SetNameExample t1 = new SetNameExample();
        SetNameExample t2 = new SetNameExample();

        t1.start();
        t2.start();

        System.out.println("Before changing name of t1: " + t1.getName());
        System.out.println("Before changing name of t2: " + t2.getName());

        t1.setName("Sonoo Jaiswal");
        t2.setName("Javapoint");

        System.out.println("After changing name of t1: " + t1.getName());
        System.out.println("After changing name of t2: " + t2.getName());
    }
}
