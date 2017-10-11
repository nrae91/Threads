package safety;

public class Counter {

    private int value = 0;

    public int getValue() {
        return value;
    }

    public synchronized void increment(){
        value++;
    }
}
