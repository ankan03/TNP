package oop.polymorphism;

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        E e = new E();
        F f = new F();
        G g = new G();

        e.show();
        f.show();
        g.show();


        //this concept is called Runtime polymorphism / Dynamic Method Dispatch because we are deciding which method call in Runtime
        E obj;
        obj = e;
        obj.show();
    }
}

class E{
    public void show(){
        System.out.println("In show E");
    }
}

class F extends  E{
    public void show(){
        System.out.println("In show F");
    }
}

class G extends  F{
    public void show(){
        System.out.println("In show G");
    }
}
