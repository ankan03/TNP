package multithreading.InterThreadCommunication_ProducerConsumerProblem;

public class Consumer implements Runnable {
    Q q = new Q();

    public Consumer(Q q) {
        this.q = q;
        Thread thread = new Thread(this,"Consumer");
        thread.start();

    }

    public void run(){
        while (true){
            q.getNum();
            try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }
        }

    }
}
