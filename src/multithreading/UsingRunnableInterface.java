package multithreading;

public class UsingRunnableInterface {
    public static void main(String[] args) {

        Runnable runnable1 = new E();
        Runnable runnable2 = new F();

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        thread1.start();
        try { Thread.sleep(10); }catch (Exception e){}
        thread2.start();
    }
}

class E implements Runnable{
    //run() is the internal method of thread .We should override this method every time while inheriting Thread class
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi-2");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class F implements Runnable{
    //run() is the internal method of thread .We should override this method every time while inheriting Thread class
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello-2");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
