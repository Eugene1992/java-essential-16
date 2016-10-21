//Создайте программу, выводящую на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60 ….
public class HomeWork043 {
    public static void main(String[] args) {
        for (int i=90, a=0; i>=0; i=i-5, a-- ){
            System.out.print(i+" ");
        }
    }
}
