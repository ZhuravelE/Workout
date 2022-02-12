package com.zhuravel.lambda.metanit;

public class LambdaAndClassLocalVariables {

    static int x = 10;
    static int y = 20;

    public static void main(String[] args) {
        Operation operation = () -> {
            x = 30;
            return x + y;
        };

        System.out.println(operation.calculate()); //50
        System.out.println(x);  //30 - значение х изменилось
    }

    interface Operation {
        int calculate();
    }
}
