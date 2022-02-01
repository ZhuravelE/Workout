package com.zhuravel.multythreading.isalive;

public class IsTheadAlive extends Thread {
//    boolean isAlive() — возвращает true, если myThread() выполняется, и false — если поток еще не был запущен или был завершен.

    @Override
    public void run() {
        try {
            Thread.sleep(500);
            System.out.println("Is thread alive in run() method " + Thread.currentThread().isAlive());
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        IsTheadAlive alive = new IsTheadAlive();

        System.out.println("Is thread alive before start() call: " + alive.isAlive());

        alive.start();

        System.out.println("Is thread alive after start() call: " + alive.isAlive());
    }
}
