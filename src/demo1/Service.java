package demo1;

/**
 * Created by bu on 4/7/2017.
 */
public class Service {

    private int age = 0;

    public synchronized void get(String username) {
        try {
            if (username.equals("Robert")) {
                this.age = 20;
                System.out.println("Robert gets age!");
                Thread.sleep(2000);
            } else {
                this.age = 30;
                System.out.println("Other gets age!");
            }
            System.out.println(username + ", age = " + age);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
