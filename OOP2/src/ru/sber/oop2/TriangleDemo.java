package ru.sber.oop2;

import java.util.Scanner;

public class TriangleDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите стороны треугольника");

        double a = scanner.nextInt();
        double b = scanner.nextInt();
        double c = scanner.nextInt();
        Triangle triangle = new Triangle(a, b, c);

        System.out.println("Площадь треугольника " + triangle.area());
        System.out.println("Периметр треугольника " + triangle.perimeter());

        System.out.println(triangle.draw());
    }
}
