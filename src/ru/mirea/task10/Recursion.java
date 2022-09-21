package ru.mirea.task10;
import java.util.Scanner;

public class Recursion {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Task Number: ");
        int x = scan.nextInt();
        switch (x){
            case (1):
                System.out.println("Input n: \n");
                int n = scan.nextInt();
                int k = 1;
                for (int i = 1; i <= n; i++){
                    System.out.print(k + " ");
                    if (i == k * (k + 1) / 2 )
                        k++;
                }
                break;
            case (2):
                System.out.println("Input n: \n");
                int z = scan.nextInt();
                for (int i = 1; i <= z; i++){
                    System.out.print(i + " ");
                }
                break;
            case (3):
                System.out.println("Input A: ");
                int a = scan.nextInt();
                System.out.println("Input B: ");
                int b = scan.nextInt();
                if (a < b)
                    for (int i = a; i <= b ; i++) {
                        System.out.print(i + " ");
                    }
                else
                    for (int i = a; i >= b; i--){
                        System.out.print(i + " ");
                    }
                break;
            case (4):
                System.out.println("Input K: ");
                int kol = scan.nextInt();
                System.out.println("Input d: ");
                int d = scan.nextInt();
                int count = 0;
                int q = (int) Math.pow(10, kol -1);
                while (q < (int) Math.pow(10, kol)){
                    int sum  = 0, num = q;
                    while (num > 0){
                        sum += num % 10;
                        num /= 10;
                    }
                    if (d == sum){
                        System.out.println(q);
                        count++;
                    }
                    q++;
                }
                System.out.println("Count = " + count);
                break;
            case(5):
                System.out.println("Input N: ");
                int number = scan.nextInt();
                System.out.println(sumD(number));
                break;
            default:
                System.out.println("Incorrect task number!");
        }

    }
    public static int sumD(int i) {
        return i == 0 ? 0 : i % 10 + sumD(i / 10);
    }

}
