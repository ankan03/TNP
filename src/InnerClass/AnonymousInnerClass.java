package InnerClass;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        D d = new D();
        d.show();

        C d1 = new D();
        d.show();

        //It will work same as inheritance without creating any extra class
        C c = new C(){
            void show(){
                System.out.println("show() method of E class");
            }
        };
        c.show();


    }
}

class C{
    void show(){
        System.out.println("show() method of C class");
    }
}

class D extends C{
    void show(){
        System.out.println("show() method of D class");
    }
}


