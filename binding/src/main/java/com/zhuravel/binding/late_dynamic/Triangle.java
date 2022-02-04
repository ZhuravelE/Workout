package com.zhuravel.binding.late_dynamic;

public class Triangle extends Figure {

    public Triangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    @Override
    public double area() {
        System.out.print("Площадь треугольника ");
        return dim1 * dim2 / 2;
    }
}
