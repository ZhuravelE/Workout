package com.zhuravel.lambda.habr;

public class LambdaWithoutParameters {

    public static void main(String[] args) {
//        MyInterface myInterface2 = new MyInterface();  //Ошибка!

        MyInterface myInterface = () -> 3.1415;

        System.out.println(myInterface.getPiValue());
    }

    @FunctionalInterface
    interface MyInterface {
        double getPiValue();
    }
}
