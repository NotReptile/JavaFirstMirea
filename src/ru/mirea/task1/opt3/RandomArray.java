package ru.mirea.task1.opt3;
import java.util.Scanner;
import java.util.Random;

public class RandomArray {
    public static void main(String[] args){
        Random rand = new Random();
        System.out.println("Enter the length of the array");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double[] array = new double[n];
        for(int i=0;i<n;i++){
            array[i] = (int)(Math.random()*10)+1;
        }
        System.out.println("Math.random array: ");
        for(int i = 0; i < n; i++){
            System.out.println(array[i]);
        }
        for(int i=0;i<n;i++){
            array[i] = rand.nextInt(10)+1;
        }
        System.out.println("Random class array: ");
        for(int i=0;i<n;i++){
            System.out.println(array[i]);
        }
    }
}