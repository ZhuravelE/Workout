package com.zhuravel.binding.early_static;

public class Main {

    public static void main(String[] args) {
        Insurance current = new CarInsurance();

        System.out.println("Category: " + current.getCategory());
        System.out.println("Category: " + CarInsurance.getCategory());
    }
}
