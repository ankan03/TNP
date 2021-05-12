package oop.finalKeyword;

public class WithClass {
    public static void main(String[] args) {
        C c = new C();
        c.show();

//        D d = new D();
//        d.show();
    }
}

final class C{
    public void show(){
        System.out.println("In show of C");
    }
}

//class D extends C{//If class C is final , it cannot be inherited
//    public void show(){
//        System.out.println("In show of D");
//    }
//}
