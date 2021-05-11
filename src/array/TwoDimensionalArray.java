package array;

import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter row no column no :");
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int a[][]  = new int[m][n];

        System.out.println("Enter values rowwise");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = scanner.nextInt();
            }
        }

        System.out.println("The 2D array is:");
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        int b[][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println("The 2D array B is:");
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Using Enhanced FOR LOOP The 2D array B is:");
        for(int i[]:b){
            for (int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
