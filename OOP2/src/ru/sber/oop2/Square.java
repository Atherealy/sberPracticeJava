package ru.sber.oop2;


public class Square extends Rectangle {

    public Square(double Side) {
        super(Side, Side);
    }

    @Override
    public double getWidth() {
        return super.getWidth();
    }

    @Override
    public void setWidth(double Side) {
        super.setWidth(Side);
        super.setHeight(Side);
    }

    @Override
    public double getHeight() {
        return super.getHeight();
    }

    @Override
    public void setHeight(double Side) {
        super.setWidth(Side);
        super.setHeight(Side);
    }

    @Override
    public String draw() {
        return this.draw(Color.Orange);
    }

    @Override
    public String draw(Color color) {
        return String.format("Нарисован квадрат со сторонами %.3f, с центром в точке %s и цветом %s",
                super.getWidth(), super.getMidPoint(), color);
    }

}
