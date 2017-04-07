package demo2;

/**
 * Created by bu on 4/7/2017.
 */
public class MyThread1 extends Thread {
    private Service service;
    private String username;

    public MyThread1(Service service, String username) {
        super();
        this.service = service;
        this.username = username;
    }

    @Override
    public void run() {
        service.getAge(this.username);
    }
}
