package ru.mirea.task1.opt3;
import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("Enter the length of the array");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n];
        for(int i=0;i<n;i++){
            array[i] = scan.nextInt();
        }
        for(int i =0;i<n;i++){
            sum = sum + array[i];
        }
        System.out.println("Sum of array elements = " + sum);
    }
}
