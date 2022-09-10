package ru.mirea.task7;

public class Square extends Shape{
    protected double side;
    @Override
    public double getArea() {
        return 0;
    }
    @Override
    public double getPerimeter() {
        return 0;
    }
    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }
    public Square(double side) {
        this.side = side;
    }
    public Square() {
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public void setWidth(double side){
        this.width = side;
    }
}
