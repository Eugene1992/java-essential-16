package cw03;

public class MultyTernaryTest {
    public static void main(String[] args) {
        int a = 10;
        int b;

        if (a > 0) {
            if (a == 5) {
                b = 5;
            } else {
                b = 1;
            }
        } else {
            b = -1;
        }

        int c = a > 0 ? a == 5 ? 5 : 1 : -1;
    }
}
