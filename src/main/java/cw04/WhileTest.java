package cw04;

public class WhileTest {
    public static void main(String[] args) {
        int counter = 10;
        boolean b = false;

        System.out.println("Start");
        while (counter > 0) { // > < >= <= == !=
            System.out.println("Hello world!");
            System.out.println(counter);
            counter--; // counter = counter - 1; counter -= 1;
        }
        System.out.println("Finish");
    }
}
