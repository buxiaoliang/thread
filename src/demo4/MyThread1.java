package demo4;

import demo3.MyThread;

/**
 * Created by bu on 4/7/2017.
 */
public class MyThread1 extends Thread {
    private Service service;

    public MyThread1(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.startupThread1();
    }
}
