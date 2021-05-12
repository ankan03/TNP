package objectClass;

public class StaticKeyword {
    public static void main(String[] args) {
//        A1 a = new A1();
//        a.show();

        A2.i =  10;
        A2.show();
//        A2.i =  10;


    }
}
class A1{
    public void show(){
        System.out.println("Inside show method of A1");
    }
}

class A2{
    public static int i=5;
    public static void show(){
        System.out.println("Inside show method of A2");
        System.out.println(i);
    }
}
