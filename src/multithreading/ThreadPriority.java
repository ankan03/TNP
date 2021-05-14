package multithreading;

public class ThreadPriority {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(()->{
            for (int i = 0; i < 5; i++) {
                System.out.println("Hi-5\t Priority: "+Thread.currentThread().getPriority());//We can get priority value of current Thread
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        },"thread-1 Hi");//We can also set thread name here
        Thread thread2 = new Thread(()->{
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello-5\t Priority: "+Thread.currentThread().getPriority());//We can get priority value of current Thread
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        },"threaf-2 Hello");//We can also set thread name here


        // We can use getName() to get the level of the thread
//        System.out.println("thread1.getName(): "+thread1.getName());
//        System.out.println("thread2.getName(): "+thread2.getName());



        // We can use setName() to set the level of the thread
//        thread1.setName("thread-1 Hi");
//        thread2.setName("threaf-2 Hello");
//        System.out.println("thread1.getName(): "+thread1.getName());
//        System.out.println("thread2.getName(): "+thread2.getName());

        //We can also set thread name during declaration
        System.out.println("thread1.getName(): "+thread1.getName());
        System.out.println("thread2.getName(): "+thread2.getName());















        //we can also set/get priority
//        thread1.setPriority(1);
//        thread2.setPriority(3);
//        System.out.println("thread1.getPriority(): "+thread1.getPriority());
//        System.out.println("thread2.getPriority(): "+thread2.getPriority());


        //We can use readymate constant for this pourpase
        thread1.setPriority(Thread.MIN_PRIORITY);//MIN_PRIORITY -> 1
        thread2.setPriority(Thread.MAX_PRIORITY);//MAX_PRIORITY -> 10
        System.out.println("thread1.getPriority(): "+thread1.getPriority());
        System.out.println("thread2.getPriority(): "+thread2.getPriority());


        thread1.start();
        try { Thread.sleep(10); }catch (Exception e){}
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Bye");
    }
}
