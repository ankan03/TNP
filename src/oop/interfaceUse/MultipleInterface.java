package oop.interfaceUse;

public class MultipleInterface {
    public static void main(String[] args) {
        D d = new D();
        d.a();
        d.b();
        d.c();
        System.out.println("----------------------------------");

        E e = new E();
        e.a();
        e.b();
        System.out.println("----------------------------------");

        F f = new F();
        f.a();
        f.b();
        f.c();
        System.out.println("----------------------------------");
    }
}

interface A{
    public void a();
}

interface B{
    public void b();
}

// interface supports multiple inheritance but class does not
interface C extends A,B{
    public void c();
}

class D implements C{

    @Override
    public void a() {
        System.out.println("Inside 'a' method of 'D' class");
    }

    @Override
    public void b() {
        System.out.println("Inside 'b' method of 'D' class");
    }

    @Override
    public void c() {
        System.out.println("Inside 'c' method of 'D' class");
    }
}

// class supports multiple implementation of inheritance
class E implements A,B{

    @Override
    public void a() {
        System.out.println("Inside 'a' method of 'E' class");
    }

    @Override
    public void b() {
        System.out.println("Inside 'b' method of 'E' class");
    }
}

class F implements A,B,C{

    @Override
    public void a() {
        System.out.println("Inside 'a' method of 'F' class");
    }

    @Override
    public void b() {
        System.out.println("Inside 'b' method of 'F' class");
    }

    @Override
    public void c() {
        System.out.println("Inside 'c' method of 'F' class");
    }
}


