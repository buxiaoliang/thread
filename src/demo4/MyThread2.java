package demo4;

/**
 * Created by bu on 4/7/2017.
 */
public class MyThread2 extends Thread {
    private Service service;

    public MyThread2(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.startupThread2();
    }
}
