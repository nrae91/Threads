package safety;

public class Main {

    public static final int MAX_THREADS = 1000;

    public static void main(String[] args) throws Exception {

        Counter counter = new Counter();
        Runnable worker = new CounterThread(counter);

        Thread[] ta = new Thread[MAX_THREADS];

        for (int i=0; i < MAX_THREADS; i++){
            ta[i] = new Thread(worker);
            ta[i].start();
        }

        for (Thread thread: ta){
            thread.join();
        }

        System.out.println("Final value is: " + counter.getValue());
    }
}
