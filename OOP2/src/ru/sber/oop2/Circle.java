package ru.sber.oop2;


public class Circle extends Figure {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.pow(this.radius, 2) * Math.PI;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public String draw() {
        return this.draw(Color.Blue);
    }

    @Override
    public String draw(Color color) {
        return String.format("Нарисован круг с радиусом %.3f, с центром в точке %s и цветом %s",
                this.radius, super.getMidPoint(), color);
    }

}