//Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….
public class HomeWork042 {
    public static void main(String[] args) {
        for(int i=1, a=0;a<55;i=i+2,a++) {
            System.out.print(i+" ");
        }
    }
}
