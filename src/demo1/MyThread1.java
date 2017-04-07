package demo1;

/**
 * Created by bu on 4/7/2017.
 */
public class MyThread1 extends Thread {
    private Service service;

    public MyThread1(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.get("Robert");
    }
}
