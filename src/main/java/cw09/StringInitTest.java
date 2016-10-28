package cw09;

/**
 * Created by Evgeniy on 28.10.2016.
 */
public class StringInitTest {
    public static void main(String[] args) {
        String s1 = "Hello";                // literal
        String s2 = new String("Hello");    // constructor
        String s3 = "Hello" + " world!";    // concatenation
        String s4 = s3.substring(0, 5);     // method
        String s5 = s4 + s3.substring(0, 5);// combo

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);

    }
}
