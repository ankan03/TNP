package loop;

public class PatternPrint {
    public static void main(String[] args) {
        int n=5;

//* * * * *
//* * * * *
//* * * * *
//* * * * *
//* * * * *

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

//*
//* *
//* * *
//* * * *
//* * * * *

        System.out.println("---------------------");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

//* * * * *
//*       *
//*       *
//*       *
//* * * * *

        System.out.println("---------------------");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n-1)
                    System.out.print("* ");
                else {
                    if (j==0 || j==n-1)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }
            }
            System.out.println();
        }

//1 2 3 4 5
//1 2 3 4 5
//1 2 3 4 5
//1 2 3 4 5
//1 2 3 4 5

        System.out.println("---------------------");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print((j+1)+" ");
            }
            System.out.println();
        }

//1 2 3 4 5
//2 3 4 5 1
//3 4 5 1 2
//4 5 1 2 3
//5 1 2 3 4

        System.out.println("---------------------");
        for (int i = 0; i < n; i++) {
            int k=i+1;
            for (int j = 0; j < n; j++) {
                if (k>n)
                    k=1;
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }

//1
//0 1
//1 0 1
//0 1 0 1
//1 0 1 0 1

        System.out.println("---------------------");
        int k;
        for (int i = 0; i < n; i++) {
            k = i%2==1?0:1;
            for (int j = 0; j <= i; j++) {
                System.out.print(k+" ");
                k = k==1?0:1;
            }
            System.out.println();
        }

//1
//2 2
//3 3 3
//4 4 4 4
//5 5 5 5 5

        System.out.println("---------------------");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(i+1+" ");
            }
            System.out.println();
        }
    }
}
