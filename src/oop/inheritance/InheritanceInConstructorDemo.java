package oop.inheritance;

public class InheritanceInConstructorDemo {
    public static void main(String[] args) {
//        A a = new A();
//        A a = new A(1);



//        B b = new B(); //When sub class object is created super class default constructor is created
//        B b = new B(1);//When sub class object is created super class default constructor is created

        A a = new B(1);
    }
}

class A{
    public A(){
        System.out.println("In A const");
    }

    public A(int i){
        System.out.println("In A Int");
    }
}

class B extends A{
    public B(){
        System.out.println("In B const");
    }

    public B(int i){
        System.out.println("In B Int");
    }
}
