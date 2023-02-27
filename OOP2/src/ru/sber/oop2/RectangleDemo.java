package ru.sber.oop2;

import java.util.Scanner;

public class RectangleDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите длину прямоугольника");
        int Height = scanner.nextInt();

        System.out.println("Введите ширину прямоугольника");
        int Weight = scanner.nextInt();

        Rectangle rectangle = new Rectangle(Weight, Height);

        System.out.println("Площадь прямоугольника " + rectangle.area());
        System.out.println("Периметр прямоугольника " + rectangle.perimeter());

        System.out.println(rectangle.draw());
    }
}