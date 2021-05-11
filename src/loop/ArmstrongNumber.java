package loop;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int n = 8208;//153 370 371 1634
        int x=n,s=0,s1=0;
        while (x>=1){
            s++;
            x/=10;
        }
        x=n;
        while (x>=1){
            s1 += Math.pow((x%10),s);
            x/=10;
        }
        if (s1==n)
            System.out.println("Armstrong");
        else
            System.out.println("NOT Armstrong");
    }
}
