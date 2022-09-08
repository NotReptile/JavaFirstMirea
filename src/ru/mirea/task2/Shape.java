package ru.mirea.task2;

public class Shape {
    private String name;
    private int corners;
    public String toString() {
        return "Shape is " + name + "\nNumber of corners = " + corners;
    }
    public void setCorners(int corners) {
        this.corners = corners;
    }
    public void setName(String name) {
        this.name = name;
    }
}
