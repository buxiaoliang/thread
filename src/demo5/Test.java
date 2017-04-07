package demo5;

/**
 * Created by bu on 4/7/2017.
 * 虽然线程一直在私有堆栈中取得isRunning的值为true并且也执行了setRunning(false);但是却把公共堆栈的isRunning变量值更新为false，
 * 所以还是一直死循环。主要由于私有堆栈和公共堆栈里面的值不同步引起的。而volatile关键字修饰的变量，作用就是强制性地在公共堆栈中取值。也就解决上面的死循环。
 */
public class Test {
    public static void main(String[] args) {
        try {
            MyThread myThread = new MyThread();
            myThread.start();
            Thread.sleep(1000);
            myThread.setRunning(false);
            System.out.println("Thread isRunning is set to false.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
