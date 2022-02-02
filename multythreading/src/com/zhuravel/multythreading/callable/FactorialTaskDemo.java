package com.zhuravel.multythreading.callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FactorialTaskDemo {

    public static void main(String[] args) {
        FactorialTask task = new FactorialTask(-5);
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> future = executorService.submit(task);

        try {
            System.out.println("Factorial of " + -5 + " is " + future.get());
        } catch (InterruptedException | ExecutionException e) {
            System.out.println("Error: " + e.getMessage());
        }

        executorService.shutdown();
    }
}
