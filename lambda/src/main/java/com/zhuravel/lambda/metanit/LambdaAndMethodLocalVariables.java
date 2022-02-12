package com.zhuravel.lambda.metanit;

public class LambdaAndMethodLocalVariables {

    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        Operation operation = () -> {
            //x = 30; Ошибка!
            return x + y;
        };

        //x = 100;  //Ошибка! Переменные используемые в лямбде должны быть final / effectively final

        System.out.println(operation.calculate()); //50
        System.out.println(x);  //30 - значение х изменилось
    }

    interface Operation {
        int calculate();
    }
}
