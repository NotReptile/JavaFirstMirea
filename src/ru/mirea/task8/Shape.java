package ru.mirea.task8;
import java.awt.*;

public class Shape {
    private Color color;
    private int xPosition;
    private int yPosition;
    private int type;

    public Shape(Color color, int xPosition, int yPosition, int type) {
        this.color = color;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.type = type;
    }
}
