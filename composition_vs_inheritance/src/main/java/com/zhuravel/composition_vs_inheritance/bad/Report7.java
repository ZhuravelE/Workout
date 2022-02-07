package com.zhuravel.composition_vs_inheritance.bad;

public class Report7 extends BaseReport {

    @Override
    void printHeader() {
        System.out.println("Print header for report 7");
    }

    @Override
    void printBody() {
        System.out.println("Print body for report 7");
    }
}
