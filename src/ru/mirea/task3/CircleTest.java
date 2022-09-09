package ru.mirea.task3;
import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args){
        Circle testCircle = new Circle();
        System.out.println("Input radius : ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        testCircle.setRadius(n);
        testCircle.areaOfCircleMethod();
        testCircle.circumferenceMethod();
        testCircle.diameterMethod();
        System.out.println(testCircle);
    }
}
