package demo5;

/**
 * Created by bu on 4/7/2017.
 */
public class MyThread extends Thread {
    //private boolean isRunning = true;
    private volatile boolean isRunning = true;

    public void setRunning(boolean isRunning) {
        this.isRunning = isRunning;
    }

    @Override
    public void run() {
        System.out.println("Thread starting.");
        while(isRunning) {

        }
        System.out.println("Thread is stopped!");
    }
}
