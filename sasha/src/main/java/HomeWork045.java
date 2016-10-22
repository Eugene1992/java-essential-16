//Выведите на экран первые 20 членов последовательности Фибоначчи.
public class HomeWork045 {
    public static void main(String[] args) {
        int a = 1, b = 1;
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
    /*public static void main(String[] args) {
        int prev1 = 1;
        int prev2 = 1;
        int cur;
        System.out.print(prev1 + " " + prev2 + " ");
        for (int i = 0; i < 18; i++) {
            cur = prev1 + prev2;
            System.out.print(cur + " ");
            prev1 = prev2;
            prev2 = cur;
        }
    }*/
}
