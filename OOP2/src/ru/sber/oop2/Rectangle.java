package ru.sber.oop2;


public class Rectangle extends Figure {

    private double width;

    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double area() {
        return this.width * this.height;
    }

    @Override
    public double perimeter() {
        return 2 * (this.width + this.height);
    }

    @Override
    public String draw() {
        return this.draw(Color.Black);
    }

    @Override
    public String draw(Color color) {
        return String.format("Нарисован прямоугольник со сторонами (%.3f, %.3f), с центром в точке %s и цветом %s",
                this.width, this.height, super.getMidPoint(), color);
    }

}
