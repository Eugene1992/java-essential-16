package cw08;

/**
 * Created by Evgeniy on 27.10.2016.
 */
public class Test {
    public static void main(String[] args) {
        print(10.0, 2);
    }

    static void f(int a) {

    }

    static void f(String a) {

    }

    static void f(int a, double b) {

    }

    static void f(double a, int b) {

    }

    static void print(int a, int num) {
        for (int i = 0; i < num; i++) {
            System.out.println(a);
        }
    }

    static void print(double a, int num) {
        for (int i = 0; i < num; i++) {
            System.out.println(a);
        }
    }

}
