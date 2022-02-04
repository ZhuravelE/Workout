package com.zhuravel.binding.late_dynamic;

public class Rectangle extends Figure {

    public Rectangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    @Override
    public double area() {
        System.out.print("Площадь прямоугольника ");
        return dim1 * dim2;
    }
}
