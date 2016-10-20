package cw04;

import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter some number:");
        int num = scan.nextInt();
        System.out.println("Choose your number system:\n1) 2\n2) 8\n3) 16");
        int num2 = scan.nextInt();
        switch (num2) {
            case 2:
                System.out.println();
        }
    }
}
