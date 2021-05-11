package loop;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        long i=0,j=1,k;
        int n=5;

        if (n>0){
            if (n==1)
                System.out.println(i);
            else if (n==2)
                System.out.println(i+"\n"+j);
            else{
                System.out.println(i);
                System.out.println(j);
                for (int l = 2; l < n; l++) {
                    k=i+j;
                    System.out.println(k);
                    i=j;j=k;
                }
            }

        }else {
            System.out.println("n should be at least 1");
        }


        //TAKING INPUT FROM USER

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        n=sc.nextInt();i=0;j=1;k=0;

        if (n>=0){
            if (n==0)
                System.out.println(i);
            else if (n==1)
                System.out.println(i+"\n"+j+"\n"+j);
            else{
                System.out.println(i);
                System.out.println(j);
                while (k<=n){
                    k=i+j;
                    i = j;
                    j = k;
                    if (k<=n) {
                        System.out.println(k);
                    }
                }

            }

        }else {
            System.out.println("n should be at least 0");
        }

    }
}
