package cw03;

public class SwitchStringTest {
    public static void main(String[] args) {
        String veryLongVariableName = "A";

        if (veryLongVariableName.equals("A")) {
            System.out.println(10);
        }

        if (veryLongVariableName.equals("B")) {
            System.out.println(11);
        }

        if (veryLongVariableName.equals("C")) {
            System.out.println(12);
        }

        switch (veryLongVariableName) {
            case "A":
                System.out.println(10);
                break;

            case "B":
                System.out.println(11);
                break;

            case "C":
                System.out.println(12);
                break;

            default:
                System.out.println("Default value");
        }
    }
}
