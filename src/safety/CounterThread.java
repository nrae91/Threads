package safety;

public class CounterThread implements Runnable{

    private Counter counter;

    public CounterThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {

        String name = Thread.currentThread().getName();

        synchronized (counter) {

            while (counter.getValue() < 10000) {

                System.out.println(name + ": found" + counter.getValue() + "will, increment!");

                counter.increment();
            }
        }
    }
}
