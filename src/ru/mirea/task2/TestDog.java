package ru.mirea.task2;
import java.util.Scanner;

public class TestDog {
    public static void main(String[] args) {
        System.out.println("Enter number of dogs : ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Dog[] obj = new Dog[n];
        String dogName = "";
        int dogAge = 0;
        for (int i = 0; i < n; i++){
            dogName = scan.next();
            dogAge = scan.nextInt();
            obj[i] = new Dog(dogName,dogAge);
        }
        for (int i = 0; i < n; i++){
            System.out.println(obj[i]);
        }
    }
}
