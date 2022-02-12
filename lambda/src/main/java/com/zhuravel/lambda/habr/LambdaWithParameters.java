package com.zhuravel.lambda.habr;

public class LambdaWithParameters {

    public static void main(String[] args) {
        Reverser reverser = (str) -> {
            StringBuilder result = new StringBuilder();
            for (int i = str.length()-1; i >= 0; i--) {
                result.append(str.charAt(i));
            }
            return result.toString();
        };

        System.out.println(reverser.reverse("Lambda"));
    }

    @FunctionalInterface
    interface Reverser {
        String reverse(String s);
    }
}
