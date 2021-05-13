package objectCloning;

public class ShallowCopy {
    public static void main(String[] args) {
        A a = new A();
        a.i = 5;
        a.j = 6;

        A a1 = a;

        a1.j = 7;//In shallow copy we are creating 2 reference of the same object
        // that's why if we change any value it will be reflected in both REFERENCE which may create problem

        System.out.println("a = "+a);
        System.out.println("a1 = "+a1);
    }
}

