package demo4;

/**
 * Created by bu on 4/7/2017.
 */
public class Service {
    private String keyObject = new String();

    public void startupThread1() {
        try {
            synchronized (keyObject) {
                System.out.println("thread1 begin!");
                Thread.sleep(3000);
                System.out.println("thread1 end");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public synchronized void startupThread2() {
        System.out.println("thread2 begin!");
        System.out.println("thread2 end");
    }
}
