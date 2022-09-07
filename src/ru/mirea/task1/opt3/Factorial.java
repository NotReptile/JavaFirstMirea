package ru.mirea.task1.opt3;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        int fact = 1;
        System.out.println("Enter number");
        Scanner scan = new Scanner(System.in);
        int f = scan.nextInt();
        for (int i = 1; i <= f; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
