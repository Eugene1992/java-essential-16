package cw03;

public class IfTest {
    public static void main(String[] args) {
        int k = 5;
        boolean b = true;

        System.out.println("Start");

        if (k > 5) { // > < >= <= == !=
            System.out.println("k > 5");
        } else if (k < 5){
            System.out.println("k < 5");
        } else {
            System.out.println("k == 5");
        }

        System.out.println("End");
    }
}
