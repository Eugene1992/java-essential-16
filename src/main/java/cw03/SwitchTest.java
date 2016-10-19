package cw03;

public class SwitchTest {
    public static void main(String[] args) {
        int k = 10;

        if (k == 10) {
            System.out.println("A");
        }

        if (k == 11) {
            System.out.println("B");
        }

        if (k == 12) {
            System.out.println("C");
        }

        /*
        - primitive types
        - wrapper classes
        - String since 1.7
        - ENUM   since 1.7
        */
        switch (k) {
            case 10:
                System.out.println("A");
                break;

            case 11:
                System.out.println("B");
                break;

            case 12:
                System.out.println("C");
                break;

            default:
                System.out.println("Default value");
        }
    }
}
