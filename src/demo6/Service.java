package demo6;

/**
 * Created by bu on 4/7/2017.
 */
public class Service {
    private boolean isContinueRun = true;

    public void runMethod() {
        while (isContinueRun) {
            // add synchronized
            String keyString =new String();
            synchronized (keyString) {

            }
        }
        System.out.println("Thread stopped.");
    }

    public void stopMethod() {
        isContinueRun = false;
    }
}
