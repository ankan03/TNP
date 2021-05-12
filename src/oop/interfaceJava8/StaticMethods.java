package oop.interfaceJava8;

public class StaticMethods {
    public static void main(String[] args) {
        //As the method is static we can directly access it without creating object
        MyStaticMethod.show();
    }
}

interface MyStaticMethod {
    static void show(){
        System.out.println("Inside 'show()' method of interface 'staticMethod'");
    }
}
