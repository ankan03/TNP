package array;

import java.util.Scanner;

public class EnhancedForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no of elements");
        int n = scanner.nextInt();

        int a[] = new int[n];
        System.out.printf("Enter %d elements",n);
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        //Enhanced For Loop
        System.out.print("Array is : ");
        for (int i:a) {
            System.out.print(i+" ");
        }



    }
}
