package oop.polymorphism;

public class MethodOverloading {
    public static void main(String[] args) {
        A a = new A();
        a.show();
        a.show(1);
        a.show(1.1);
        a.show("Ankan");
    }
}

class A{
    public  void show(){
        System.out.println("Hello");
    }

    public  void show(int i){
        System.out.println("Hello INT "+i);
    }

    public  void show(String str){
        System.out.println("Hello STRING "+str);
    }

    public  void show(double i){
        System.out.println("Hello DOUBLE "+i);
    }
}
