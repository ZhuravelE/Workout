package com.zhuravel.binding.late_dynamic;

public class Figure {

    protected double dim1;
    protected double dim2;

    public Figure(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    public double area() {
        System.out.print("Площадь фигуры не определена");
        return 0.0;
    }
}
