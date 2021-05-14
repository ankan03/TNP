package InnerClass;

public class MemberInnerClass {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println("i: "+obj.i);

        A.B innerClassObj = obj.new B();
        System.out.println("j: "+innerClassObj.j);
    }
}

class A{
    int i=5;
    class B{
        int j=8;
    }
}