package fileHandling;

public class MethodsOfJavaReflectionApi {
    public static void main(String[] args) throws ClassNotFoundException {
        Class c1 = Class.forName("fileHandling.A");
        Class c2 = Class.forName("fileHandling.B");
        Class c3 = Class.forName("fileHandling.C");

        System.out.println("c1.isInterface(): "+c1.isInterface());
        System.out.println("c3.isInterface(): "+c3.isInterface());

        System.out.println("c1.getSuperclass(): "+c1.getSuperclass());
        System.out.println("c2.getSuperclass(): "+c2.getSuperclass());


    }
}


class A{

}

class B extends A{

}

interface C{

}