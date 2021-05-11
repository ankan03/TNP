package loop;

import java.util.Scanner;

public class SwappingNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st no:");
        int n1 = scanner.nextInt();
        System.out.println("Enter 2nd no:");
        int n2 = scanner.nextInt();

        System.out.printf("Before swap n1 = %d , n2 = %d\n",n1,n2);

        // Using 3rd variable
        int  temp = n1;
        n1=n2;
        n2=temp;
        System.out.printf("After 1st swap n1 = %d , n2 = %d\n",n1,n2);

        // without Using 3rd variable
        n1 = n1+n2;
        n2 = n1-n2;
        n1 = n1-n2;
        System.out.printf("After 2nd swap n1 = %d , n2 = %d\n",n1,n2);

        // Using XOR operator
        n1 = n1^n2;
        n2 = n1^n2;
        n1 = n1^n2;
        System.out.printf("After 3rd swap n1 = %d , n2 = %d\n",n1,n2);

        // Another way
        n1=n1+n2-(n2=n1);
        System.out.printf("After 4th swap n1 = %d , n2 = %d\n",n1,n2);

    }
}
