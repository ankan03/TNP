package condition;

public class IfElse {
    public static void main(String[] args) {
        //Greater number among a,b,c

        int a=15,b=9,c=12;
        if(a>b&&a>c)
            System.out.println("A is greater");
        else if (b>a&&b>c)
            System.out.println("B is greater");
        else
            System.out.println("C is greater");

//        Ternary Operator

        int r = a>b?a:b;
        System.out.println("r = "+r);


    }
}
