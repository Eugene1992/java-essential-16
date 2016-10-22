//Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….
public class HomeWork044 {
    public static void main(String[] args) {
        for (int i = 2, a = 0; a < 20; a++, i *= 2) {
            System.out.print(i + " ");
        }
    }
}
