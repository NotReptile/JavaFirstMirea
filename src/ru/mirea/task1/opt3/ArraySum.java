package ru.mirea.task1.opt3;
import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        int sum = 0;
        int sum1 = 0;
        int sum2 = 0;
        int i = 0;

        System.out.println("Enter the length of the array");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n];

        for( ; i<n; i++){                   // заполнение массива
            array[i] = scan.nextInt();
        }

        for( i =0; i<n; i++){                  // сумма элементов с помощью цикла for
            sum = sum + array[i];
        }
        System.out.println("Sum of array elements(for) = " + sum);
        i = 0;

        while (i < n) {                        // сумма элементов с помощью цикла while
            sum1 = sum1 + array[i];
            i++;
        }
        System.out.println("Sum of array elements(while) = " + sum1);
        i = 0;

        do{                                     // сумма элементов с помощью цикла while
            sum2 = sum2 + array[i];
            i++;
        }while(i < n);
        System.out.println("Sum of array elements(do while) = " + sum2);
    }
}
