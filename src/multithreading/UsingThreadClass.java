package multithreading;

public class UsingThreadClass {
    public static void main(String[] args) throws InterruptedException {

        //This will execute first a object then will execute b
//        A a = new A();
//        B b = new B();
//
//        a.show();
//        b.show();

        //start() will call run() method internally that's why it prints Hi-1 Hello-1 alternatively
//        C c = new C();
//        D d = new D();
//        c.start();//Will call run() method of the class(Inherited Thread)
//        d.start();//Will call run() method of the class(Inherited Thread)

        //sometimes it create problem(one method can be called 2 times before another) that's why we put a little time gap between two method execution
        C c = new C();
        D d = new D();
        c.start();
        Thread.sleep(10);
        d.start();
    }
}

class A{
    public void show() throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi");
            Thread.sleep(500);
        }
    }
}

class B{
    public void show() throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
            Thread.sleep(500);
        }
    }
}

class C extends Thread{
    //run() is the internal method of thread .We should override this method every time while inheriting Thread class
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi-1");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class D extends Thread{
    //run() is the internal method of thread .We should override this method every time while inheriting Thread class
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello-1");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
