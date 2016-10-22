package cw05;

public class BinaryTests {
    public static void main(String[] args) {
        System.out.println(10 & 2);
//        0000 1010
//       &
//        0000 0010
//        ---------
//        0000 0010

        System.out.println(10 | 2);
//        0000 1010
//       |
//        0000 0010
//        ---------
//        0000 1010

        System.out.println(10 ^ 2);
//        0000 1010
//       ^
//        0000 0010
//        ---------
//        0000 1000
    }
}
