package ru.mirea.task7;

public class Circle extends Shape{
    protected double radius;

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }
    public Circle(double radius,String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(){
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
