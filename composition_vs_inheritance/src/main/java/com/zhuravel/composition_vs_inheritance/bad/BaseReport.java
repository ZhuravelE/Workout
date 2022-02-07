package com.zhuravel.composition_vs_inheritance.bad;

public abstract class BaseReport {

    void printHeader() {
        System.out.println("Print base header");
    }

    void printFooter() {
        System.out.println("Print base footer");
    }

    abstract void printBody();

    void print() {
        printHeader();
        printBody();
        printFooter();
    }
}
