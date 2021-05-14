package multithreading;

public class UsingLambdaExpression {
    public static void main(String[] args) {
        //Normal (Using interface)
//        Runnable runnable1 = new G();
//        Runnable runnable2 = new H();
//
//        Thread thread1 = new Thread(runnable1);
//        Thread thread2 = new Thread(runnable2);



        //Normal Using interface ( Using Annonimas class concept)
//        Thread thread1 = new Thread(new G());
//        Thread thread2 = new Thread(new H());



        //Using Lambda expression approach-1
//        Runnable runnable1 = new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 5; i++) {
//                    System.out.println("Hi-3");
//                    try {
//                        Thread.sleep(500);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        };
//        Runnable runnable2 = new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 5; i++) {
//                    System.out.println("Hello-3");
//                    try {
//                        Thread.sleep(500);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        };
//        Thread thread1 = new Thread(runnable1);
//        Thread thread2 = new Thread(runnable2);



        //Using Lambda expression approach-2
//        Runnable runnable1 = ()->{
//                for (int i = 0; i < 5; i++) {
//                    System.out.println("Hi-3");
//                    try {
//                        Thread.sleep(500);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//
//        };
//        Runnable runnable2 = ()->{
//                for (int i = 0; i < 5; i++) {
//                    System.out.println("Hello-3");
//                    try {
//                        Thread.sleep(500);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//
//        };
//
//        Thread thread1 = new Thread(runnable1);
//        Thread thread2 = new Thread(runnable2);




        //Using Lambda expression approach-3
        Thread thread1 = new Thread(()->{
            for (int i = 0; i < 5; i++) {
                System.out.println("Hi-4");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        });
        Thread thread2 = new Thread(()->{
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello-4");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        });

        thread1.start();
        try { Thread.sleep(10); }catch (Exception e){}
        thread2.start();
    }
}

class G implements Runnable{
    //run() is the internal method of thread .We should override this method every time while inheriting Thread class
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi-3");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class H implements Runnable{
    //run() is the internal method of thread .We should override this method every time while inheriting Thread class
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello-3");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
