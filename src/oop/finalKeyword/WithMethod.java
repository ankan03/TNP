package oop.finalKeyword;

public class WithMethod {
    public static void main(String[] args) {
        B b = new B();
        b.show();
    }
}

class A{
    final public void show(){
        System.out.println("In show of A");
    }
}

class B extends A{
//    public void show(){//If show() is final , it cannot be override
//        System.out.println("In show of B");
//    }
}
