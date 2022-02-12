package com.zhuravel.lambda.metanit;

public class LambdaApp {

    public static void main(String[] args) {
        withoutLambda();
        withLambdaOne();
        withTerminalLambda();
    }

    private static void withoutLambda() {
        Operationable op = new Operationable() {
            @Override
            public int calculate(int x, int y) {
                return x + y;
            }
        };

        int z = op.calculate(20, 10);
        System.out.println(z);
    }

    private static void withLambdaOne() {
        Operationable operation;
        operation = (x, y) -> x + y;

        int result = operation.calculate(10, 20);
        System.out.println(result);
    }

    private static void withTerminalLambda() {
        Printable printer = s -> System.out.println(s);

        printer.print("Hello java!");
    }

    interface Operationable {
        int calculate(int x, int y);
    }

    interface Printable {
        void print(String s);
    }
}
