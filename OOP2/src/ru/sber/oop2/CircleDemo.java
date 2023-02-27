package ru.sber.oop2;

import java.util.Scanner;

public class CircleDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите радиус круга");

        int radius = scanner.nextInt();
        Circle circle = new Circle(radius);

        System.out.println("Площадь круга "+circle.area());
        System.out.println("Периметр круга "+circle.perimeter());

        System.out.println(circle.draw());
    }
}