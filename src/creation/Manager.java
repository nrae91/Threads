package creation;

public class Manager {

    public final static int MAX_THREADS = 10;

    public static void main(String[] args) {

        Thread thread;
        Worker worker = new Worker();

        for (int i=0; i < MAX_THREADS; i++){
            thread = new Thread(worker);
            thread.start();
        }

    }
}
