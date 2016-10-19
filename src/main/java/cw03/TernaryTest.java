package cw03;

public class TernaryTest {
    public static void main(String[] args) {
        int a = 10;
        int b;

        if (a > 0) {
            b = 1;
        } else {
            b = -1;
        }

        // int c = condition ? true : false;
        int c =      a > 0   ?   1  :  -1  ;

        System.out.println(b);
        System.out.println(c);
    }
}
