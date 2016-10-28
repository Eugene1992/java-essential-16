package cw09;

/**
 * Created by Evgeniy on 28.10.2016.
 */
public class StringMethods {
    public static void main(String[] args) {
        String str = "Hello world!";
        String s1 = "Hello world!!";

        System.out.println(str.equals(s1));
        System.out.println(str.equals(str));

        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

        System.out.println(str.length());

        System.out.println(str.substring(5));
        System.out.println(str.substring(0, 5));

        System.out.println(str.isEmpty());
        System.out.println("".isEmpty());

        System.out.println(str.startsWith("Hell"));
        System.out.println(str.startsWith("Hi"));

        System.out.println(str.endsWith("!"));
        System.out.println(str.endsWith("!!"));

        String strWithSpaces = "    Hello    world!    ";
        System.out.println(strWithSpaces.trim());

        System.out.println(str.contains("worl"));
        System.out.println(str.contains("word"));

        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i] + " ");
        }

        System.out.println();
        byte[] bytes = str.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.print(bytes[i] + " ");
        }
    }
}
