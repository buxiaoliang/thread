package demo4;

import demo3.MyThread;

/**
 * Created by bu on 4/7/2017.
 * 同步代码块放在非同步synchronized方法中进行声明使用，不能保证调用方法的线程的执行同步/顺序性，也就是线程调用方法的顺序是无序的。
 */
public class Test {
    public static void main(String[] args) {
        Service service = new Service();
        MyThread1 myThread1 = new MyThread1(service);
        myThread1.start();
        MyThread2 myThread2 = new MyThread2(service);
        myThread2.start();
    }
}
