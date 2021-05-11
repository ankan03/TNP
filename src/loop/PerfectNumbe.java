package loop;

import java.util.Scanner;

public class PerfectNumbe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no: ");
        int n = scanner.nextInt();

        if (isPerfect(n))
            System.out.println("Perfect Number");
        else
            System.out.println("NOT a Perfect Number");
    }

    public static boolean isPerfect(int n){
        int s=0;
        for (int i = 1; i <= n/2; i++) {
            if (n%i == 0)
                s+=i;
        }
        if (s==n)
            return true;
        else
            return false;
    }
}
