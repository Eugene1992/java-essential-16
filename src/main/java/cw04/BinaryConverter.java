package cw04;

public class BinaryConverter {
    public static void main(String[] args) {
        int k = 127; // 0 ... 127
        int i0, i1, i2, i3, i4, i5, i6;

        i0 = k % 2;
        k = k / 2;
        i1 = k % 2;
        k = k / 2;
        i2 = k % 2;
        k = k / 2;
        i3 = k % 2;
        k = k / 2;
        i4 = k % 2;
        k = k / 2;
        i5 = k % 2;
        k = k / 2;
        i6 = k % 2;
        System.out.print(i6);
        System.out.print(i5);
        System.out.print(i4);
        System.out.print(i3);
        System.out.print(i2);
        System.out.print(i1);
        System.out.print(i0);
    }
}
