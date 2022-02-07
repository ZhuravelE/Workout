package com.zhuravel.composition_vs_inheritance.bad;

public class Report6 extends BaseReport {

    @Override
    void printBody() {
        System.out.println("Print body for report 6");
    }

    @Override
    void printFooter() {
        super.printFooter();
        printAppendix();
    }

    void printAppendix() {
        System.out.println("Print appendix for report 6");
    }
}
