package oop.polymorphism;

public class MethodOverriding {
    public static void main(String[] args) {
        B b = new B();
        b.show();

        C c = new C();
        c.show();

        D d = new D();
        d.show();
    }
}

class B{
    public void show(){
        System.out.println("In show B");
    }
}

class C extends  B{
    public void show(){
        System.out.println("In show C");
    }
}

class D extends  C{
    public void show(){
        System.out.println("In show D");
    }
}
