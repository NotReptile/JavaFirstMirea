package ru.mirea.task2;

public class Shape {
    private String name;
    private int corners;
    public String toString() {
        return "Shape - " + name + "\nNumber of corners = " + corners;

    }
    public static void main(String[] args) {
        Shape x = new Shape();
        x.name = "Triangle";
        x.corners = 3;

        System.out.println(x);
    }
}

