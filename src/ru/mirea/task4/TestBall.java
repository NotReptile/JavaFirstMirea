package ru.mirea.task4;

public class TestBall {
    public static void main(String[] args) {
        Ball newBall = new Ball(3.5, 4.2);
        System.out.println("\nBall cords before move: \n");
        System.out.println(newBall);
        newBall.move(3.4,5.6);
        System.out.println("\nBall cords after move: \n");
        System.out.println(newBall);
    }
}
