package demo3;

/**
 * Created by bu on 4/7/2017.
 */
public class MyThread extends Thread {
    private Service service;
    private String username;

    public MyThread(Service service, String username) {
        this.service = service;
        this.username = username;
    }

    @Override
    public void run() {
        super.run();
        service.getAge(this.username);
    }
}
