package com.zhuravel.lambda.habr;

public class LambdaWithGeneric {

    public static void main(String[] args) {
        GenericInterface<String> reverser = str -> {
            StringBuilder result = new StringBuilder();
            for (int i = str.length()-1; i >= 0; i--) {
                result.append(str.charAt(i));
            }
            return result.toString();
        };
        System.out.println("Reversed string: " + reverser.func("Lambda"));

        GenericInterface<Integer> factorial = n -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result = i * result;
            }
            return result;
        };
        int number = 5;
        System.out.println("Factorial of " + number + " is " + factorial.func(number));
    }

    @FunctionalInterface
    interface GenericInterface<T> {
        T func(T s);
    }
}
