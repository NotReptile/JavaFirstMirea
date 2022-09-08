package ru.mirea.task2;

public class Tester {
    public static void main(String[] args) {
        // Shape class test
        Shape x = new Shape();
        x.setName("Triangle");
        x.setCorners(3);
        System.out.println("\nInfo about Shape object : \n" + x);
        // Ball class test
        Ball greenBall = new Ball();
        greenBall.setColor("Green");
        System.out.println("\nInfo about Ball object : \n" + greenBall);
        // Book class test
        Book someBook = new Book();
        someBook.setName("javaBook");
        someBook.setPages(5000);
        System.out.println("\nInfo about Book object : \n" + someBook);
    }
}
