package demo6;

/**
 * Created by bu on 4/7/2017.
 * 后面线程的修改的内容不能影响已经运行的线程，他们没有可见性。
 * 这种死循环，虽然MyThread2的调用了stopMethod();方法停止线程，但是根本没起作用。原因是MyThread1线程进入死循环中，一直在循环体未出来，MyThread1没看见MyThread2送过来的false，就是差在各个线程之间没有可见性。
 为了保持线程之间的可见性，使用synchronized关键字，让两个线程都持有钥匙进入同步代码块。这样就可以保证两个线程之间可见了。
 */
public class Test {
    public static void main(String[] args) {
        try {
            Service service = new Service();
            MyThread1 myThread1 = new MyThread1(service);
            myThread1.start();
            Thread.sleep(1000);
            MyThread2 myThread2 = new MyThread2(service);
            myThread2.start();
            System.out.println("Stop command is sent.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
