package com.zhuravel.composition_vs_inheritance.good;

public class Report1 implements Report {

    DefaultHeader header;
    Body body;
    DefaultFooter footer;

    @Override
    public void print() {
        header.print();
        body.print();
        footer.print();
    }
}
