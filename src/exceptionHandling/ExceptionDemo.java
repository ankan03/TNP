package exceptionHandling;

public class ExceptionDemo {
    public static void main(String[] args) {
        double i,j,k=0;
        i=8;
        j=0;

        int a[] = {1,2,3};
        try {
            k = i/j;
            System.out.println("k: "+k);

            System.out.println("Array element: "+a[1]);

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Max length = "+a.length);
        }catch (ArithmeticException e){
            System.out.println("Cannot divided by zero");
        }catch (Exception e){
            System.out.println("Some error occured");
        }
    }




}
