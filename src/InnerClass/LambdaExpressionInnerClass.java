package InnerClass;

public class LambdaExpressionInnerClass {
    public static void main(String[] args) {

        //Normal(Without using Lambda expression)
//        F f = new F();
//        f.show();

        //Normal(Without using Lambda expression)[Using Inner class concept]
//        E e = new E() {
//            @Override
//            public void show() {
//                System.out.println("Inside show() method");
//            }
//        };
//        e.show();

//        E e = ()->{
//            System.out.println("Inside show() method");
//        };
//        e.show();

        E e = ()->System.out.println("Inside show() method");
        e.show();



    }
}

@FunctionalInterface
interface E{
    public void show();
}

class F implements E{

    @Override
    public void show() {
        System.out.println("Inside show() method of F class");
    }
}
