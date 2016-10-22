package cw05;

public class ShiftsTest {
    public static void main(String[] args) {
        System.out.println(48 << 4); // * 2^n
//        0000 0000 0000 0000 0000 0000 0011 0000
//        0000 0000 0000 0000 0000 0000 1100 0000

        System.out.println(48 >> 4); // / 2^n
//        0000 0000 0000 0000 0000 0000 0011 0000
//        0000 0000 0000 0000 0000 0000 0000 1100

        byte b = (byte)(48 << 3);
        System.out.println(b);
//        0000 0000 0000 0000 0000 0000 0011 0000
//                                      1000 0000
    }
}
