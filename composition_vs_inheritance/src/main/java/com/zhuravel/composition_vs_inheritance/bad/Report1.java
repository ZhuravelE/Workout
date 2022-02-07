package com.zhuravel.composition_vs_inheritance.bad;

public class Report1 extends BaseReport {

    @Override
    void printBody() {
        System.out.println("Print body for report 1");
    }
}
