package oop;

public class AnonymousObject {
    public static void main(String[] args) {
        B b = new B();
        b.i = 10;
        b.show();

        new B().i =9;//Here we are not creating object so the heap memory space is not wasting for storing extra instance
        new B().show();//But it is impossible to track any object and use that in future situation (that's why everytime i=0)

    }
}

class B{
    int i=0;

    public B(){
        System.out.println();
        System.out.println("Inside default constructor of B class");
    }
    public void show(){
        System.out.println("In show() i = "+i);

    }
}
