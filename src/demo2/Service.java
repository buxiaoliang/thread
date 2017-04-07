package demo2;

/**
 * Created by bu on 4/7/2017.
 */
public class Service {

    public synchronized void getAge(String username) {
        if (username.equals("Robert")) {
            System.out.println("Robert's age is 20.");
            getSex(username);
        } else {
            System.out.println("Other's age is 30.");
            getSex(username);
        }
    }

    public synchronized void getSex(String username) {
        if (username.equals("Robert")) {
            System.out.println("Robert's sex is male.");
        } else {
            System.out.println("Other's sex is female.");
        }
    }
}
