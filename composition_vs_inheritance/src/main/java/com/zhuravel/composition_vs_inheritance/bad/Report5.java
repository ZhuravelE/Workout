package com.zhuravel.composition_vs_inheritance.bad;

public class Report5 extends BaseReport {

    @Override
    void printBody() {
        System.out.println("Print body for report 5");
    }

    @Override
    void printFooter() {
        System.out.println("Print footer for report 5");
    }
}
