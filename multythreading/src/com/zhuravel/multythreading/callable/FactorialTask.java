package com.zhuravel.multythreading.callable;

import java.security.InvalidParameterException;
import java.util.concurrent.Callable;

public class FactorialTask implements Callable<Integer> {
    int number;

    public FactorialTask(int number) {
        this.number = number;
    }

    @Override
    public Integer call() throws InvalidParameterException {
        if (number < 0) {
            throw new InvalidParameterException("Number should be positive");
        }

        int fact = 1;
        for (int i = number; i > 1; i--) {
            fact = fact * i;
        }

        return fact;
    }
}
