package basicConcept;

public class Operator {
    public static void main(String[] args) {
    //Bitwise And & Or

        int a = 25; // 11001
        int b=10;   //  1010
                    // 01000(bitwise AND)
                    // 11011(bitwise AND)

        int r = a&b;
        System.out.println("a&b =" +r);
        r = a|b;
        System.out.println("a|b =" +r);


    //Left and Right Shift Operator

        int r1=a>>2;
        System.out.println("a>>2 = "+r1);
        r1 = a<<2;
        System.out.println("a<<2 = "+r1);

//        Boolean
        boolean bool=true;
        System.out.println("bool = "+bool);
        bool = !bool;
        System.out.println("bool = "+bool);
    }
}
