package com.zhuravel.lambda.metanit;

public class LambdaGeneralized {

    public static void main(String[] args) {
        withLambdaOne();
    }

    private static void withLambdaOne() {
        Operationable<Integer> operationInteger = (x, y) -> x + y;
        Operationable<String> operationString = (x, y) -> x + y;

        System.out.println(operationInteger.calculate(10, 20)); //30
        System.out.println(operationString.calculate("10", "20"));  //1020
    }

    interface Operationable<T> {
        T calculate(T x, T y);
    }
}
