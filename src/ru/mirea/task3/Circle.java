package ru.mirea.task3;

public class Circle {
    private double circumference;
    private double areaOfCircle;
    private double diameter;
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void diameterMethod(){
        diameter = radius * 2;
    }
    public void circumferenceMethod(){
        circumference = 2 * Math.PI * radius;
    }
    public void areaOfCircleMethod(){
        areaOfCircle = Math.PI * Math.pow(radius,2);
    }
    public String toString(){
        return "Circle radius = " + radius +
                "\nCircle diameter = " + diameter +
                "\nCircle circumference = " + circumference +
                "\nArea of circle = " + areaOfCircle;
    }

}
