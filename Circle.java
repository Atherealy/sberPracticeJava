package ru.sber.oop1;
public class Circle {
    private double radius;
    private String color;

    public double area(){
        return Math.PI * Math.pow(radius, 2);
    }

    public double perimeter(){
        return Math.PI * 2 * radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public String toString() {
        return String.format("{ Радиус: %.3f; Цвет: %s; Площадь: %.3f; Периметр: %.3f }",
                radius, color, area(), perimeter());
    }
}
