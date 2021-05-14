package multithreading.InterThreadCommunication_ProducerConsumerProblem;

public class InterThreadCommunication {
    public static void main(String[] args) {
        Q q = new Q();
        new Producer(q);
        new Consumer(q);
    }
}
