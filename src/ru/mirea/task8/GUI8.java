package ru.mirea.task8;
import javax.swing.*;
import java.awt.*;

public class GUI8 extends Shape{
    public GUI8(Color color, int xPosition, int yPosition, int type) {
        super(color, xPosition, yPosition, type);
    }

    public static void main(String[] args){
        JFrame frame = new JFrame("GUI");
        //Shape redCircle = new Shape(Color.red,15,25, 0);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,600);
        frame.setLayout(null);
        frame.add(new JLabel("Hello World"));
        frame.pack();
        frame.setVisible(true);


    }
}
