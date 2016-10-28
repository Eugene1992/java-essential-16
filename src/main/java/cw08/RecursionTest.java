package cw08;

/**
 * Created by Evgeniy on 27.10.2016.
 */
public class RecursionTest {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(fac(num));
    }

    public static int fack(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    public static int fac(int num) {
        if (num == 1) return 1;
        return num * fac(num - 1);
    }
}
