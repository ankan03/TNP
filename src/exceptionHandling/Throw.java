package exceptionHandling;

public class Throw {
    public static void main(String[] args) {

        int i=10;
        try {
            if (i<10){
                throw new ArithmeticException();//By using throw we can manually throw exception if required
            }else {
                System.out.println("i: "+i);
            }
        }catch (ArithmeticException e){
            System.out.println("No should greater than 10");
        }

    }
}
