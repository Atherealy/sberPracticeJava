package ru.sber.oop2;

public enum Color {
    Orange("Оранжевый"),
    Blue("Синий"),
    Yellow("Желтый"),
    Black("Черный"),
    White("Белый");

private  String colorName;
    Color(String colorName) {
        this.colorName = colorName;
    }

@Override
public String toString() {
        return colorName;
        }
}
