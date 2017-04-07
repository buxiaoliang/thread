package demo1;

/**
 * Created by bu on 4/7/2017.
 */
public class Test2 {
    public static void main(String[] args) {
        Service service1 = new Service();
        Service service2 = new Service();
        MyThread1 myThread1 = new MyThread1(service1);
        myThread1.start();
        MyThread2 myThread2 = new MyThread2(service2);
        myThread2.start();
    }
}
