package cw06;

public class Test {
    public static void main(String[] args) {
        printNtimes("Hello", 10);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        printNtimes("Hello world", 5);
        int sum = getSum(10, 25);
        System.out.println(sum);
    }

    static void printNtimes(String msg, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(msg);
        }
    }

    static int getSum(int a, int b) {
        return a + b;
    }
}
