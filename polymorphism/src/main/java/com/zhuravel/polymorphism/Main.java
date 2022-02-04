package com.zhuravel.polymorphism;

/**
 * Created by Евгений on 20.11.2016.
 */
public class Main {

    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.version + " " + a.testMethod());
    }
}

class A {
    String version = "1.0A";
    String testMethod() {
        return version + "-A";
    }
}

class B extends A {
    String version = "1.0B";
    String testMethod() {
        return version + "-B";
    }
}