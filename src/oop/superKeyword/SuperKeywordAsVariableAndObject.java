package oop.superKeyword;

public class SuperKeywordAsVariableAndObject {
    public static void main(String[] args) {
        C c = new C();
        D d = new D();
//        System.out.println(c.i);
//        System.out.println(d.i);

//        c.show();
//        d.show();

        E e = new E();
        e.show();


    }
}

class C{
    int i=5;
    public void show(){
        System.out.println("In show method of C \t i = "+i);
    }
}

class D extends C{
    int i=10;
    public void show(){
//        System.out.println("In show method of D \t i = "+i);
        System.out.println("In show method of D \t i = "+super.i); //super is used for accessing parent class variable
    }
}

class E extends C{
    int i=15;
    public void show(){
        super.show();//super is used for accessing parent class object
        System.out.println("In show method of E");
    }
}
