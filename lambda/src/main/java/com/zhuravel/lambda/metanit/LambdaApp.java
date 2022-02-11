package com.zhuravel.lambda.metanit;

public class LambdaApp {

    public static void main(String[] args) {
        varOne();
    }

    private static void varOne() {
        Operationable operation;
        operation = (x, y) -> x + y;

        int result = operation.calculate(10, 20);
        System.out.println(result);
    }

    private static void varTwo() {
        Operationable op = new Operationable() {
            @Override
            public int calculate(int x, int y) {
                return x + y;
            }
        };

        int z = op.calculate(20, 10);
        System.out.println(z);
    }
}

interface Operationable {

    int calculate(int x, int y);
}
