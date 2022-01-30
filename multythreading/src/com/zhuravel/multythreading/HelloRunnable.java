package com.zhuravel.multythreading;

public class HelloRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello from a runnable!");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new HelloRunnable());
        thread.start();
    }
}
