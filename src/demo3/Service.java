package demo3;

/**
 * Created by bu on 4/7/2017.
 */
public class Service {
    public void getAge(String username) {
        synchronized (this) {
            try {
                System.out.println(username);
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(username + " finished！");
        }
    }
}
