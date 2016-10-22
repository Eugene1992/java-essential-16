package cw05;

public class XorTest {
    public static void main(String[] args) {
        System.out.println(true ^ false);
        System.out.println(false ^ true);

        System.out.println(true ^ true);
        System.out.println(false ^ false);

        int x = 5, y = 7;
        System.out.println("x = " + x + ", y = " + y);

        x = x ^ y; // x == 2
        y = x ^ y; // y == 5
        x = x ^ y; // x == 7
        System.out.println("x = " + x + ", y = " + y);


    }
}
