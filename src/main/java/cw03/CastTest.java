package cw03;

public class CastTest {
    public static void main(String[] args) {
        short s = 200;

        int i = s;         // implicit safe cast

        byte b = (byte) s; // explicit unsafe cast

        System.out.println(b);

//        0000 0000 1100 1000
//                  1100 1000
    }
}
