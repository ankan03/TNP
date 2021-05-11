package loop;

public class PrimeCheck {
    public static void main(String[] args) {
        int n = 29;

        int c=0;
        for (int i = 2; i <= n/2; i++) {
            if (n%i==0)
                c++;
        }
        if (c>0)
            System.out.println("Not Prime");
        else
            System.out.println("Prime");
    }
}
