/*Написать программу, которая реализует следующий функционал:
 Пользователь вводит число в 10-ой системе счисления.
 Программа выводит сообщение в котором предлагает пользователю перевести данное число в одну из систем счисления на выбор:
    1) в 2-ую
    2) в 8-ую
    3) в 16-ую
Пользователь выбирает один из предложенных вариантов, программа выполняет соответствующий перевод числа и выводит
на экран результат.*/

import java.util.Scanner;

public class HomeWork046 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter some number:");
        int num = scan.nextInt();
        System.out.println("Choose your number system:\n1) 2\n2) 8\n3) 16");
        int numSys = scan.nextInt();
        String result = "";
        switch (numSys) {
            case 2:
                while (num >= 1) {
                    result = num % 2 + result;
                    num = num / 2;
                }
                System.out.println(result);
                break;

            case 8:
                while (num > 8) {
                    result = num % 8 + result;
                    num = num / 8;
                }
                result = num + result;
                System.out.println(result);
                break;

            case 16:
                int cur = 0;
                while (num > 0) {
                    cur = num % 16;
                    if (cur >= 10) {
                        if (cur == 10) result = "A" + result;
                        if (cur == 11) result = "B" + result;
                        if (cur == 12) result = "C" + result;
                        if (cur == 13) result = "D" + result;
                        if (cur == 14) result = "E" + result;
                        if (cur == 15) result = "F" + result;
                    } else {
                        result = num + result;
                    }
                    num = num / 16;
                }
                System.out.println(result);
                break;
        }
    }
}