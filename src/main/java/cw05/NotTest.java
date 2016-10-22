package cw05;

public class NotTest {
    public static void main(String[] args) {
        System.out.println(!false);
        System.out.println(!true);

        int k = 0;
        boolean stop = false;
        while (!stop) { // stop != true
            if (k == 27) stop = true;
            System.out.println("I'm alive!");
            k++;
        }

        System.out.println(~10 + 1);
    }
}
