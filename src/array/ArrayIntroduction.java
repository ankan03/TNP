package array;

import java.util.Random;
import java.util.Scanner;

public class ArrayIntroduction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no of elements");
        int n = scanner.nextInt();

        int a[] = new int[n];
        System.out.printf("Enter %d elements",n);
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.print("Array is : ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }


        //Random Class
        int n1 = 20;
        int a1[] = new int[n1];
        Random random = new Random();

        for (int i = 0; i < n1; i++) {
            a1[i] = random.nextInt(50);
        }

        System.out.println("Random array is: ");
        for(int k:a1)
            System.out.print(k+" ");
    }
}
