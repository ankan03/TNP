package staticKeyword;

public class NonStaticVariablesStaticMethod {
    public static void main(String[] args) {
//        staticKeyword.A.i = 1; // non-static variable can not be initiated without object
        A.j = 10;//static variable can be initiated without object

        A a1 = new A();
        A a2 = new A();
        A a3 = new A();

        a1.i = 1;
        a2.i = 2;
        a3.i = 3;
        a1.increment();
        a2.increment();
        a3.increment();

//        a1.decrement();

    }
}

class A{
    public int i=5;
    public static int j = 9;

    public  void increment(){
        j++;
        i++;
        System.out.println("i = "+i+" j = "+j);
    }

    public static void decrement(){
        j--;
//        i--;//will not work because non-static variable is not accessible from static method

    }
}
