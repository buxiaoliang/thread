package demo2;

/**
 * Created by bu on 4/7/2017.
 * synchronized????
 */
public class Test {
    public static void main(String[] args) {
        Service service = new Service();
        MyThread1 myThread1 = new MyThread1(service, "Robert");
        myThread1.start();
    }
}
