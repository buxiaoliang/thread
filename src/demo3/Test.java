package demo3;

/**
 * Created by bu on 4/7/2017.
 * synchronized代码块的同步特点
 * 多个线程调用同一个对象的不同synchronized同步方法或者是synchronized(this)同步代码块时，调用都是顺序执行，也就是所谓的同步的，阻塞的
 */
public class Test {
    public static void main(String[] args) {
        Service service = new Service();
        MyThread myThread1 = new MyThread(service, "Robert");
        myThread1.start();
        MyThread myThread2 = new MyThread(service, "Other");
        myThread2.start();
    }
}
