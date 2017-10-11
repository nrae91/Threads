package creation;

import java.util.Date;

public class Worker implements Runnable {

    @Override
    public void run() {

        // do some work
        for (int i=0;i<=1000;i++){
            System.out.println(Thread.currentThread().getName() + " counts: " + i + " @ " + System.nanoTime());
        }
    }
}
