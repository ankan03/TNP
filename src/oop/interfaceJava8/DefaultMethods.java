package oop.interfaceJava8;

public class DefaultMethods {
    public static void main(String[] args) {
        X x = new X();
        x.add();
        x.sub();
        System.out.println("-----------------------------------------");

        Y y = new Y();
        y.show();
        System.out.println("-----------------------------------------");

        Y1 y1 = new Y1();
        y1.show();
        System.out.println("-----------------------------------------");

        Z1 z1 = new Z1();
        z1.show();
    }
}

interface A{
    public void add();
    default void sub(){
        System.out.println("Inside 'sub()' method of interface 'A'");
    }
}

class X implements A{
    public void add(){
        System.out.println("Inside 'add()' method of class 'X'");
    }

    // We must have to override interface methods which are declared but not defined
    // But for interface defined methods we can override interface methods but it is not necessary
//    public void sub(){
//        System.out.println("Inside 'sub()' method of class 'X'");
//    }

}

interface B{
    default void show(){
        System.out.println("Inside 'show()' method of interface 'B'");
    }
}

interface C{
    default void show(){
        System.out.println("Inside 'show()' method of interface 'C'");
    }
}

class Y implements B{
    // We can override interface methods but it is not necessary if the method is already defined
//    public void show() {
//        System.out.println("Inside 'show()' method of class 'Y'");
//    }
}

class Y1 implements B,C{

    // In case of same method present in both interfaces we have to manually override the method, it is necessary
    @Override
    public void show() {
        System.out.println("Inside 'show()' method of class 'Y1'");
    }
}

class Z{
    public void show(){
        System.out.println("Inside 'show()' method of class 'Z'");
    }
}

class Z1 extends Z implements B,C{

    //if same method is present in parent class and interface then PARENT CLASS METHOD WILL GET HIGHER PRIORITY if we doesn't override the method in the CHILD CLASS (it is known as THIRD RULE)
//    public void show(){
//        System.out.println("Inside 'show()' method of class 'Z1'");
//    }
}


interface D{

    //ERROR: Because this method belongs to OBJECT class of java
//    default public boolean equals(Object o){
//
//    }
}