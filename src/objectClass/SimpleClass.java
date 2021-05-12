package objectClass;

public class SimpleClass {
    public static void main(String[] args) {
        A obj = new A();
        obj.print();
    }
}

class A{
    public void print(){
        System.out.println("Inside A class");
    }
}
