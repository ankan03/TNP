package multithreading;

public class SynchronizedKeyword {
    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

//        Thread thread1 = new Thread(()->{
//            for (int i = 0; i < 100; i++) {
//                counter.increment();
//            }
//        });
//
//        Thread thread2 = new Thread(()->{
//            for (int i = 0; i < 100; i++) {
//                counter.increment();
//            }
//        });

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    counter.increment();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    counter.increment();
                }
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
        System.out.println("Counter: "+counter.count);
    }
}

class Counter {
    int count;

    public synchronized void increment(){//synchronized means if one thread is executing other cannot execute the method at same time
        count++;
    }
}
