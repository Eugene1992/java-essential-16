package cw05;

public class AndTest {
    public static void main(String[] args) {
        int a = 100;
        int b = 40;
        int c = 30;

        if (a > b && a > c) {
            System.out.println(a);
        }
        if (b > a && b > c) {
            System.out.println(b);
        }
        if (c > a && c > b) {
            System.out.println(c);
        }

    }
}
