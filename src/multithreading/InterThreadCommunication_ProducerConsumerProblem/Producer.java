package multithreading.InterThreadCommunication_ProducerConsumerProblem;

public class Producer implements Runnable {

    Q q = new Q();

    public Producer(Q q) {
        this.q = q;
        Thread thread = new Thread(this,"Producer");
        thread.start();
    }

    @Override
    public void run() {
        int i=0;
        while (true){
            q.setNum(i++);
            try { Thread.sleep(500); } catch (InterruptedException e) { e.printStackTrace(); }
        }
    }
}
