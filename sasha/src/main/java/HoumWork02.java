/**
 * 1. Создать четыре целочисленные переменные типов byte, short, int, long.
 * 2. Инициализировать переменную типа byte результатом суммы двух любых чисел.
 * 3. Инициализировать переменную типа short  результатом вычитания двух любых чисел.
 * 4. Инициализировать переменную типа int результатом деления двух любых чисел.
 * 5. Инициализировать переменную типа long результатом умножения двух любых чисел.
 * 6. Передать переменной типа byte результат суммы двух переменных типа byte.
 * 7. Передать переменной типа byte результат суммы двух переменных типа short, деленных на третью переменную типа byte.
 * 8. Переменной типа int передать результат деления двух short, умноженных на результат деления двух byte.
 * 9. Поменять значения двух целочисленных переменных используя третью.
 * 10. Поменять значения двух переменных без использования третей.
 */
public class HoumWork02 {
    public static void main(String[] args) {
        byte b;
        b = 5;

        short s;
        s = 30700;

        int i;
        i = 359487652;

        long l;
        l = 698752469543L;

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);

        byte b1;
        b1 = 65 + 32;

        short s1;
        s1 = 32700 - 18395;

        int i1;
        i1 = 352879 / 356;

        long l1;
        l1 = 34254 * 546;

        System.out.println(b1);
        System.out.println(s1);
        System.out.println(i1);
        System.out.println(l1);

        byte b2;
        b2 = (byte) (b1 + b);

        byte b3;
        b3 = (byte) ((s + s1) / b2);

        int i2;
        i2 = (s / s1) * (b / b1);

        System.out.println(b2);
        System.out.println(b3);
        System.out.println(i2);

        byte z, x, c;
        z = 1;
        x = 2;
        c = 3;

        c = z;
        z = x;
        x = c;

        System.out.println(z);
        System.out.println(x);

        int z1, x1;
        z1 = 5;
        x1 = 10;

        z1 = z1 + x1;
        x1 = z1 - x1;
        z1 = z1 - x1;

        System.out.println(z1);
        System.out.println(x1);

    }
}
