package loop;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no: ");
        int n = scanner.nextInt();
        int s=0;
        int r=n;
        while (r>=1){
            System.out.printf("s = %d r = %d\t",s,r);
            int k = r%10;
            s=s*10+k;
            r/=10;
            System.out.printf("s = %d r = %d\n",s,r);
        }

        if (n==s)
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
}
