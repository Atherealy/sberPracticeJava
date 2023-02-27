package ru.sber.oop2;

import java.util.Scanner;

public class SquareDemo {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in );
        System.out.println("Введите сторону квадрата");

        int Side = scanner.nextInt();
        Square Square = new Square (Side);

        System.out.println("Площадь квадрата " + Square.area());
        System.out.println("Периметр квадрата " + Square.perimeter());

        System.out.print(Square.draw());

    }
}
