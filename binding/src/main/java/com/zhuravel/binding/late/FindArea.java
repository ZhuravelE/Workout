package com.zhuravel.binding.late;

public class FindArea {

    public static void main(String[] args) {
        Figure f = new Figure(10.0, 5.0);
        Rectangle r = new Rectangle(9.0, 5.0);
        Triangle t = new Triangle(10.0, 8.0);

        Figure figureRef;
        figureRef = r;
        System.out.println(figureRef.area());
        figureRef = t;
        System.out.println(figureRef.area());
        figureRef = f;
        System.out.println(figureRef.area());
    }
}
