//Выведите на экран первые 20 членов последовательности Фибоначчи.
public class HomeWork045 {
    public static void main(String[] args) {
        int a = 1, b = 1, c = 0;
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                a = a + b;
                System.out.print(a + " ");
            } else {
                b = a + b;
                System.out.print(b + " ");
            }
        }
    }
}
