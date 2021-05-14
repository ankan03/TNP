package multithreading;

public class JoinAndIsAlive {
    public static void main(String[] args) throws InterruptedException {
        //Using Lambda expression approach-3
        Thread thread1 = new Thread(()->{
            for (int i = 0; i < 5; i++) {
                System.out.println("Hi-5");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        });
        Thread thread2 = new Thread(()->{
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello-5");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        });

        //Will print 'Bye' after first printing Hi-5
//        thread1.start();
//        try { Thread.sleep(10); }catch (Exception e){}
//        thread2.start();
//        System.out.println("Bye");


        //Will print 'Bye' after completing the Hi-5_Hello-5 loop
        thread1.start();
        try { Thread.sleep(10); }catch (Exception e){}
        thread2.start();

        System.out.println("\nMIDDLE thread1.isAlive(): "+thread1.isAlive()+"\n");
        thread1.join();
        thread2.join();
        System.out.println("\nEND thread1.isAlive(): "+thread1.isAlive()+"\n");

        System.out.println("Bye");
//        System.out.println("\nEND thread1.isAlive(): "+thread1.isAlive());

    }
}
