package cw04;

public class ForTest {
    public static void main(String[] args) {
        // for (init counter; condition; increment/decrement)
        int i = 0, j = 10;
        for (;;) {
            if (i < 10) {
                System.out.println("Hello world!");
                System.out.println(j);
                i++;
                j--;
            }
        }
    }
}
