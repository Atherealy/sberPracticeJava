package ru.sber.oop2;


public class Triangle extends Figure {

    private double sideOne;

    private double sideTwo;

    private double sideThree;

    public Triangle(double sideOne, double sideTwo, double sideThree) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
    }

    public double getSideOne() {
        return sideOne;
    }

    public void setSideOne(double sideOne) {
        this.sideOne = sideOne;
    }

    public double getSideTwo() {
        return sideTwo;
    }

    public void setSideTwo(double sideTwo) {
        this.sideTwo = sideTwo;
    }

    public double getSideThree() {
        return sideThree;
    }

    public void setSideThree(double sideThree) {
        this.sideThree = sideThree;
    }

    @Override
    public double area() {
        double halfPerimeter = perimeter() / 2;

        double res = halfPerimeter;
        res *= (halfPerimeter - this.sideOne);
        res *= (halfPerimeter - this.sideTwo);
        res *= (halfPerimeter - this.sideThree);

        return Math.sqrt(res);
    }

    @Override
    public double perimeter() {
        return this.sideOne + this.sideTwo + this.sideThree;
    }

    @Override
    public String draw() {
        return this.draw(Color.Yellow);
    }

    @Override
    public String draw(Color color) {
        return String.format("Нарисован треугольник со сторонами (%.3f, %.3f, %.3f), с центром в точке %s и цветом %s",
                this.sideOne, this.sideTwo, this.sideThree, super.getMidPoint(), color);
    }

}
