package ru.sber.oop2;

public abstract class Figure implements Drawable {
    private Point midPoint = new Point();

    public Point getMidPoint() {
        return this.midPoint;
    }
    public void setMidPoint(Point middlePoint) {
        this.midPoint = midPoint;
    }
    public abstract double area();
    public abstract double perimeter();

}