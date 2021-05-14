package InnerClass;

public class StaticInnerClass {
    public static void main(String[] args) {
        B b = new B();
        System.out.println("i: "+b.i);
        System.out.println("k: "+B.k);
        B.C c = new B.C();
        System.out.println("j: "+c.j);
        System.out.println("l: "+ B.C.l);
    }
}

class B{
    int i=3;
    static int k=2;
    static class C{
        int j=9;
        static int l=5;
    }
}