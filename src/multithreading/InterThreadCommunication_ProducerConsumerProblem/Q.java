package multithreading.InterThreadCommunication_ProducerConsumerProblem;

public class Q {
    int num;
    boolean valueSet=false;



    public synchronized void  getNum() {

        while (!valueSet){
            try { wait(); } catch (InterruptedException e) { e.printStackTrace(); }
        }

        System.out.println("Get: "+num);
        valueSet = false;
        notify();


    }

    public synchronized void  setNum(int num) {

        while (valueSet){
            try { wait(); } catch (InterruptedException e) { e.printStackTrace(); }
        }

        System.out.println("Put: "+num);
        this.num = num;
        valueSet=true;
        notify();

    }
}
